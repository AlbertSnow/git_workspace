package com.wandoujia.ripple_framework.c;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class bb extends com.wandoujia.ripple_framework.log.h
{
  bb(az paramaz)
  {
  }

  public final boolean a(View paramView)
  {
    a(paramView, Logger.Module.ITEM, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, this.a.i().H(), null);
    az localaz = this.a;
    com.wandoujia.ripple_framework.view.a.h localh = new com.wandoujia.ripple_framework.view.a.h(localaz.f());
    localh.a(R.string.open_video_in_browser);
    localh.a(true);
    localh.a(R.string.ok, new bc(localaz));
    localh.b(R.string.cancel, new bd());
    localh.b();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bb
 * JD-Core Version:    0.6.0
 */