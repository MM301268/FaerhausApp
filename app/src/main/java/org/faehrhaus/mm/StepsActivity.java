package org.faehrhaus.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StepsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        getSupportActionBar().hide();
    }
}