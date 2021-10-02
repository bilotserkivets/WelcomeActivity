package com.example.welcomeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.welcomeactivity.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            intent?.let {
                val fullName = it.getStringExtra(FULL_NAME_KEY)
                welcomeText.text = getString(R.string.welcome_text, fullName)
            }
        }

    }
}