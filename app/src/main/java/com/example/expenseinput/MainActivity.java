package com.example.expenseinput;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ev, ev1, ev2, ev3, ev4, ev5, ev6, ev7, ev8, ev9, ev10;
    TextView sumOfU;
    TextView sumOfF;
    TextView sumOfM;
    TextView sumOfMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ev = findViewById(R.id.ev);
        ev1 = findViewById(R.id.ev1);
        ev2 = findViewById(R.id.ev2);
        ev3 = findViewById(R.id.ev3);
        ev4 = findViewById(R.id.ev4);
        ev5 = findViewById(R.id.ev5);
        ev6 = findViewById(R.id.ev6);
        ev7 = findViewById(R.id.ev7);
        ev8 = findViewById(R.id.ev8);
        ev9 = findViewById(R.id.ev9);
        ev10 = findViewById(R.id.ev10);
        sumOfU = findViewById(R.id.sumOfU);
        sumOfF=findViewById(R.id.sumOfF);
        sumOfM=findViewById(R.id.sumOfM);
        sumOfMe=findViewById(R.id.sumOfMe);

    }

    public void ComputeExpenses(View view) {
        if (
                ev10.getText().toString().isEmpty() ||
                        ev.getText().toString().isEmpty() ||//check if fields are empty then tells you to fill them in if they are
                        ev1.getText().toString().isEmpty() ||
                        ev2.getText().toString().isEmpty() ||
                        ev3.getText().toString().isEmpty() ||
                        ev4.getText().toString().isEmpty() ||
                        ev5.getText().toString().isEmpty() ||
                        ev6.getText().toString().isEmpty() ||
                        ev7.getText().toString().isEmpty() ||
                        ev8.getText().toString().isEmpty() ||
                        ev9.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Fill in all fields",
                    Toast.LENGTH_LONG).show();
        } else {
            float g1, g2, g3, g4, g5, g6, g7, g8, g9, g, g10;
            g1 = Float.parseFloat(ev1.getText().toString());
            g2 = Float.parseFloat(ev2.getText().toString());
            g3 = Float.parseFloat(ev3.getText().toString());
            g4 = Float.parseFloat(ev4.getText().toString());
            g5 = Float.parseFloat(ev5.getText().toString());
            g6 = Float.parseFloat(ev6.getText().toString());
            g7 = Float.parseFloat(ev7.getText().toString());
            g8 = Float.parseFloat(ev8.getText().toString());
            g9 = Float.parseFloat(ev9.getText().toString());
            g = Float.parseFloat(ev.getText().toString());
            g10 = Float.parseFloat(ev10.getText().toString());

            Intent n = new Intent(this, com.example.expenseinput.ResultsExpense.class);
            n.putExtra("1", g1);
            n.putExtra("2", g2);
            n.putExtra("3", g3);
            n.putExtra("4", g4);
            n.putExtra("5", g5);
            n.putExtra("6", g6);
            n.putExtra("7", g7);
            n.putExtra("8", g8);
            n.putExtra("9", g9);
            n.putExtra("0", g);
            n.putExtra("10", g10);

            startActivity(n);
        }
    }

    public void USum(View view) {
        if (ev2.getText().toString().isEmpty() || //check if fields are empty then tells you to fill them in if they are
                ev3.getText().toString().isEmpty() ||
                ev4.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Fill in all fields",
                    Toast.LENGTH_LONG).show();
        } else {
            float s1, s2, s3;
            s1 = Float.parseFloat(ev2.getText().toString());
            s2 = Float.parseFloat(ev3.getText().toString());
            s3 = Float.parseFloat(ev4.getText().toString());
            float sumofU2 = (s1 + s2 + s3);
            sumOfU.setText("$" + String.format("%.2f", sumofU2));
        }
    }

    public void FSum(View view) {
        if (ev5.getText().toString().isEmpty() ||
                ev6.getText().toString().isEmpty()){

            Toast.makeText(MainActivity.this, "Fill in all fields",
                    Toast.LENGTH_LONG).show();
        } else {
            float f1, f2;
            f1 = Float.parseFloat(ev5.getText().toString());
            f2 = Float.parseFloat(ev6.getText().toString());
            float sumofF2 = (f1 + f2);
            sumOfF.setText("$" + String.format("%.2f", sumofF2));


        }

    }

    public void MSum(View view) {
        if (ev7.getText().toString().isEmpty() ||
                ev8.getText().toString().isEmpty() ||
                ev9.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Fill in all fields",
                    Toast.LENGTH_LONG).show();
        } else {
            float f3, f4, f5;
            f3 = Float.parseFloat(ev7.getText().toString());
            f4 = Float.parseFloat(ev8.getText().toString());
            f5 = Float.parseFloat(ev9.getText().toString());
            float sumofM2 = (f3 + f4 + f5);
            sumOfM.setText("$" + String.format("%.2f", sumofM2));


        }

    }

    public void MeSum(View view) {
        if (ev.getText().toString().isEmpty() ||
                ev10.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Fill in all fields",
                    Toast.LENGTH_LONG).show();
        } else {
            float f6, f7;
            f6 = Float.parseFloat(ev.getText().toString());
            f7 = Float.parseFloat(ev10.getText().toString());
            float sumofMe2 = (f6 + f7);
            sumOfMe.setText("$" + String.format("%.2f", sumofMe2));


        }

    }
}