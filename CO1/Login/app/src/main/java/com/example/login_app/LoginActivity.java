package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        showName=(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        String name=intent.getStringExtra("username");
        System.out.println(name);
        showName.setText(name);

    }
}