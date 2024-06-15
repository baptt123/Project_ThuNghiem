package com.example.lab3;

import android.content.Intent;
import android.widget.Button;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ClickButton(){
        Button btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(v -> {
            Intent intent1=new Intent(this,MainActivity2.class);
            startActivity(intent1);
        });
    }
}