package com.example.brand.canadiangeographyquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quizScore = 0;
    RadioGroup radio_group_one;
    RadioButton correct_one;
    RadioGroup radio_group_two;
    RadioButton correct_two;
    RadioGroup radio_group_three;
    RadioButton correct_three;
    Button submit_button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correct_one = findViewById(R.id.right_1);
        correct_two = findViewById(R.id.right_2);
        correct_three = findViewById(R.id.right_3);
        submit_button = findViewById(R.id.submit_button);


    }

    private int calculateScore() {

        radio_group_one = findViewById(R.id.radio_group_one);
        int radioIdOne = radio_group_one.getCheckedRadioButtonId();
        if (radioIdOne == -1)
            return -1;
        correct_one = findViewById(R.id.right_1);
        int radioButtonIdOne = correct_one.getId();
        if (radioButtonIdOne == radioIdOne)
            quizScore++;

        radio_group_two = findViewById(R.id.radio_group_two);
        int radioIdTwo = radio_group_two.getCheckedRadioButtonId();
        if (radioIdTwo== -1)
            return -1;
        correct_one = findViewById(R.id.right_2);
        int radioButtonIdTwo = correct_two.getId();
        if (radioButtonIdTwo == radioIdTwo)
            quizScore++;

        radio_group_three = findViewById(R.id.radio_group_three);
        int radioIdThree = radio_group_three.getCheckedRadioButtonId();
        if (radioIdThree== -1)
            return -1;
        correct_three = findViewById(R.id.right_3);
        int radioButtonIdThree = correct_three.getId();
        if (radioButtonIdThree == radioIdThree)
            quizScore++;




        return quizScore;


    }
public void submitScore(View view)  {
        calculateScore();
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your Final Score is" + quizScore,
                        Toast.LENGTH_LONG).show();
                quizScore = 0;
            }
        });
}

    }
    


