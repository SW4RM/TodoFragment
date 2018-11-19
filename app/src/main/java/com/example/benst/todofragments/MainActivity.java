package com.example.benst.todofragments;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        //here we a setting up the fragment manager meaning this class will*
        // *be responsible for the fragment objects being utilised by the program.


        if (fragment == null){

            fragment = new TodoFragment();

            fm.beginTransaction()

                    .add(R.id.fragment_container, fragment)

                    .commit();

        }

    }

}