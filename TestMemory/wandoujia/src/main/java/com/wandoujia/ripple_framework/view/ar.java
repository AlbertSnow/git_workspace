package com.wandoujia.ripple_framework.view;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class ar extends h
{
  ar(Spinner paramSpinner)
  {
  }

  public final boolean a(View paramView)
  {
    if (Spinner.a(this.a))
    {
      this.a.a();
      return false;
    }
    Spinner.b(this.a);
    a(paramView, Logger.Module.UI, ViewLogPackage.Element.SPINNER, ViewLogPackage.Action.EXPAND, Spinner.c(this.a), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ar
 * JD-Core Version:    0.6.0
 */