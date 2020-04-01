package com.example.quizapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class StartingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        Button buttonStartQuiz = findViewById(R.id.button_start_quiz);
        buttonStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });

        Button buttonStartChart = findViewById(R.id.button_start_chart);
        buttonStartChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChart();
            }
        });

    }


    private void startQuiz() {
        Intent intent = new Intent(StartingScreenActivity.this, QuizActivity.class);
        startActivity(intent);
    }

    private void startChart() {
        Intent intent = new Intent(StartingScreenActivity.this, ChartActivity.class);
        startActivity(intent);
    }
}
