package com.example.sampleapllication4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText edtwheit;
private EditText edtheight;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //edtwheit = findViewById(R.id.edtwheit);
        edtheight = findViewById(R.id.txt_height);


    }

    public void btn_onclick(View view) {
        String name = edtheight.getText().toString();
        String name2= edtwheit.getText().toString();
    }
}