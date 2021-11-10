package com.gmail.espeniel69;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	//	private static final String TAG = "MainActivity";
	private static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void writeLog(View view) {

		UserProfile userProfile = new UserProfile("홍길동", "010-3154-2115", "경기도 김포시");

		Log.v(TAG, "이것은 verbose 로그입니다." + userProfile);
		Log.d(TAG, "이것은 debug 로그입니다." + userProfile);
		Log.i(TAG, "이것은 info 로그입니다." + userProfile);
		Log.w(TAG, "이것은 warning 로그입니다." + userProfile);
		Log.e(TAG, "이것은 error 로그입니다." + userProfile);
	}
}