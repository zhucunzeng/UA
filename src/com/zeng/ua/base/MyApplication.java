package com.zeng.ua.base;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

public class MyApplication extends Application {
	private static final String TAG = "MyApplication";
	
	
	public MyApplication() {
		// TODO Auto-generated constructor stub
		Log.i(TAG, "constructor");
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i(TAG, "onCreate");
		super.onCreate();
	}
	
	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		Log.i(TAG, "onTerminate");
		super.onTerminate();
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		Log.i(TAG, "onConfigurationChanged");
		super.onConfigurationChanged(newConfig);
	}
	
	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		Log.i(TAG, "onLowMemory");
		super.onLowMemory();
	}
	
	@Override
	public void onTrimMemory(int level) {
		// TODO Auto-generated method stub
		Log.i(TAG, "onTrimMemory");
		super.onTrimMemory(level);
	}
	

}
