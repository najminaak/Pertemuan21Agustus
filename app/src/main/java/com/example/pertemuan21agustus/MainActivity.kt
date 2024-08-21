package com.example.pertemuan21agustus

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan21agustus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var binding:ActivityMainBinding

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tombolCount.setOnClickListener {
            val angkaDariTextView = binding.txtAngka.text.toString()
            val angka = angkaDariTextView.toInt() + 1
            binding.txtAngka.text = angka.toString()
        }

        binding.tombolKurang.setOnClickListener {
            val angkaDariTextView = binding.txtAngka.text.toString()
            val angka = angkaDariTextView.toInt() - 1
            binding.txtAngka.text = angka.toString()
        }

        binding.tombolToast.setOnClickListener {
            val angka = binding.txtAngka.text.toString()
            Toast.makeText(this, "Angka saat ini " + angka, Toast.LENGTH_SHORT).show()
        }

    }
}