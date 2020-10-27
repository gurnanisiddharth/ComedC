package com.example.comedc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.Firebase;

public class PersonalInfoActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_info);

        et1=(EditText)findViewById(R.id.edittext);
        et2=(EditText)findViewById(R.id.edittext1);
        et3=(EditText)findViewById(R.id.edittext2);
        et4=(EditText)findViewById(R.id.edittext3);
        b=(Button)findViewById(R.id.submit);
        //inserting data into firebase database (real time database)
        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://comedc.firebaseio.com/personalInfo");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myinfoDB midb = new myinfoDB(et1.getText().toString(),et2.getText().toString(),et3.getText().toString(),et4.getText().toString());
                ref.push().setValue(midb);
                Toast.makeText(PersonalInfoActivity.this, "Saved Successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}