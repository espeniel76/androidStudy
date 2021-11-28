package com.gmail.explicintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Activity2 extends AppCompatActivity {

	@Override
	public void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		setContentView(R.layout.layout2);
		AppCompatButton b = (AppCompatButton) findViewById(R.id.button01);
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				// If you don't finish and move to activity 1, activities will only accumulate on the stack.
				finish();
			}
		});

	}
}

