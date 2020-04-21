package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleLogin = findViewById(R.id.title_login);
        TextView titleRegister = findViewById(R.id.title_register);

        String textLogin = titleLogin.getText().toString();
        String textRegister = titleRegister.getText().toString();

        Log.d(TAG, textLogin+ " "+ textRegister);

        ImageView imageView = findViewById(R.id.image);

        final Button nextButton = findViewById(R.id.next);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "I clicked Next button!" + nextButton.getText());
            }
        });


        EditText emailField = findViewById(R.id.email_field);

        emailField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(TAG, "BEFORE" + s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "ON" + s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "AFTER" + s.toString());

            }
        });




        Switch notificationsSwitch = findViewById(R.id.notificationSwitch);

        notificationsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d(TAG, "Switch" + isChecked);

            }
        });

        RatingBar ratingBar = findViewById(R.id.rating);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Log.d(TAG, "Rating" + rating);
            }
        });

        ((RadioGroup) findViewById(R.id.radioGroup)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Log.d(TAG, "RadioChange"+ radioButton.getText().toString());
            }
        });

    }
}
