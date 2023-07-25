package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class album6 extends AppCompatActivity {
    ImageView i;
    String s;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album6);

        i=findViewById(R.id.imageViewcp1);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s="1";
                picture();
            }
        });
    }

    public void picture(){
        if(s == "1"){
            Intent i=new Intent(this, carp1.class);
            startActivity(i);
        }
    }
}