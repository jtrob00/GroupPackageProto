package com.example.jeseniaroberts.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login extends AppCompatActivity {

    private Button proLobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        proLobutton = (Button) findViewById(R.id.button3);

        proLobutton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {

                openProfileLo();
            }
        });
    }

    public void openProfileLo()
    {

        Intent intent = new Intent( this, Profile.class);
        startActivity(intent);
    }
}
