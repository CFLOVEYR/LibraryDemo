package com.shiyan.activity;

import org.xutils.x;
import org.xutils.view.annotation.ContentView;

import com.shiyan.R;
import com.shiyan.R.id;
import com.shiyan.R.layout;
import com.shiyan.fragment.FirstFragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

@ContentView(R.layout.activity_fragment_inject_actvity)
public class FragmentInjectActvity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		x.view().inject(this);
		//获取碎片管理者
		FragmentManager manager=getSupportFragmentManager();
		//获取事务
		FragmentTransaction transaction=manager.beginTransaction();

		transaction.replace(R.id.container, new FirstFragment());
		//提交事务
		transaction.commit();
	}
}
