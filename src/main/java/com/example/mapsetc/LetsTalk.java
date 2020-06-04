package com.example.mapsetc;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.example.mapsetc.R;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class LetsTalk extends AppCompatActivity {
    EditText messages, number;
    Button enter;
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    String textss,phone;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messaging);
        messages = (EditText) findViewById(R.id.user_msg);
        number = (EditText) findViewById(R.id.user_call);
        enter = (Button) findViewById(R.id.msg);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyMessage();
            }
        });
    }
    protected void MyMessage()
    {
        textss= messages.getText().toString();
        phone=number.getText().toString();
        Log.i("Send SMS","");
        Intent smsIntent= new Intent(Intent.ACTION_VIEW);

        smsIntent.setData(Uri.parse("smsto:"));
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address",phone);
        smsIntent.putExtra("sms_body",textss);

        try {
            startActivity(smsIntent);
            finish();
            Log.i("Sent Message","");

        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(LetsTalk.this,
                    "SMS failed, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.messaging, menu);
//        return true;
//    }
}