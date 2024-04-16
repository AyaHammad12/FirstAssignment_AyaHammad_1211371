package com.example.myapplication1;
import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity3 extends AppCompatActivity {

    private EditText Q1;
    private EditText Q2;
    private EditText Q3;
    private EditText Q4;
    private EditText Q5;
    private EditText Q6;
    private CheckBox checkBox;
    private Button btnSave;
    private boolean flag = false;


    private static final String PREF_KEY_QUESTION_1 = "question_1_answer";
    private static final String PREF_KEY_QUESTION_2 = "question_2_answer";
    private static final String PREF_KEY_QUESTION_3 = "question_3_answer";
    private static final String PREF_KEY_QUESTION_4 = "question_4_answer";
    private static final String PREF_KEY_QUESTION_5 = "question_5_answer";
    private static final String PREF_KEY_QUESTION_6 = "question_6_answer";
    private static final String FLAF = "FLAG";

    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;


    private boolean running;
    private int second;
    private String QUESTION_1;
    private String QUESTION_2;
    private String QUESTION_3;
    private String QUESTION_4;
    private String QUESTION_5;
    private String QUESTION_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setUpViews();
        setUpSharedPreferences();
//        set();
        checkedPrefs();

        checkInstance(savedInstanceState);
        setBoolean(true);
        runTimer();

    }
    //        Q1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (!hasFocus) {
//                    Q1OnFinishTyping();
//                }
//            }
//        });
    public void btnSaveOnClick(View view) {

                    Q1OnFinishTyping();
                    Q2OnFinishTyping();
                    Q3OnFinishTyping();
                    Q4OnFinishTyping();
                    Q5OnFinishTyping();
                    Q6OnFinishTyping();
    }

    private void Q1OnFinishTyping() {
        String input = Q1.getText().toString().trim();
        if (QUESTION_1.isEmpty() && !input.isEmpty()) {

//            Toast.makeText(MainActivity3.this, " answer Q_1"+input, Toast.LENGTH_SHORT).show();
            Boolean b= input.equalsIgnoreCase("المثلث");
//            Toast.makeText(MainActivity3.this, " boolean  Q_1"+b, Toast.LENGTH_SHORT).show();
            if (input.equalsIgnoreCase("مثلث") || input.equalsIgnoreCase("المثلث")) {
                Toast.makeText(this, "Answer saved for Q1: " + input, Toast.LENGTH_SHORT).show();
                editor.putString(PREF_KEY_QUESTION_1, input);
                editor.putBoolean(FLAF, true);
                editor.commit();
            }
            else  {
                Toast.makeText(MainActivity3.this, "Wrong answer Q_1", Toast.LENGTH_SHORT).show();

            }

        }

    }
    public void Q2OnFinishTyping() {
        String input=Q2.getText().toString().trim();
        if(QUESTION_2.isEmpty() && !input.isEmpty()) {
//            Toast.makeText(this, "inside", Toast.LENGTH_SHORT).show();

//            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            boolean n = input.equalsIgnoreCase("4a");
//            Toast.makeText(this, "Text equals n boolean: " + n, Toast.LENGTH_SHORT).show();

            if (!n) {
                Toast.makeText(this, "Text entered: Wrong answer for Q2", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Answer saved for Q2: " + input, Toast.LENGTH_SHORT).show();
                editor.putString(PREF_KEY_QUESTION_2, input);
                editor.putBoolean(FLAF, true);

                editor.commit();

            }

        }
    }

    private void set(){
        editor.putString(PREF_KEY_QUESTION_1, "");
        editor.putString(PREF_KEY_QUESTION_2, "");
        editor.putString(PREF_KEY_QUESTION_3, "");
        editor.putString(PREF_KEY_QUESTION_4, "");
        editor.putString(PREF_KEY_QUESTION_5, "");
        editor.putString(PREF_KEY_QUESTION_6, "");
        editor.putBoolean(FLAF, false);

        editor.commit();
    }
    public void Q3OnFinishTyping() {
        String input=Q3.getText().toString().trim();
        if(QUESTION_3.isEmpty() && !input.isEmpty()) {
//            Toast.makeText(this, "Q3inside", Toast.LENGTH_SHORT).show();

//            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            boolean n = (input.equalsIgnoreCase("مربع") || input.equalsIgnoreCase("المربع"));
//            Toast.makeText(this, "Q3 Text equals n boolean: " + n, Toast.LENGTH_SHORT).show();

            if (!n) {
                Toast.makeText(this, "Q3 Text entered: Wrong answer  ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Q3 Answer saved : " + input, Toast.LENGTH_SHORT).show();
                editor.putString(PREF_KEY_QUESTION_3, input);
                editor.putBoolean(FLAF, true);

                editor.commit();

            }

        }
//
//        if(QUESTION_3.isEmpty()) {
//            String input=Q3.getText().toString().trim();
//            if (input.equalsIgnoreCase("مربع") || input.equalsIgnoreCase("المربع")) {
//                editor.putString(PREF_KEY_QUESTION_3, input);
//                editor.putBoolean(FLAF, true);
//                Toast.makeText(this, "Answer saved for Q3: " + input, Toast.LENGTH_SHORT).show();
//                editor.commit();
//            } else {
//                Toast.makeText(this, "Text entered: Wrong answer Q3", Toast.LENGTH_SHORT).show();
//
//            }
//        }
    }
    public void Q4OnFinishTyping() {

        String input=Q4.getText().toString().trim();
        if(QUESTION_4.isEmpty()  && !input.isEmpty()) {
//            Toast.makeText(this, "Q4inside", Toast.LENGTH_SHORT).show();

//            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            boolean n = (input.equalsIgnoreCase("مستطيل") || input.equalsIgnoreCase("المستطيل"));
//            Toast.makeText(this, "Q4 Text equals n boolean: " + n, Toast.LENGTH_SHORT).show();

            if (!n) {
                Toast.makeText(this, "Q4 Text entered: Wrong answer  ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Q4 Answer saved : " + input, Toast.LENGTH_SHORT).show();
                editor.putString(PREF_KEY_QUESTION_4, input);
                editor.putBoolean(FLAF, true);

                editor.commit();

            }

        }
//        if (QUESTION_4.isEmpty()) {
//            String input = Q4.getText().toString().trim();
//            if (input.equalsIgnoreCase("مستطيل") || input.equalsIgnoreCase("المستطيل")) {
//                editor.putString(PREF_KEY_QUESTION_4, input);
//                editor.putBoolean(FLAF, true);
//                Toast.makeText(this, "Answer saved for Q4: " + input, Toast.LENGTH_SHORT).show();
//                editor.commit();
//            } else {
//                Toast.makeText(this, "Text entered: Wrong answer Q4", Toast.LENGTH_SHORT).show();
//
//            }
//        }
    }
    public void Q5OnFinishTyping() {


        String input=Q5.getText().toString().trim();
        if(QUESTION_5.isEmpty() && !input.isEmpty()) {
//            Toast.makeText(this, "Q5inside", Toast.LENGTH_SHORT).show();

//            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            boolean n =  (input.equalsIgnoreCase("a+b+c"));
//            Toast.makeText(this, "Q5 Text equals n boolean: " + n, Toast.LENGTH_SHORT).show();

            if (!n) {
                Toast.makeText(this, "Q5 Text entered: Wrong answer  ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Q5 Answer saved : " + input, Toast.LENGTH_SHORT).show();
                editor.putString(PREF_KEY_QUESTION_5, input);
                editor.putBoolean(FLAF, true);

                editor.commit();

            }

        }
//
//        if (QUESTION_5.isEmpty()) {
//            String input = Q5.getText().toString().trim();
//            if (input.equalsIgnoreCase("a+b+c")) {
//                editor.putString(PREF_KEY_QUESTION_5, input);
//                editor.putBoolean(FLAF, true);
//                Toast.makeText(this, "Answer saved for Q5: " + input, Toast.LENGTH_SHORT).show();
//                editor.commit();
//            } else {
//                Toast.makeText(this, "Text entered: Wrong answer Q5", Toast.LENGTH_SHORT).show();
//
//            }
//        }
    }
    public void Q6OnFinishTyping() {
        String input=Q6.getText().toString().trim();
        if(QUESTION_6.isEmpty()&& !input.isEmpty()) {
//            Toast.makeText(this, "Q6inside", Toast.LENGTH_SHORT).show();

//            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            boolean n =   (input.equalsIgnoreCase("درائره") || input.equalsIgnoreCase("الدائره") || input.equalsIgnoreCase("درائرة") || input.equalsIgnoreCase("الدائرة")) ;
//            Toast.makeText(this, "Q6 Text equals n boolean: " + n, Toast.LENGTH_SHORT).show();

            if (!n) {
                Toast.makeText(this, "Q6 Text entered: Wrong answer  ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Q6 Answer saved : " + input, Toast.LENGTH_SHORT).show();
                editor.putString(PREF_KEY_QUESTION_6, input);
                editor.putBoolean(FLAF, true);

                editor.commit();

            }

        }
//
//        if (QUESTION_6.isEmpty()) {
//          String input= Q6.getText().toString().trim();
//            if (input.equalsIgnoreCase("درائره") || input.equalsIgnoreCase("الدائره") || input.equalsIgnoreCase("درائرة") || input.equalsIgnoreCase("الدائرة")) {
//                editor.putString(PREF_KEY_QUESTION_6, input);
//                editor.putBoolean(FLAF, true);
//                Toast.makeText(this, "Answer saved for Q5: " + input, Toast.LENGTH_SHORT).show();
//                editor.commit();
//            } else {
//                Toast.makeText(this, "Text entered: Wrong answer Q6", Toast.LENGTH_SHORT).show();
//
//            }
//        }
    }


    private void checkedPrefs() {
        flag=prefs.getBoolean(FLAF,false);
        if (flag){
            QUESTION_1 = prefs.getString(PREF_KEY_QUESTION_1, "");
            QUESTION_2 = prefs.getString(PREF_KEY_QUESTION_2, "");
            QUESTION_3 = prefs.getString(PREF_KEY_QUESTION_3, "");
            QUESTION_4 = prefs.getString(PREF_KEY_QUESTION_4, "");
            QUESTION_5 = prefs.getString(PREF_KEY_QUESTION_5, "");
            QUESTION_6 = prefs.getString(PREF_KEY_QUESTION_6, "");

            if (!QUESTION_1.isEmpty()){
                Q1.setText(QUESTION_1);
            }
            if (!QUESTION_2.isEmpty()){
                Q2.setText(QUESTION_2);
            }
            if (!QUESTION_3.isEmpty()){
                Q3.setText(QUESTION_3);
            }
            if (!QUESTION_4.isEmpty()){
                Q4.setText(QUESTION_4);
            }
            if (!QUESTION_5.isEmpty()){
                Q5.setText(QUESTION_5);
            }
            if (!QUESTION_6.isEmpty()){
                Q6.setText(QUESTION_6);
            }
            checkBox.setChecked(true);
        }

    }




    private void setUpSharedPreferences() {
          prefs= PreferenceManager.getDefaultSharedPreferences(this);
          editor=prefs.edit();
    }


    private void setUpViews() {
        Q1 = findViewById(R.id.Q1);
        Q2 = findViewById(R.id.Q2);
        Q3 = findViewById(R.id.Q3);
        Q4 = findViewById(R.id.Q4);
        Q5 = findViewById(R.id.Q5);
        Q6 = findViewById(R.id.Q6);
        checkBox= findViewById(R.id.checkBox);
        btnSave=findViewById(R.id.btnPress);


    }

// ...................................................................................

    private void runTimer() {
        final  TextView txtTimse=findViewById(R.id.textTime);

        final Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours=second/3600;
                int mintes=(second%3600)/60;
                int sec=second%60;
                int sece=((second%3600)%60);
//                String time=hours +" : "+mintes+" : "+sec;
                String time=sec +" : "+mintes+" : "+hours;


                txtTimse.setText(time);

                if (running){
                    second++;
                }
                handler.postDelayed(this,1000);
            }
        });
    }

    public void CheckBoxOnClick(View view) {
        flag=true;
        editor.putBoolean(FLAF,true);
        editor.commit();


    }


    @Override
    protected void onPause() {
        super.onPause();
        if (running) {
            setBoolean(false);
        }
        Q1OnFinishTyping();
        Q2OnFinishTyping();
        Q3OnFinishTyping();
        Q4OnFinishTyping();
        Q5OnFinishTyping();
        Q6OnFinishTyping();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!running) {
            setBoolean(true);
        }
        checkedPrefs();
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("second",second);
        outState.putBoolean("running",running);

    }

    private void setBoolean (Boolean falge){
        running=falge;

    }
    private void checkInstance(Bundle savedInstanseState){
        if (savedInstanseState != null){
            second=savedInstanseState.getInt("second");
            running=savedInstanseState.getBoolean("running");
        }
    }



}
