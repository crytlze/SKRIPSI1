package com.example.kriz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MulaiDiagnosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_diagnosa);
    }

    public void lanjut(View view) {
        Intent intent = new Intent(MulaiDiagnosa.this, diagnosa1.class);
        startActivity(intent);
    }
}
