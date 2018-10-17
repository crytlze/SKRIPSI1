package com.example.kriz.sistempakarv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class G01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g01);

        Button YA,TIDAK;

        YA = (Button)findViewById(R.id.YA);
        YA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent YA = new Intent(G01.this, G02.class);
                startActivity(YA);
            }
        });

        TIDAK = (Button)findViewById(R.id.TIDAK);
        TIDAK .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TIDAK = new Intent(G01.this, G08.class);
                startActivity(TIDAK);
            }
        });
    }

    public void kemenu(View view) {

        Intent balik = new Intent(G01.this, MainActivity.class);
        startActivity(balik);
    }
}
