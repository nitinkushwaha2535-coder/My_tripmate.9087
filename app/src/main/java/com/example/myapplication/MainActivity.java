package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        // =========================
        // HOME
        // =========================

        LinearLayout navHome = findViewById(R.id.navHome);

        navHome.setOnClickListener(v -> {
            // Already on Home
        });


        // =========================
        // MY TRIPS
        // =========================

        LinearLayout navTrips = findViewById(R.id.navTrips);

        navTrips.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    MyTripsActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // DESTINATIONS
        // =========================

        LinearLayout navDestinations =
                findViewById(R.id.navDestinations);

        navDestinations.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    DestinationActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // PROFILE
        // =========================

        LinearLayout navProfile =
                findViewById(R.id.navProfile);

        navProfile.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Profile coming soon",
                Toast.LENGTH_SHORT
        ).show());


        // =========================
        // SEARCH BAR
        // =========================

        LinearLayout searchBar =
                findViewById(R.id.searchBar);

        searchBar.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Search coming soon",
                Toast.LENGTH_SHORT
        ).show());


        // =========================
        // SEARCH ICON
        // =========================

        View homeSearchIcon =
                findViewById(R.id.homeSearchIcon);

        homeSearchIcon.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Search coming soon",
                Toast.LENGTH_SHORT
        ).show());


        // =========================
        // SEE ALL DESTINATIONS
        // =========================

        View seeAllDestinations =
                findViewById(R.id.seeAllDestinations);

        seeAllDestinations.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    DestinationActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // MANALI CARD
        // =========================

        View manaliCard =
                findViewById(R.id.manaliCard);

        manaliCard.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    DestinationActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // BALI CARD
        // =========================

        View baliCard =
                findViewById(R.id.baliCard);

        baliCard.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    DestinationActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // QUICK SERVICES
        // =========================

        View flightsOption =
                findViewById(R.id.flightsOption);

        flightsOption.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Flights selected",
                Toast.LENGTH_SHORT
        ).show());


        View hotelsOption =
                findViewById(R.id.hotelsOption);

        hotelsOption.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Hotels selected",
                Toast.LENGTH_SHORT
        ).show());


        View cabsOption =
                findViewById(R.id.cabsOption);

        cabsOption.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Cabs selected",
                Toast.LENGTH_SHORT
        ).show());


        View trainsOption =
                findViewById(R.id.trainsOption);

        trainsOption.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Trains selected",
                Toast.LENGTH_SHORT
        ).show());


        // =========================
        // TRAVEL INSPIRATION
        // =========================

        View inspirationCard1 =
                findViewById(R.id.inspirationCard1);

        inspirationCard1.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Travel article selected",
                Toast.LENGTH_SHORT
        ).show());


        View inspirationCard2 =
                findViewById(R.id.inspirationCard2);

        inspirationCard2.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "Travel article selected",
                Toast.LENGTH_SHORT
        ).show());


        // =========================
        // SEE ALL INSPIRATION
        // =========================

        View seeAllInspiration =
                findViewById(R.id.seeAllInspiration);

        seeAllInspiration.setOnClickListener(v -> Toast.makeText(
                MainActivity.this,
                "More travel inspiration coming soon",
                Toast.LENGTH_SHORT
        ).show());
    }
}