package com.bignerdranch.android.basicdancenyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DayButton extends AppCompatActivity {

    private Button mMondayButton;
    private Button mTuesdayButton;
    private Button mWednesdayButton;
    private Button mThursdayButton;
    private Button mFridayButton;
    private Button mSaturdayButton;
    private Button mSundayButton;
    Object v;
    private String selectedDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_button);

        mMondayButton = (Button) findViewById(R.id.monday_button);
        mMondayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDay = "Monday";
                Intent intent = new Intent(DayButton.this, DaySelected.class);
                intent.putExtra("selectedDay", selectedDay);
                startActivity(intent);
            }
        });

        mTuesdayButton = (Button) findViewById(R.id.tuesday_button);
        mTuesdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDay = "Tuesday";
                Intent intent = new Intent(DayButton.this, DaySelected.class);
                intent.putExtra("selectedDay", selectedDay);
                startActivity(intent);
            }
        });

        mWednesdayButton = (Button) findViewById(R.id.wednesday_button);
        mWednesdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDay = "Wednesday";
                Intent intent = new Intent(DayButton.this, DaySelected.class);
                intent.putExtra("selectedDay", selectedDay);
                startActivity(intent);
            }
        });

        mThursdayButton = (Button) findViewById(R.id.thursday_button);
        mThursdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDay = "Thursday";
                Intent intent = new Intent(DayButton.this, DaySelected.class);
                intent.putExtra("selectedDay", selectedDay);
                startActivity(intent);
            }
        });

        mFridayButton = (Button) findViewById(R.id.friday_button);
        mFridayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDay = "Friday";
                Intent intent = new Intent(DayButton.this, DaySelected.class);
                intent.putExtra("selectedDay", selectedDay);
                startActivity(intent);
            }
        });

        mSaturdayButton = (Button) findViewById(R.id.saturday_button);
        mSaturdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDay = "Saturday";
                Intent intent = new Intent(DayButton.this, DaySelected.class);
                intent.putExtra("selectedDay", selectedDay);
                startActivity(intent);
            }
        });

        mSundayButton = (Button) findViewById(R.id.sunday_button);
        mSundayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDay = "Sunday";
                Intent intent = new Intent(DayButton.this, DaySelected.class);
                intent.putExtra("selectedDay", selectedDay);
                startActivity(intent);
            }
        });


    }
}