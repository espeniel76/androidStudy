package com.gmail.userinterface1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

//		코드를 사용하여 UI 구성
//		setContentView(R.layout.activity_main);
//		setContentView(R.layout.activity_relative);

//		LinearLayout container = new LinearLayout(this);
//		container.setOrientation(LinearLayout.VERTICAL);
//
//		Button b1 = new Button(this);
//		b1.setText("첫번째 버튼");
//		container.addView(b1);
//
//		Button b2 = new Button(this);
//		b2.setText("두번째 버튼");
//		container.addView(b2);
//
//		setContentView(container);

//		코드와 xml 을 이용하여 UI 구성

//		setContentView(R.layout.activity_common);
//
//		AppCompatButton b1 = (AppCompatButton) findViewById(R.id.button1);
//		b1.setText("코드에서도 변경 가능");
//
//		AppCompatButton b2 = (AppCompatButton) findViewById(R.id.button2);
//		b2.setEnabled(false);

		setContentView(R.layout.activity_common);
//		LinearLayout manager = (LinearLayout) findViewById(R.id.LayoutManager);
//		manager.setOrientation(LinearLayout.HORIZONTAL);

//		setContentView(R.layout.activity_calculator);
//		setContentView(R.layout.activity_calculator2);
		setContentView(R.layout.activity_calculator3);
	}
}
