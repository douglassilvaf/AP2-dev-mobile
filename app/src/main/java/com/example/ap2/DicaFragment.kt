package com.example.ap2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class DicaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla (cria) o layout para este fragmento
        return inflater.inflate(R.layout.fragment_dica, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnVerDica = view.findViewById<Button>(R.id.btn_ver_dica)

        btnVerDica.setOnClickListener {
            // ISSO É UMA INTENT IMPLÍCITA: Abre uma página web
            val url = "https://proximonivel.embratel.com.br/nubank-ganha-excelencia-em-clojure/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}