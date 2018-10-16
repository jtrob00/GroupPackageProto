package com.example.jeseniaroberts.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    private Button prosibutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        prosibutton = (Button) findViewById(R.id.button6);

        prosibutton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {

                openProfileSi();
            }
        });
    }

    public void openProfileSi()
    {
        Intent intent = new Intent( this, Profile.class);
        startActivity(intent);
    }
}
