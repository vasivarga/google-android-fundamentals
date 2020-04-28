package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityWeek3Challenge1 extends AppCompatActivity {

    Button submitButton;
    EditText emailText, phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week3_challenge1);

        submitButton = findViewById(R.id.submitButton);
        emailText = findViewById(R.id.email_field);
        phoneText = findViewById(R.id.phone_field);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (emailText.getText().
            }
        });

    }
}
