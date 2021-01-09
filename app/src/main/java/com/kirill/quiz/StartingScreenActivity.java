package com.kirill.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        Button buttonStartQuiz = findViewById(R.id.button_start_quiz); //init start button

        buttonStartQuiz.setOnClickListener(new View.OnClickListener() { //listener
            @Override
            public void onClick(View v) {
                startQuiz();//invocate quiz activity
            }
        });

    }

    private void startQuiz() { //starting quiz activity
        Intent intent = new Intent(StartingScreenActivity.this, QuizActivity.class);
        startActivity(intent);
    }
}