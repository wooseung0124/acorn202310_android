package com.example.step05listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener{

    List<String> names; // 필드선언
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sample 데이터
        names = new ArrayList<>(); // 지역변수
        names.add("김구라");
        names.add("해골");
        names.add("원숭이");
//        for (int i=0; i<100; i++){
//            names.add("아무게 "+i);
//        }
        /*
            ListView 를 활용한 adapter 의 역할 : 데이터를 가공하고 view 에 뿌려주는 역할

            어댑터는 화면상에서 보이는 데이터 이 외에 밑에 있을 나머지 정보는 미리 만들어두진 않는다.
            사용자가 스크롤해서 밑으로 화면을 내려보려는 순간에 필요한 요소만 빠르게 데이터를 출력한다.
            그 모습을 ListView가 응답한다.
         */
        //ListView 에 연결할 어댑터
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, names); // simple_list_item_1 : 개발자가 미리 만들어둔 자원(텍스트뷰 1개짜리, ctrl+마우스 클릭시 정보 보임)
        //ListView 의 참조값 얻어오기
        ListView listView = findViewById(R.id.listView);
        //ListView 에 어댑터 연결하기
        listView.setAdapter(adapter);
        // 버튼에 리스너 등록하기
        Button addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(v -> {
            // 1. EditText 에 입력한 문자열을 읽어와서
            EditText inputName = findViewById(R.id.inputName);
            String name = inputName.getText().toString();
            // 2. names(모델)에 추가하고
            names.add(name);
            // 3. 어뎁터에 names(모델)이 변경되었다고 실시간으로 알린다. 이게 없으면 사용자는 입력 이외에 다른 행위를 했을 때 뒤늦게 업데이트된다.
            adapter.notifyDataSetInvalidated();
            // 4. EditText 에 입력한 내용 지우기(입력창 초기화)
            inputName.setText("");
            // 5. 마지막 위치까지 부드럽게 스크롤하기
            int position = adapter.getCount(); // 전체 아이템 개수
            listView.smoothScrollToPosition(position);
        });
        //ListView 에 AdapterView.ItemClickListener 등록하기
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this); // 오랫동안 누를 경우
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        /*
            parent => ListView
            view => cell view (TextView)
            position => 클릭한 cell 의 인덱스
            id => 클릭한 cell 의 아이템 아이디(Pk)가 있다면 아이디가 전달된다(없으면 index가 전달됨)
         */
        Log.d("MainActivity", "position"+position);
        // 클릭한 cell 에 출력된 이름
        String name=names.get(position);
        //Toast 메세지로 출력해보기
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
        new AlertDialog.Builder(this)
                .setTitle("알림")
                .setMessage("삭제할까요?")
                .setPositiveButton("네",(dialog, which)->{
                    //Long Click 된 cell 의 index = > int position
                    names.remove(position);
                    //UI 업데이트
                    adapter.notifyDataSetChanged();
                })
                .setNegativeButton("아니요", null)
                .create()
                .show();
        return false;
    }
}










