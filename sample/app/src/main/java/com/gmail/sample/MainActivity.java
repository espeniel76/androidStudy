package com.gmail.sample;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

	private TextView testLabel;
	private ImageView testImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		testLabel = findViewById(R.id.test_label);
		testImage = findViewById(R.id.test_image);
	}

	@SuppressLint("NonConstantResourceId")
	public void changeTextType(View view) {
		testLabel.setText("변경이 되었습니다.");
		switch(view.getId()) {
			case R.id.change_text:
				testLabel.setText("변경이 되었습니다.");
				testLabel.setTextSize(24);
//				testLabel.setTextColor(Color.parseColor("#FF0000"));
				testLabel.setTextColor(ContextCompat.getColor(this, R.color.colorLabel));
//				testImage.setImageResource(R.drawable.spiderman);
//				Glide 왜 동작 안함?
				Glide.with(this).load("http://192.168.1.20/upload/202111/c15bc0f2-e556-415c-99e5-176108814830.jpg").into(testImage);
//				Glide.with(this).load("https://homepages.cae.wise.edu/~ece533/images/airplane.png").into(testImage);
				break;

			case R.id.reset_text:
				testLabel.setText("리셋 되었습니다.");
				testLabel.setTextSize(36);
//				testLabel.setTextColor(Color.parseColor("#000000"));
				testLabel.setTextColor(ContextCompat.getColor(this, R.color.colorSecondaryLabel));
				testImage.setImageResource(R.drawable.ironman);
				break;

			case R.id.test_label:
				testLabel.setText("");
				break;
		}
	}
}