package com.example.scanerqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static TextView resultTextView;
    Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = (TextView) findViewById(R.id.textView);
        scan_btn =(Button)findViewById(R.id.btn_scan);
    }

    public void scan(View view) {
        startActivity(new Intent(getApplicationContext(),ScanCodeActivity.class));
    }
}
