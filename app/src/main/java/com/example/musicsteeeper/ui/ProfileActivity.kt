package com.example.musicsteeeper.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.musicsteeeper.R
import com.musicsteeeper.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityProfileBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imageViewArrowBackLong.setOnClickListener{
            startActivity(Intent(this, EditProfileActivity::class.java))
        }
    }
}