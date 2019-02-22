package com.example.tugasdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bagi extends AppCompatActivity {
    private Button btnbagii;
    private EditText etbagi1, etbagi2;
    private TextView tvbagii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagi);

        btnbagii = findViewById(R.id.btnbagi);
        etbagi1 = findViewById(R.id.bagi1);
        etbagi2 = findViewById(R.id.bagi2);
        tvbagii = findViewById(R.id.hasilbagi);

        btnbagii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sBagi1 = etbagi1.getText().toString();
                    String sBagi2 = etbagi2.getText().toString();
                    double Bagisatu = Double.parseDouble(sBagi1);
                    double Bagidua = Double.parseDouble(sBagi2);
                    double hasil = Bagisatu / Bagidua;

                    String sHasil = String.valueOf(hasil);
                    tvbagii.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
