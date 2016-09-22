package com.wandoujia.launcher_base.launcher.b;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.launcher_base.launcher.c.a;
import com.wandoujia.launcher_base.utils.g;
import com.wandoujia.launcher_base.utils.h;

public final class e extends a
{
  private int a;

  public e(int paramInt, g paramg)
  {
    this.a = paramInt;
    a(paramg);
  }

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null)
      return paramView;
    return h.b(paramViewGroup, this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.b.e
 * JD-Core Version:    0.6.0
 */