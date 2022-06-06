package com.example.gametwentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game extends AppCompatActivity {
    String username;
    int total;
    public static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        username = sharedPref.getString("Info", "");
        ImageView dice1 = (ImageView)findViewById(R.id.imgDice1);
        ImageView dice2 = (ImageView)findViewById(R.id.imgDice2);
        TextView text = (TextView) findViewById(R.id.txtText);
        TextView Total = (TextView)findViewById(R.id.txtTotal);
        Button roll = (Button)findViewById(R.id.btnRoll);
        Button exit = (Button)findViewById(R.id.btnExit);
        text.setText("Welcome to Game of 21 " + username);
        Total.setText("Click on the Roll button to start playing if you've already read the rules");
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total < 15)
                {
                    dice1.startAnimation(AnimationUtils.loadAnimation(Game.this, R.anim.shake));
                    dice2.startAnimation(AnimationUtils.loadAnimation(Game.this, R.anim.shake));
                    int d1 = randomDiceValue();
                    int d2 = randomDiceValue();
                    int combTot = d1 + d2;
                    total = total + combTot;
                    if ((total == 9) || (total == 17) || (total > 21))
                    {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putInt("Total1", total);
                        editor.putInt("dice11", d1);
                        editor.putInt("dice21", d2);
                        editor.commit();
                        startActivity(new Intent(Game.this, Lose.class));
                    }
                    else if (total ==21)
                    {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putInt("Total", total);
                        editor.putInt("dice1", d1);
                        editor.putInt("dice2", d2);
                        editor.commit();
                        startActivity(new Intent(Game.this, Win.class));
                    }
                    else
                    {
                        text.setText("Your rolled a " + d1 + " and a " + d2 + " with a combined total of " + combTot);
                        Total.setText("Actual Total: " + total);
                        switch (d1)
                        {
                            case 1:
                                dice1.setImageResource(R.drawable.one);
                                Toast.makeText(Game.this, "Slow and Steady!", Toast.LENGTH_LONG).show();
                                break;
                            case 2:
                                dice1.setImageResource(R.drawable.two);
                                break;
                            case 3:
                                dice1.setImageResource(R.drawable.three);
                                Toast.makeText(Game.this, "You've got this!", Toast.LENGTH_LONG).show();
                                break;
                            case 4:
                                dice1.setImageResource(R.drawable.four);
                                break;
                            case 5:
                                dice1.setImageResource(R.drawable.five);
                                Toast.makeText(Game.this, "Awesome!", Toast.LENGTH_LONG).show();
                                break;
                            case 6:
                                dice1.setImageResource(R.drawable.six);
                                Toast.makeText(Game.this, "Lets Go!", Toast.LENGTH_LONG).show();
                                break;
                        }
                        switch (d2)
                        {
                            case 1:
                                dice2.setImageResource(R.drawable.one);
                                break;
                            case 2:
                                dice2.setImageResource(R.drawable.two);
                                break;
                            case 3:
                                dice2.setImageResource(R.drawable.three);
                                break;
                            case 4:
                                dice2.setImageResource(R.drawable.four);
                                break;
                            case 5:
                                dice2.setImageResource(R.drawable.five);
                                break;
                            case 6:
                                dice2.setImageResource(R.drawable.six);
                                break;
                        }
                    }
                }
                else if (total >= 15)
                {
                    dice1.startAnimation(AnimationUtils.loadAnimation(Game.this, R.anim.shake));
                    dice2.setVisibility(View.GONE);
                    int d1 = randomDiceValue();
                    int d2 = 0;
                    total = total + d1;
                    if ((total == 9) || (total == 17) || (total > 21))
                    {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putInt("Total1", total);
                        editor.putInt("dice11", d1);
                        editor.putInt("dice21", d2);
                        editor.commit();
                        startActivity(new Intent(Game.this, Lose.class));
                    }
                    else if (total ==21)
                    {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putInt("Total", total);
                        editor.putInt("dice1", d1);
                        editor.putInt("dice2", d2);
                        editor.commit();
                        startActivity(new Intent(Game.this, Win.class));
                    }
                    else
                    {
                        text.setText("Your rolled a " + d1);
                        Total.setText("Actual Total: " + total);
                        switch (d1)
                        {
                            case 1:
                                dice1.setImageResource(R.drawable.one);
                                Toast.makeText(Game.this, "Keep rolling!", Toast.LENGTH_LONG).show();
                                break;
                            case 2:
                                dice1.setImageResource(R.drawable.two);
                                Toast.makeText(Game.this, "Almost there!", Toast.LENGTH_LONG).show();
                                break;
                            case 3:
                                dice1.setImageResource(R.drawable.three);
                                break;
                            case 4:
                                dice1.setImageResource(R.drawable.four);
                                Toast.makeText(Game.this, "Very Good!", Toast.LENGTH_LONG).show();
                                break;
                            case 5:
                                dice1.setImageResource(R.drawable.five);
                                break;
                            case 6:
                                dice1.setImageResource(R.drawable.six);
                                Toast.makeText(Game.this, "Bulls Eye!", Toast.LENGTH_LONG).show();
                                break;
                        }
                    }
                }
            }
        });
    }

    public static int randomDiceValue(){
        return RANDOM.nextInt(6) + 1;
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
        builder.setTitle("Exit Game");
        builder.setMessage("Are you sure you want to end this game?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Game.this.finish();
                        startActivity(new Intent(Game.this, MainActivity.class));
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