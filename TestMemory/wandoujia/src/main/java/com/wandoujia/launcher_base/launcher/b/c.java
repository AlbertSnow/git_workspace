package com.wandoujia.launcher_base.launcher.b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.R.layout;
import com.wandoujia.launcher_base.launcher.c.a;

public final class c extends a
{
  private String a;

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null);
    do
    {
      return paramView;
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(R.layout.launcher_nodata_cell, paramViewGroup, false);
    }
    while (TextUtils.isEmpty(this.a));
    ((TextView)paramView.findViewById(R.id.tip_no_data)).setText(this.a);
    return paramView;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.b.c
 * JD-Core Version:    0.6.0
 */