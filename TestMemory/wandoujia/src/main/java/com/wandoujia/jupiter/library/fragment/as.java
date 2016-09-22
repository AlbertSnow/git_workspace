package com.wandoujia.jupiter.library.fragment;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.wandoujia.p4.views.ScrollDownLayout;

final class as
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private int a = 0;

  as(LibFragment paramLibFragment)
  {
  }

  public final void onGlobalLayout()
  {
    int i = this.b.a.getHeight();
    if (this.a == i)
      return;
    this.a = i;
    this.b.c.setMaxOffset(i);
    this.b.c.setEnable(true);
    this.b.c.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.as
 * JD-Core Version:    0.6.0
 */