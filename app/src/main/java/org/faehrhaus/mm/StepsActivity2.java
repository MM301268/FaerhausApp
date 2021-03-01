package org.faehrhaus.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StepsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps2);
        assert getSupportActionBar() != null;
        getSupportActionBar().hide();
        Button btn_SP2_Next = findViewById(R.id.btn_SP2_next);
        btn_SP2_Next.setOnClickListener(v -> {
            startActivity(new Intent(StepsActivity2.this, AffiliationActivity.class));
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

        });
    }
}