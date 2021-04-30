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
    }


    fun enviaMensagem(view: View) {
        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val nome = editTextNome.text.toString()

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val email = editTextEmail.text.toString()


        val intent = Intent(this, MostraDadosPessoa::class.java).apply {
            putExtra(NOME, nome)
            putExtra(EMAIL, email)
        }

        startActivity(intent)
    }
}