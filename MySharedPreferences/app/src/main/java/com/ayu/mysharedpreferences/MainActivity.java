package com.ayu.mysharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    Button simpan, hapus;
    TextView hasil;
    SharedPreferences.Editor setData;
    SharedPreferences getData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData=getSharedPreferences("data", MODE_PRIVATE).edit();
        getData=getSharedPreferences("data", MODE_PRIVATE);
        nama=findViewById(R.id.nama);
        simpan=findViewById(R.id.simpan);
        hapus=findViewById(R.id.hapus);
        hasil=findViewById(R.id.hasil);

        if (getData.contains("session nama"))
        {
            hasil.setText(getData.getString("session nama", null));
        }
        else
        {
            hasil.setText("Data belum disimpan");
        }
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData.putString("session nama", nama.getText().toString());
                setData.apply();
                hasil.setText(nama.getText().toString());
            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData.edit().remove("session nama").commit();
                hasil.setText("");
            }
        });
    }
}