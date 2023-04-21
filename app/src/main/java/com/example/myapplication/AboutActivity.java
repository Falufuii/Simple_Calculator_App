package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    private Button answerButton, backButton;
    private TextView showAnswer, topic;
    private EditText enterNum1 , enterNum2 ;
    private String textNum1, textNum2, value;
    private double num1, num2, result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent = getIntent();

        enterNum1 = findViewById(R.id.editTextNum1);
        enterNum2 = findViewById(R.id.editTextNum2);

        showAnswer = findViewById(R.id.showAnswer);
        topic = findViewById(R.id.textView4);

        if (intent.hasExtra("option")) {
            value = getIntent().getStringExtra("option");
            topic.setText(value);
        }

        answerButton = findViewById(R.id.answerButton);
        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textNum1 = enterNum1.getText().toString();
                textNum2 = enterNum2.getText().toString();

                if (!textNum1.isEmpty() && !textNum2.isEmpty()) {
                    num1 = Double.parseDouble(textNum1);
                    num2 = Double.parseDouble(textNum2);

                    if(num2 != 0) {

                        // (intent.hasExtra("option")) {

                            //String value = getIntent().getStringExtra("option");

                            if (value.equals("Plus")) {
                                result = num1 + num2;
                            } else if (value.equals("Minus")) {
                                result = num1 - num2;
                            } else if (value.equals("Multiply")) {
                                result = num1 * num2;
                            } else if (value.equals("Divide")) {
                                result = num1 / num2;
                            }

                            showAnswer.setText(Double.toString(result));
                        //} else {
                            //showAnswer.setText(Double.toString(result));
                        //}
                    } else{
                        showAnswer.setText("Can not divide by zero");
                    }
                }else{
                    showAnswer.setText("Please enter both numbers");
                }
            }
        });

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}