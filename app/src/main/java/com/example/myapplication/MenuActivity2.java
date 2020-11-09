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

public class MenuActivity2 extends AppCompatActivity {

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
                Intent intent = new Intent(MenuActivity2.this, MyActivity.class);
                startActivity(intent);
            }
        });

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity2.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        btn_best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity2.this, MenuActivity2.class);
                startActivity(intent);
            }
        });

        btn_gi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity2.this, MenuActivity3.class);
                startActivity(intent);
            }
        });

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        data.add("공지사항");
        data.add("48V 전기자전거 50만원 대 동급 최강!");
        data.add("집에서도 밖에서도 입는 바지!");
        data.add("AI산업 투자, SK 현대 사용");
        data.add("세계 최초 신소재 에어셀베타젤");
        adapter.notifyDataSetChanged();
    }
}