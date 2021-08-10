package com.example.handyman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class UserScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_screen)

        supportActionBar?.hide()

        val button = findViewById<ImageButton>(R.id.imageButton3)
        button.setOnClickListener{
            val intent = Intent(this, JobActivity::class.java)
            startActivity(intent)
        }
    }
}