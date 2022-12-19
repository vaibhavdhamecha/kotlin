package com.basic.datapassing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.basic.datapassing.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {

            val myIntent = Intent(this, SecondActivity::class.java)
            myIntent.putExtra("name", binding.txtName.text.toString())
            myIntent.putExtra("surname", binding.txtSurname.text.toString())
            startActivity(myIntent)
        }

    }
}