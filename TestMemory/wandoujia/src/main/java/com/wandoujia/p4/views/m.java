package com.wandoujia.p4.views;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class m extends GestureDetector.SimpleOnGestureListener
{
  m(ScrollDownLayout paramScrollDownLayout)
  {
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 > 10.0F)
    {
      this.a.a();
      return true;
    }
    if (paramFloat2 < 10.0F)
    {
      this.a.b();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.m
 * JD-Core Version:    0.6.0
 */