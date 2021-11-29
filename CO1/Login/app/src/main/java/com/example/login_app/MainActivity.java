package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private  EditText pass;
    private Button loginBtn;
    private TextView infoTxt;
    private String uName="Samuel";
    private String psw="Samuel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.etName);
        String userStr=username.getText().toString();
        pass = (EditText)findViewById(R.id.etPassword);
        String passStr=pass.getText().toString();
        loginBtn = (Button)findViewById(R.id.btnLogin);
        infoTxt = (TextView)findViewById(R.id.tvInfo);
        String infoStr=infoTxt.getText().toString();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userStr.equals(uName) && passStr.equals(psw)){
                    infoTxt.setText("Login Successfull");
                    Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                    intent.putExtra("username",userStr);
                    startActivity(intent);
                }
                else{
                    infoTxt.setText("Username or Password Not match!!!");
                }
            }
        });



    }
}