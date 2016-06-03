package com.demo.sendvalidatebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author Administrator
 * @创建时间 2016-6-3下午2:37:35
 * @描述 自定义倒计时按钮
 * 
 */
public class MainActivity extends Activity implements OnClickListener {

	private SendValidateButton	getcode_btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		initView();
	}

	private void initView() {
		setContentView(R.layout.activity_main);
		getcode_btn = (SendValidateButton) findViewById(R.id.getcode_btn);
		getcode_btn.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.getcode_btn:
			getcode_btn.startTickWork();
			break;
		default:
			break;
		}
	}

}
