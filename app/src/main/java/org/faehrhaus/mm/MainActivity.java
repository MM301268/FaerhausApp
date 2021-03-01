package org.faehrhaus.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assert getSupportActionBar() != null;
        getSupportActionBar().hide();
        Button btn_MP_Next = findViewById(R.id.btn_MP_Next);
        btn_MP_Next.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ContactActivity.class));
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        });
    }

}