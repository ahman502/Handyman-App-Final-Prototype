package com.example.handyman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Plumber_review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plumber_review)

        supportActionBar?.hide()

        val button10 = findViewById<ImageView>(R.id.imageView18)
        button10.setOnClickListener{
            val intent = Intent(this, Carisa_info::class.java)
            startActivity(intent)
        }
    }
}