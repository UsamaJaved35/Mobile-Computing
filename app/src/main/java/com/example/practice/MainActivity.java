package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        listView=findViewById(R.id.listView);
        ArrayList<String> friendList=new ArrayList<String>();
        friendList.add("usama");
        friendList.add("zaman");
        friendList.add("ahmad");
        friendList.add("osama");
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,friendList);
        Collections.sort(friendList);
        listView.setAdapter(arrayAdapter);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                friendList.add(editText.getText().toString());
//                arrayAdapter.notifyDataSetChanged();
//            }});
    }
    }