package com.example.adapterandexception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Collections;

class EmptyListException extends Exception{
    public String toString(){
        return "Empty List Exception";
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=(ListView) findViewById(R.id.List);
        String[] Colors={};
        ArrayAdapter<String> ColorAdapter=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,Colors);
        try{
            if(ColorAdapter.getCount()<=0){
                throw new EmptyListException();
            }
            lv.setAdapter(ColorAdapter);
        }catch (EmptyListException e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }
    }
}