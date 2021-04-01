package com.ayu.recyclerlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adaptermahasiswa;
    private ArrayList<Mahasiswa> mDataMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        adaptermahasiswa = new MahasiswaAdapter((mDataMahasiswa));

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adaptermahasiswa);

    }

    private void addData() {
        mDataMahasiswa = new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa( "Fitriyah Ayu", "E41191725", "123456"));
        mDataMahasiswa.add(new Mahasiswa( "Putra ", "E41191725", "123456"));
        mDataMahasiswa.add(new Mahasiswa( "Laudya Citra", "E41191725", "123456"));
        mDataMahasiswa.add(new Mahasiswa( "Putri Ayu", "E41191725", "123456"));
    }
}