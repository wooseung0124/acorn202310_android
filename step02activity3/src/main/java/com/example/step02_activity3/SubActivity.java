package com.example.step02_activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Log.e("SubActivity", "SubActivity 생명주기 : Logcat 에서 확인해봐");
        Log.e("SubActivity", "onCreate() : 화면구성, 실행시 가장 먼저 호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("SubActivity", "onRestart() : onStop() 동작 이후 어플 복귀시 동작되는 메서드이자 곧바로 onStart() 를 호출하는 메서드");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("SubActivity", "onStart() : onCreate 이후 호출되는 메서드, onRestart 이후에도 자동 호출된다.");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("SubActivity", "onResume() : onStart() 이후 호출되며 어플이 동작된다. onPause() 동작 이후 어플 복귀시 동작되는 메서드");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("SubActivity", "onPause() : 기존에 사용했던 화면(Activity) 위에 다른 활동 화면이 덮어쓰기 할 때 호출됨(게임하다가 전화올 때 게임 기준)");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("SubActivity", "onStop() : 종료는 아니지만 잠시 일시정지 혹은 현위치에 머물러야 될 상황이 올 경우 호출되는 메서드(카톡하다가 전화올 때 카톡 기준)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("SubActivity", "onDestroy() : 머물고 있는 활동 중에서 완전히 종료시킬 때 호출되는 메서드(휴대폰 기기상에서 사용중인 어플 지우는 화면)");
    }
}