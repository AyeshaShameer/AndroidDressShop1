package com.example.ayesh.dressshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity {

     public ImageButton imgButton1, imgButton2, imgButton3, imgButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButton1 = (ImageButton) findViewById(R.id.BridalImgBtn);
        imgButton2 = (ImageButton) findViewById(R.id.CasualImgBtn);
        imgButton3 = (ImageButton) findViewById(R.id.PartyImgBtn);
        imgButton4 = (ImageButton) findViewById(R.id.KidImgBtn);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DressActivity.class);
                startActivity(intent);
            }
        });
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DressActivity.class);
                startActivity(intent);
            }
        });
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DressActivity.class);
                startActivity(intent);
            }
        });
        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DressActivity.class);
                startActivity(intent);
            }
        });
    }
}

