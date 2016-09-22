package com.wandoujia.logv3.toolkit.cardshow;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.wandoujia.logv3.toolkit.v;

public abstract class a extends BaseAdapter
{
  private j a;

  public abstract View a(int paramInt, View paramView, ViewGroup paramViewGroup);

  public void a()
  {
    if (this.a != null)
      this.a.a();
  }

  public final boolean a(j paramj)
  {
    this.a = paramj;
    return true;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = a(paramInt, paramView, paramViewGroup);
    v.b().a(localView, paramInt);
    if (this.a != null)
      this.a.a(localView, getItemId(paramInt));
    return localView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.a
 * JD-Core Version:    0.6.0
 */