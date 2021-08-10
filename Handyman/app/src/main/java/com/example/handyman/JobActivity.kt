package com.example.handyman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class JobActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job)

        supportActionBar?.hide()

        val button = findViewById<ImageView>(R.id.imageView8)
        button.setOnClickListener{
            val intent = Intent(this, UserScreen::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button4)
        button2.setOnClickListener{
            val intent = Intent(this, Handyman_info::class.java)
            startActivity(intent)
        }
    }
}