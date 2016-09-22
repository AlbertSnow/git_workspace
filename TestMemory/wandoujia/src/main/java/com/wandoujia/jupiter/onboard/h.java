package com.wandoujia.jupiter.onboard;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class h extends com.wandoujia.ripple_framework.log.h
{
  h(EssentialGameFragment paramEssentialGameFragment)
  {
  }

  public final boolean a(View paramView)
  {
    EssentialGameFragment.a(this.a);
    if (this.a.isAdded())
      this.a.getActivity().finish();
    a(paramView, Logger.Module.WELCOME, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.ENTER, "wdj://essential", Long.valueOf(EssentialGameFragment.a(EssentialGameFragment.b(this.a).c())));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.h
 * JD-Core Version:    0.6.0
 */