package com.wandoujia.p4.app_launcher.switcher;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.app_launcher.manager.m;

public abstract class BaseSwitcher
{
  private com.wandoujia.p4.app_launcher.g.a a;

  public static BaseSwitcher a(String paramString)
  {
    while (true)
    {
      try
      {
        BaseSwitcher.Type localType = BaseSwitcher.Type.valueOf(paramString);
        switch (d.a[localType.ordinal()])
        {
        case 1:
          return new s();
        case 2:
          if (!SystemUtil.aboveApiLevel(21))
            break label153;
          i = 0;
          if (i == 0)
            break;
          return new i();
        case 3:
          return new a();
        case 4:
          return new e();
        case 5:
          return new n();
        case 6:
          if (!m.d())
            break;
          return new g();
        case 7:
          return new ScreenLightSwitcher();
        case 8:
          RingerModeSwitcher localRingerModeSwitcher = new RingerModeSwitcher();
          return localRingerModeSwitcher;
        default:
          return null;
        }
      }
      catch (Exception localException)
      {
      }
      return null;
      label153: int i = 1;
    }
  }

  public final View a(ViewGroup paramViewGroup)
  {
    if (this.a == null)
    {
      this.a = com.wandoujia.p4.app_launcher.g.a.a(paramViewGroup);
      f();
      if (this.a.getView() != null)
        this.a.getView().setOnClickListener(new c(this));
    }
    return this.a.getView();
  }

  public abstract BaseSwitcher.Type a();

  protected void a(View paramView)
  {
    View localView = this.a.getView();
    v localv = v.b().a(localView, "app_launcher");
    ViewLogPackage.Element localElement = ViewLogPackage.Element.BUTTON;
    ViewLogPackage.Action localAction = ViewLogPackage.Action.TOGGLE;
    localv.a(localView, localElement, localAction, a().name(), Long.valueOf(e())).d(localView);
  }

  public void c()
  {
  }

  public final com.wandoujia.p4.app_launcher.g.a d()
  {
    return this.a;
  }

  public abstract long e();

  protected abstract void f();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.BaseSwitcher
 * JD-Core Version:    0.6.0
 */