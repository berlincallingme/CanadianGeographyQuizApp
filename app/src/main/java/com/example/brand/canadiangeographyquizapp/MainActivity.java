package com.example.brand.canadiangeographyquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    private void totalScore() {

        radio_group_one = findViewById(R.id.radio_group_one);
        int firstAnswer = radio_group_one.getCheckedRadioButtonId();
        if (firstAnswer == -1)
        correct_one = findViewById(R.id.right_1);
        int firstAnswer1 = correct_one.getId();
        if (firstAnswer1 == firstAnswer)
            quizScore++;
        Toast toast = Toast.makeText(this, "correct answer", Toast.LENGTH_SHORT);
        toast.show();
    }

    }
    


