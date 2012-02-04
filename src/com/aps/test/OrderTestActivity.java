package com.aps.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OrderTestActivity extends Activity {
    /** Called when the activity is first created. */
	public static final String TAG = "ACT1";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.main);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getBaseContext(), Act2.class));
			}
		});
    }//onCreate
    
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