package com.example.testfocus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ContainerView extends View{
	 public ContainerView(Context context) {
		 super(context);
	 }
	 
	 public ContainerView(Context context, AttributeSet attrs) {
		 super(context);
	 }
	 
	 public ContainerView(Context context, AttributeSet attrs, int defStyleAttr) {
		 super(context, attrs, defStyleAttr);
	 }
	 
	 @Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onTouchEvent(event);
	}
	 
	        	 
}

