package com.wandoujia.jupiter.search.b;

import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class b extends h
{
  b(a parama, Model paramModel)
  {
    super(paramModel);
  }

  public final boolean a(View paramView)
  {
    Action localAction = this.a.i().b().action_positive;
    ((NavigationManager)i.k().a("navigation")).a(paramView.getContext(), localAction);
    a(paramView, Logger.Module.SEARCH, ViewLogPackage.Element.TEXT_LINK, localAction);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.b
 * JD-Core Version:    0.6.0
 */