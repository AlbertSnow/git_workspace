package com.wandoujia.p4.app.detail.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import com.wandoujia.p4.utils.c;
import java.util.List;

final class h extends BaseAdapter
{
  private List<g> a;

  private h(ReportActivity paramReportActivity)
  {
  }

  public final void a(List<g> paramList)
  {
    this.a = paramList;
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = c.a(this.b, 2130903483); ; localView = paramView)
    {
      g localg = (g)getItem(paramInt);
      ((CheckBox)localView).setText(localg.b());
      ((CheckBox)localView).setOnCheckedChangeListener(new i(localg));
      return localView;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.h
 * JD-Core Version:    0.6.0
 */