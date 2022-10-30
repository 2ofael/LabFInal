package com.example.labfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button TostBtn = findViewById(R.id.ToastButton);
        Button Next = findViewById(R.id.NextButton);
        EditText NameEt = findViewById(R.id.NameEditText);

        TostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast ts = Toast.makeText(MainActivity.this,NameEt.getText().toString(),Toast.LENGTH_SHORT);
                ts.show();
            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calculate.class);

                startActivity(intent);
            }
        });
    }
}