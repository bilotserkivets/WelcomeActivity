package com.example.welcomeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.welcomeactivity.databinding.ActivityMainBinding

const val FULL_NAME_KEY = "FULL_NAME_KEY"

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            val fullName = binding.fullName.text.toString().trim()

            if (fullName.isNotEmpty()) {
                Intent(this, WelcomeActivity::class.java)
                    .also { welcomeIntent -> welcomeIntent.putExtra(FULL_NAME_KEY, fullName)
                        startActivity(welcomeIntent)}
            } else {
                Toast.makeText(this, getString(R.string.full_name_label), Toast.LENGTH_LONG).show()
            }
        }

    }
}