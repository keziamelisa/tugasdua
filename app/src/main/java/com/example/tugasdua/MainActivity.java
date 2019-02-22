package com.example.tugasdua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_tmbh, btn_krg, btn_kalii, btn_bagii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tmbh = findViewById(R.id.btntambah);
        btn_krg = findViewById(R.id.btnkurang);
        btn_kalii = findViewById(R.id.btn_kali);
        btn_bagii = findViewById(R.id.btn_bagi);

        btn_tmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), tambah.class);
                startActivity(intent);
            }
        });

        btn_krg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), kurang.class);
                startActivity(intent);
            }
        });

        btn_kalii.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), kali.class);
                startActivity(intent);
            }
        });

        btn_bagii.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), bagi.class);
                startActivity(intent);
            }
        });
    }

}
