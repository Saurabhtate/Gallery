package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class album2 extends AppCompatActivity {

    ImageView i;
    String s;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album2);
        i = findViewById(R.id.imageViewsu1);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = "1";
                picture();
            }
        });
    }

    public void picture() {
        if (s == "1") {
            Intent i = new Intent(this, saup1.class);
            startActivity(i);
        }
    }
}