package com.example.kriz.sistempakarv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class G09 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g09);

        Button YA,TIDAK;

        YA = (Button)findViewById(R.id.YA);
        YA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent YA = new Intent(G09.this, P03.class);
                startActivity(YA);
            }
        });

        TIDAK = (Button)findViewById(R.id.TIDAK);
        TIDAK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TIDAK = new Intent(G09.this, P03.class);
                startActivity(TIDAK);
            }
        });
    }
}
