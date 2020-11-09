package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SeolActivity extends AppCompatActivity {

    private ListView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seol);

        view = (ListView)findViewById(R.id.view);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        view.setAdapter(adapter);

        data.add("검토중 : 영거의 대박 프로젝트");
        data.add("검토중 : 워니의 쪽박 프로젝트");
        data.add("검토중 : 삐삐의 멍멍 프로젝트");
        data.add("검토중 : 재윤의 야구 프로젝트");
        adapter.notifyDataSetChanged();


    }
}