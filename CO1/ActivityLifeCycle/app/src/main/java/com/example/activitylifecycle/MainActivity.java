package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lifeCycle","Created");
    }

        @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifeCycle","Started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifeCycle","Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifeCycle","Resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifeCycle","Started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifeCycle","Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifeCycle","Destroyed");
    }
}