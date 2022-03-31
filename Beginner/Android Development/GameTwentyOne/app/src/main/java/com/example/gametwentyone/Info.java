package com.example.gametwentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Info extends AppCompatActivity {
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        EditText Info = (EditText)findViewById(R.id.username);
        Button back = (Button)findViewById(R.id.btnBack);
        Button next = (Button)findViewById(R.id.btnNext);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.this.finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = Info.getText().toString();
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("Info", username);
                editor.commit();
                startActivity(new Intent(Info.this, Game.class));
            }
        });
    }
}