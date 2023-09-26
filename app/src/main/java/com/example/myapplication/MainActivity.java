package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.
    }
}