package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView =findViewById(R.id.list_items);
        List<String> list=new ArrayList();

        list.add("المربع");
        list.add("المثلث");
        list.add("الدائرة");
        list.add("المستطيل");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setSelection(-1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                if (position ==0) {
                    //chicked Square
                    startActivity(new Intent(MainActivity2.this, MainActivity5.class));
                } else if (position==1) {
                    //chicked Triangle
                    startActivity(new Intent(MainActivity2.this, MainActivity6.class));

                } else if (position ==2) {
                    //chicked Circle
                    startActivity(new Intent(MainActivity2.this, MainActivity7.class));
                } else if (position==3) {
                    //chicked Rectangle
                    startActivity(new Intent(MainActivity2.this, MainActivity8.class));

                }

            }
        });



    }
}