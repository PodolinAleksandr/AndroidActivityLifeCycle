package com.example.androidactivitylivecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Log.d("LifeCycle :", "onCreate" );
        textView.append("onCreate" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle :", "onStart" );
        textView.append("onStart" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle :", "onResume" );
        textView.append("onResume" + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle :", "onPause" );
        textView.append("onPause" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle :", "onStop" );
        textView.append("onStop" + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle :", "onDestroy" );
        textView.append("onDestroy" + "\n");
    }
}
