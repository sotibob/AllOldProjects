package com.example.movieticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class BuyTicket extends AppCompatActivity {
    int TicketQuantity;
    int PriceCalc;
    double TaxCalc;
    double TotalCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_ticket);
        final EditText noT = (EditText) findViewById(R.id.noTicket);
        Button Calculate = (Button) findViewById(R.id.btnCalc);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView Price = (TextView) findViewById(R.id.price);
                final TextView Tax = (TextView) findViewById(R.id.tax);
                final TextView Total = (TextView) findViewById(R.id.total);
                DecimalFormat tenth = new DecimalFormat("$#.##");
                TicketQuantity = Integer.parseInt(noT.getText().toString());
                if (TicketQuantity != 0) {
                    PriceCalc = TicketQuantity * 15;
                    TaxCalc = PriceCalc * 0.08;
                    TotalCalc = PriceCalc + TaxCalc;
                    Price.setText("Ticket Price: " + tenth.format(PriceCalc));
                    Tax.setText("Tax: " + tenth.format(TaxCalc));
                    Total.setText("Total: " + tenth.format(TotalCalc));
                } else
                {
                    Toast.makeText(BuyTicket.this, "Please input a number greater than 0", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}