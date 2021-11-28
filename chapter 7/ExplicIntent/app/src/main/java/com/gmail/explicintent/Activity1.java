package com.gmail.explicintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Activity1 extends AppCompatActivity {

	@Override
	public void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		setContentView(R.layout.layout1);
		AppCompatButton b = (AppCompatButton) findViewById(R.id.button01);
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Activity1.this, Activity2.class);
				startActivity(intent);
			}
		});

	}
}
