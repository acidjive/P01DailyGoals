package com.myapplicationdev.android.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        //Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        //Get the String Array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        //Get the text view object
        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);

        //Display the name and age on the TextView
        tv1.setText("Read up on materil before class:  " + info[0] );
        tv2.setText("Arrive on time so as not to miss important part of the lesson:   " + info[1] );
        tv3.setText("Attempt the problem myself:  " + info[2] );
        tv4.setText("Reflection:  " + info[3] );
    }
}
