package com.syafii.viewbinding.Kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.syafii.viewbinding.databinding.ActivityMain2Binding
import com.syafii.viewbinding.utils.toast

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //this is call id from main activity
        //this is Text View
        binding.tvTitleKotlin.text = "Ini Adalah Aplikasi Untuk implement View Binding dengan bahasa Kotlin"

        //this Is button
        binding.btnTestKotlin.text = "Button"
        binding.btnTestKotlin.setOnClickListener {
            toast("Button clicked")
        }
    }
}