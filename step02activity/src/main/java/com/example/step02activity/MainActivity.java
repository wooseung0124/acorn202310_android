package com.example.step02activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Activity 가 활성화 될 때 최초 한번 호출되는 메소드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
            부모의 메소드 .setContentView() 메서드 호출되면서
            어떤 xml 문서를 전개해서 화면을 구성할 지 정보를 전달한다
            R 은 res
            layout 은 layout 폴더
            activity_main 은 activity_main.xml 문서를 가리킨다.
            따라서
            R.layout.activity_main 은 res/layout/activity_main.xml 문서를 의미한다.
         */
        setContentView(R.layout.activity_main);
    }
    // 카운트 값을 저장할 필드 만들고 초기값 0 부여
    int count=0;

    // 증가 버튼 눌렀을 때 호출될 예정인 메소드 만들기
    public void add(View v){
        // 카운트 1 증가 시키고
        count++;
        // 카운트값을 TextView 에 출력하기

        // id 가 myCount 인 TextView 객체의 참조값 얻어오기
        TextView textView=findViewById(R.id.myCount);
        // 출력할 숫자를 문자로 변환
        String strCount=Integer.toString(count);
        //TextView 객체의 setText() 메소드를 이용해서 출력된 값 수정하기
        textView.setText(strCount);
    }

    public void drop(View v){
        count --;

        // id 가 myCount 인 TextView 객체의 참조값 얻어오기
        TextView textView=findViewById(R.id.myCount);
        // 출력할 숫자를 문자로 변환
        String strCount=Integer.toString(count);
        textView.setText(strCount);
    }

    public void reset(View v){
        count = 0;

        // id 가 myCount 인 TextView 객체의 참조값 얻어오기
        TextView textView=findViewById(R.id.myCount);
        // 출력할 숫자를 문자로 변환
        String strCount=Integer.toString(count);
        textView.setText(strCount);
    }


}





















