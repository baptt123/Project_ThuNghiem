package com.example.listview;

import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView=findViewById(R.id.listView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getListView();
    }
    public void getListView(){
        User user1=new User("tantt121","tanbadao123");
        User user2=new User("hungtt121","hungbadao123");
        ArrayList<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        ArrayAdapter<User> userArrayAdapter=new ArrayAdapter<User>(this, android.R.layout.simple_expandable_list_item_1,list);
        listView.setAdapter(userArrayAdapter);
    }
}