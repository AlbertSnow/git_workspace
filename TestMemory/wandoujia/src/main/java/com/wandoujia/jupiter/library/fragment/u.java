package com.wandoujia.jupiter.library.fragment;

import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class u extends h
{
  u(t paramt)
  {
  }

  public final boolean a(View paramView)
  {
    b.a(new v(this), new Void[0]);
    a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UPGRADE_ALL, null, null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.u
 * JD-Core Version:    0.6.0
 */