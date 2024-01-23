package com.example.step02activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 이동하기2 버튼의 참조값 얻어오기
        Button moveBtn2 = findViewById(R.id.moveBtn2);
        // new View.OnClickListener() 인터페이스를 등록해서 동작 정의하기
        moveBtn2.setOnClickListener(new View.OnClickListener() { // 인터페이스 녀석
            // javascript 라면??
            // let btn = document.querySelector("#moveBtn2")
            // btn.addEventListener("click", function(){});

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                // 그냥 this 가 아닌 이유 : View.OnClickListener() 인터페이스를 가리키기 때문
                // 바깥에 있는 MainActivity 를 지정하기 위해 MainActivity.this 로 작성
                startActivity(intent);
            }
        });

        //id 가 moveBtn3 인 Button 객체의 참조값 얻어오기
        Button moveBtn3 = findViewById(R.id.moveBtn3);
        //버튼에 클릭 리스너 등록하기 (함수형태)
        moveBtn3.setOnClickListener(v -> {
            Intent intent = new Intent(this, SubActivity.class); // this : MainActivity 참조값 혹은 Context 참조값
            startActivity(intent);
        });

        // 문제 : MainActivity 를 view.OnClickListener type 으로 만들고
        // MainActivity 를 이동하기4 버튼을 눌렀을 때 리스너 인터페이스로 등록하고
        // 동일한 동작을 하도록 프로그래밍 해보세요
        Button moveBtn4 = findViewById(R.id.moveBtn4);
        moveBtn4.setOnClickListener(this); // 이동하기 4 버튼
    }

    public void clicked(View v) { // 이동하기 1번 버튼
        // 액티비티를 이동한다.

        // SubActivity 로 이동할 의도(Intent) 를 가지고 있는 객체 생성하기
        Intent intent = new Intent(this, SubActivity.class);
        // 부모의 메서드를 이용해서 Activity 이동하기
        startActivity(intent);
    }

    // 정답 : implment View.OnClickListener 인터페이스를 구현했기 때문에 강제로 오버라이드된 메서드
    @Override
    public void onClick(View view) {
        // SubActivity 로 이동할 의도(Intent) 를 가지고 있는 객체 생성하기
        Intent intent = new Intent(this, SubActivity.class);
        // 부모의 메서드를 이용해서 Activity 이동하기
        startActivity(intent);
    }
}