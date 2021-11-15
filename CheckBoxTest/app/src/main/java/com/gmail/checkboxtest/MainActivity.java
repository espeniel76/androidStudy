package com.gmail.checkboxtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Rating Bar
		final RatingBar ratingbar = (RatingBar) findViewById(R.id.ratingbar);
		ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
				Toast.makeText(getApplicationContext(), "New Rating: " + rating, Toast.LENGTH_SHORT).show();
			}
		});
	}

	// toggle sample
	public void onToggleClicked(View view) {
		boolean on = ((ToggleButton) view).isChecked();

		if (on) {
			Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(getApplicationContext(), "Not checked", Toast.LENGTH_SHORT).show();
		}
	}

	//	radio sample
	public void onRadioButtonClicked(View view) {
		boolean checked = ((RadioButton) view).isChecked();

		switch (view.getId()) {
			case R.id.radio_red:
				if (checked)
					Toast.makeText(getApplicationContext(), ((RadioButton) view).getText(), Toast.LENGTH_SHORT).show();
				break;
			case R.id.radio_blue:
				if (checked)
					Toast.makeText(getApplicationContext(), ((RadioButton) view).getText(), Toast.LENGTH_SHORT).show();
				break;
		}
	}

	// checkbox sample
	public void onCheckBoxClicked(View view) {
		boolean checked = ((CheckBox) view).isChecked();

		switch (view.getId()) {
			case R.id.checkbox_meat:
				if (checked)
					Toast.makeText(getApplicationContext(), "고기 선택", Toast.LENGTH_SHORT).show();
				else
					Toast.makeText(getApplicationContext(), "고기 선택 해제", Toast.LENGTH_SHORT).show();
				break;
			case R.id.checkbox_cheese:
				if (checked)
					Toast.makeText(getApplicationContext(), "치즈 선택", Toast.LENGTH_SHORT).show();
				else
					Toast.makeText(getApplicationContext(), "치즈 선택 해제", Toast.LENGTH_SHORT).show();
				break;
		}
	}
}