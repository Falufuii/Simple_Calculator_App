package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//public Button PlusButton, MinusButton, MultiplyButton, DivideButton;

    public String value1 = "Plus", value2 = "Minus", value3 = "Multiply" , value4 = "Divide";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button PlusButton = findViewById(R.id.PlusButton);
        PlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                //intent.putExtra("plus", "option");
                intent.putExtra("option", value1);

                startActivity(intent);
            }
        });

        Button MinusButton = findViewById(R.id.MinusButton);
        MinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                //intent.putExtra("minus", "option");
                intent.putExtra("option", value2);
                startActivity(intent);
            }
        });

        Button MultiplyButton = findViewById(R.id.MultiplyButton);
        MultiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                //intent.putExtra("multiply","option" );
                intent.putExtra("option",value3 );
                startActivity(intent);
            }
        });

        Button DivideButton = findViewById(R.id.DivideButton);
        DivideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                //intent.putExtra("divide","option" );
                intent.putExtra("option",value4 );
                startActivity(intent);
            }
        });
    }
}