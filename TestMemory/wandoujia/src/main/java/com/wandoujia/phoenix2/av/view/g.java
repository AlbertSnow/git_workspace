package com.wandoujia.phoenix2.av.view;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class g
  implements AbsListView.OnScrollListener
{
  g(ScrollDownLayout paramScrollDownLayout)
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

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.view.g
 * JD-Core Version:    0.6.0
 */