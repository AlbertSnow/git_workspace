package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.wandoujia.phoenix2.R.styleable;

public class PagePointsBox extends LinearLayout
{
  public PagePointsBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public PagePointsBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    setGravity(17);
    setOrientation(0);
    if (paramAttributeSet == null)
      return;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.PagePointsBox);
    localTypedArray.getResourceId(0, 2130838623);
    localTypedArray.getResourceId(1, 2130838622);
    localTypedArray.recycle();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.PagePointsBox
 * JD-Core Version:    0.6.0
 */