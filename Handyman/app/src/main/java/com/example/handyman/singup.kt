package com.example.handyman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class singup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)

        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.button8)
        button.setOnClickListener{
            val intent = Intent(this, UserScreen::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<ImageView>(R.id.imageView18)
        button2.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}