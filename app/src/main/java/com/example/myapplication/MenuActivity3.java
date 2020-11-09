package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity3 extends AppCompatActivity {

    private Button btn_my, btn_best, btn_main, btn_gi;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_my = findViewById(R.id.btn_my);
        btn_best = findViewById(R.id.btn_best);
        btn_main = findViewById(R.id.btn_main);
        btn_gi = findViewById(R.id.btn_gi);

        btn_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity3.this, MyActivity.class);
                startActivity(intent);
            }
        });

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity3.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        btn_best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity3.this, MenuActivity2.class);
                startActivity(intent);
            }
        });

        btn_gi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity3.this, MenuActivity3.class);
                startActivity(intent);
            }
        });

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        data.add("공지사항");
        data.add("체험형 미디어 아트 전시");
        data.add("명품 산업");
        data.add("선크림? CC크림? 하나로 끝내자!");
        data.add("두유의 재발견, 무첨가 프리미엄");
        adapter.notifyDataSetChanged();
    }
}