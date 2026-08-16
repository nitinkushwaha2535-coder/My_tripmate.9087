package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ManaliDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_manali_details);

        // Add to My Trip button
        Button addToTripButton = findViewById(R.id.addManaliTrip);

        addToTripButton.setOnClickListener(v -> {

            Toast.makeText(
                    ManaliDetailsActivity.this,
                    "Manali added to My Trip!",
                    Toast.LENGTH_SHORT
            ).show();

        });

        // Book Now button
        Button bookNowButton = findViewById(R.id.bookManali);

        bookNowButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    ManaliDetailsActivity.this,
                    BookingActivity.class

            );

            startActivity(intent);

        });
    }
}