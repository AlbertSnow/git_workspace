package com.wandoujia.jupiter.search.b;

import android.view.View;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class j extends com.wandoujia.ripple_framework.log.h
{
  j(h paramh, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    i.k().a("navigation");
    NavigationManager.a(this.b.e().getContext(), this.a.n(), "HISTORY");
    a(paramView, Logger.Module.SEARCH, ViewLogPackage.Element.TEXT_LINK, ViewLogPackage.Action.REDIRECT, "wdj://search/result/" + this.a.n(), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.j
 * JD-Core Version:    0.6.0
 */