package com.wandoujia.p4.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.a.a.a.a;

public abstract class n extends BaseAdapter
  implements WrapperListAdapter, a
{
  private int a = 1;
  private BaseAdapter b;

  public n(BaseAdapter paramBaseAdapter)
  {
    this.b = paramBaseAdapter;
  }

  public abstract int a(int paramInt);

  public abstract int b(int paramInt);

  public int getCount()
  {
    return 3 * this.b.getCount();
  }

  public Object getItem(int paramInt)
  {
    return this.b.getItem(paramInt / 3);
  }

  public long getItemId(int paramInt)
  {
    return this.b.getItemId(paramInt / 3);
  }

  public int getItemViewType(int paramInt)
  {
    if (paramInt % 3 == 1)
      return this.b.getItemViewType(paramInt / 3);
    return this.a;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    if (getItemViewType(paramInt) == this.a)
    {
      if (getItemViewType(paramInt) != this.a)
        throw new IllegalStateException("The view type at the position must be margin view type");
      int j;
      int k;
      if (paramInt % 3 == 0)
      {
        j = i;
        if (j == 0)
          break label104;
        k = a(paramInt / 3);
        if (paramView != null)
          break label144;
        paramView = new View(paramViewGroup.getContext());
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, k));
      }
      while (true)
      {
        paramView.setVisibility(4);
        return paramView;
        j = 0;
        break;
        label104: if (paramInt % 3 == 2);
        while (true)
        {
          if (i == 0)
            break label134;
          k = b(paramInt / 3);
          break;
          i = 0;
        }
        label134: throw new IllegalStateException("The view at the position must be margin top or margin bottom.");
        label144: AbsListView.LayoutParams localLayoutParams = (AbsListView.LayoutParams)paramView.getLayoutParams();
        localLayoutParams.height = k;
        paramView.setLayoutParams(localLayoutParams);
      }
    }
    return this.b.getView(paramInt / 3, paramView, paramViewGroup);
  }

  public int getViewTypeCount()
  {
    this.a = (0 + this.b.getViewTypeCount());
    return 1 + this.b.getViewTypeCount();
  }

  public ListAdapter getWrappedAdapter()
  {
    return this.b;
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.registerDataSetObserver(paramDataSetObserver);
    this.b.registerDataSetObserver(paramDataSetObserver);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.unregisterDataSetObserver(paramDataSetObserver);
    this.b.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.n
 * JD-Core Version:    0.6.0
 */