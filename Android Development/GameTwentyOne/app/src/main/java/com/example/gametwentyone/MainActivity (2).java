package com.example.gametwentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] menu = {"Start Game", "Game Rules", "Exit"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.menu, menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, Info.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Rules.class));
                break;
            case 2:
                onBackPressed();
                break;
        }
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit Game");
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                        System.exit(0);
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