package com.example.labfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        TextView textView = findViewById(R.id.textViewSum);
        Intent intent = getIntent();

        String  sumString = intent.getStringExtra("sumkey");
        textView.setText(sumString);

    }
}