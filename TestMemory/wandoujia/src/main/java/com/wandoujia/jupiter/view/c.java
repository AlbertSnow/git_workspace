package com.wandoujia.jupiter.view;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class c extends h
{
  c(AutoInstallCardView paramAutoInstallCardView)
  {
  }

  public final boolean a(View paramView)
  {
    AutoInstallCardView.a(this.a);
    Config.G();
    a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.CLOSE, "auto_install_card", null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.c
 * JD-Core Version:    0.6.0
 */