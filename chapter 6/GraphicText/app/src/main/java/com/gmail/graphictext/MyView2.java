package com.gmail.graphictext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class MyView2 extends View {
	public MyView2(Context context) {
		super(context);
		setBackgroundColor(Color.YELLOW);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setTextSize(80);

		Typeface t;
		t = Typeface.create(Typeface.SERIF, Typeface.NORMAL);
		paint.setTypeface(t);
		paint.setTextAlign(Paint.Align.LEFT);
		canvas.drawText("This is a test!", 10, 200, paint);

		paint.setTextAlign(Paint.Align.CENTER);
		canvas.drawText("This is a test!", 500, 300, paint);

		paint.setTextAlign(Paint.Align.RIGHT);
		canvas.drawText("This is a test!", 800, 400, paint);

		paint.setTextAlign(Paint.Align.LEFT);
		paint.setColor(Color.RED);

		paint.setUnderlineText(true);
		canvas.drawText("This is a test!", 10, 500, paint);
		paint.setUnderlineText(false);

		paint.setStrikeThruText(true);
		canvas.drawText("This is a test!", 10, 600, paint);
		paint.setStrikeThruText(false);

		paint.setTextSkewX(-0.5f);
		canvas.drawText("This is a test!", 10, 700, paint);
		paint.reset();
	}
}
