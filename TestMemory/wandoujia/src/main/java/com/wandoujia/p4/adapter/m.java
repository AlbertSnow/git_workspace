package com.wandoujia.p4.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.List;

public class m extends BaseAdapter
  implements WrapperListAdapter
{
  protected final List<View> a;
  private ListAdapter b;
  private final List<View> c;

  public m(ListAdapter paramListAdapter)
  {
    this.b = paramListAdapter;
    this.a = new ArrayList();
    this.c = new ArrayList();
  }

  private int a()
  {
    return this.a.size();
  }

  private int b()
  {
    return this.c.size();
  }

  public void a(int paramInt, View paramView)
  {
    if (!this.a.contains(paramView))
    {
      if (paramInt > this.a.size())
        paramInt = this.a.size();
      this.a.add(paramInt, paramView);
      notifyDataSetChanged();
    }
  }

  public final void a(View paramView)
  {
    if (!this.a.contains(paramView))
    {
      this.a.add(paramView);
      notifyDataSetChanged();
    }
  }

  public final void b(View paramView)
  {
    if (!this.c.contains(paramView))
    {
      this.c.add(paramView);
      notifyDataSetChanged();
    }
  }

  public final boolean c(View paramView)
  {
    boolean bool = this.a.remove(paramView);
    if (bool)
      notifyDataSetChanged();
    return bool;
  }

  public int getCount()
  {
    if (this.b != null)
      return b() + a() + this.b.getCount();
    return b() + a();
  }

  public Object getItem(int paramInt)
  {
    int i = a();
    if (paramInt < i);
    int j;
    do
    {
      return null;
      j = paramInt - i;
    }
    while ((this.b == null) || (j >= this.b.getCount()));
    return this.b.getItem(j);
  }

  public long getItemId(int paramInt)
  {
    int i = a();
    if ((this.b != null) && (paramInt >= i))
    {
      int j = paramInt - i;
      if (j < this.b.getCount())
        return this.b.getItemId(j);
    }
    return -1L;
  }

  public int getItemViewType(int paramInt)
  {
    int i = a();
    if ((this.b != null) && (paramInt >= i))
    {
      int j = paramInt - i;
      if (j < this.b.getCount())
        return this.b.getItemViewType(j);
    }
    return -1;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = a();
    if (paramInt < i)
      return (View)this.a.get(paramInt);
    int j = paramInt - i;
    ListAdapter localListAdapter = this.b;
    int k = 0;
    if (localListAdapter != null)
    {
      k = this.b.getCount();
      if (j < k)
        return this.b.getView(j, paramView, paramViewGroup);
    }
    return (View)this.c.get(j - k);
  }

  public int getViewTypeCount()
  {
    if (this.b != null)
      return this.b.getViewTypeCount();
    return 1;
  }

  public ListAdapter getWrappedAdapter()
  {
    return this.b;
  }

  public boolean hasStableIds()
  {
    if (this.b != null)
      return this.b.hasStableIds();
    return false;
  }

  public boolean isEmpty()
  {
    return (this.b == null) || (this.b.isEmpty());
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.registerDataSetObserver(paramDataSetObserver);
    if (this.b != null)
      this.b.registerDataSetObserver(paramDataSetObserver);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.unregisterDataSetObserver(paramDataSetObserver);
    if (this.b != null)
      this.b.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.m
 * JD-Core Version:    0.6.0
 */