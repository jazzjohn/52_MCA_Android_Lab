package com.example.calculatorusinggridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView result;
    Button add,sub, multi,divide;
    private Double n1,n2,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        result=(TextView) findViewById(R.id.result);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        multi =(Button) findViewById(R.id.mult);
        divide=(Button) findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Double.parseDouble(num1.getText().toString());
                n2=Double.parseDouble(num2.getText().toString());
                r=n1+n2;
                result.setText(r.toString());
                num1.setText("");
                num2.setText("");

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Double.parseDouble(num1.getText().toString());
                n2=Double.parseDouble(num2.getText().toString());
                r=n1/n2;
                result.setText(r.toString());
                num1.setText("");
                num2.setText("");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Double.parseDouble(num1.getText().toString());
                n2=Double.parseDouble(num2.getText().toString());
                r=n1-n2;
                result.setText(r.toString());
                num1.setText("");
                num2.setText("");
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Double.parseDouble(num1.getText().toString());
                n2=Double.parseDouble(num2.getText().toString());
                r=n1*n2;
                result.setText(r.toString());
                num1.setText("");
                num2.setText("");
            }
        });
    }
}