package com.example.mapsetc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EmailSend extends AppCompatActivity
{
    EditText mail, sub, title;
    Button send;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mailsending);
        mail=(EditText)findViewById(R.id.edit_text);
        sub=(EditText)findViewById(R.id.subject);
        title=(EditText)findViewById(R.id.heading);
        send= (Button)findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] receive=mail.getText().toString().split(",");
                String title1=title.getText().toString();
                String subject=sub.getText().toString();
                Intent intent=null,chooser=null;
                intent=new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL,receive);
                intent.putExtra(Intent.EXTRA_SUBJECT, title1);
                intent.putExtra(Intent.EXTRA_TEXT,subject);
                chooser= Intent.createChooser(intent,"Select Email App..");
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(chooser);
                else
                    Toast.makeText(getApplicationContext(),"No Apps Available", Toast.LENGTH_SHORT).show();


            }
        });

    }
}
