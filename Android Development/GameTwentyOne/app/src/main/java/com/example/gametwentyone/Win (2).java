package com.example.gametwentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Win extends AppCompatActivity {
    String username;
    int d1;
    int d2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        username = sharedPref.getString("Info", "");
        d1 = sharedPref.getInt("dice1", 0);
        d2 = sharedPref.getInt("dice2", 0);
        int combTot = d1 + d2;
        TextView text = (TextView)findViewById(R.id.txtText);
        Button replay = (Button)findViewById(R.id.btnReplay);
        Button exit = (Button)findViewById(R.id.btnExit);
        if (d2 == 0)
        {
            text.setText(username + " your last roll was a " + d1);
        }
        else
        {
            text.setText(username + " you rolled a " + d1 + " and a " + d2 + ", with a combined total of " + combTot);
        }
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Win.this.finish();
                startActivity(new Intent(Win.this, Game.class));
            }
        });
    }

    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Win.this);
        builder.setTitle("Exit Game");
        builder.setMessage("Exit to menu?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Win.this.finish();
                        startActivity(new Intent(Win.this, MainActivity.class));
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}