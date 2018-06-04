package com.example.aeonz.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassedData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passed_data);

       if (getIntent().hasExtra("com.example.aeonz.passingdata.PASSDATA")){
           TextView passedData = findViewById(R.id.passedData);
           String text = getIntent().getExtras().getString("com.example.aeonz.passingdata.PASSDATA");
           passedData.setText(text);
        }

        Button ReturnBtn = findViewById(R.id.ReturnBtn);
       ReturnBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent returnIntent = new Intent(getApplicationContext() , MainActivity.class);
               startActivity(returnIntent);
           }
       });

    }
}
