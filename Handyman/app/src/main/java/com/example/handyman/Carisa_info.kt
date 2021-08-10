package com.example.handyman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Carisa_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carisa_info)

        supportActionBar?.hide()

        val button6 = findViewById<ImageView>(R.id.imageView18)
        button6.setOnClickListener{
            val intent = Intent(this, Handyman_info::class.java)
            startActivity(intent)
        }

        val button8 = findViewById<Button>(R.id.button6)
        button8.setOnClickListener{
            val intent = Intent(this, Plumber_review::class.java)
            startActivity(intent)
        }
    }
}