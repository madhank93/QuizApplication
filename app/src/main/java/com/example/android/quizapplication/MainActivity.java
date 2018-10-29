package com.example.android.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public RadioGroup questionGroup1;
    public RadioGroup questionGroup2;
    public RadioGroup questionGroup3;
    public RadioGroup questionGroup4;
    public RadioGroup questionGroup5;

    public int correctAnswersCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the radio group ID
        questionGroup1 = (RadioGroup) findViewById(R.id.Question_1);
        questionGroup2 = (RadioGroup) findViewById(R.id.Question_2);
        questionGroup3 = (RadioGroup) findViewById(R.id.Question_3);
        questionGroup4 = (RadioGroup) findViewById(R.id.Question_4);
        questionGroup5 = (RadioGroup) findViewById(R.id.Question_5);

        // Fires this event when Submit button is clicked.
        Button submitButton = (Button) findViewById(R.id.submit_btn);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkQuestions();
                displayResult();
            }
        });

    }

    public void checkQuestions () {

        // Comparing checked ID in Radio group with ID of the correct answer

        if (questionGroup1.getCheckedRadioButtonId() == R.id.Ques_choice_1b) {
            correctAnswersCount += 1;
        }

        if (questionGroup2.getCheckedRadioButtonId() == R.id.Ques_choice_2a) {
            correctAnswersCount += 1;
        }

        if (questionGroup3.getCheckedRadioButtonId() == R.id.Ques_choice_3a) {
            correctAnswersCount += 1;
        }

        if (questionGroup4.getCheckedRadioButtonId() == R.id.Ques_choice_4c) {
            correctAnswersCount += 1;
        }

        if (questionGroup5.getCheckedRadioButtonId() == R.id.Ques_choice_5b) {
            correctAnswersCount += 1;
        }
    }

    public void resetCorrectAnswersCount(){
        correctAnswersCount = 0;
    }

    public void displayResult() {

        Toast.makeText(MainActivity.this, "Correct Answers: " + correctAnswersCount + "/5",
                Toast.LENGTH_LONG).show();
        resetCorrectAnswersCount();
    }

}
