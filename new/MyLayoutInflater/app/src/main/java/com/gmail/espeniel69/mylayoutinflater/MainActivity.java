package com.gmail.espeniel69.mylayoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

	FrameLayout container;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

//		레이아웃을 메모리의 객체화 시킨다
//		레이아웃 인플레이션
		setContentView(R.layout.activity_main);

		container = (FrameLayout) findViewById(R.id.container);

		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

//				 xml 레이아웃을 메모리에 객체화
				LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				inflater.inflate(R.layout.sub1, container, true);

				
			}
		});
	}
}