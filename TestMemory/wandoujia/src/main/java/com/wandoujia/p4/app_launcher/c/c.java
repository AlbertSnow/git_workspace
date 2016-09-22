package com.wandoujia.p4.app_launcher.c;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class c extends h
{
  c(View.OnClickListener paramOnClickListener, AlertDialog paramAlertDialog)
  {
  }

  public final boolean a(View paramView)
  {
    if (this.a != null)
      this.a.onClick(paramView);
    i.k().h().a(paramView, Logger.Module.APP_LAUNCHER, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.CLOSE, "close_fastclean", null).c(paramView);
    this.b.dismiss();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.c.c
 * JD-Core Version:    0.6.0
 */