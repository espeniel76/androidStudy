package com.gmail.mybasicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
		boolean checked = radioButton1.isChecked();


	}
}