package com.gmail.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.util.jar.Attributes;

public class CustomView extends View {
	public CustomView(Context context) {
		super(context);
		setBackgroundColor(Color.YELLOW);
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context);
		setBackgroundColor(Color.YELLOW);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		Paint paint = new Paint();
		paint.setColor(Color.RED);
		canvas.drawArc(new RectF(10, 10, 600, 600), 45, 320, true, paint);
	}
}