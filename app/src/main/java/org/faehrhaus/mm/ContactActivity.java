package org.faehrhaus.mm;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().hide();
        Button btn_CP_Next = findViewById(R.id.btn_CP_next);
        btn_CP_Next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                startActivity(new Intent(ContactActivity.this, StepsActivity1.class));
            }
        });

        String styledText_Mail = "<u><font color=#33b5e5>faehrhaus@gmx.net</font></u>.";


        TextView txt_faehrhaus_email = (TextView) findViewById(R.id.txt_CP_Email);
        txt_faehrhaus_email.setText(Html.fromHtml(styledText_Mail), TextView.BufferType.SPANNABLE);
        txt_faehrhaus_email.setText(Html.fromHtml("<a href=\"mailto:faehrhaus@gmx.net\">faehrhaus@gmx.net</a>"));
        txt_faehrhaus_email.setMovementMethod(LinkMovementMethod.getInstance());

        String styledText_Phone = "<u><font color=#33b5e5>089 23 07 74 79</font></u>";
        TextView txt_CallFaehrhaus = findViewById(R.id.txt_CP_phone);
        txt_CallFaehrhaus.setText(Html.fromHtml(styledText_Phone), TextView.BufferType.SPANNABLE);
        txt_CallFaehrhaus.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v){
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:08923077479"));
                if (ActivityCompat.checkSelfPermission(ContactActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });

    }
}