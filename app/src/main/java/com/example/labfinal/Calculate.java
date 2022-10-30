package com.example.labfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        EditText num2 = findViewById(R.id.etNum2);
        EditText num1 = findViewById(R.id.etNum2);
        Button SumBtn = findViewById(R.id.Sumbtn);

     SumBtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             int x = Integer.parseInt(num1.getText().toString());
             int y = Integer.parseInt(num2.getText().toString());
             int z = x+y;
             String sent = (z+"");
             Intent senter = new Intent(Calculate.this,Output.class);
             senter.putExtra("sumkey",sent);
             startActivity(senter);

         }
     });

    }
}