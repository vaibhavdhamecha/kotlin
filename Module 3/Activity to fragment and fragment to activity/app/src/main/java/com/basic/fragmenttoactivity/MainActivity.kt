package com.basic.fragmenttoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.basic.fragmenttoactivity.databinding.ActivityMainBinding
import com.basic.fragmenttoactivity.fragments.ExampleFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnFragment.setOnClickListener {

            loadFragment(ExampleFragment())
        }


    }

    fun loadFragment(fragment: Fragment)
    {
        var trascation = supportFragmentManager.beginTransaction()
        trascation.replace(R.id.screen,fragment)
        trascation.addToBackStack(null)
        trascation.commit()

    }


}