package com.example.lect_12_listviewsadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView name,id,position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));
        id.setText(intent.getStringExtra("id"));
        position.setText(intent.getStringExtra("position"));
    }
}