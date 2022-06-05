package com.example.lect_12_listviewsadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> friendlist=new ArrayList<String>();
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        friendlist.add("zain");
        friendlist.add("Arham");
        friendlist.add("Ashar");

        listView=findViewById(R.id.lw1);

        adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, friendlist);

        Collections.sort(friendlist);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("adapter view ",adapterView.toString());
                Log.d("view view ",view.toString());
                Log.d("int i ",String.valueOf(i));
                Log.d("long l ",String.valueOf(l));
                Log.d("friend list",friendlist.get(i));
                //delete
                friendlist.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
    }

    public void Add(View view){
        friendlist.add("sharmeen");
        adapter.notifyDataSetChanged();
    }
}