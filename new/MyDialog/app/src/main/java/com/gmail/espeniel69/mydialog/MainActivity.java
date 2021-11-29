package com.gmail.espeniel69.mydialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				showMessage();
			}
		});
	}

	public void showMessage() {
		AlertDialog.builder builder = new AlertDialog.Builder(this);
		builder.setTitle("안내");
		builder.setMessage("종료하시겠습니까?");
		builder.setIcon(android.R.drawable.ic_dialog_alert);
		builder.setPoitiveButton("예", new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(getApplicationContext(), "예 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
			}
		});
	}
}