package org.faehrhaus.mm;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class ContactActivity extends AppCompatActivity {

    @Override
    @SuppressWarnings("deprecation")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        assert getSupportActionBar() != null;
        getSupportActionBar().hide();
        Button btn_CP_Next = findViewById(R.id.btn_CP_next);
        btn_CP_Next.setOnClickListener(v -> {
            startActivity(new Intent(ContactActivity.this, StepsActivity1.class));
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        });

        String styledText_Mail = "<u><font color=#33b5e5>faehrhaus@gmx.net</font></u>.";


        TextView txt_faehrhaus_email = (TextView) findViewById(R.id.txt_CP_Email);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            txt_faehrhaus_email.setText(Html.fromHtml(styledText_Mail, Html.FROM_HTML_MODE_LEGACY), TextView.BufferType.SPANNABLE);
            txt_faehrhaus_email.setText(Html.fromHtml("<a href=\"mailto:faehrhaus@gmx.net\">faehrhaus@gmx.net</a>", Html.FROM_HTML_MODE_LEGACY));
        } else {
            txt_faehrhaus_email.setText(Html.fromHtml(styledText_Mail), TextView.BufferType.SPANNABLE);
            txt_faehrhaus_email.setText(Html.fromHtml("<a href=\"mailto:faehrhaus@gmx.net\">faehrhaus@gmx.net</a>"));
        }
        txt_faehrhaus_email.setMovementMethod(LinkMovementMethod.getInstance());

        String styledText_Phone = "<u><font color=#33b5e5>089 23 07 74 79</font></u>";
        TextView txt_CallFaehrhaus = findViewById(R.id.txt_CP_phone);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            txt_CallFaehrhaus.setText(Html.fromHtml(styledText_Phone, Html.FROM_HTML_MODE_LEGACY), TextView.BufferType.SPANNABLE);
        } else {
            txt_CallFaehrhaus.setText(Html.fromHtml(styledText_Phone), TextView.BufferType.SPANNABLE);
        }
        txt_CallFaehrhaus.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:08923077479"));
            if (ActivityCompat.checkSelfPermission(ContactActivity.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            startActivity(callIntent);
        });

    }
}