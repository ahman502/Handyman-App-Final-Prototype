package com.example.handyman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Handyman_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handyman_info)

        supportActionBar?.hide()

        val button3 = findViewById<ImageView>(R.id.imageView18)
        button3.setOnClickListener{
            val intent = Intent(this, JobActivity::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<TextView>(R.id.button11)
        button4.setOnClickListener{
            val intent = Intent(this, Carisa_info::class.java)
            startActivity(intent)
        }
    }
}