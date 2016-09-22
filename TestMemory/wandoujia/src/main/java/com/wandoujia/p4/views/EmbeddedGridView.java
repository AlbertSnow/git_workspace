package com.wandoujia.p4.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class EmbeddedGridView extends UnScrollableGridView
{
  public EmbeddedGridView(Context paramContext)
  {
    super(paramContext);
  }

  public EmbeddedGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public EmbeddedGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.EmbeddedGridView
 * JD-Core Version:    0.6.0
 */