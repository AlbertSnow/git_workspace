package com.wandoujia.jupiter;

import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.nirvana.framework.network.a;
import com.wandoujia.ripple_framework.ReceiverMonitor;

final class d
  implements Runnable
{
  d(JupiterApplication paramJupiterApplication)
  {
  }

  public final void run()
  {
    if (NetworkUtil.isNetworkConnected())
    {
      j.a().a("accessibility");
      a locala = (a)j.a().a("api_context");
      AccessibilityManager.a(locala);
      AccessibilityManager.b(locala);
      return;
    }
    ReceiverMonitor.a().a(JupiterApplication.a(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d
 * JD-Core Version:    0.6.0
 */