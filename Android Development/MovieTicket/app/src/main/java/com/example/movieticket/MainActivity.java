package com.example.movieticket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[ ] movie = {"Purchase Ticket", "Select seat", "Display Ticket", "Go to our website"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.logo, movie));
    }

    protected void onListItemClick(ListView L, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, BuyTicket.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Seat.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Ticket.class));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.regmovies.com/")));
                break;

        }
    }
}