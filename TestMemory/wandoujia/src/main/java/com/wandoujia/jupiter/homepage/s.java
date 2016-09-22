package com.wandoujia.jupiter.homepage;

import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class s extends h
{
  s(Model paramModel)
  {
  }

  public final boolean a(View paramView)
  {
    a(paramView, Logger.Module.SPLASH, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, this.a.a(), null);
    b.a(paramView, this.a);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.s
 * JD-Core Version:    0.6.0
 */