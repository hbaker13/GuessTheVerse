package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stArt(View view){
        Intent st = new Intent(this, table.class);
        startActivity(st);
    }

    public void clOse(View view) {
        finish();
        System.exit(0);
    }

}
