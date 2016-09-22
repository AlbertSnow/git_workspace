package com.wandoujia.ripple_framework.installer;

import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.app.activity.IncompatibleDialogActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.model.IncompatibleAppInfo;
import java.util.HashMap;
import java.util.Map;

public final class m
{
  private final Map<String, n> a = new HashMap();

  public m()
  {
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this);
  }

  public final void a(IncompatibleAppInfo paramIncompatibleAppInfo, n paramn)
  {
    this.a.put(paramIncompatibleAppInfo.packageName, paramn);
    IncompatibleDialogActivity.a(JupiterApplication.e(), paramIncompatibleAppInfo);
  }

  public final void onEvent(com.wandoujia.jupiter.b.a.c paramc)
  {
    if (paramc == null);
    n localn;
    do
    {
      return;
      localn = (n)this.a.remove(paramc.a);
    }
    while (localn == null);
    localn.a(paramc.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.m
 * JD-Core Version:    0.6.0
 */