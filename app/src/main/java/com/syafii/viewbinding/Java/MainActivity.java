package com.syafii.viewbinding.Java;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.syafii.viewbinding.databinding.ActivityMainBinding;


/**
 * Created by Muhamad Syafii
 * Monday,24/08/2020
 * Copyright (c) 2020.
 * All Rights Reserved
 */

public class MainActivity extends AppCompatActivity {

    //call the class of you want binding
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        //this is call id from main activity
        //this is Text View
        binding.tvTitleJava.setText("Ini Adalah Aplikasi Untuk implement View Binding dengan bahasa Java");

        //this Is button
        binding.btnTestJava.setText("Button");
        binding.btnTestJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}