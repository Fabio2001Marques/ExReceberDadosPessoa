package pt.ipg.exreceberdadospessoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        val NOME = "Nome"
        val EMAIL = "Email"
        val PHONE = "Phone"
        val Idade = "Idade"
        val DATA = "Data"
    }


    fun enviaDados(view: View) {

        val data = Date()

        val editTextNome = findViewById<EditText>(R.id.textInputEditNome)
        val nome = editTextNome.text.toString()

        var dadosCorretos = true

        if (nome.isBlank()) {
            editTextNome.error = "Please Specify a name"
            dadosCorretos = false
        }

        val editTextEmail = findViewById<EditText>(R.id.textInputEditEmail)
        val email = editTextEmail.text.toString()

        if (email.isBlank()) {
            editTextEmail.error = "Please Specify a email"
            dadosCorretos = false
        }

        val editTextPhone = findViewById<EditText>(R.id.textInputEditPhone)
        val phone = editTextPhone.text.toString()

        if (phone.isBlank()) {
            editTextPhone.error = "Please Specify a phone"
            dadosCorretos = false
        }

        // Normalmente deve ser pedida a data de nascimento e não a idade
        val editTextIdade = findViewById<EditText>(R.id.textInputEditIdade)
        val idade = editTextIdade.text.toString().toIntOrNull()

        if (idade == null) {
            editTextIdade.error = "Please Specify age"
            dadosCorretos = false
        }

        if (dadosCorretos) {

            val intent = Intent(this, MostraDadosPessoa::class.java).apply {
                putExtra(NOME, nome)
                putExtra(EMAIL, email)
                putExtra(PHONE, phone)
                putExtra(Idade, idade)
                putExtra(DATA, data)

            }
            startActivity(intent)
        }
    }
}