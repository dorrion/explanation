package com.example.explanation_0408;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btn_sub_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sub_right = findViewById(R.id.button_sub0_right);

        btn_sub_right.setOnClickListener(new View.OnClickListener() { //액티비티로 화면 전환해주는 코드
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SubActivity1.class); // 인텐트는 기본적으로 수행할 기능인 액션(Action)과 액션이 수행될 대상의 데이터(Data)가 함께
                startActivity(intent); // 다음 화면으로 넘어가기
            }
        });

    }

}
