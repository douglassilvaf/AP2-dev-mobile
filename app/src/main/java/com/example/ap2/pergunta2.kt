package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pergunta2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta2)

        val btnKlm = findViewById<Button>(R.id.klm)
        val btnVkt = findViewById<Button>(R.id.vkt)
        val btnChatgpt = findViewById<Button>(R.id.chatgpt)
        val btnLLM = findViewById<Button>(R.id.llm)

        val totalPontos = "total pontos"

        val pontuacaoRecebida = intent.getIntExtra(totalPontos, 0)
        var totalpergunta2 = pontuacaoRecebida

        // Configurar o clique para cada botão
        btnKlm.setOnClickListener {
            val intent = Intent(this, pergunta3::class.java)
            intent.putExtra(totalPontos, totalpergunta2)
            startActivity(intent)
        }
        btnVkt.setOnClickListener {
            val intent = Intent(this, pergunta3::class.java)
            intent.putExtra(totalPontos, totalpergunta2)
            startActivity(intent)
        }
        btnChatgpt.setOnClickListener {
            val intent = Intent(this, pergunta3::class.java)
            intent.putExtra(totalPontos, totalpergunta2)
            startActivity(intent)
        }
        btnLLM.setOnClickListener {
            totalpergunta2 += 1
            val intent = Intent(this, pergunta3::class.java)
            intent.putExtra(totalPontos, totalpergunta2)
            startActivity(intent)
        }

    }
}