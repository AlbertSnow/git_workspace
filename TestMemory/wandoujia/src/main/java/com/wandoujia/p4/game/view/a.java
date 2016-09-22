package com.wandoujia.p4.game.view;

import android.view.View;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class a extends h
{
  a(String paramString)
  {
  }

  public final boolean a(View paramView)
  {
    Action.Builder localBuilder = new Action.Builder().intent("wdj://apps/" + this.a);
    ((NavigationManager)i.k().a("navigation")).a(paramView.getContext(), localBuilder.build());
    i.k().h().a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "goto_video", null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.view.a
 * JD-Core Version:    0.6.0
 */