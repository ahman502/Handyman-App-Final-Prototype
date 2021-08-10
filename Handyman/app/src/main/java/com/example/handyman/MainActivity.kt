package com.example.handyman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, UserScreen::class.java)
            startActivity(intent)
        }

        val button12 = findViewById<TextView>(R.id.sign_up)
        button12.setOnClickListener{
            val intent = Intent(this, singup::class.java)
            startActivity(intent)
        }
    }




}