package com.miriderz.ridewatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.miriderz.ridewatch.databinding.ActivityMainBinding
import com.miriderz.ridewatch.databinding.TestOnlyBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button.setOnClickListener{
            println("Button is clicked")
            val intentToSecondActivity = Intent (this@MainActivity, SecondActivity::class.java)
            startActivity(intentToSecondActivity)
        }
        val view = binding.root
        setContentView(view)
    }
}