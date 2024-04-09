package com.example.lab3_4;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClicked();
    }
    public void onClicked(){
        EditText username=findViewById(R.id.usernameEditText);
        EditText password=findViewById(R.id.passwordEditText);
        Button button=findViewById(R.id.loginButton);
        button.setOnClickListener(v -> {
            String usernameedittext=username.getText().toString();
            String passwordedittext=password.getText().toString();
            if(usernameedittext.equals(passwordedittext)){
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ImageFragment imageFragment=new ImageFragment();
                ft.add(R.id.relative_layout,imageFragment);
                ft.commit();
            }else{
                Toast.makeText(getApplicationContext(),"Tài khoản hoac mật khau khong khop",Toast.LENGTH_LONG).show();
            }
        });
    }
}