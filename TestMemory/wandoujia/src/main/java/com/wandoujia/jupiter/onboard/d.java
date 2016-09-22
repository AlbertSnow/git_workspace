package com.wandoujia.jupiter.onboard;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class d extends h
{
  d(EssentialAppFragment paramEssentialAppFragment)
  {
  }

  public final boolean a(View paramView)
  {
    if (EssentialAppFragment.a(this.a))
      return false;
    if (EssentialAppFragment.b(this.a).b())
    {
      EssentialGameFragment.a(EssentialAppFragment.f(this.a).c(), this.a);
      EssentialAppFragment.d(this.a);
      a(paramView, Logger.Module.WELCOME, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.ENTER, "wdj://essential", Long.valueOf(EssentialGameFragment.a(EssentialAppFragment.g(this.a).c())));
      return true;
    }
    try
    {
      ((OnboardActivity)this.a.getActivity()).a = EssentialAppFragment.c(this.a).c();
      label110: EssentialAppFragment.d(this.a);
      a(paramView, Logger.Module.WELCOME, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.ENTER, "wdj://welcome/games", Long.valueOf(EssentialGameFragment.a(EssentialAppFragment.e(this.a).c())));
      return true;
    }
    catch (Exception localException)
    {
      break label110;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.d
 * JD-Core Version:    0.6.0
 */