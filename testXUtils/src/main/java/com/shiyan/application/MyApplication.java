package com.shiyan.application;

import android.app.Application;

import org.xutils.x;

public class MyApplication extends Application{

	@Override
	public void onCreate() {
		super.onCreate();
		//初始化XUtils3
		x.Ext.init(this);
		//设置debug模式
		x.Ext.setDebug(true);
	}
}
