package com.example.conversordemoedas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.conversordemoedas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
       binding.btnCalcular.setOnClickListener {
           val euro = binding.editNumero.text.toString().toDouble()
           val dolares = String.format("%.2f", euro * 0.8)
           binding.Visualizacao.text = dolares

       }
    }
}