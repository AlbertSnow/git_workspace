package com.wandoujia.p4.adapter;

import android.widget.BaseAdapter;
import java.util.List;

public abstract class h<T> extends BaseAdapter
{
  protected List<T> a;

  public void a(List<T> paramList)
  {
    this.a = paramList;
    notifyDataSetChanged();
  }

  public final List<T> b()
  {
    return this.a;
  }

  public final void c()
  {
    if (this.a != null)
      this.a.clear();
    notifyDataSetChanged();
  }

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
 * Qualified Name:     com.wandoujia.p4.adapter.h
 * JD-Core Version:    0.6.0
 */