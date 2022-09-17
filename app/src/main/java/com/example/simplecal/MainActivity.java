package com.example.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get two buttons
        Button addButton = findViewById(R.id.addButton);
        Button subButton = findViewById(R.id.subButton);
        //set listeners for buttons
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addition();
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtraction();
            }
        });
    }

    public void addition(){
        //get the editText
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        //convert value into int
        int x=Integer.parseInt(number1.getText().toString());
        int y=Integer.parseInt(number2.getText().toString());
        //addition of these two numbers
        int z=x+y;
        String answer = Integer.toString(z);
        Intent intent = new Intent(this, AddActivity2.class);
        intent.putExtra( "fieldValue",answer);
        startActivity(intent);
    }

    public void subtraction(){
        //get the editText
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        //convert value into int
        int x=Integer.parseInt(number1.getText().toString());
        int y=Integer.parseInt(number2.getText().toString());
        //subtraction of these two numbers
        int z=x-y;
        String answer = Integer.toString(z);
        Intent intent = new Intent(this, SubActivity3.class);
        intent.putExtra( "fieldValue",answer);
        startActivity(intent);
    }
}