package com.example.bdappfinal

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val signupb : TextView = findViewById<TextView>(R.id.signuplink)
        signupb.setOnClickListener{
            val buttonSignup = Intent(this, Signup::class.java)
            startActivity(buttonSignup)
        }

        val homeb : AppCompatButton = findViewById<AppCompatButton>(R.id.button)
        homeb.setOnClickListener{
            val buttonhome = Intent(this, Home::class.java)
            startActivity(buttonhome)
        }
    }
}