package com.example.ap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.max = 3
        progressBar.progress = 1

        var total = 0
        val totalPontos = "total pontos"

        val btnNaja = findViewById<Button>(R.id.Naja)
        val btnForza = findViewById<Button>(R.id.forza)
        val btnJarvis = findViewById<Button>(R.id.jarvis)
        val btnRuby = findViewById<Button>(R.id.ruby)

        // Configurar o clique para cada botão
        btnNaja.setOnClickListener {
            val intent = Intent(this, pergunta2::class.java)
            intent.putExtra(totalPontos, total)
            startActivity(intent)
        }
        btnForza.setOnClickListener {
            val intent = Intent(this, pergunta2::class.java)
            intent.putExtra(totalPontos, total)
            startActivity(intent)
        }
        btnJarvis.setOnClickListener {
            val intent = Intent(this, pergunta2::class.java)
            intent.putExtra(totalPontos, total)
            startActivity(intent)
        }
        btnRuby.setOnClickListener {
            total += 1
            val intent = Intent(this, pergunta2::class.java)
            intent.putExtra(totalPontos, total)
            startActivity(intent)
        }

    }
}