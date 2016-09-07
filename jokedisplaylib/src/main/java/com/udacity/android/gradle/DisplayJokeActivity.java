package com.udacity.android.gradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    public static final String JOKE_EXTRA = "com.udacity.android.gradle.JokeDisplayLib";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        ((TextView) findViewById(R.id.jokeDisplayView)).setText(getIntent().getStringExtra(JOKE_EXTRA));
    }
}
