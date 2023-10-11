package com.bignerdranch.android.basicdancenyc;

import java.util.ArrayList;
import java.util.List;

public class ClassLibrary {
    private static ClassLibrary instance;
    private ArrayList<DanceClass> theClasses;

    private ClassLibrary(){
        theClasses = new ArrayList<>();
        DanceClass BDCB1 = new DanceClass("Int Ballet", "Ballet","Intermediate", "Tuesday", "4:30pm - 6pm", "Benjamin Briones", "Broadway Dance Center",R.drawable.benjamin_briones);
        DanceClass BDCB2 = new DanceClass("Int Ballet", "Ballet","Intermediate", "Thursday", "4:30pm - 6pm", "Benjamin Briones", "Broadway Dance Center",R.drawable.benjamin_briones);
        DanceClass BDCB3 = new DanceClass("Int Ballet", "Ballet","Intermediate", "Sunday", "1:30pm - 3pm", "Benjamin Briones", "Broadway Dance Center",R.drawable.benjamin_briones);
        DanceClass BDCB4 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Monday", "4:30pm - 6pm", "Deanna Doyle", "Broadway Dance Center",R.drawable.deanna_doyle);
        DanceClass BDCB5 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Wednesday", "4:30pm - 6pm", "Deanna Doyle", "Broadway Dance Center",R.drawable.deanna_doyle);
        DanceClass BDCB6 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Friday", "4:30pm - 6pm", "Deanna Doyle", "Broadway Dance Center",R.drawable.deanna_doyle);
        DanceClass BDCB7 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Monday", "3pm - 4:30pm", "Deanna Doyle", "Broadway Dance Center",R.drawable.deanna_doyle);
        DanceClass BDCB8 = new DanceClass("Int Ballet", "Ballet","Intermediate", "Wednesday", "10:30am - 12pm", "Deanna Doyle", "Broadway Dance Center",R.drawable.deanna_doyle);
        DanceClass BDCB9 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Wednesday", "3pm - 4:30pm", "Deanna Doyle", "Broadway Dance Center",R.drawable.deanna_doyle);
        DanceClass BDCB10 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Sunday", "3pm - 4:30pm", "Deanna Doyle", "Broadway Dance Center",R.drawable.deanna_doyle);
        DanceClass BDCB11 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Monday", "4:30pm - 6pm", "Dorit Koppel", "Broadway Dance Center",R.drawable.dorit_koppel);
        DanceClass BDCB12 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Wednesday", "4:30pm - 6pm", "Dorit Koppel", "Broadway Dance Center",R.drawable.dorit_koppel);
        DanceClass BDCB13 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Friday", "4:30pm - 6pm", "Dorit Koppel", "Broadway Dance Center",R.drawable.dorit_koppel);
        DanceClass BDCB14 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Tuesday", "12pm - 1:30pm", "Dorit Koppel", "Broadway Dance Center",R.drawable.dorit_koppel);
        DanceClass BDCB15 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Thursday", "12pm - 1:30pm", "Dorit Koppel", "Broadway Dance Center",R.drawable.dorit_koppel);
        DanceClass BDCB16 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Tuesday", "1:30pm - 3pm", "Dorit Koppel", "Broadway Dance Center",R.drawable.dorit_koppel);
        DanceClass BDCB17 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Thursday", "1:30pm - 3pm", "Dorit Koppel", "Broadway Dance Center",R.drawable.dorit_koppel);
        DanceClass BDCB18 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Thursday", "6pm - 7:30pm", "Erica Ratkovicz", "Broadway Dance Center",R.drawable.erica_ratkovicz);
        DanceClass BDCB38 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Saturday", "5pm - 6:30pm", "Erica Ratkovicz", "Broadway Dance Center",R.drawable.erica_ratkovicz);
        DanceClass BDCB19 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Sunday", "4:30pm - 6pm", "Eureka Nakano Grimes", "Broadway Dance Center",R.drawable.eureka_nakano_grimes);
        DanceClass BDCB20 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Tuesday", "10:30am - 12pm", "Jamie Salmon", "Broadway Dance Center",R.drawable.jamie_salmon);
        DanceClass BDCB21 = new DanceClass("Int Ballet", "Ballet","Intermediate", "Thursday", "10:30am - 12pm", "Jamie Salmon", "Broadway Dance Center",R.drawable.jamie_salmon);
        DanceClass BDCB22 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Saturday", "12pm - 1:30pm", "Jessica Epting", "Broadway Dance Center",R.drawable.jessica_epting);
        DanceClass BDCB23 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Sunday", "10:30am - 12pm", "Joy Karrley", "Broadway Dance Center",R.drawable.koy_karley);
        DanceClass BDCB24 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Friday", "1:30pm - 3pm", "Joy Karrley", "Broadway Dance Center",R.drawable.koy_karley);
        DanceClass BDCB25 = new DanceClass("Int Ballet", "Ballet","Intermediate", "Friday", "3pm - 4:30pm", "Kate Loh", "Broadway Dance Center",R.drawable.kate_loh);
        DanceClass BDCB26 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Tuesday", "9am - 10:30am", "Luis Villar", "Broadway Dance Center",R.drawable.louis_villar);
        DanceClass BDCB27 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Thursday", "9am - 10:30am", "Luis Villar", "Broadway Dance Center",R.drawable.louis_villar);
        DanceClass BDCB28 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Monday", "12pm - 1:30pm", "Natalya Stavro", "Broadway Dance Center",R.drawable.natalya_stavro);
        DanceClass BDCB29 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Wednesday", "12pm - 1:30pm", "Natalya Stavro", "Broadway Dance Center",R.drawable.natalya_stavro);
        DanceClass BDCB30 = new DanceClass("Adv Beg Ballet", "Ballet","Beginner", "Friday", "12pm - 1:30pm", "Natalya Stavro", "Broadway Dance Center",R.drawable.natalya_stavro);
        DanceClass BDCB31 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Monday", "6pm - 7:30pm", "Sarah Simon Wolff", "Broadway Dance Center",R.drawable.sarah_simon_wolff);
        DanceClass BDCB32 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Tuesday", "6pm - 7:30pm", "Sarah Simon Wolff", "Broadway Dance Center",R.drawable.sarah_simon_wolff);
        DanceClass BDCB33 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Monday", "9am - 10:30am", "Ted Keener", "Broadway Dance Center",R.drawable.ted_keener);
        DanceClass BDCB34 = new DanceClass("Basic Ballet", "Ballet","Beginner", "Friday", "9am - 10:30am", "Ted Keener", "Broadway Dance Center",R.drawable.ted_keener);
        DanceClass BDCB35 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Wednesday", "9am - 10:30am", "Ted Keener", "Broadway Dance Center",R.drawable.ted_keener);
        DanceClass BDCB36 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Tuesday", "3pm - 4:30pm", "Yuka Kawazu", "Broadway Dance Center",R.drawable.yuka_kawazu);
        DanceClass BDCB37 = new DanceClass("Beg Ballet", "Ballet","Beginner", "Thursday", "3pm - 4:30pm", "Yuka Kawazu", "Broadway Dance Center",R.drawable.yuka_kawazu);
        DanceClass BDCHH1 = new DanceClass("Beg Hip-Hop", "Hip-Hop","Beginner", "Monday", "12pm - 1:30pm", "Antboogie", "Broadway Dance Center",R.drawable.antboogie);
        DanceClass StepsB1 = new DanceClass("Int Ballet", "Ballet","Intermediate", "Tuesday", "1:30pm - 3pm", "Noriko Hara", "Steps on Broadway",R.drawable.noriko_hara);
        DanceClass StepsHH1 = new DanceClass("Open Hip-Hop", "Hip-Hop","Open", "Monday", "6:15pm - 7:45pm", "Yancy Greene", "Steps on Broadway",R.drawable.yancy_greene);
        DanceClass PDHH1 = new DanceClass("Beg House", "Hip-Hop","Beginner", "Friday", "11:30am - 1pm", "Huu Rock", "Peridance",R.drawable.huu_rock);
        DanceClass PDB1 = new DanceClass("Inter Ballet", "Ballet","Intermediate", "Saturday", "10:30am - 12pm", "Graciela Kozak", "Peridance",R.drawable.graciela_kozak);
        DanceClass AAEB1 = new DanceClass("Beginner Ballet", "Ballet","Beginner", "Wednesday", "6pm - 7:30pm", "Benjamin Briones", "Alvin Ailey Extension",R.drawable.benjamin_briones);
        DanceClass AAEHH1 = new DanceClass("Abs Beg Hip-Hop", "Hip-Hop","Beginner", "Thursday", "6:30pm - 8pm", "Yancy Greene", "Alvin Ailey Extension",R.drawable.yancy_greene);

        theClasses.add(BDCB1);
        theClasses.add(BDCB2);
        theClasses.add(BDCB3);
        theClasses.add(BDCB4);
        theClasses.add(BDCB5);
        theClasses.add(BDCB6);
        theClasses.add(BDCB7);
        theClasses.add(BDCB8);
        theClasses.add(BDCB9);
        theClasses.add(BDCB10);
        theClasses.add(BDCB11);
        theClasses.add(BDCB12);
        theClasses.add(BDCB13);
        theClasses.add(BDCB14);
        theClasses.add(BDCB15);
        theClasses.add(BDCB16);
        theClasses.add(BDCB17);
        theClasses.add(BDCB18);
        theClasses.add(BDCB19);
        theClasses.add(BDCB20);
        theClasses.add(BDCB21);
        theClasses.add(BDCB22);
        theClasses.add(BDCB23);
        theClasses.add(BDCB24);
        theClasses.add(BDCB25);
        theClasses.add(BDCB26);
        theClasses.add(BDCB27);
        theClasses.add(BDCB28);
        theClasses.add(BDCB29);
        theClasses.add(BDCB31);
        theClasses.add(BDCB32);
        theClasses.add(BDCB33);
        theClasses.add(BDCB34);
        theClasses.add(BDCB35);
        theClasses.add(BDCB36);
        theClasses.add(BDCB37);
        theClasses.add(BDCB38);
        theClasses.add(BDCB30);
        theClasses.add(BDCHH1);
        theClasses.add(StepsB1);
        theClasses.add(StepsHH1);
        theClasses.add(PDB1);
        theClasses.add(PDHH1);
        theClasses.add(AAEHH1);
        theClasses.add(AAEB1);



    }

    public static ClassLibrary getInstance(){
        if(instance == null){
            instance = new ClassLibrary();
        }

        return instance;
    }

    public ArrayList<DanceClass> getClasses(){
        return theClasses;
    }
}


