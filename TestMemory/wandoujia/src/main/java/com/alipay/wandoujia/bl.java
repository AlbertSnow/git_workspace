package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class bl
  implements AbsListView.OnScrollListener
{
  bl(bg parambg)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    if (paramAbsListView.getLastVisiblePosition() == -1 + paramAbsListView.getCount());
    for (int i = 1; ; i = 0)
    {
      b.h();
      View localView = bg.c(this.a);
      int j = 0;
      if (i != 0)
        j = 8;
      localView.setVisibility(j);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bl
 * JD-Core Version:    0.6.0
 */