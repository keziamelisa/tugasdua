package com.example.tugasdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tambah extends AppCompatActivity {
private Button btntambahh;
private EditText etangka1, etangka2;
private TextView tvtambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);
        btntambahh = findViewById(R.id.btntmbh);
        etangka1 = findViewById(R.id.tambah1);
        etangka2 = findViewById(R.id.tambah2);
        tvtambah = findViewById(R.id.hasiltmbh);

        btntambahh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka1 = etangka1.getText().toString();
                    String sAngka2 = etangka2.getText().toString();
                    double X = Double.parseDouble(sAngka1);
                    double Y = Double.parseDouble(sAngka2);
                    double hasil = X + Y;

                    String sHasil = String.valueOf(hasil);
                    tvtambah.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }}