package org.faehrhaus.mm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class StepsActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps1);
        getSupportActionBar().hide();
        Button btn_SP1_Next = findViewById(R.id.btn_SP1_Next);
        btn_SP1_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StepsActivity1.this, StepsActivity2.class));
            }
        });
    }
}