package com.example.comedc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button b4;
    EditText phone,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b4=(Button)findViewById(R.id.button4);
        phone=(EditText)findViewById(R.id.edittext1);
        password=(EditText)findViewById(R.id.edittext2);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phone.getText().toString().isEmpty()||password.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter valid phone number and password",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent4 = new Intent(Login.this,MainActivity4.class);
                    startActivity(intent4);
                }
            }
        });
    }
}