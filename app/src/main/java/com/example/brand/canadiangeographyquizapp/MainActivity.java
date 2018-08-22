package com.example.brand.canadiangeographyquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quizScore = 0;
    RadioGroup quiz_question_1;
    RadioGroup quiz_question_2;
    RadioGroup quiz_question_3;
    CheckBox quiz_question_4_a;
    CheckBox quiz_question_4_b;
    CheckBox quiz_question_4_c;
    EditText edit_text_quiz_question;
    RadioButton correct_one;
    RadioButton correct_two;
    RadioButton correct_three;
    Button submit_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quiz_question_1 = findViewById(R.id.radio_group_one);
        quiz_question_2 = findViewById(R.id.radio_group_two);
        quiz_question_3 = findViewById(R.id.radio_group_three);
        quiz_question_4_a = findViewById(R.id.wrong_10);
        quiz_question_4_b = findViewById(R.id.right_4);
        quiz_question_4_c = findViewById(R.id.right_5);
        correct_one = findViewById(R.id.right_1);
        correct_two = findViewById(R.id.right_2);
        correct_three = findViewById(R.id.right_3);
        edit_text_quiz_question = findViewById(R.id.edit_text_quiz_question);


    }

    private int calculateScore() {

        if (quiz_question_1.getCheckedRadioButtonId() == R.id.right_1) {
                quizScore++;
        }

        if (quiz_question_2.getCheckedRadioButtonId() == R.id.right_2) {
            quizScore++;
        }
        if (quiz_question_3.getCheckedRadioButtonId() == R.id.right_3) {
            quizScore++;
        }
        if (quiz_question_4_b.isChecked() && quiz_question_4_c.isChecked()){
            quizScore++;
        }

        String editTextQuizQuestion = edit_text_quiz_question.getText().toString();
        if ((editTextQuizQuestion.equals(getResources().getString(R.string.edit_text_answer_1))) || (editTextQuizQuestion.equals(getResources().getString(R.string.edit_text_answer_2))))
            quizScore++;
        else if (editTextQuizQuestion.equals(""))
            return -1;

        return quizScore;


    }

    public void submitScore(View view) {
        calculateScore();
        Toast.makeText(this, "Your Final Score is " + quizScore + " Out of 5",
                Toast.LENGTH_LONG).show();
        quizScore = 0;
    }

    public void resetQuiz (View view) {

        quiz_question_1.clearCheck();
        quiz_question_2.clearCheck();
        quiz_question_3.clearCheck();

        quiz_question_4_a.setChecked(false);
        quiz_question_4_b.setChecked(false);
        quiz_question_4_c.setChecked(false);

        edit_text_quiz_question = findViewById(R.id.edit_text_quiz_question);
        edit_text_quiz_question.setText("");


        quizScore = 0 ;

    }

}


    


