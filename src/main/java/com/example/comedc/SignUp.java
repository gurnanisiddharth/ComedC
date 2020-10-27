package com.example.comedc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.Firebase;

public class SignUp extends AppCompatActivity {
    Button b3;
    EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b3=(Button)findViewById(R.id.button3);
        e1=(EditText)findViewById(R.id.edittext3);
        e2=(EditText)findViewById(R.id.edittext4);
        e3=(EditText)findViewById(R.id.edittext5);
        e4=(EditText)findViewById(R.id.edittext6);

        //inserting data into firebase database (real time database)
        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://comedc.firebaseio.com/registration");

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()||e3.getText().toString().isEmpty()||e4.getText().toString().isEmpty())
                {
                    Toast.makeText(SignUp.this, "Enter valid details", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent3 = new Intent(SignUp.this, Login.class);
                    startActivity(intent3);
                    registerDB rdb = new registerDB(e1.getText().toString(),e2.getText().toString(),e3.getText().toString());
                    ref.push().setValue(rdb);
                }
            }
        });
    }
}