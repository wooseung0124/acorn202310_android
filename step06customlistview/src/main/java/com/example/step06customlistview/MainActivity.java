package com.example.step06customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 어뎁터 연결
        List<CountryDto> countries = new ArrayList<>();

        //셈플데이터
        countries.add(new CountryDto(R.drawable.austria,
                "오스트리아", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.belgium,
                "벨기에", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.brazil,
                "브라질", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.france,
                "프랑스", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.germany,
                "독일", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.greece,
                "그리스", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.israel,
                "이스라엘", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.italy,
                "이탈리아", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.japan,
                "일본", "그지 같은 나라~"));
        countries.add(new CountryDto(R.drawable.korea,
                "대한민국", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.poland,
                "폴란드", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.spain,
                "스페인", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.usa,
                "미국", "어쩌구.. 저쩌구.."));

        CountryAdapter adapter = new CountryAdapter(this, R.layout.listview_cell, countries);

        // ListView 의 참조값
        ListView listView = findViewById(R.id.listView);
        // 어뎁터 연결
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id)->{ // id: CountryAdapter 의 getItemId
            // 엑티비티 이동 intent 객체
            Intent intent = new Intent(this, DetailActivity.class);
            // 클릭한 cell 데이터
            CountryDto dto = countries.get(position);
            //Intent 객체에 Serializable type (CountryDto) 객체 담기
            intent.putExtra("dto", dto);
            // 이동
            startActivity(intent); // DetailActivity 에 있는 intent 로 전달
        });


    }
}





















