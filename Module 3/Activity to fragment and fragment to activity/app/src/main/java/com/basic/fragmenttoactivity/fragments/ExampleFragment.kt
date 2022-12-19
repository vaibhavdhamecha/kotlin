package com.basic.fragmenttoactivity.fragments

import android.content.Intent
import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.basic.fragmenttoactivity.MainActivity
import com.basic.fragmenttoactivity.R


class ExampleFragment : Fragment() {

    private var binding: ExampleFragment?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_example, container, false)

        var btnStart = view?.findViewById<Button>(R.id.viewActivity)


        btnStart?.setOnClickListener {


            var mIntent = Intent(activity,MainActivity::class.java)
            startActivity(mIntent)

        }

        return view
    }


}
