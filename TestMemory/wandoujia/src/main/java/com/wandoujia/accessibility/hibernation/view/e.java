package com.wandoujia.accessibility.hibernation.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage.Builder;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class e
  implements View.OnClickListener
{
  e(AppHibernatingView paramAppHibernatingView)
  {
  }

  public final void onClick(View paramView)
  {
    if (AppHibernatingView.a(this.a) != null)
      AppHibernatingView.a(this.a).b(paramView);
    v.b().a(paramView, Logger.Module.APP_LAUNCHER.name()).a(paramView, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REMOVE, "").a(paramView, new ViewLogPackage.IndexPackage.Builder().index(Integer.valueOf(AppHibernatingView.c(this.a))).sub_index(Integer.valueOf(AppHibernatingView.b(this.a))).build()).d(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.e
 * JD-Core Version:    0.6.0
 */