package com.example.lab3_2;

import android.annotation.SuppressLint;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate() {
        EditText e1 = findViewById(R.id.so1);
        EditText e2 = findViewById(R.id.so2);
        EditText e3 = findViewById(R.id.so3);
        Button btn = findViewById(R.id.button);
        int number1 = Integer.parseInt(e1.getText().toString());
        int number2 = Integer.parseInt(e2.getText().toString());
        int number3 = Integer.parseInt(e3.getText().toString());
        int result = number1 + number2 + number3;
        Bundle bundle = new Bundle();
        bundle.putInt("result", result);

    }
}