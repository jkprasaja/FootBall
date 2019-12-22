package com.rojotech.apptech.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int teamAFouls = 0;
    int scoreTeamB = 0;
    int teamBFouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAScored(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalTeamA(scoreTeamA);
    }


    public void teamAFouls(View view) {
        teamAFouls = teamAFouls + 1;
        displayFoulsTeamA(teamAFouls);
    }

    public void teamBScored(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalTeamB(scoreTeamB);

    }

    public void teamBFouls(View view) {
        teamBFouls = teamAFouls + 1;
        displayFoulsTeamB(teamBFouls);
    }

    private void displayGoalTeamA(int score) {
        TextView displayGoal = findViewById(R.id.team_a_goal);
        displayGoal.setText(String.valueOf(score));

    }

    private void displayGoalTeamB(int score) {
        TextView displayGoalTeamB = findViewById(R.id.team_b_goal);
        displayGoalTeamB.setText(String.valueOf(score));

    }

    private void displayFoulsTeamA(int Fouls) {
        TextView displayFoulsTeamA = findViewById(R.id.team_a_fouls);
        displayFoulsTeamA.setText(String.valueOf(Fouls));
    }


    private void displayFoulsTeamB(int fouls) {
        TextView displayFoulsTeamB = findViewById(R.id.team_b_fouls);
        displayFoulsTeamB.setText(String.valueOf(fouls));
    }

    public void resetAllScore(View view) {
        scoreTeamA = 0;
        teamAFouls = 0;
        scoreTeamB = 0;
        teamBFouls = 0;
        displayGoalTeamA(scoreTeamA);
        displayGoalTeamB(scoreTeamB);
        displayFoulsTeamA(teamAFouls);
        displayFoulsTeamB(teamBFouls);
    }
}
