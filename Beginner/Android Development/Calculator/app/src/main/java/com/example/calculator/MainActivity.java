package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    String OperatorChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Num1 = (EditText)findViewById(R.id.txtNum1);
        final EditText Num2 = (EditText)findViewById(R.id.txtNum2);
        final Spinner Operators = (Spinner)findViewById(R.id.txtOperators);
        Button Calculate = (Button)findViewById(R.id.btnCalculate);

        Calculate.setOnClickListener(new View.OnClickListener() {
            final TextView Answer = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View v) {
                OperatorChoice = Operators.getSelectedItem().toString();
                DecimalFormat tenth = new DecimalFormat("#.###");
                switch (OperatorChoice) {
                    case "Plus": {
                        int Number1 = Integer.parseInt(Num1.getText().toString());
                        int Number2 = Integer.parseInt(Num2.getText().toString());
                        int FinalAnswer = Number1 + Number2;
                        Answer.setText("Your answer is " + tenth.format(FinalAnswer));
                        break;
                    }
                    case "Minus": {
                        int Number1 = Integer.parseInt(Num1.getText().toString());
                        int Number2 = Integer.parseInt(Num2.getText().toString());
                        int FinalAnswer = Number1 - Number2;
                        Answer.setText("Your answer is " + tenth.format(FinalAnswer));
                        break;
                    }
                    case "Multiplied by": {
                        int Number1 = Integer.parseInt(Num1.getText().toString());
                        int Number2 = Integer.parseInt(Num2.getText().toString());
                        int FinalAnswer = Number1 * Number2;
                        Answer.setText("Your answer is " + tenth.format(FinalAnswer));
                        break;
                    }
                    case "Divided by": {
                        double Number1 = Double.parseDouble(Num1.getText().toString());
                        double Number2 = Double.parseDouble(Num2.getText().toString());
                        if(Number2 == 0){
                            Answer.setText("Cannnot Divide by Zero(0)");
                        }
                        else{
                        double FinalAnswer = Number1 / Number2;
                        Answer.setText("Your answer is " + tenth.format(FinalAnswer));
                        }
                        break;
                    }
                }
            }
        });
    }
}