package com.example.gridimagenew;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    GridView imageGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] items={"One","Two","Three","Four"};
        setContentView(R.layout.activity_main);
        imageGV=findViewById(R.id.gvitem);
        ArrayList<ImageModel>imageModelArrayList=new ArrayList<ImageModel>();
        imageModelArrayList.add(new ImageModel(R.drawable.a));
        imageModelArrayList.add(new ImageModel(R.drawable.b));
        imageModelArrayList.add(new ImageModel(R.drawable.c));
        imageModelArrayList.add(new ImageModel(R.drawable.d));
        ImageAdapter adapter=new ImageAdapter(this,imageModelArrayList);
        imageGV.setAdapter(adapter);

        imageGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                new AlertDialog.Builder(MainActivity.this).setMessage(items[i]).show();
            }
        });
    }
}
