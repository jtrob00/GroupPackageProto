package com.example.jeseniaroberts.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button logbutton;
    private Button sinbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logbutton = (Button) findViewById(R.id.button);
        sinbutton = (Button) findViewById(R.id.button2);

        logbutton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {

                openLogin();
            }
        });

        sinbutton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                openSignup();
            }

        });
    }

    public void openLogin()
    {

        Intent intent = new Intent( this, Login.class);
        startActivity(intent);


    }
    public void openSignup()
    {
        Intent intent = new Intent( this, Signup.class);
        startActivity(intent);
    }
}
