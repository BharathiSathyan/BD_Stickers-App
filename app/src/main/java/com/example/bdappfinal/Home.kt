package com.example.bdappfinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {

    private lateinit var searchIcon: ImageView
    private lateinit var searchBarLayout: View
    private lateinit var searchEditText: EditText
    private lateinit var signinb: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)

        // Initialize views
        searchIcon = findViewById(R.id.search_icon_in_bar)
        searchBarLayout = findViewById(R.id.search_bar_layout)
        searchEditText = findViewById(R.id.search_edit_text)
        signinb = findViewById(R.id.noti)

        // Set the search bar layout to be initially hidden
        searchBarLayout.visibility = View.GONE

        // Set click listener for the search icon
        searchIcon.setOnClickListener {
            toggleSearchBar()
        }

        // Set click listener for the notification icon
        signinb.setOnClickListener {
            val buttonSignin = Intent(this, NotificationActivity::class.java)
            startActivity(buttonSignin)
        }

        // Handle window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Function to toggle the visibility of the search bar layout
    private fun toggleSearchBar() {
        if (searchBarLayout.visibility == View.VISIBLE) {
            searchBarLayout.visibility = View.GONE
        } else {
            searchBarLayout.visibility = View.VISIBLE
            searchEditText.requestFocus()
        }
    }
}
