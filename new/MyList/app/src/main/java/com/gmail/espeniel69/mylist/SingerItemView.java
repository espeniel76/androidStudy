package com.gmail.espeniel69.mylist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SingerItemView extends LinearLayout {
	TextView textview;
	TextView textview2;
	ImageView imageView;

	public SingerItemView(Context context) {
		super(context);
		init(context);
	}

	public SingerItemView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	private void init(Context context) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.singer_item, this, true);

		textview = (TextView) findViewById(R.id.textView);
		textview2 = (TextView) findViewById(R.id.textView2);
		imageView = (ImageView) findViewById(R.id.imageView);
	}

	public void setName(String name) {
		textview.setText(name);
	}

	public void setMobile(String mobile) {
		textview2.setText(mobile);
	}

	public void setImage(int resId) {
		imageView.setImageResource(resId);
	}
}
