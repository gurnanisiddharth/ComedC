package com.example.comedc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class FeedbackActivity extends AppCompatActivity {
    RatingBar rb;
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        rb=(RatingBar)findViewById(R.id.ratingbar);
        tv=(TextView)findViewById(R.id.textView1);
        et=(EditText)findViewById(R.id.editText);

        //inserting data into firebase database (real time database)
        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://comedc.firebaseio.com/feedback");

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv.setText(String.valueOf(v));
                Toast.makeText(getApplicationContext(),String.valueOf(v),Toast.LENGTH_LONG).show();
                feedbackDB fdb = new feedbackDB(et.getText().toString(),tv.getText().toString());
                ref.push().setValue(fdb);
            }
        });
    }
}