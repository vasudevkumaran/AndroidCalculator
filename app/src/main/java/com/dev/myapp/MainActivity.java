package com.dev.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView resultText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        Log.w("MainActivity", "on create called");
        resultText = findViewById(R.id.resultTx);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w("MainActivity", "on resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MainActivity", "on pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MainActivity", "on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MainActivity", "on destroy called");
    }

    @Override
    public void onClick(View view) {
        Log.w("MainActivity", "btn pressed");
        if (resultText.getText().toString().equals("0")) {
            resultText.setText("");
        }
        if (view.getId() == R.id.btn1) {
            resultText.append("1");
        } else if (view.getId() == R.id.btn2) {
            resultText.append("2");
        } else if (view.getId() == R.id.btn3) {
            resultText.append("3");
        } else if (view.getId() == R.id.btn4) {
            resultText.append("4");
        }
    }

    public void onBtnPressed(View view){
        if (resultText.getText().toString().equals("0")) {
            resultText.setText("");
        }
        Button btn = (Button)view;
        resultText.append(btn.getText().toString());
    }
}
