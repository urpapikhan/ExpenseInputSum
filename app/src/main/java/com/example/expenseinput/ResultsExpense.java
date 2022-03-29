package com.example.expenseinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsExpense extends AppCompatActivity {
    TextView textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17;
    float g1,g2,g3,g4,g5,g6,g7,g8,g9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_expense);
        textView9=(TextView) findViewById(R.id.textView9);
        textView10=(TextView) findViewById(R.id.textView10);
        textView11=(TextView) findViewById(R.id.textView11);
        textView12=(TextView) findViewById(R.id.textView12);
        textView13=(TextView) findViewById(R.id.textView13);
        textView14=(TextView) findViewById(R.id.textView14);
        textView15=(TextView) findViewById(R.id.textView15);
        textView16=(TextView) findViewById(R.id.textView16);
        textView17=(TextView) findViewById(R.id.textView17);

        Intent recInt=getIntent();

        textView9.setText(""+recInt.getFloatExtra("1",g1));
        textView10.setText(""+recInt.getFloatExtra("2",g2));
        textView11.setText(""+recInt.getFloatExtra("3",g3));
        textView12.setText(""+recInt.getFloatExtra("4",g4));
        textView13.setText(""+recInt.getFloatExtra("5",g5));
        textView14.setText(""+recInt.getFloatExtra("6",g6));
        textView15.setText(""+recInt.getFloatExtra("7",g7));
        textView16.setText(""+recInt.getFloatExtra("8",g8));
        textView17.setText(""+recInt.getFloatExtra("9",g9));

    }
}