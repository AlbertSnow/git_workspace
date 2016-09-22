package com.wandoujia.phoenix2.av.view;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class f extends GestureDetector.SimpleOnGestureListener
{
  f(ScrollDownLayout paramScrollDownLayout)
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

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.view.f
 * JD-Core Version:    0.6.0
 */