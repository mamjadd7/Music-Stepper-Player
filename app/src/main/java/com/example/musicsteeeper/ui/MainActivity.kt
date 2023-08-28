package com.example.musicsteeeper.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.musicsteeeper.R
//done
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logOut = findViewById<TextView>(R.id.buttonSignUp)
        val login = findViewById<TextView>(R.id.buttonLogin)

        login.setOnClickListener {
            startActivity(Intent(this, HomeExpandedActivity::class.java))
        }


        logOut.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}