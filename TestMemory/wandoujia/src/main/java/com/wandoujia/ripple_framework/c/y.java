package com.wandoujia.ripple_framework.c;

import android.view.View;
import android.widget.TextView;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class y extends h
{
  y(x paramx, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    c localc = (c)i.k().a("navigation");
    paramView.getContext();
    this.b.i().e();
    this.a.n();
    this.a.m().n();
    localc.b();
    a(paramView, Logger.Module.UI, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, ((TextView)paramView).getText().toString(), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.y
 * JD-Core Version:    0.6.0
 */