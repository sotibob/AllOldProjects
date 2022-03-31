package com.example.movieticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Seat extends AppCompatActivity {
    String myRow;
    String mySeatNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);
        final EditText Row = (EditText) findViewById(R.id.txtRow);
        final EditText SeatNo = (EditText) findViewById(R.id.txtSeatNo);
        Button Confirm = (Button) findViewById(R.id.btnConfirm);

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView Confirmation = (TextView) findViewById(R.id.confirm);
                myRow = Row.getText().toString();
                mySeatNo = SeatNo.getText().toString();
                Confirmation.setText("You are now confirmed for row " + myRow + " seat #" + mySeatNo + ". Enjoy the Show!");
            }
        });
    }
}