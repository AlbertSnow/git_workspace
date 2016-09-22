package com.wandoujia.jupiter.onboard;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class e extends h
{
  e(EssentialAppFragment paramEssentialAppFragment)
  {
  }

  public final boolean a(View paramView)
  {
    EssentialAppFragment.d(this.a);
    if (EssentialAppFragment.a(this.a))
      return false;
    if (EssentialAppFragment.b(this.a).b())
    {
      a(paramView, Logger.Module.WELCOME, ViewLogPackage.Element.TEXT_LINK, ViewLogPackage.Action.ENTER, "wdj://essential", Long.valueOf(0L));
      return true;
    }
    a(paramView, Logger.Module.WELCOME, ViewLogPackage.Element.TEXT_LINK, ViewLogPackage.Action.ENTER, "wdj://welcome/games", Long.valueOf(0L));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.e
 * JD-Core Version:    0.6.0
 */