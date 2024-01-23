package com.example.step06customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() { // extends AppCompatActivity
	// onCreate() 메서드 오버라이드
	override fun onCreate(savedInstanceState: Bundle?) { // Bundle? nullable type
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_detail)
		// Detail 액티비티에 전달된 Intent 객체
		val i:Intent = intent // getIntent() 액티비티 메소드(HelloKotlin 의 UseJava 참고)를 통해 dto 꺼내기
		/*
			intent 활용도
			안드로이드는 특정 애플리케이션의 기능을 가져와서 사용도 가능하다.
			예를 들어 카메라 기능을 구현하고자 할 때 기기에 이미 존재하는 카메라 기능을 불러와서 활성화 시키는 개념이다.
		 */
		val dto:CountryDto = i.getSerializableExtra("dto") as CountryDto

		val imageView = findViewById<ImageView>(R.id.imageView)
		val textName:TextView = findViewById(R.id.textName)
		val textContent = findViewById<TextView>(R.id.textContent)
		// ContryDto 에 있는 정보를 UI 에 출력
		imageView.setImageResource(dto.resId)
		// textName.setText(dto.name), 밑에 처럼 작성도 가능
		textName.text = dto.name
		textContent.text = dto.content
		val confirmBtn : Button = findViewById(R.id.confirmBtn)
		// 버튼에 클릭 리스너 등록
		confirmBtn.setOnClickListener{
			// 액티비티의 finish() 메서도 호출하기
			finish()
		}
	}
}