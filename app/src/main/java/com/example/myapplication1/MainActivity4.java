package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinner2=findViewById(R.id.spinner2);
        List<String> list=new ArrayList<>();

        list.add("مربع ");
        list.add("مثلث ");
        list.add("دائرة ");
        list.add("مستطيل ");
        list.add("اختار");

        ArrayAdapter adapter1=new ArrayAdapter(MainActivity4.this, android.R.layout.simple_expandable_list_item_1,list);
        spinner2.setAdapter(adapter1);
        spinner2.setSelection(4, false);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 4) {
                    Intent intent = new Intent(MainActivity4.this, MainActivity9.class);
                    intent.putExtra("pos", position);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle the event when nothing is selected, if needed
                Toast.makeText(MainActivity4.this, "Nothing selected", Toast.LENGTH_SHORT).show();
            }

        });

    }
}