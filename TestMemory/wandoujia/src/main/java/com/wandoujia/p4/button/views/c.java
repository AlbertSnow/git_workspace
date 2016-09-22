package com.wandoujia.p4.button.views;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

final class c
  implements Runnable
{
  c(StatefulButton paramStatefulButton)
  {
  }

  public final void run()
  {
    Rect localRect = new Rect();
    this.a.getHitRect(localRect);
    localRect.top = (-50 + localRect.top);
    localRect.left = (-50 + localRect.left);
    localRect.right = (50 + localRect.right);
    localRect.bottom = (50 + localRect.bottom);
    TouchDelegate localTouchDelegate = new TouchDelegate(localRect, this.a);
    if (View.class.isInstance(this.a.getParent()))
      ((View)this.a.getParent()).setTouchDelegate(localTouchDelegate);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.c
 * JD-Core Version:    0.6.0
 */