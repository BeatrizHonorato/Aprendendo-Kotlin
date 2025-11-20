package com.example.conversordetemperatura

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversordetemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener {
            if (binding.editTemperatura.text.isNotBlank()){
                val celsius = binding.editTemperatura.text.toString().toDouble()
                val fahrenheit = celsius * 1.8 + 32
                binding.txtVisualizar.text = fahrenheit.toString()
            }else{
                binding.txtVisualizar.text = "Temperatura inválida"
            }

        }

    }
}