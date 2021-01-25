package com.kishorramani.navigationcomponentbasic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kishorramani.navigationcomponentbasic.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSimpleNavigation.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnBottomNavigation.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        binding.btnOnBoardingNavigation.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}