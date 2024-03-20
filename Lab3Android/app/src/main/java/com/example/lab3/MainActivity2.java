package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
    }
    public void ClickButton(){
        Button btn_2=findViewById(R.id.button2);
        btn_2.setOnClickListener(v -> {
            Intent intent_2=new Intent(this,MainActivity.class);
            startActivity(intent_2);
        });
    }
}
