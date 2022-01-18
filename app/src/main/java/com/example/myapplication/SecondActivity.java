package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Log> activities;
    ArrayList<Time> timestamps;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
        gridView = findViewById(R.id.myGridLIst);

        activities = (ArrayList<Log>) getIntent().getSerializableExtra("act");
        timestamps = (ArrayList<Time>) getIntent().getSerializableExtra("time");
        GridAdapter gridAdapter = new GridAdapter(SecondActivity.this, activities, timestamps);
        gridView.setAdapter(gridAdapter);


    }



}

