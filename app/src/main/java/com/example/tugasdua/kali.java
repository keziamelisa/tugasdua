package com.example.tugasdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kali extends AppCompatActivity {
    private Button btnklii;
    private EditText etkali1, etkali2;
    private TextView tvkali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kali);

        btnklii = findViewById(R.id.btnkali);
        etkali1 = findViewById(R.id.kali1);
        etkali2 = findViewById(R.id.kali2);
        tvkali = findViewById(R.id.hasilkali);

        btnklii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sKali1 = etkali1.getText().toString();
                    String sKali2 = etkali2.getText().toString();
                    double kli1 = Double.parseDouble(sKali1);
                    double kli2 = Double.parseDouble(sKali2);
                    double hasil = kli1 * kli2;

                    String sHasil = String.valueOf(hasil);
                    tvkali.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
