package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import com.wandoujia.logv3.model.packages.DeviceStatusPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class f extends h
{
  f(e parame, long paramLong1, long paramLong2)
  {
  }

  public final boolean a(View paramView)
  {
    e.a(this.c, paramView.getContext(), e.a(this.c));
    a(paramView, Logger.Module.APP_LAUNCHER, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "free_space", null);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.b);
    String str = String.format("avai:%d,total:%d", arrayOfObject);
    v.b().a(paramView, new DeviceStatusPackage.Builder().extra_msg(str).build());
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.f
 * JD-Core Version:    0.6.0
 */