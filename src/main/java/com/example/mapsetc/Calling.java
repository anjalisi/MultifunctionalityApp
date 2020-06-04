package com.example.mapsetc;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Calling extends AppCompatActivity
{
    EditText phone;
    Button call;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calls);

        phone=(EditText)findViewById(R.id.make_call);
        call=(Button)findViewById(R.id.call1);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String no=phone.getText().toString();
                Intent intent=null;
                intent = new Intent(Intent.ACTION_CALL);
                if(no.trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter A Number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    intent.setData(Uri.parse("tel:"+no));
                }
                if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(), "Please Grant Permission To Proceed", Toast.LENGTH_SHORT).show();
                    requestPermission();
                }else
                    startActivity(intent);
                /* Only for dialling
                intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+no));
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
            */
            }
        });
    }
    private void requestPermission()
    {
        ActivityCompat.requestPermissions(Calling.this, new String[] {Manifest.permission.CALL_PHONE},1);

    }
}
