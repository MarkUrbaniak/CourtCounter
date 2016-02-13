package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button twoPoint1 = (Button) findViewById(R.id.two_point1);
        final Button threePoint1 = (Button) findViewById(R.id.three_point1);
        final Button onePoint1 = (Button) findViewById(R.id.one_point1);
        final Button twoPoint2 = (Button) findViewById(R.id.two_point2);
        final Button threePoint2 = (Button) findViewById(R.id.three_point2);
        final Button onePoint2 = (Button) findViewById(R.id.one_point2);
        final Button reset = (Button) findViewById(R.id.reset);

        onePoint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int points = 1;
                int player = 1;
                increment1(player, points);
            }
        });

        twoPoint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int points = 2;
                int player = 1;
                increment1(player, points);
            }
        });

        threePoint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int points = 3;
                int player = 1;
                increment1(player, points);
            }
        });

        onePoint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int points = 1;
                int player = 2;
                increment1(player, points);
            }
        });

        twoPoint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int points = 2;
                int player = 2;
                increment1(player, points);
            }
        });

        threePoint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int points = 3;
                int player = 2;
                increment1(player, points);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1 = 0;
                score2 = 0;
                TextView txtScore1 = (TextView) findViewById(R.id.score1);
                txtScore1.setText("" + score1);
                TextView txtScore2 = (TextView) findViewById(R.id.score2);
                txtScore2.setText("" + score2);
            }
        });
    }

    private void increment1(int player, int points) {
        if (player == 1) {
            score1 = score1 + points;
            TextView txtScore1 = (TextView) findViewById(R.id.score1);
            txtScore1.setText("" + score1);
        }
        else {
            score2 = score2 + points;
            TextView txtScore2 = (TextView) findViewById(R.id.score2);
            txtScore2.setText("" + score2);
        }
    }


}
