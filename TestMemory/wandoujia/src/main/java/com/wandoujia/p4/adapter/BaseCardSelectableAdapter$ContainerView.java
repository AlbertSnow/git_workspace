package com.wandoujia.p4.adapter;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class BaseCardSelectableAdapter$ContainerView extends FrameLayout
{
  private View a;
  private View b;
  private boolean c;

  private BaseCardSelectableAdapter$ContainerView(Context paramContext)
  {
    super(paramContext);
  }

  private void setNeedInterceptTouchEvent(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public View getCoverView()
  {
    return this.b;
  }

  public View getOriginView()
  {
    return this.a;
  }

  public Object getTag(int paramInt)
  {
    return this.a.getTag(paramInt);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.c;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (Build.VERSION.SDK_INT > 10);
    do
      return;
    while (this.a == null);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, this.a.getMeasuredHeight());
    this.b.setLayoutParams(localLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.BaseCardSelectableAdapter.ContainerView
 * JD-Core Version:    0.6.0
 */