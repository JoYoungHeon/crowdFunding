package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

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
                Intent intent = new Intent(MenuActivity.this, MyActivity.class);
                startActivity(intent);
            }
        });

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        btn_best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MenuActivity2.class);
                startActivity(intent);
            }
        });

        btn_gi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MenuActivity3.class);
                startActivity(intent);
            }
        });

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        data.add("공지사항");
        data.add("30분만에 펀딩 성공 반년반에 거래액 95%업!");
        data.add("2차감염 예방기술 UN, WHO 조달자격업체 등록");
        data.add("기타 필수템! 고급 카포와 초정밀 튜너");
        data.add("스마트 워치 끝판왕! 3만원 대?");
        data.add("48V 전기자전거 50만원 대 동급 최강!");
        data.add("집에서도 밖에서도 입는 바지!");
        data.add("AI산업 투자, SK 현대 사용");
        data.add("세계 최초 신소재 에어셀베타젤");
        adapter.notifyDataSetChanged();
    }
}