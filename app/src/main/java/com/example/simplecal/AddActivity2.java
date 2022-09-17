package com.example.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AddActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2);

        String data = getIntent().getStringExtra("fieldValue");
        TextView output = findViewById(R.id.outputAdd);
        output.setText(data);

    }
}