package com.dev.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("MainActivity","on create called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w("MainActivity","on resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MainActivity","on pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MainActivity","on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MainActivity","on destroy called");
    }
}
