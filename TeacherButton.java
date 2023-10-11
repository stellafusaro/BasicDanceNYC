package com.bignerdranch.android.basicdancenyc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class TeacherButton extends AppCompatActivity implements TeacherButtonAdapter.OnTeacherNameClickListener {

    ArrayList<DanceClass> theList;
    ArrayList<DanceClass> theActualList;
    ArrayList<String> uniqueTeachers;

    String selectedTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_button);

        RecyclerView recyclerView = findViewById(R.id.mRecycleView);

        ClassLibrary lib = ClassLibrary.getInstance();
        theList = lib.getClasses();

        uniqueTeachers= new ArrayList<>();
        theActualList = new ArrayList<>();

        for(DanceClass danceClass: theList) {
            String teacher=danceClass.getTeacher();

            if(!uniqueTeachers.contains(teacher)){
                uniqueTeachers.add(teacher);
                theActualList.add(danceClass);
            }
        }

        TeacherButtonAdapter adapter = new TeacherButtonAdapter(this, theActualList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onTeacherNameClick(String theName) {
        selectedTeacher = theName;
        Intent intent = new Intent(TeacherButton.this, TeacherSelected.class);
        intent.putExtra("selectedTeacher", selectedTeacher);
        startActivity(intent);
    }
}
