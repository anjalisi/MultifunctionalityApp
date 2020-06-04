package com.example.mapsetc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button weburl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weburl=(Button)findViewById(R.id.website);

    }

    public void dosomething(View v)
    {
        Intent intent=null,chooser=null;
        switch (v.getId())
        {
            case R.id.website:
                Intent i = new Intent();
                i.setClassName("com.example.mapsetc","com.example.mapsetc.OpenUrl");
                //startActivity();
                startActivity(i);
                break;
            case R.id.email:
                Intent j=new Intent();
                j.setClassName("com.example.mapsetc","com.example.mapsetc.EmailSend");
                startActivity(j);
                break;

            case R.id.phonecall:
                Intent k=new Intent();
                k.setClassName("com.example.mapsetc","com.example.mapsetc.Calling");
                startActivity(k);
                break;

            case R.id.map:
                intent=new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://maps.google.com/maps?q=38.897676,-77.03653(Label Point)"));
                chooser=Intent.createChooser(intent,"Open Map Using...");
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(chooser);
                else
                    Toast.makeText(getApplicationContext(),"No Apps Available", Toast.LENGTH_SHORT).show();
                break;

            case R.id.messagesend:
                Intent a=new Intent();
                a.setClassName("com.example.mapsetc","com.example.mapsetc.LetsTalk");
                startActivity(a);
                break;

            case R.id.imagesend:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_TEXT,"Check the attached Image...");
                Uri uri_img=Uri.parse("android.resource://com.example/drawable/"+R.drawable.uii);
                intent.putExtra(Intent.EXTRA_STREAM,uri_img);
                chooser=Intent.createChooser(intent,"Share image via..");
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(chooser);
                else
                    Toast.makeText(getApplicationContext(),"No Apps Available", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
