package com.gmail.espeniel69.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
	private static final String TAG = "MyService";

	public MyService() {
	}

	@Override
	public void onCreate() {
		super.onCreate();

		Log.d(TAG, "onCreate() 호출됨.");
	}

	/**
	 * onCreate 가 아니라
	 * onStartCommand 가 온다
	 * service 특성상 onCreate 는 원래 떠 있게 됨
	 * @param intent
	 * @param flags
	 * @param startId
	 * @return
	 */
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.d(TAG, "onStartCommand() 호출됨.");

		if (intent == null) {
			return Service.START_STICKY;
		} else {
			processCommand(intent);
		}

		return super.onStartCommand(intent, flags, startId);
	}

	private void processCommand(Intent intent) {
		String command = intent.getStringExtra("command");
		String name = intent.getStringExtra("name");
		Log.d(TAG, "전달받은 데이터: " + command + ", " + name);

		// 5초의 텀을 주고
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}

		Intent showIntent = new Intent(getApplicationContext(), MainActivity.class);
		// extra data 를 넣으려면
		// activity 가 아니라 service 이므로 이러한 속성들을 추가로 부여한다.
		showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | // 화면이 없는 service 에서 화면이 있는 activity 로 화면을 띄울 수 있다.
				Intent.FLAG_ACTIVITY_SINGLE_TOP |           // 기존 화면을 재활용 한다. 새로 띄우지 않고
				Intent.FLAG_ACTIVITY_CLEAR_TOP);            // 기존 화면위에 다른 화면이 있으면, 다른 화면을 제거 해준다.
		showIntent.putExtra("command", "show");
		showIntent.putExtra("name", " from service.");

		// 다시 main activity 를 호출한다.
		startActivity(showIntent);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		Log.d(TAG, "onDestroy() 호출됨.");
	}

	@Override
	public IBinder onBind(Intent intent) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
}