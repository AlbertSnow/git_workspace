package com.wandoujia.phoenix2.av.a;

import android.os.Looper;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  implements AbsListView.OnScrollListener
{
  private final List<AbsListView.OnScrollListener> a = new ArrayList();

  private static void a()
  {
    if (Looper.myLooper() != Looper.getMainLooper())
      throw new IllegalStateException("Must be invoked from the main thread.");
  }

  public final void a(AbsListView.OnScrollListener paramOnScrollListener)
  {
    a();
    if (paramOnScrollListener == null)
      return;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      if (paramOnScrollListener == (AbsListView.OnScrollListener)localIterator.next())
        return;
    this.a.add(paramOnScrollListener);
  }

  public final void b(AbsListView.OnScrollListener paramOnScrollListener)
  {
    a();
    if (paramOnScrollListener == null);
    Iterator localIterator;
    do
    {
      return;
      while (!localIterator.hasNext())
        localIterator = this.a.iterator();
    }
    while (paramOnScrollListener != (AbsListView.OnScrollListener)localIterator.next());
    localIterator.remove();
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    Iterator localIterator = new ArrayList(this.a).iterator();
    while (localIterator.hasNext())
      ((AbsListView.OnScrollListener)localIterator.next()).onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    Iterator localIterator = new ArrayList(this.a).iterator();
    while (localIterator.hasNext())
      ((AbsListView.OnScrollListener)localIterator.next()).onScrollStateChanged(paramAbsListView, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.a.a
 * JD-Core Version:    0.6.0
 */