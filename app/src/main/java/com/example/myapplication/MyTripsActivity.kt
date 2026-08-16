package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyTripsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_trips)

        // Back button
        val myTripback = findViewById<TextView>(R.id.myTripsBack)

        myTripback.setOnClickListener {
            finish()
        }

        // View Trip button
        val viewTripButton = findViewById<Button>(R.id.viewTripButton)

        viewTripButton.setOnClickListener {

            val intent = Intent(
                this@MyTripsActivity,
                ManaliDetailsActivity::class.java
            )

            startActivity(intent)
        }
    }
}