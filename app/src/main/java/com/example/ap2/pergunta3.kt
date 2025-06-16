package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pergunta3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta3)

        val btnMeta = findViewById<Button>(R.id.meta)
        val btnTesla = findViewById<Button>(R.id.tesla)
        val btnHostgator = findViewById<Button>(R.id.hostgator)
        val btnNubank = findViewById<Button>(R.id.nubank)

        val totalPontos = "total pontos"

        val pontuacaoRecebida = intent.getIntExtra(totalPontos, 0)
        var totalpergunta3 = pontuacaoRecebida

        btnMeta.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra(totalPontos, totalpergunta3)
            startActivity(intent)
        }

        btnTesla.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra(totalPontos, totalpergunta3)
            startActivity(intent)
        }
        btnHostgator.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra(totalPontos, totalpergunta3)
            startActivity(intent)
        }
        btnNubank.setOnClickListener {
            totalpergunta3 += 1
            val intent = Intent(this, total::class.java)
            intent.putExtra(totalPontos, totalpergunta3)
            startActivity(intent)
        }
    }
}