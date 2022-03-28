package com.example.toggleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView) findViewById(R.id.imageView1);
        i2=(ImageView) findViewById(R.id.imageView2);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.VISIBLE);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2.setVisibility(View.GONE);
                i1.setVisibility(View.VISIBLE);
            }
        });
    }
}