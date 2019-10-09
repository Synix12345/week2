package com.example.week2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class NewArticleJ extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newarticle);

        TextView header = findViewById(R.id.header);
        TextView content = findViewById(R.id.content);

        int articlePosition = getIntent().getIntExtra("ID",'0');

        Article currentArticle = FakeDatabase.getArticleById(articlePosition);
        header.setText(currentArticle.getHeadline());
        content.setText(currentArticle.getContent());



    }



}
