package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class ActionBar$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public int a = 0;

  public ActionBar$LayoutParams()
  {
    super(-2, -2);
    this.a = 8388627;
  }

  public ActionBar$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ActionBarLayout);
    this.a = localTypedArray.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
    localTypedArray.recycle();
  }

  public ActionBar$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.a = paramLayoutParams.a;
  }

  public ActionBar$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.ActionBar.LayoutParams
 * JD-Core Version:    0.6.0
 */