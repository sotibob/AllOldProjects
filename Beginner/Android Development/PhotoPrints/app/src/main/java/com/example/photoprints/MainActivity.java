package com.example.photoprints;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int noPrints;
    double Cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText Prints = (EditText) findViewById(R.id.txtPrints);
        final RadioButton rad4x6 = (RadioButton) findViewById(R.id.rad4x6);
        final RadioButton rad5x7 = (RadioButton) findViewById(R.id.rad5x7);
        final RadioButton rad8x10 = (RadioButton) findViewById(R.id.rad8x10);
        Button  Print= (Button) findViewById(R.id.btnPrint);

        Print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView result = (TextView) findViewById(R.id.txtResult);
                noPrints = Integer.parseInt(Prints.getText().toString());
                DecimalFormat tenth = new DecimalFormat("$#.##");
                if(rad4x6.isChecked())
                {
                    if(noPrints <= 0)
                    {
                        Toast.makeText(MainActivity.this, "Please input a number greater than 0", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Cost = noPrints * 0.19;
                        result.setText("The order cost is " + tenth.format(Cost));
                    }
                }
                else if(rad5x7.isChecked())
                {
                    if(noPrints <= 0)
                    {
                        Toast.makeText(MainActivity.this, "Please input a number greater than 0", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Cost = noPrints * 0.49;
                        result.setText("The order cost is " + tenth.format(Cost));
                    }
                }
                else if(rad8x10.isChecked())
                {
                    if(noPrints == 0)
                    {
                        Toast.makeText(MainActivity.this, "Please input a number greater than 0", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Cost = noPrints * 0.79;
                        result.setText("The order cost is " + tenth.format(Cost));
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please choose a size", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}