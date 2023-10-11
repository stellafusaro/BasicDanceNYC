package com.bignerdranch.android.basicdancenyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mTeacherButton;
    private Button mDayButton;
    Object v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDayButton = (Button) findViewById(R.id.day_button);
        mDayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, DayButton.class);
                startActivity(intent);

            }
        });

        mTeacherButton = (Button) findViewById(R.id.teacher_button);
        mTeacherButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TeacherButton.class);
                startActivity(intent);

            }
        });
    }
}