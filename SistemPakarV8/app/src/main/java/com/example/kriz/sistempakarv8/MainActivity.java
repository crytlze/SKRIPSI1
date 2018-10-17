package com.example.kriz.sistempakarv8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button diagnosa;
         Button tentang;

        diagnosa = (Button)findViewById(R.id.diagnosa);
        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diagnosa = new Intent(MainActivity.this,diagnosa.class);
                startActivity(diagnosa);
            }
        });

        tentang = (Button)findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tentang = new Intent(MainActivity.this, about.class);
                startActivity(tentang);
            }
        });


    }
}
