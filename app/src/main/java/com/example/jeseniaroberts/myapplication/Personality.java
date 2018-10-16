package com.example.jeseniaroberts.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personality extends AppCompatActivity
{
    private Button persgroupbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality);

        persgroupbutton = (Button) findViewById(R.id.button7);

        persgroupbutton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {

                openGroups();
            }
        });
    }
    public void openGroups()
    {

        Intent intent = new Intent( this, Groups.class);
        startActivity(intent);


    }
}
