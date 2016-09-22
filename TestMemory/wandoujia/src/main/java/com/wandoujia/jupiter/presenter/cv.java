package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.c.bg;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class cv extends bg
{
  cv(Logger.Module paramModule, ViewLogPackage.Element paramElement)
  {
    super(paramModule, paramElement);
  }

  protected final void a(View paramView, Model paramModel)
  {
    ((NavigationManager)i.k().a("navigation")).b(e().getContext(), paramModel, e());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cv
 * JD-Core Version:    0.6.0
 */