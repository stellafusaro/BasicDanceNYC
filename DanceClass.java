package com.bignerdranch.android.basicdancenyc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DanceClass {

    private String mName;
    private String mStyle;
    private String mLevel;
    private String mDay;
    private String mTime;
    private String mTeacher;
    private String mSchool;
    private int mImage;

    public DanceClass(String name, String style, String level, String day, String time, String teacher, String school, int image ){

        mName = name;
        mStyle = style;
        mLevel = level;
        mDay = day;
        mTime = time;
        mTeacher = teacher;
        mSchool = school;
        mImage = image;

    }


    public String getClassDay(){
        return mTime + " " + mName + " with " + mTeacher + " @ " + mSchool;

    }

    public String getClassTeacher(){
        return mTime + " on " + mDay + " " + mName + " @ " + mSchool;
    }

    public String getStyle(){
        return mStyle;
    }

    public String getSchool(){
        return mSchool;
    }
    public String getDay(){
        return mDay;
    }

    public String getLevel(){
        return mLevel;
    }

    public int getImage(){ return mImage;}

    public String getTeacher(){return mTeacher;}

}