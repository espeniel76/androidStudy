package com.gmail.chap8lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	private MyView mMyView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mMyView = (MyView) findViewById(R.id.myview);
	}

	public void redraw(View v) {
		mMyView.invalidate();
	}
}