package com.basic.o2onavigation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.basic.o2onavigation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            val myintent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(myintent)
        }
    }
}