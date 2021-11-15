package com.gmail.event;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	//	1.내부 클래스를 이용한 구현
//	class MyListenerClass implements View.OnClickListener {
//		public void onClick(View v) {
//			Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다.", Toast.LENGTH_SHORT).show();
//		}
//	}
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		AppCompatButton button = (AppCompatButton) findViewById(R.id.button);
//
//		MyListenerClass buttonListener = new MyListenerClass();
//		button.setOnClickListener(buttonListener);
//	}

	//	 2. 무명 클래스를 이용한 구현
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		AppCompatButton button = (AppCompatButton) findViewById(R.id.button);
//
//		button.setOnClickListener(new View.OnClickListener() {
//			public  void onClick(View v) {
//				Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다", Toast.LENGTH_SHORT).show();
//			}
//		});
//	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AppCompatButton button = (AppCompatButton) findViewById(R.id.button);
		button.setOnClickListener(this);

	}


//	public void onClick(View target) {
//		Toast.makeText(getApplicationContext(), "Beep Bop",
//				Toast.LENGTH_LONG).show();
//
//	}
}