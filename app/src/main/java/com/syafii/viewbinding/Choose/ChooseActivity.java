package com.syafii.viewbinding.Choose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.syafii.viewbinding.Java.MainActivity;
import com.syafii.viewbinding.databinding.ActivityChooseBinding;

public class ChooseActivity extends AppCompatActivity {

    ActivityChooseBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityChooseBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        binding.llAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.llKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseActivity.this, com.syafii.viewbinding.Kotlin.MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}