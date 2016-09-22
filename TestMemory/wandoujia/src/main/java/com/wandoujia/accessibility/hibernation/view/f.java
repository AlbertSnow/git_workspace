package com.wandoujia.accessibility.hibernation.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class f
  implements View.OnClickListener
{
  f(AppHibernatingView paramAppHibernatingView)
  {
  }

  public final void onClick(View paramView)
  {
    if (AppHibernatingView.a(this.a) != null)
      AppHibernatingView.a(this.a).a(paramView);
    v.b().a(paramView, Logger.Module.APP_LAUNCHER.name()).a(paramView, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "").d(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.f
 * JD-Core Version:    0.6.0
 */