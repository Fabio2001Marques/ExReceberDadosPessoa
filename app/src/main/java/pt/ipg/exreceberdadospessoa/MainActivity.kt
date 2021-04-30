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

        if(nome.isBlank()){
            editTextNome.error = "Please Specify a name"
            return
        }

        val editTextEmail = findViewById<EditText>(R.id.textInputEditEmail)
        val email = editTextEmail.text.toString()

        if(nome.isBlank()){
            editTextNome.error = "Please Specify a email"
            return
        }

        val editTextPhone = findViewById<EditText>(R.id.textInputEditPhone)
        val phone = editTextPhone.text.toString()

        if(phone.isBlank()){
            editTextPhone.error = "Please Specify a phone"
            return
        }

        val editTextIdade = findViewById<EditText>(R.id.textInputEditIdade)
        val idade = editTextIdade.text.toString()

        if(idade.isBlank()){
            editTextIdade.error = "Please Specify a idade"
            return
        }

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