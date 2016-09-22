package com.wandoujia.p4.views;

import android.support.v4.view.bg;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;

final class o extends cf
{
  o(ScrollDownLayout paramScrollDownLayout)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.a(paramRecyclerView, paramInt1, paramInt2);
    ScrollDownLayout localScrollDownLayout = this.a;
    if (!bg.b(paramRecyclerView, -1));
    for (boolean bool = true; ; bool = false)
    {
      localScrollDownLayout.setDraggable(bool);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.o
 * JD-Core Version:    0.6.0
 */