package com.wandoujia.jupiter.homepage.splashwindow;

import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class g extends h
{
  g(Model paramModel)
  {
  }

  public final boolean a(View paramView)
  {
    b.a(paramView, this.a);
    a(paramView, Logger.Module.SPLASH, ViewLogPackage.Element.PAGE, ViewLogPackage.Action.REDIRECT, this.a.a(), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.g
 * JD-Core Version:    0.6.0
 */