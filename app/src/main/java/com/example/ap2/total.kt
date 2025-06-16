package com.example.ap2

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class total : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.total)

        val totalPontos = "total pontos"
        val pontuacaoFinal = intent.getIntExtra(totalPontos, 0)

        val textoResultado = findViewById<TextView>(R.id.total)
        val webViewDica = findViewById<WebView>(R.id.dica)

        textoResultado.text = pontuacaoFinal.toString()

        // Garante que a página carregue dentro do app
        webViewDica.webViewClient = WebViewClient()
        webViewDica.settings.javaScriptEnabled = true

        webViewDica.loadUrl("https://www.dio.me/") // Usei .me que é o domínio atual
    }
}