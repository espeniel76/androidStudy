package com.gmail.edittexttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

//		변수 정의
		final EditText eText;
		AppCompatButton btn;

//		시작?
		super.onCreate(savedInstanceState);

//		최초 view 생성
		setContentView(R.layout.activity_main);

//		view 에서 요소 선택
		eText = (EditText) findViewById(R.id.edittext);
		btn = (AppCompatButton) findViewById(R.id.button);

//		btn button 요소에 클릭 이벤트 리스너 추가
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String str = eText.getText().toString();
				Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();
			}
		});
	}
}