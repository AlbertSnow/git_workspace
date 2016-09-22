package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.app_launcher.switcher.BaseSwitcher;
import com.wandoujia.p4.app_launcher.switcher.BaseSwitcher.Type;

public final class i extends com.wandoujia.launcher_base.launcher.c.a
{
  private BaseSwitcher a;

  public i(BaseSwitcher paramBaseSwitcher)
  {
    this.a = paramBaseSwitcher;
  }

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = this.a.a(paramViewGroup);
    return paramView;
  }

  protected final void a()
  {
    BaseSwitcher localBaseSwitcher;
    if (this.a != null)
    {
      localBaseSwitcher = this.a;
      if ((localBaseSwitcher != null) && (localBaseSwitcher.d() != null))
        break label24;
    }
    while (true)
    {
      return;
      label24: View localView = localBaseSwitcher.d().getView();
      Object localObject = localView.getTag(2131492911);
      if ((localObject instanceof Boolean));
      for (boolean bool = ((Boolean)localObject).booleanValue(); !bool; bool = false)
      {
        v localv = v.b().a(localView, "app_launcher");
        ViewLogPackage.Element localElement = ViewLogPackage.Element.BUTTON;
        ViewLogPackage.Action localAction = ViewLogPackage.Action.TOGGLE;
        localv.a(localView, localElement, localAction, localBaseSwitcher.a().name(), Long.valueOf(localBaseSwitcher.e())).c(localView);
        localView.setTag(2131492911, Boolean.valueOf(true));
        return;
      }
    }
  }

  protected final void i()
  {
    super.i();
    if (this.a != null)
      this.a.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.i
 * JD-Core Version:    0.6.0
 */