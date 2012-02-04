package com.aps.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Act2 extends Activity {
	private static final String TAG = "ACT2";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textView = new TextView(this);
		textView.setText("This is Act2");
		setContentView(textView);
	}
	
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.d(TAG, "onDestroy");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.d(TAG, "onStop");
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.d(TAG, "onStart");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.d(TAG, "onRestart");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.d(TAG, "onResume");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.d(TAG, "onPause");
    }
    

}
