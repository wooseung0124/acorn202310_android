package com.example.step04example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /*
        똑같은 자바언어로 사용하고 있지만 이클립스에서 배운 지역변수라는 제안이 안드로이드에선 자유로운 이유
        : 생명주기가 있기 때문이다. onCreate() 는 어플이 실행되고 제일 먼저 화면을 구상하는 메서드이기에 밖에 있는 필드로
          값을 넣을 수 있었던 것이다. 그래서 layout 연결을 onCreate 에서만 진행해도 무방했던 것이다.
     */

    // 필드
    TextView first;
    TextView second;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 레이아웃 요소 모두 연결하기
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        result = findViewById(R.id.result);
        Button plusBtn = findViewById(R.id.plusBtn);
        Button minusBtn = findViewById(R.id.minusBtn);

        /*
            first = findViewById(R.id.first);
            ㄴ> (R.id.first) 동작원리 : 16진수 정수값 불러오기(activity_main.xml 참고)

            public class R{
                public static class id{
                    public static final int plusBtn = 1111;
                    public static final int minusBtn = 1112;
                    public static final int first = 1113;
                    public static final int second = 1114;
                }
            }
         */

        // this 의 type 은?
        MainActivity a = this;
        View.OnClickListener b = this;

        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
    }

    @Override // MainActivity 를 클릭 리스너로 등록한 View(Button) 에 클릭 이벤트가 발생하면 호출되는 메소드
    public void onClick(View view) { // View view = new Button()
        /*
            이클립스에서 배운 지역변수의 한계를 극복하고자 한번더 선언할 필요가 없게 되었다.
            first = findViewById(R.id.first);
            second = findViewById(R.id.second);
         */
        double num1 = Double.parseDouble(first.getText().toString());
        double num2 = Double.parseDouble(second.getText().toString());
        double result = 0;

        // View type view 에는 이벤트가 발생한 Button 의 참조값이 전달된다.
        // 눌러진 버튼의 아이디값을 읽어온다(정수값)
        int id = view.getId();
        if (id == R.id.plusBtn){
            result = num1+num2;
        }
        else if(id == R.id.minusBtn){
            result = num1-num2;
        }
        // 계산 결과를 문자열(String) 로 변환해서 TextView 에 출력하기
        String strResult = Double.toString(result);
        // TextView 에 출력하기
        this.result.setText(strResult);

        /*
            View type 에는 뭐가 있는가?
            : activity.xml 에서 사용했던 모든 요소들이 들어있다.
              때문에 View view = new Button() 가 가능한 것이다.
         */
    }
}