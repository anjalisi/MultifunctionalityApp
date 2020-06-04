package com.example.mapsetc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OpenUrl extends AppCompatActivity {
    EditText url;
    Button open_url;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.websiteopen);

        url=(EditText)findViewById(R.id.website);
        open_url=(Button)findViewById(R.id.openurl);

        open_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent1=null,chooser1=null;
                intent1=new Intent(Intent.ACTION_VIEW);
                String url1= "https://"+url.getText().toString();
                intent1.setData(Uri.parse(url1));
                chooser1=Intent.createChooser(intent1,"Open website Using...");
                if(intent1.resolveActivity(getPackageManager())!=null)
                    startActivity(chooser1);
                else
                    Toast.makeText(getApplicationContext(),"No Apps Available", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
