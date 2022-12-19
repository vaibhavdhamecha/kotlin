package com.basic.buttoncolorchange

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.basic.buttoncolorchange.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnGray.setOnClickListener {
            binding.bg.setBackgroundColor(Color.GRAY)
        }

        binding.btnRed.setOnClickListener {
            binding.bg.setBackgroundColor(Color.RED)
        }

        binding.btnYellow.setOnClickListener {
            binding.bg.setBackgroundColor(Color.YELLOW)
        }

    }
}