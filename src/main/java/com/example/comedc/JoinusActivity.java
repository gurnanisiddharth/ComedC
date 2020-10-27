package com.example.comedc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.Firebase;

public class JoinusActivity extends AppCompatActivity {
    EditText t1,t2,t3,t4,t5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joinus);

        t1=(EditText)findViewById(R.id.editTextT1);
        t2=(EditText)findViewById(R.id.editTextT2);
        t3=(EditText)findViewById(R.id.editTextT3);
        t4=(EditText)findViewById(R.id.editTextT4);
        t5=(EditText)findViewById(R.id.editTextT5);
        button=(Button)findViewById(R.id.save);

        //inserting data into firebase database (real time database)
        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://comedc.firebaseio.com/joinUsDetails");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().isEmpty()||t2.getText().toString().isEmpty()||t3.getText().toString().isEmpty()||t5.getText().toString().isEmpty()){
                    Toast.makeText(JoinusActivity.this, "Enter all details", Toast.LENGTH_SHORT).show();
                }
                else{
                    joinusDB judb = new joinusDB(t1.getText().toString(),t2.getText().toString(),t3.getText().toString(),t4.getText().toString(),t5.getText().toString());
                    ref.push().setValue(judb);
                    Toast.makeText(JoinusActivity.this, "Saved Successfully", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}