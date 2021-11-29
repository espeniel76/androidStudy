package com.gmail.mytoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AppCompatButton button = (AppCompatButton) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast toast = Toast.makeText(getApplicationContext(), "위치가 바뀐 토스트", Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.TOP | Gravity.LEFT, 200, 200);
				toast.show();
			}
		});

		// 팝업형식의 토스트 메시지
		AppCompatButton button2 = (AppCompatButton) findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				LayoutInflater inflater = getLayoutInflater();
				View layout = inflater.inflate(R.layout.toastborder, (ViewGroup) findViewById(R.id.toast_layout_root));

				TextView text = layout.findViewById(R.id.text);
				text.setText("모양을 바꾼 토스트");

				Toast toast = new Toast(getApplicationContext());
				toast.setGravity(Gravity.CENTER, 0, -200);
				toast.setDuration(Toast.LENGTH_LONG);
				toast.setView(layout);

				toast.show();
			}
		});

		// 아래쪽에서 올라오는 스낵바
		AppCompatButton button3 = (AppCompatButton) findViewById(R.id.button3);
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				Snackbar.make(v, "스낵바입니다.", Snackbar.LENGTH_LONG).show();
				Snackbar.make(v, "스낵바 입니다.", Snackbar.LENGTH_LONG).show();
			}
		});
	}
}