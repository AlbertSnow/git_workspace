package com.wandoujia.p4.button.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public final class h extends BaseAdapter
{
  public h(SubActionButton paramSubActionButton)
  {
  }

  private i a(int paramInt)
  {
    return (i)SubActionButton.b(this.a).get(paramInt);
  }

  public final int getCount()
  {
    if (SubActionButton.b(this.a) != null)
      return SubActionButton.b(this.a).size();
    return 0;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramViewGroup.getContext());
    if (paramView == null);
    for (View localView = localLayoutInflater.inflate(2130903494, paramViewGroup, false); ; localView = paramView)
    {
      i locali = a(paramInt);
      ((TextView)localView).setText(locali.a);
      return localView;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.h
 * JD-Core Version:    0.6.0
 */