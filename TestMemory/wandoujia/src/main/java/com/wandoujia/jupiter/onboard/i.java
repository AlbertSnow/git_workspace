package com.wandoujia.jupiter.onboard;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class i extends h
{
  i(EssentialGameFragment paramEssentialGameFragment)
  {
  }

  public final boolean a(View paramView)
  {
    EssentialGameFragment.c(this.a);
    if (this.a.isAdded())
      this.a.getActivity().finish();
    a(paramView, Logger.Module.WELCOME, ViewLogPackage.Element.TEXT_LINK, ViewLogPackage.Action.ENTER, "wdj://essential", Long.valueOf(0L));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.i
 * JD-Core Version:    0.6.0
 */