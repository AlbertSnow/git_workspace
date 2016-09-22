package com.wandoujia.launcher_base.launcher.c;

import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;

final class j extends at
{
  j(d paramd)
  {
  }

  public final int a()
  {
    return d.g(this.a);
  }

  public final int a(Object paramObject)
  {
    if ((paramObject instanceof View))
    {
      Object localObject = ((View)paramObject).getTag(n.a);
      if ((localObject instanceof Integer))
      {
        int i = ((Integer)localObject).intValue();
        n localn = d.c(this.a, i);
        if (localn != null)
          return localn.b();
      }
    }
    return -2;
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    n localn = d.b(this.a, paramInt);
    if (localn != null)
    {
      View localView = localn.a(paramViewGroup);
      ((ViewPager)paramViewGroup).addView(localView);
      return localView;
    }
    return null;
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    ((ViewPager)paramViewGroup).removeView((View)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.j
 * JD-Core Version:    0.6.0
 */