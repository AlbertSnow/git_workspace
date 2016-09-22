package com.wandoujia.logv3.toolkit.cardshow;

import android.content.Context;
import android.view.View;
import com.wandoujia.logv3.toolkit.h;
import com.wandoujia.logv3.toolkit.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class p
  implements Runnable
{
  private View a;
  private long b;

  p(o paramo)
  {
  }

  public final p a(long paramLong)
  {
    this.b = paramLong;
    return this;
  }

  public final p a(View paramView)
  {
    this.a = paramView;
    return this;
  }

  public final void run()
  {
    if (!o.a(this.c));
    do
      return;
    while (o.b(this.c).contains(Long.valueOf(this.b)));
    ArrayList localArrayList = new ArrayList();
    o.a(this.c, this.a, localArrayList);
    Context localContext = this.a.getContext();
    h localh;
    Iterator localIterator;
    if ((localContext instanceof h))
    {
      localh = (h)localContext;
      localIterator = localArrayList.iterator();
    }
    label150: 
    while (true)
    {
      label81: if (!localIterator.hasNext())
        break label152;
      View localView = (View)localIterator.next();
      if (localh != null)
        localh.onLogCardShow(localView);
      while (true)
      {
        if (!(localView instanceof m))
          break label150;
        ((m)localView).a();
        break label81;
        localh = null;
        break;
        v.b().c(localView);
      }
    }
    label152: o.b(this.c).add(Long.valueOf(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.p
 * JD-Core Version:    0.6.0
 */