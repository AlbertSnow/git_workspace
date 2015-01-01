package com.example.testfocus;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private int keyCode = -1;
	private boolean change2B2 = false;

	private OnFocusChangeListener mFocusListener = new OnFocusChangeListener() {

		@Override
		public void onFocusChange(View v, boolean hasFocus) {
			Log.i("test", "Focused view text:" + ((TextView) v).getText());
			Log.i("test", "Focus:" + hasFocus);
			// if (((TextView)v).getText().equals("Button5") && !hasFocus) {
			// findViewById(R.id.button2).requestFocus();
			// }

			if (b3 == v && hasFocus && change2B2) {
				b2.requestFocus();
				change2B2 = false;
			}
			Log.i("test", "d " + b2.getNextFocusRightId());
			Log.i("test", "d " + v.getId());
			Log.i("test", "d " + change2B2);

		};
	};

	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;

	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		Log.i("test", "on key down");

		this.keyCode = keyCode;
		switch (keyCode) {
		case KeyEvent.KEYCODE_DPAD_RIGHT:
			if (b5.isFocused()) {
				b2.requestFocus();
				change2B2 = true;
			} else {
				change2B2 = false;
			}
			break;

		default:
			change2B2 = false;
			break;
		}

		// boolean result = super.onKeyDown(keyCode, event);
		// Log.i("test", "key result:"+result);
		return false;
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("test", "log is success running");
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b4.setNextFocusRightId(R.id.button2);
		b5 = (Button) findViewById(R.id.button5);

		b5.setOnFocusChangeListener(mFocusListener);
		b4.setOnFocusChangeListener(mFocusListener);
		b3.setOnFocusChangeListener(mFocusListener);
		b1.setOnFocusChangeListener(mFocusListener);
		b2.setOnFocusChangeListener(mFocusListener);

		// findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// Intent intent = new
		// Intent(MainActivity.this,com.android.browser.BrowserActivity)
		// startActivity(intent);
		// }
		// });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void onClick(View view) {
		Log.i("test", ((TextView) view).getText() + "be clicked");
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onTouchEvent(event);
	}
	
}
