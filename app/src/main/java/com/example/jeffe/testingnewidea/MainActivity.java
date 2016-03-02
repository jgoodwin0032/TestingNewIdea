package com.example.jeffe.testingnewidea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declare our view variables
    private TextView mWelcomeTextView;
    private Button mAddScreenButton;
    private Button mShowScreenButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWelcomeTextView = (TextView) findViewById(R.id.welcomeTextView);
        mAddScreenButton = (Button) findViewById(R.id.addScreenButton);

        mAddScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAddItem();


            }

        });

        mShowScreenButton = (Button) findViewById(R.id.showScreenButton);

        mShowScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAddItem();

            }

        });
    }

        private void startAddItem() {
            Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);

        }

        private void startShowScreen() {
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);

    }
}
