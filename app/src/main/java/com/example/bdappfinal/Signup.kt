package com.example.bdappfinal

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val signinb : TextView = findViewById<TextView>(R.id.signinlink)
        signinb.setOnClickListener {
            val buttonSignin = Intent(this, Login::class.java)
            startActivity(buttonSignin)
        }

        val homeb : AppCompatButton = findViewById<AppCompatButton>(R.id.button)
        homeb.setOnClickListener{
            val buttonhome = Intent(this, Login::class.java)
            startActivity(buttonhome)
        }
    }
}