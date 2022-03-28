package com.example.gridimage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    
    GridView gridview;
    String[] items={"carrot","orange","potato","tomato"};
    int[] images={R.drawable.carrot,R.drawable.orange,R.drawable.potato,R.drawable.tomato};
//    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview=(GridView) findViewById(R.id.grid);
        CustomAdapter customAdapter=new CustomAdapter(images,this);
        gridview.setAdapter(customAdapter);

//        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                new AlertDialog.Builder(builder.getContext()).
//                        setMessage(items[i]).show();
//            }
//        });

    }

}