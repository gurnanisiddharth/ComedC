package com.example.comedc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        t1=(TextView)findViewById(R.id.faqs);
        t2=(TextView)findViewById(R.id.aboutus);
        t3=(TextView)findViewById(R.id.policy);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this, "You selected FAQ's", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity5.this,FaqsActivity.class);
                startActivity(intent1);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this, "You selected ABOUT US", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainActivity5.this,AboutusActivity.class);
                startActivity(intent2);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this, "You selected TERMS AND PRIVACY POLICY", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainActivity5.this,PolicyActivity.class);
                startActivity(intent3);
            }
        });
    }
}