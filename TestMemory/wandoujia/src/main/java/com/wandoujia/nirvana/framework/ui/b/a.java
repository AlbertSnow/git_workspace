package com.wandoujia.nirvana.framework.ui.b;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public abstract class a<T> extends com.wandoujia.logv3.toolkit.cardshow.a
{
  protected List<T> a;

  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    b localb;
    if (paramView != null)
    {
      localb = com.wandoujia.nirvana.framework.ui.c.b.b(paramView);
      int i = getItemViewType(paramInt);
      if (localb.b != i)
      {
        localb = a(paramInt, paramViewGroup);
        localb.b = i;
        com.wandoujia.nirvana.framework.ui.c.b.a(localb.a, localb);
      }
    }
    while (true)
    {
      a(paramInt, localb);
      return localb.a;
      localb = a(paramInt, paramViewGroup);
      localb.b = getItemViewType(paramInt);
      com.wandoujia.nirvana.framework.ui.c.b.a(localb.a, localb);
    }
  }

  protected abstract b a(int paramInt, ViewGroup paramViewGroup);

  public void a()
  {
    if (this.a != null)
      this.a.clear();
    notifyDataSetChanged();
  }

  protected abstract void a(int paramInt, b paramb);

  public int getCount()
  {
    if (this.a == null)
      return 0;
    return this.a.size();
  }

  public T getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.b.a
 * JD-Core Version:    0.6.0
 */