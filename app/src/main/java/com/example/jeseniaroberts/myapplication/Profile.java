package com.example.jeseniaroberts.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity
{
    private Button groupbutton;
    private Button personalitybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        groupbutton = (Button) findViewById(R.id.button4);
        personalitybutton = (Button) findViewById(R.id.button5);

        groupbutton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {

                openGroups();
            }
        });

        personalitybutton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                openPersonality();
            }

        });
    }

    public void openGroups()
    {

        Intent intent = new Intent( this, Groups.class);
        startActivity(intent);


    }
    public void openPersonality()
    {
        Intent intent = new Intent( this, Personality.class);
        startActivity(intent);
    }
}
