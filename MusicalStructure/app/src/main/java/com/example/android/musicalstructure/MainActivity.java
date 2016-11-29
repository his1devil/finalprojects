package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind the view with clicklistener
        TextView hymn = (TextView) findViewById(R.id.HymnForTheWeekend);
        hymn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Hymn.class);
                startActivity(i);
            }
        });

        TextView erverglow = (TextView) findViewById(R.id.Everglow);
        erverglow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Everglow.class);
                startActivity(i);
            }
        });

        TextView adventure = (TextView) findViewById(R.id.AdventureOfALifetime);
        adventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Adventure.class);
                startActivity(i);
            }
        });

        TextView amazing = (TextView) findViewById(R.id.AmazingDay);
        amazing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Amazing.class);
                startActivity(i);
            }
        });

        TextView order = (TextView) findViewById(R.id.buy);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Order.class);
                startActivity(i);
            }
        });


    }
}
