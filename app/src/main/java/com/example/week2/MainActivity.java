package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button1 = findViewById(R.id.art);
        Button share = findViewById(R.id.button);
        share.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                 Intent intent = new Intent(MainActivity.this, NewArticleJ.class);
                 intent.putExtra("ID", 1);
                startActivity(intent);
            }
        });
        View button2 = findViewById(R.id.art2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewArticleJ.class);
                intent.putExtra("ID", 2);
                startActivity(intent);
            }
        });
        View button3 = findViewById(R.id.art3);
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewArticleJ.class);
                intent.putExtra("ID", 3);
                startActivity(intent);
            }
        });

    }

    }
    

        
       
        
        


