package com.wandoujia.ripple_framework.ripple.b;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class j extends h
{
  j(i parami, Model paramModel)
  {
  }

  public final boolean a(View paramView)
  {
    ((c)com.wandoujia.ripple_framework.i.k().a("navigation")).a(this.b.f(), paramView, this.a, 516);
    a(paramView, Logger.Module.UI, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, this.a.n(), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.j
 * JD-Core Version:    0.6.0
 */