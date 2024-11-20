package com.example.bdappfinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val notifications = listOf(
            Notification(R.drawable.rosegold, "Rosegold Sticker", "10:00 AM"),
            Notification(R.drawable.emblem, "Emblem Sticker", "10:30 AM"),
            Notification(R.drawable.auto_emblem, "Automobile sticker", "11:00 AM"),
            Notification(R.drawable.uv_dtf, "UV sticker", "11:30 AM"),
            Notification(R.drawable.blackmetal, "Black metal sticker", "12:00 PM")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NotificationAdapter(notifications)
    }
}
