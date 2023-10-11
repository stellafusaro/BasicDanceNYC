package com.bignerdranch.android.basicdancenyc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TeacherSelected extends AppCompatActivity {
    private TextView selectedTeacherTextView;
    private ListView classListView;
    private ArrayList<DanceClass> theList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_selected);

        String selectedTeacher = getIntent().getStringExtra("selectedTeacher");
        selectedTeacherTextView = findViewById(R.id.selectedTeacherTextView);
        selectedTeacherTextView.setText(selectedTeacher);

        ClassLibrary lib = ClassLibrary.getInstance();
        theList = lib.getClasses();

        LinearLayout display = findViewById(R.id.class_show);

        for(DanceClass danceClass :theList){
            Log.d("Debug", "Class Day: " + danceClass.getDay());
            if(danceClass.getTeacher().equals(selectedTeacher)){
                TextView textView = new TextView(this);
                textView.setText(danceClass.getClassTeacher());

                display.addView(textView);

            }


        }


    }
}