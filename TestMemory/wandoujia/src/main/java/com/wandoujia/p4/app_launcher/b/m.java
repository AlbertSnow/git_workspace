package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;
import com.wandoujia.p4.app_launcher.manager.ALManager;
import com.wandoujia.p4.app_launcher.manager.k;

public final class m extends com.wandoujia.launcher_base.launcher.c.a
{
  private o a;
  private CleanWidget b;
  private final k c = new n(this);

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView != null)
    {
      this.a = ((o)paramView.getTag(2131492878));
      localObject = paramView;
    }
    while (true)
    {
      if ((localObject instanceof CleanWidget))
      {
        this.b = ((CleanWidget)localObject);
        this.a.a(this.b);
      }
      com.wandoujia.p4.a.e().a(this.c);
      return localObject;
      localObject = CleanWidget.a(paramViewGroup);
      this.a = new o(0);
      ((View)localObject).setTag(2131492878, this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.m
 * JD-Core Version:    0.6.0
 */