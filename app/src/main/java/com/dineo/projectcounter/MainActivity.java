package com.dineo.projectcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayFormTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayFormTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View v){
        scoreTeamA =scoreTeamA + 1;
        displayFormTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayFormTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayFormTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View v){
        scoreTeamB =scoreTeamB + 1;
        displayFormTeamB(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayFormTeamA(scoreTeamA);
        displayFormTeamB(scoreTeamB);
    }
    public void displayFormTeamA(int score){

        TextView scoreView =(TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFormTeamB(int score){

        TextView scoreView =(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
