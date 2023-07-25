package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class album1 extends AppCompatActivity {

    ImageView i;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album1);
        i=findViewById(R.id.imageViewp1);

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
            Intent i=new Intent(this, labP1.class);
            startActivity(i);
        }
    }
}