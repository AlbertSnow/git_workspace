package com.wandoujia.ripple_framework.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public abstract class ax<T extends ay> extends BaseAdapter
{
  private List<T> a = new ArrayList();

  public abstract View a(ViewGroup paramViewGroup);

  public final T a(int paramInt)
  {
    return (ay)this.a.get(paramInt);
  }

  public final void a(List<T> paramList)
  {
    this.a = new ArrayList(paramList);
  }

  public int getCount()
  {
    return this.a.size();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ax
 * JD-Core Version:    0.6.0
 */