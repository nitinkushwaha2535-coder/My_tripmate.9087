package com.example.myapplication;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class BookingActivity extends AppCompatActivity {

    // Booking values
    int travelers = 2;
    int packagePrice = 12999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_booking);


        // =========================
        // BACK BUTTON
        // =========================

        TextView bookingBack = findViewById(R.id.bookingBack);

        bookingBack.setOnClickListener(v -> {
            finish();
        });


        // =========================
        // TRAVEL DATE
        // =========================

        LinearLayout dateSelector =
                findViewById(R.id.dateSelector);

        TextView selectedDate =
                findViewById(R.id.selectedDate);

        dateSelector.setOnClickListener(v -> {

            Calendar calendar = Calendar.getInstance();

            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog =
                    new DatePickerDialog(
                            BookingActivity.this,
                            (view, selectedYear, selectedMonth, selectedDay) -> {

                                String date =
                                        selectedDay + "/" +
                                                (selectedMonth + 1) + "/" +
                                                selectedYear;

                                selectedDate.setText(date);
                                selectedDate.setTextColor(
                                        Color.parseColor("#087F5B")
                                );
                            },
                            year,
                            month,
                            day
                    );

            datePickerDialog.show();
        });


        // =========================
        // TRAVELERS
        // =========================

        LinearLayout travelersCard =
                findViewById(R.id.travelersCard);

        TextView travelerCount =
                findViewById(R.id.travelerCount);

        travelersCard.setOnClickListener(v -> {

            travelers++;

            // Maximum 6 travelers
            if (travelers > 6) {
                travelers = 1;
            }

            travelerCount.setText(String.valueOf(travelers));

            updateTotal();
        });


        // =========================
        // STANDARD PACKAGE
        // =========================

        TextView packageStandard =
                findViewById(R.id.packageStandard);

        packageStandard.setOnClickListener(v -> {

            packagePrice = 12999;

            packageStandard.setTextColor(
                    Color.parseColor("#087F5B")
            );

            updateTotal();
        });


        // =========================
        // PREMIUM PACKAGE
        // =========================

        TextView packagePremium =
                findViewById(R.id.packagePremium);

        packagePremium.setOnClickListener(v -> {

            packagePrice = 18999;

            packagePremium.setTextColor(
                    Color.parseColor("#087F5B")
            );

            updateTotal();
        });


        // =========================
        // CONFIRM BOOKING
        // =========================

        Button confirmBookingButton =
                findViewById(R.id.confirmBookingButton);

        confirmBookingButton.setOnClickListener(v -> {

            Toast.makeText(
                    BookingActivity.this,
                    "Booking confirmed successfully!",
                    Toast.LENGTH_LONG
            ).show();
        });


        // Initial total
        updateTotal();
    }


    // =========================
    // UPDATE TOTAL PRICE
    // =========================

    private void updateTotal() {

        TextView totalPrice =
                findViewById(R.id.totalPrice);

        int total = travelers * packagePrice;

        totalPrice.setText("₹" + total);
    }
}