package com.wandoujia.phoenix2.av.a;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class c
  implements AbsListView.OnScrollListener
{
  c(b paramb)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      android.support.v4.app.b.b(false);
      b.a(this.a).e();
      return;
    }
    android.support.v4.app.b.b(true);
    b.a(this.a).f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.a.c
 * JD-Core Version:    0.6.0
 */