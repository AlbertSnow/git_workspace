package com.wandoujia.ripple_framework.c;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class m extends h
{
  m(l paraml, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    ((c)i.k().a("navigation")).a(this.b.f(), paramView, this.a.m(), 514);
    a(paramView, Logger.Module.BOX, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, null, null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.m
 * JD-Core Version:    0.6.0
 */