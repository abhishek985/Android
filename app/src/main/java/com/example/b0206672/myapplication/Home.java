package com.example.b0206672.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity {

    private CardView java,selenium;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        init();

    }

    public void init() {
        java=(CardView)findViewById(R.id.java);
        selenium=(CardView)findViewById(R.id.selenium);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Home.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
