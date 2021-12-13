package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private  EditText pass;
    private Button loginBtn;
    private TextView infoTxt;
    private String uName="Samuel";
    private String psw="Samuel";
    private int count=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.etName);
        pass = (EditText)findViewById(R.id.etPassword);
        loginBtn = (Button)findViewById(R.id.btnLogin);
        infoTxt = (TextView)findViewById(R.id.tvInfo);
        String infoStr=infoTxt.getText().toString();
        infoTxt.setText("Login attempt Remaining "+count);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals(uName) && pass.getText().toString().equals(psw)){
                    Toast toast=Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                    intent.putExtra("username",username.getText().toString());
                    startActivity(intent);
                }
                else{
                    count--;
                    if(count<=0){
                        loginBtn.setEnabled(false);
                        infoTxt.setText("Please try after some time");

                    }
                }
            }
        });



    }
}