package com.example.aula1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aula1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(
            layoutInflater
        )
        setContentView(binding.root)



        binding.dolarToReal.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                SegundaTela::class.java
            )
            startActivity(intent)
        }

        binding.convertToDolar.setOnClickListener{

            val valor : Double = binding.inputReal.text.toString().toDouble()

            val conversao : Double = valor * 0.2

            binding.value.text = String.format("%.2f", conversao)

        }
    }
}