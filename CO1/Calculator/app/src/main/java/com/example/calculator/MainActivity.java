package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Double num1,num2,ans;
    private String op;
    private TextView number,result;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnmult,btnmin,btndiv,btneq,btndot,btnclr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=(TextView) findViewById(R.id.txt1);
        result=(TextView) findViewById(R.id.txt2);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn0=(Button) findViewById(R.id.btn0);
        btnmult=(Button) findViewById(R.id.btnmult);
        btndiv=(Button) findViewById(R.id.btndiv);
        btnplus=(Button) findViewById(R.id.btnplus);
        btnmin=(Button) findViewById(R.id.btnmin);
        btneq=(Button) findViewById(R.id.buttoneq);
        btndot=(Button) findViewById(R.id.btndot);
        btnclr=(Button) findViewById(R.id.btnclr);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(number.getText().toString()+'1');
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'2');
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'3');
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'4');
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'5');
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'6');
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'7');
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'8');
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'9');
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString()+'0');
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number.getText().toString());
                number.setText("");
                op="*";
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number.getText().toString());
                number.setText("");
                op="/";
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number.getText().toString());
                number.setText("");
                op="+";
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number.getText().toString());
                number.setText("");
                op="-";
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText("");
                result.setText("");
                num1=0.0;
                num2=0.0;
            }
        });

        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2=Double.parseDouble(number.getText().toString());
                if(num1>=0 && num2>=0){
                    if(op.equals("+")){
                        ans=num1+num2;
                        result.setText(ans.toString());
                        number.setText("");
                    }else if(op.equals("-")){
                        ans=num1-num2;
                        result.setText(ans.toString());
                        number.setText("");
                    }else if(op.equals("*")){
                        ans=num1*num2;
                        result.setText(ans.toString());
                        number.setText("");
                    }else if(op.equals("/")){
                        ans=num1/num2;
                        result.setText(ans.toString());
                        number.setText("");
                    }
                }
            }
        });


    }
}