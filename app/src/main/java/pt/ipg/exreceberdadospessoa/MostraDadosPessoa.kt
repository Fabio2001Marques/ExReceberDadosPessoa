package pt.ipg.exreceberdadospessoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MostraDadosPessoa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_dados_pessoa)

        val nome = intent.getStringExtra(MainActivity.NOME)
        val email = intent.getStringExtra(MainActivity.EMAIL)
        val phone = intent.getStringExtra(MainActivity.PHONE)
        val idade = intent.getStringExtra(MainActivity.Idade)
        val data = intent.getSerializableExtra(MainActivity.DATA) as Date

        val textViewNome = findViewById<TextView>(R.id.textViewNome)
        textViewNome.setText(nome)

        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        textViewEmail.setText(email)

        val textViewPhone = findViewById<TextView>(R.id.textViewPhone)
        textViewPhone.setText(phone)

        val textViewIdade = findViewById<TextView>(R.id.textViewIdade)
        textViewIdade.setText(idade)

        val textViewHora = findViewById<TextView>(R.id.textViewHora)
        val df = SimpleDateFormat("HH:mm:ss")
        textViewHora.setText(df.format(data))
    }


}