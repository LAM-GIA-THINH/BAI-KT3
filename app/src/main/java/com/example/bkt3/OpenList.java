package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OpenList extends AppCompatActivity {
    ListView lvBook;
    ArrayList<Language> arrayLanguage;
    Language_adapter adapter;
    TextView txtview;
    TextView txtview2;
    ImageView imghinh;
    Button btnvdu;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_list);
        AnhXa();
        txtview.setText(getIntent().getStringExtra("Tên"));
        txtview2.setText(getIntent().getStringExtra("Mô tả"));
        imghinh.setImageResource(getIntent().getIntExtra("Hinh",0));
        btnvdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });


    }

    private void AnhXa() {
        txtview = (TextView) findViewById(R.id.ten1);
        txtview2 = (TextView) findViewById(R.id.ten2);
        imghinh = (ImageView) findViewById(R.id.hinh1);
        btnvdu = (Button) findViewById(R.id.btn);
        edit = (EditText) findViewById(R.id.nhap);
    }
}