package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    private Button btn_rok, btn_hyun, btn_arlim, btn_seol, btn_back, btn_mypro, btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        btn_rok = findViewById(R.id.btn_rok);
        btn_hyun = findViewById(R.id.btn_hyun);
        btn_arlim = findViewById(R.id.btn_arlim);
        btn_seol = findViewById(R.id.btn_seol);
        btn_back = findViewById(R.id.btn_back);
        btn_mypro = findViewById(R.id.btn_mypro);
        btn_logout = findViewById(R.id.btn_logout);

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "로그아웃이 완료되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        btn_mypro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, SeolActivity.class);
                startActivity(intent);
            }
        });

        btn_hyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, HyunActivity.class);
                startActivity(intent);
            }
        });


    }
}