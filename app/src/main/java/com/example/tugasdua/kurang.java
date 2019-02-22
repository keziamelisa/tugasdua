package com.example.tugasdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kurang extends AppCompatActivity {
    private Button btnkurangg;
    private EditText etkrg1, etkrg2;
    private TextView tvkurangg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurang);

        btnkurangg = findViewById(R.id.btnkrg);
        etkrg1 = findViewById(R.id.kurang1);
        etkrg2 = findViewById(R.id.kurang2);
        tvkurangg = findViewById(R.id.hasilkrg);

        btnkurangg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sKurang1 = etkrg1.getText().toString();
                    String sKurang2 = etkrg2.getText().toString();
                    double Satu = Double.parseDouble(sKurang1);
                    double Dua = Double.parseDouble(sKurang2);
                    double hasil = Satu - Dua;

                    String sHasil = String.valueOf(hasil);
                    tvkurangg.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
