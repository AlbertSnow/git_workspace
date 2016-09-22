package com.wandoujia.ripple_framework.view;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;
import android.view.View;
import java.util.Iterator;
import java.util.List;

final class q extends cf
{
  q(ObservableRecyclerView paramObservableRecyclerView)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    Iterator localIterator = ObservableRecyclerView.a(this.a).iterator();
    while (localIterator.hasNext())
      ((cf)localIterator.next()).a(paramRecyclerView, paramInt);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    ObservableRecyclerView.a(this.a, this.a.computeHorizontalScrollOffset());
    ObservableRecyclerView.b(this.a, this.a.computeVerticalScrollOffset());
    View localView = paramRecyclerView.getChildAt(0);
    if (localView != null)
    {
      ObservableRecyclerView.c(this.a, RecyclerView.c(localView));
      ObservableRecyclerView.d(this.a, localView.getTop());
    }
    while (true)
    {
      Iterator localIterator = ObservableRecyclerView.a(this.a).iterator();
      while (localIterator.hasNext())
        ((cf)localIterator.next()).a(paramRecyclerView, paramInt1, paramInt2);
      ObservableRecyclerView.c(this.a, 0);
      ObservableRecyclerView.d(this.a, 0);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.q
 * JD-Core Version:    0.6.0
 */