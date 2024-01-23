package com.example.step00text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onCreate() 메소드 안에 지역변수 선언
        EditText inputNum = findViewById(R.id.inputNum);
        Button button = findViewById(R.id.testBtn);

        // 버튼 클릭시 함수형태로 리스너 등록하기
        button.setOnClickListener(v->{
            // 잘 받아왔다는 것을 입증
            // String msg = inputNum.getText().toString();
            // Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

            // EditText 에 입력한 문자열을 읽어와서 int type 으로 바꾼다음
            int num = Integer.parseInt(inputNum.getText().toString());
            if (num%2 == 1){
                Toast.makeText(this, "홀수입니다", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "짝수입니다" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}