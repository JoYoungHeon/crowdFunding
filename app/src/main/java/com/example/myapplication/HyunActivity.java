package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HyunActivity extends AppCompatActivity {

    private ListView hyun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyun);

        hyun = (ListView)findViewById(R.id.hyun);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
        hyun.setAdapter(adapter);

        data.add("스마트 워치 끝판왕! 3만원 대? 후원이 완료되었습니다.");
        data.add("집에서도 밖에서도 입는 바지! 후원이 완료되었습니다.");
        adapter.notifyDataSetChanged();

    }
}