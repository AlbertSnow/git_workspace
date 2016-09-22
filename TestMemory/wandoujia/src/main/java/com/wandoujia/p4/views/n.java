package com.wandoujia.p4.views;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class n
  implements AbsListView.OnScrollListener
{
  n(ScrollDownLayout paramScrollDownLayout)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    ScrollDownLayout.a(this.a, paramAbsListView);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    ScrollDownLayout.a(this.a, paramAbsListView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.n
 * JD-Core Version:    0.6.0
 */