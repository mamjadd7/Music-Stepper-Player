package com.example.musicsteeeper.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.musicsteeeper.R
import com.musicsteeeper.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityEditProfileBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.circularImageEditProfile.setOnClickListener {
            startActivity(Intent(this, PlayerSingleActivity::class.java))
        }


    }
}