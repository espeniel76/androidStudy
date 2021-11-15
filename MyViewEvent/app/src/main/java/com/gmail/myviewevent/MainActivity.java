package com.gmail.myviewevent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

class MyView extends View {
	int key;
	String str;
	int x, y;

	public MyView(Context context) {
		super(context);
		setBackgroundColor(Color.YELLOW);
	}

	@SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		x = (int) event.getX();
		y = (int) event.getY();
		invalidate();
		return super.onTouchEvent(event);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		@SuppressLint("DrawAllocation") Paint paint = new Paint();
		paint.setTextSize(50);
		canvas.drawCircle(x, y, 30, paint);
		canvas.drawText("(" + x + "," + y + ") 에서 터치 이벤트가 발생하였음", x, y + 100, paint);
	}
}

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);

		MyView w = new MyView(this);
		setContentView(w);
	}
}