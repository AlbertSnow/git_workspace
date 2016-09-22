package com.wandoujia.ripple_framework.c;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class q extends h
{
  q(p paramp, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    ((c)i.k().a("navigation")).a(this.b.f(), paramView, this.a, 262);
    a(paramView, Logger.Module.ATTACHMENT, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, String.valueOf(this.a.e()), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.q
 * JD-Core Version:    0.6.0
 */