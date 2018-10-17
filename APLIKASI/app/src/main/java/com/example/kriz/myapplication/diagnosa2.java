package com.example.kriz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class diagnosa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa2);
    }

    public void lanjut(View view) {

        boolean checked = ((RadioButton)view).isChecked();

       switch (view.getId())
        {
            case R.id.G01:
                if(checked) {
                    Intent intent = new Intent(diagnosa2.this, diagnosa2.class);
                    startActivity(intent);
                }
                break;

            case R.id.G02:
                if(checked) {
                    Intent intent = new Intent(diagnosa2.this, diagnosa3.class);
                    startActivity(intent);
                }

                break;


        }
    }
}
