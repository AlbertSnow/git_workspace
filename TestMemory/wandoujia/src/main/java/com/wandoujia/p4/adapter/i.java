package com.wandoujia.p4.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;

public final class i extends BaseAdapter
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private final BaseAdapter f;

  public i(BaseAdapter paramBaseAdapter)
  {
    this.f = paramBaseAdapter;
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
    notifyDataSetChanged();
  }

  public final void b(int paramInt)
  {
    this.b = paramInt;
    notifyDataSetChanged();
  }

  public final void c(int paramInt)
  {
    this.c = paramInt;
  }

  public final void d(int paramInt)
  {
    this.d = paramInt;
  }

  public final void e(int paramInt)
  {
    this.e = paramInt;
  }

  public final int getCount()
  {
    if (this.f.getCount() % this.a == 0)
      return this.f.getCount() / this.a;
    return 1 + this.f.getCount() / this.a;
  }

  public final Object getItem(int paramInt)
  {
    int i = paramInt * this.a;
    return this.f.getItem(i);
  }

  public final long getItemId(int paramInt)
  {
    int i = paramInt * this.a;
    return this.f.getItemId(i);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = paramInt * this.a;
    int j = paramInt * this.a;
    int k;
    k localk;
    int m;
    if (-1 + (j + this.a) < this.f.getCount())
    {
      k = this.a;
      localk = (k)paramView;
      if (localk == null)
        localk = new k(paramViewGroup.getContext(), 0);
      m = 0;
      label69: if (m >= this.a)
        break label376;
      if (m >= localk.getChildCount())
        break label410;
    }
    label132: label151: label410: for (View localView = localk.getChildAt(m); ; localView = null)
    {
      int i1 = i + m;
      Object localObject;
      int i2;
      LinearLayout.LayoutParams localLayoutParams1;
      int i3;
      label185: int i4;
      if (m < k)
        if ((localView instanceof l))
        {
          localObject = this.f.getView(i1, null, paramViewGroup);
          ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
          if (localLayoutParams == null)
            break label345;
          i2 = localLayoutParams.height;
          localLayoutParams1 = new LinearLayout.LayoutParams(0, i2);
          localLayoutParams1.weight = 1.0F;
          if (i1 % this.a != 0)
            break label352;
          i3 = this.d;
          localLayoutParams1.leftMargin = i3;
          if ((i1 + 1) % this.a != 0)
            break label361;
          i4 = this.d;
          label210: localLayoutParams1.rightMargin = i4;
          if (i1 / this.a != 0)
            break label367;
        }
      label345: label352: label361: label367: for (int i5 = this.e; ; i5 = this.c)
      {
        localLayoutParams1.topMargin = i5;
        ((View)localObject).setLayoutParams(localLayoutParams1);
        if (localObject != localView)
        {
          if (localView != null)
            localk.removeView(localView);
          localk.addView((View)localObject, m);
        }
        m++;
        break label69;
        k = this.f.getCount() - j;
        break;
        localObject = this.f.getView(i1, localView, paramViewGroup);
        break label132;
        if ((localView instanceof l))
        {
          localObject = localView;
          break label132;
        }
        localObject = new l(paramViewGroup.getContext(), 0);
        break label132;
        i2 = -2;
        break label151;
        i3 = this.b;
        break label185;
        i4 = 0;
        break label210;
      }
      label376: for (int n = -1 + localk.getChildCount(); n >= this.a; n--)
        localk.removeViewAt(n);
      return localk;
    }
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.registerDataSetObserver(paramDataSetObserver);
    if (this.f != null)
      this.f.registerDataSetObserver(paramDataSetObserver);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.unregisterDataSetObserver(paramDataSetObserver);
    if (this.f != null)
      this.f.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.i
 * JD-Core Version:    0.6.0
 */