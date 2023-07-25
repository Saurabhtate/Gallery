package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6;
    String ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);
        i5=findViewById(R.id.i5);
        i6=findViewById(R.id.i6);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch="1";
                album();

            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch="2";
                album();

            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch="3";
                album();

            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch="4";
                album();

            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch="5";
                album();

            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch="6";
                album();

            }
        });
    }
    public void album(){

        if (ch=="1"){
            Intent i=new Intent(this,album1.class);
            startActivity(i);
        } else if (ch=="2") {
            Intent i=new Intent(this,album2.class);
            startActivity(i);
        } else if (ch=="3") {
            Intent i=new Intent(this,album3.class);
            startActivity(i);
        }else if (ch=="4") {
            Intent i=new Intent(this,album4.class);
            startActivity(i);
        }else if (ch=="5") {
            Intent i=new Intent(this,album5.class);
            startActivity(i);
        }else if (ch=="6") {
            Intent i=new Intent(this,album6.class);
            startActivity(i);
        }
    }
}