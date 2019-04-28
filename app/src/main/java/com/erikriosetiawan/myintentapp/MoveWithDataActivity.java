package com.erikriosetiawan.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    protected static final String EXTRA_NAME = "extra_name";
    protected static final String EXTRA_AGE = "extra_age";

    TextView textDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        textDataReceived = findViewById(R.id.tv_data_received);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = "Nama saya : " + name +"\nUmur Saya : " + age;

        textDataReceived.setText(text);
    }
}
