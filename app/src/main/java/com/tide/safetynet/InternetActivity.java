package com.tide.safetynet;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class InternetActivity extends Activity {
	
	private ImageView imageview1;
	
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.internet);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		imageview1 = findViewById(R.id.imageview1);
	}
	
	private void initializeLogic() {
		SketchwareUtil.showMessage(getApplicationContext(), "No internet connection, kindly check your network.");
	}
	
	@Override
	public void onBackPressed() {
		intent.setClass(getApplicationContext(), WebsiteActivity.class);
		startActivity(intent);
	}
}