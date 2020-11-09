package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText et_id, et_pw, et_bank, et_num, et_jm, et_jms, et_name;
    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_id = findViewById(R.id.et_id);
        et_pw = findViewById(R.id.et_pw);
        et_bank = findViewById(R.id.et_bank);
        et_num = findViewById(R.id.et_num);
        et_jm = findViewById(R.id.et_jm);
        et_jms = findViewById(R.id.et_jms);
        et_name = findViewById(R.id.et_name);

        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "회원가입을 축하드립니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}