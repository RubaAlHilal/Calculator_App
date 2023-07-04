package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    EditText result;
    Button SumButton;
    Button MulButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =(EditText) findViewById(R.id.editTextTextPersonName6);
        num2 =(EditText) findViewById(R.id.editTextTextPersonName4);
        result =(EditText) findViewById(R.id.editTextTextPersonName5);
        SumButton = (Button) findViewById(R.id.Sumbutton);
        MulButton = (Button) findViewById(R.id.mulButton);


        SumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                Float First = Float.parseFloat(num1.getText().toString() + " ");
                Float Second = Float.parseFloat(num2.getText().toString()+ " ");

//                sum.setText(num1 + num2 );
                result.setText(First + Second + "");

            }


        });

        MulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                Float First = Float.parseFloat(num1.getText().toString() + " ");
                Float Second = Float.parseFloat(num2.getText().toString()+ " ");

//                sum.setText(num1 + num2 );
                result.setText(First * Second + "");

            }
        });










    }
}