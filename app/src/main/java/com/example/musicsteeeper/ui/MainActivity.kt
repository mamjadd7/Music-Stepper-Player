package com.example.musicsteeeper.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.musicsteeeper.R
import com.musicsteeeper.databinding.ActivityMainBinding

//done
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)





        binding.buttonSignUp.setOnClickListener {
            startActivity(Intent(this, HomeExpandedActivity::class.java))
        }


        binding.buttonLogin.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}