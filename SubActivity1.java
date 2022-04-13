package com.example.explanation_0408;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity1 extends Activity {

    ImageButton btn_sub_left;
    ImageButton btn_sub_right;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1); // layout xml과 자바파일 연결

        btn_sub_left = findViewById(R.id.button_sub1_left);
        btn_sub_right = findViewById(R.id.button_sub1_right);

        btn_sub_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class); // 인텐트는 기본적으로 수행할 기능인 액션(Action)과 액션이 수행될 대상의 데이터(Data)가 함께
                startActivity(intent); // 다음 화면으로 넘어가기
            }
        });

        btn_sub_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SubActivity2.class); // 인텐트는 기본적으로 수행할 기능인 액션(Action)과 액션이 수행될 대상의 데이터(Data)가 함께
                startActivity(intent); // 다음 화면으로 넘어가기
            }
        });

    }
}
