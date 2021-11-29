package com.gmail.espeniel69.mysummary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	AppCompatButton likeButton;
	TextView likeCountView;
	boolean likeState = false;
	int likeCount = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		likeButton = (AppCompatButton) findViewById(R.id.likeButton);
		likeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (likeState) {
					decrLikeCount();
				} else {
					incrLikeCount();
				}

				likeState = !likeState;
			}
		});

		likeCountView = (TextView) findViewById(R.id.likeCount);
	}

	public void incrLikeCount() {
		likeCount += 1;
		likeCountView.setText(String.valueOf(likeCount));
		likeButton.setBackgroundResource(R.drawable.ic_thumb_up_selected);
	}

	public void decrLikeCount() {
		likeCount -= 1;
		likeCountView.setText(String.valueOf(likeCount));
		likeButton.setBackgroundResource(R.drawable.ic_thumb_up);
	}
}