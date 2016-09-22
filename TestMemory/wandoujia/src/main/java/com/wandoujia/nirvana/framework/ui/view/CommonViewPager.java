package com.wandoujia.nirvana.framework.ui.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ck;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CommonViewPager extends ViewPager
{
  private boolean a = true;
  private ck b;
  private boolean c = false;

  public CommonViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnPageChangeListener(new a(this));
  }

  private void d()
  {
    this.c = true;
    post(new b());
  }

  protected final boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramView != this) && ((paramView instanceof ViewPager)))
      return true;
    return super.a(paramView, paramBoolean, paramInt1, paramInt2, paramInt3);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.a)
      return false;
    return super.onInterceptTouchEvent(paramMotionEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.c)
      d();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.a)
      return false;
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setOnPageChangeListener(ck paramck)
  {
    this.b = paramck;
  }

  public void setScrollEnabled(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.view.CommonViewPager
 * JD-Core Version:    0.6.0
 */