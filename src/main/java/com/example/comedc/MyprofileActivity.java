package com.example.comedc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyprofileActivity extends AppCompatActivity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myprofile);

        t1=(TextView)findViewById(R.id.info);
        t2=(TextView)findViewById(R.id.logout);
        t3=(TextView)findViewById(R.id.records);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MyprofileActivity.this,PersonalInfoActivity.class);
                startActivity(intent1);
                Toast.makeText(getApplicationContext(),"Personal Info.....",Toast.LENGTH_LONG).show();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MyprofileActivity.this,MainActivity.class);
                startActivity(intent2);
                Toast.makeText(getApplicationContext(),"You have successfully logged out",Toast.LENGTH_LONG).show();
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Health Records are.....",Toast.LENGTH_LONG).show();
            }
        });
    }
}