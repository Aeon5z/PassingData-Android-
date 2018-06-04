package com.example.aeonz.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button passBtn =  findViewById(R.id.passBtn);
        passBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userText = findViewById(R.id.userText);
                TextView testView = findViewById(R.id.displayText);

                //testView.setText(userText.getText().toString());

                Intent passIntent = new Intent(getApplicationContext() , PassedData.class);
                passIntent.putExtra("com.example.aeonz.passingdata.PASSDATA" , userText.getText().toString());
                startActivity(passIntent);


            }
        });


    }
}
