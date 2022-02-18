package com.example.adapterandexception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=(ListView) findViewById(R.id.List);
        String[] Colors={"Red","Green","Black","White","Yellow"};
        ArrayAdapter<String> ColorAdapter=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,Colors);
        try{
            lv.setAdapter(ColorAdapter);
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }
}