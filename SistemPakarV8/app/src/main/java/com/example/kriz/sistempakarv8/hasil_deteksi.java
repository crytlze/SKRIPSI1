package com.example.kriz.sistempakarv8;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class hasil_deteksi extends AppCompatActivity {


    Toolbar toolbar;
    protected Cursor cursor;
    Database dbHelper;
    TextView final_result;
    TextView nama_penyakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_deteksi);

       

        dbHelper = new Database(this);
        final_result = (TextView) findViewById(R.id.final_result);
        TextView persen = (TextView)findViewById(R.id.persen);
        TextView judul_keterangan = (TextView)findViewById(R.id.textView5);
        nama_penyakit = (TextView) findViewById(R.id.namapenyakit);
        TextView penyakitnol = (TextView) findViewById(R.id.penyakitnol);

        cursor = this.dbHelper.getReadableDatabase().rawQuery("SELECT * FROM penyakit WHERE kode_penyakit = '" + getIntent().getStringExtra("nama")+"' ", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            judul_keterangan.setVisibility(View.VISIBLE);

            nama_penyakit.setText(cursor.getString(1).toString());
            final_result.setText(getIntent().getStringExtra("namagejala"));
            persen.setText(getIntent().getStringExtra("persen"));

        }else{
            final_result.setText(getIntent().getStringExtra("namagejala"));
            final_result.setText("Tidak ada gejala yang dipilih");
            judul_keterangan.setVisibility(View.INVISIBLE);

        }
        penyakitnol.setText(getIntent().getStringExtra("namanol"));

        Button Mulailagi = (Button)findViewById(R.id.mulailagi);
        Mulailagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

               Intent i = new Intent(getApplicationContext(), diagnosa.class);
               startActivity(i);
            }
        });
    }



    public void onBackPressed() {


    }
}
