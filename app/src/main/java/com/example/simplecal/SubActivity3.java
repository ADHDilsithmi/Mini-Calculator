package com.example.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SubActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        String data = getIntent().getStringExtra("fieldValue");
        TextView output = findViewById(R.id.outputSub);
        output.setText(data);

    }
}