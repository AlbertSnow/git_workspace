package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;

final class an extends BaseAdapter
{
  private final String[] a;

  private an(Context paramContext)
  {
    this.a = paramContext.getResources().getStringArray(2131230736);
  }

  public final int getCount()
  {
    return this.a.length;
  }

  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == 0)
      return c.a(paramViewGroup, 2130903322);
    View localView = c.a(paramViewGroup, 2130903321);
    ((TextView)localView.findViewById(2131493602)).setText(this.a[paramInt]);
    return localView;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = c.a(paramViewGroup, 2130903299);
    return paramView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.an
 * JD-Core Version:    0.6.0
 */