package org.faehrhaus.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AffiliationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiliation);
        assert getSupportActionBar() != null;
        getSupportActionBar().hide();
        Button btn_AP_toMP = findViewById(R.id.btn_AP_toMP);
        btn_AP_toMP.setOnClickListener(v -> {
            startActivity(new Intent(AffiliationActivity.this, MainActivity.class));
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        });
    }
}