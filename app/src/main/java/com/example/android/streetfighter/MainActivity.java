package com.example.android.streetfighter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayPlayerOne(int scorePlayerOne) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(scorePlayerOne));
    }

    public void addOneForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 1;
        displayPlayerOne(scorePlayerOne);
    }

    public void addTwoForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 2;
        displayPlayerOne(scorePlayerOne);
    }

    public void addThreeForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 3;
        displayPlayerOne(scorePlayerOne);
    }

    public void displayPlayerTwo(int scorePlayerTwo) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(scorePlayerTwo));
    }

    public void addOneForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 1;
        displayPlayerTwo(scorePlayerTwo);
    }

    public void addTwoForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 2;
        displayPlayerTwo(scorePlayerTwo);
    }

    public void addThreeForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 3;
        displayPlayerTwo(scorePlayerTwo);
    }

    public void reset(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        displayPlayerOne(scorePlayerOne);
        displayPlayerTwo(scorePlayerTwo);
    }

}
