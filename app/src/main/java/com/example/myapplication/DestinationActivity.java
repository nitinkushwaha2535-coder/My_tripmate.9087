package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_destination);


        // =========================
        // MANALI
        // =========================

        View manaliCard = findViewById(R.id.destinationManali);

        manaliCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        DestinationActivity.this,
                        ManaliDetailsActivity.class
                );

                startActivity(intent);
            }
        });


        // =========================
        // BALI
        // =========================

        View baliCard = findViewById(R.id.destinationBali);

        baliCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(
                        DestinationActivity.this,
                        "Bali details coming soon",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });


        // =========================
        // SEARCH
        // =========================

        View searchBar =
                findViewById(R.id.destinationSearchBar);

        searchBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(
                        DestinationActivity.this,
                        "Search coming soon",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });


        // =========================
        // SEE ALL
        // =========================

        View seeAll =
                findViewById(R.id.destinationSeeAll);

        seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(
                        DestinationActivity.this,
                        "All destinations coming soon",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });


        // =========================
        // INSPIRATION
        // =========================

        View inspiration =
                findViewById(R.id.destinationInspiration);

        inspiration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(
                        DestinationActivity.this,
                        "Travel inspiration selected",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}