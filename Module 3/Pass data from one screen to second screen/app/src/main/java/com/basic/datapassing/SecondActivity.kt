package com.basic.datapassing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.basic.datapassing.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = intent

        var name = intent.getStringExtra("name")
        var surname = intent.getStringExtra("surname")

        binding.lbName.text = name.toString()
        binding.lbSurName.text = surname.toString()


    }
}