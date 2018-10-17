package com.example.kriz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mulaidiagnosa(View view) {
        Intent intent = new Intent(MainActivity.this, MulaiDiagnosa.class);
        startActivity(intent);
    }

    public void macam2penyakit(View view) {
        Intent intent = new Intent(MainActivity.this, MacamPenyakit.class );
        startActivity(intent);
    }
}
