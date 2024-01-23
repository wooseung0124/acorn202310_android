package com.example.step02_activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 생명주기 : https://developer.android.com/reference/android/app/Activity
    // 안드로이드 기기 백버튼과 홈버튼, 그리고 업버튼 차이
    // 백 : 애플리케이션 종료(웹브라우저 닫기 버튼)
    // 홈 : 애플리케이션 탈출(웹브라우저 화면 내려놓기)
    // 업 : 애플리케이션 레이어 층 쌓기

    @Override // 부모의 메서드(필수)
    protected void onCreate(Bundle savedInstanceState) { // 화면구성, 실행시 가장 먼저 호출됨
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "MainActivity 생명주기 : Logcat 에서 확인해봐");
        Log.e("MainActivity", "onCreate() : 화면구성, 실행시 가장 먼저 호출됨");

        Button moveBtn = findViewById(R.id.moveBtn);
        moveBtn.setOnClickListener(view -> {
            Intent intent=new Intent(this,SubActivity.class);
            startActivity(intent);
        });
    }

    // 생명주기 메서드를 선택적으로 호출할 수 있다. 개인적으로 지정하지 않으면 안드로이드에서 설정한 값이 자동으로 실행된다.

    @Override // 부모의 메서드(선택)
    protected void onRestart() { // onStop() 동작 이후 어플 복귀시 동작되는 메서드이자 곧바로 onStart() 를 호출하는 메서드
        super.onRestart();
        Log.e("MainActivity", "onRestart() : onStop() 동작 이후 어플 복귀시 동작되는 메서드이자 곧바로 onStart() 를 호출하는 메서드");
    }

    @Override // 부모의 메서드(선택)
    protected void onStart() { // onCreate 이후 호출되는 메서드
        super.onStart();
        Log.e("MainActivity", "onStart() : onCreate 이후 호출되는 메서드, onRestart 이후에도 자동 호출된다.");
    }

    @Override // 부모의 메서드(선택)
    protected void onResume() { // onStart() 이후 호출되며 어플이 동작된다. onPause() 동작 이후 어플 복귀시 동작되는 메서드
        super.onResume();
        Log.e("MainActivity", "onResume() : onStart() 이후 호출되며 어플이 동작된다. onPause() 동작 이후 어플 복귀시 동작되는 메서드");
    }

    @Override // 부모의 메서드(선택)
    protected void onPause() { // 기존에 사용했던 화면(Activity) 위에 다른 활동 화면이 덮어쓰기 할 때 호출됨(게임하다가 전화올 때 게임 기준)
        super.onPause();
        Log.e("MainActivity", "onPause() : 기존에 사용했던 화면(Activity) 위에 다른 활동 화면이 덮어쓰기 할 때 호출됨(게임하다가 전화올 때 게임 기준)");
    }

    @Override // 부모의 메서드(선택)
    protected void onStop() { // 종료는 아니지만 잠시 일시정지 혹은 현위치에 머물러야 될 상황이 올 경우 호출되는 메서드(카톡하다가 전화올 때 카톡 기준)
        super.onStop();
        Log.e("MainActivity", "onStop() : 종료는 아니지만 잠시 일시정지 혹은 현위치에 머물러야 될 상황이 올 경우 호출되는 메서드(카톡하다가 전화올 때 카톡 기준)");
    }

    @Override // 부모의 메서드(선택)
    protected void onDestroy() { // 머물고 있는 활동 중에서 완전히 종료시킬 때 호출되는 메서드(휴대폰 기기상에서 사용중인 어플 지우는 화면)
        super.onDestroy();
        Log.e("MainActivity", "onDestroy() : 머물고 있는 활동 중에서 완전히 종료시킬 때 호출되는 메서드(휴대폰 기기상에서 사용중인 어플 지우는 화면)");
    }
}















