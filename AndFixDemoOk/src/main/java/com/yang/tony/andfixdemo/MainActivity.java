package com.yang.tony.andfixdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * main activity
 */
public class MainActivity extends Activity {

	private TextView	mTv;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTv = (TextView) findViewById(R.id.tv);
		mTv.setText("我被andFix改变了内容");

		// toast();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		android.os.Process.killProcess(android.os.Process.myPid());
	}

	// 打包1.apk后，修改toast内容，打包2.apk
	private void toast() {
		Toast.makeText(this, "olad", Toast.LENGTH_SHORT).show();
	}
}
