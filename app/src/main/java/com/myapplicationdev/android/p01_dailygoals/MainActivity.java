package com.myapplicationdev.android.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Get the RadioGrp obj
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radioGroup1);
                RadioGroup rg2 = (RadioGroup)findViewById(R.id.radioGroup2);
                RadioGroup rg3 = (RadioGroup)findViewById(R.id.radioGroup3);

                //Get the Id of the selected radio btn in the radiogrp
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();

                //Get the radio button object from the Id we had gotten above
                RadioButton rb1 = (RadioButton)findViewById(selectedButtonId1);
                RadioButton rb2 = (RadioButton)findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton)findViewById(selectedButtonId3);


                //Get the editText that user keys in rj
                EditText etRj=(EditText)findViewById(R.id.editText);

                //Put the answers into an array
                String[] info ={rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),etRj.getText().toString(),};

                //create an intent to start another activity called
                //DemoActivitites (which we would create later)
                Intent i = new Intent(MainActivity.this,Summary.class);

                //pass the string array holding the name and age to new activity.
                i.putExtra("info",info);
                startActivity(i);


            }
});
    }

}
