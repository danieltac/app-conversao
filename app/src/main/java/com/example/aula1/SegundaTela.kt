package com.example.aula1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SegundaTela : AppCompatActivity() {

    private var valorInput: EditText? = null
    private var total: TextView? = null
    private var valorC: String? = null
    private var botao: Button? = null
    private var voltar: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.segundatela)

        valorInput = findViewById<View>(R.id.inputDolar) as EditText
        total = findViewById<View>(R.id.valueReal) as TextView
        botao = findViewById<View>(R.id.convertToReal) as Button
        voltar = findViewById<View>(R.id.realToDolar) as ImageButton

        botao!!.setOnClickListener {
            valorC = valorInput!!.text.toString()
            val valor = "0$valorC".toDouble()
            val conversao = valor * 5
            total!!.text = String.format("%.2f", conversao)
        }

        voltar!!.setOnClickListener {
            startActivity(
                Intent(
                    this@SegundaTela,
                    MainActivity::class.java
                )
            )
        }
    }
}


