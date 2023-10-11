package com.bignerdranch.android.basicdancenyc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DaySelected extends AppCompatActivity {

    private TextView selectedDayTextView;
    private ListView classListView;
    private ArrayList<DanceClass> theList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_selected);

        String selectedDay = getIntent().getStringExtra("selectedDay");
        selectedDayTextView = findViewById(R.id.selectedDayTextView);
        selectedDayTextView.setText(selectedDay);

        ClassLibrary lib = ClassLibrary.getInstance();
        theList = lib.getClasses();

        LinearLayout display = findViewById(R.id.class_display);

        for(DanceClass danceClass :theList){
            Log.d("Debug", "Class Day: " + danceClass.getDay());
            if(danceClass.getDay().equals(selectedDay)){
                TextView textView = new TextView(this);
                textView.setText(danceClass.getClassDay());

                display.addView(textView);

            }


        }


    }
}