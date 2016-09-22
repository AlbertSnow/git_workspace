package com.wandoujia.nirvana.framework.ui;

import android.view.View;
import com.wandoujia.base.log.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public final View a;
  private final com.wandoujia.nirvana.framework.ui.a.a b;
  private final List<b> c;
  private Object d;

  public a(View paramView)
  {
    this(paramView, null);
  }

  public a(View paramView, Object paramObject)
  {
    this.a = paramView;
    this.d = paramObject;
    paramView.getContext();
    this.b = new com.wandoujia.nirvana.framework.ui.a.a(paramView);
    this.c = new LinkedList();
  }

  private a a(int paramInt, b paramb, boolean paramBoolean)
  {
    if (paramBoolean)
      a(paramInt);
    paramb.d = paramInt;
    paramb.e = this.d;
    paramb.c = this;
    this.c.add(paramb);
    return this;
  }

  private b a(List<b> paramList, int paramInt)
  {
    int i = ((b)paramList.get(paramInt)).d;
    if (i == 0);
    for (View localView = this.a; localView == null; localView = this.b.b(i).a())
    {
      Log.w("Presenter", "IGNORED, VIEW ID NOT FOUND:" + Integer.toHexString(i), new Object[0]);
      return null;
    }
    b localb = (b)paramList.get(paramInt);
    localb.b = localView;
    localb.c = this;
    return localb;
  }

  public final a a(int paramInt)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.d != paramInt)
        continue;
      if (localb.b != null)
        localb.a();
      localIterator.remove();
    }
    return this;
  }

  public final a a(int paramInt, b paramb)
  {
    return a(paramInt, paramb, false);
  }

  public final a a(b paramb)
  {
    return a(0, paramb, false);
  }

  public final void a()
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      b localb = a(this.c, i);
      if (localb == null)
        continue;
      localb.a();
    }
  }

  public final void a(Object paramObject)
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      b localb = a(this.c, i);
      if (localb == null)
        continue;
      localb.a(paramObject);
    }
  }

  public final com.wandoujia.nirvana.framework.ui.a.a b()
  {
    return this.b;
  }

  public final a b(int paramInt, b paramb)
  {
    return a(paramInt, paramb, true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.a
 * JD-Core Version:    0.6.0
 */