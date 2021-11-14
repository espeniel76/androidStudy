package com.gmail.touchevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(new MyView(this));
//		setContentView(new SingleTouchView(this, null));
//		setContentView(new MultiTouchView(this, null));
		setContentView(new MyImageView(this));
	}
}