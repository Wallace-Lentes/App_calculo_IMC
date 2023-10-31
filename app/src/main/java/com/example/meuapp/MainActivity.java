package com.example.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate");
        titleTextView = findViewById(R.id.titleTextView);
        titleTextView.setText("CALCULADORA DE IMC");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("LifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("LifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("LifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("LifeCycle", "onDestroy");
    }
}