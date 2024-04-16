package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {
    private Button btnPress;
    private Button press;
    private TextView res;
    private EditText edtRec1;
    private EditText edtRec2;
    private EditText edtTRA1;
    private EditText edtTRA2;
    private EditText edtTRA3;
    private EditText edtCR;
    private EditText edtSEq;
    private TableRow TRSQ;
    private TableRow TRTR;
    private TableRow TRTR2;
    private TableRow TRTR3;
    private TableRow TRCR;
    private TableRow TRRE1;
    private TableRow TRRE2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        edtSEq=findViewById(R.id.edt_seq);
        edtTRA1=findViewById(R.id.edt_tr1);
        edtTRA2=findViewById(R.id.edt_tr2);
        edtTRA3=findViewById(R.id.edt_tr3);
        edtCR=findViewById(R.id.edt_cr);
        edtRec1=findViewById(R.id.edt_rec1);
        edtRec2=findViewById(R.id.edt_rec2);
        res=findViewById(R.id.edt_result);
        press=findViewById(R.id.btnPress);

        TRSQ=findViewById(R.id.TRSQ);
        TRTR=findViewById(R.id.TRTR);
        TRTR2=findViewById(R.id.TRTR2);
        TRTR3=findViewById(R.id.TRTR3);
        TRCR=findViewById(R.id.TRCR);
        TRRE1=findViewById(R.id.TRRE1);
        TRRE2=findViewById(R.id.TRRE2);

        Intent intett=getIntent();
        int positionn=intett.getIntExtra("pos",-1);

        if (positionn==0){

            TRSQ.setVisibility(View.VISIBLE);


        } else if (positionn ==1) {

            TRTR.setVisibility(View.VISIBLE);
            TRTR2.setVisibility(View.VISIBLE);
            TRTR3.setVisibility(View.VISIBLE);

        }else if (positionn ==2){

            TRCR.setVisibility(View.VISIBLE);

        }else if (positionn ==3){

            TRRE1.setVisibility(View.VISIBLE);
            TRRE2.setVisibility(View.VISIBLE);
        }

        press.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (positionn==0){
                    if (!edtSEq.getText().toString().isEmpty()) {
                        double se1 = Double.parseDouble(edtSEq.getText().toString());
                        double RESS = 4.0 * se1;
                        String formattedResult = String.format("%.2f", RESS);

                        res.setText(formattedResult);
                    }else {
                        Toast.makeText(MainActivity9.this, "empty input", Toast.LENGTH_SHORT).show();
                    }
                } else if (positionn ==1) {


                    if (!edtTRA1.getText().toString().isEmpty() & !edtTRA2.getText().toString().isEmpty() & !edtTRA3.getText().toString().isEmpty() ) {
                        double tr1=Double.parseDouble(edtTRA1.getText().toString());
                        double tr2=Double.parseDouble(edtTRA2.getText().toString());
                        double tr3=Double.parseDouble(edtTRA3.getText().toString());
                        double RES2=tr1+tr2+tr3;
                        String formattedResult = String.format("%.2f", RES2);

                        res.setText(formattedResult);
                    }else {
                        Toast.makeText(MainActivity9.this, "empty input", Toast.LENGTH_SHORT).show();
                    }
                }else if (positionn ==2){
                    if (!edtCR.getText().toString().isEmpty() ){
                        double cr1=Double.parseDouble(edtCR.getText().toString());
                        double RESS=(2*cr1*3.14159);
                        String formattedResult = String.format("%.2f", RESS);
                        res.setText(formattedResult);
                    }else {
                        Toast.makeText(MainActivity9.this, "empty input", Toast.LENGTH_SHORT).show();
                    }

                }else if (positionn ==3){
                    if (!edtRec1.getText().toString().isEmpty() & !edtRec2.getText().toString().isEmpty()  ) {
                        double re1 = Double.parseDouble(edtRec1.getText().toString());
                        double re2 = Double.parseDouble(edtRec2.getText().toString());


                        double RES2=(2*re1)+(2*re2);

                        String formattedResult = String.format("%.2f", RES2);
                        res.setText(formattedResult);
                    }else {
                        Toast.makeText(MainActivity9.this, "empty input", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });




    }
}