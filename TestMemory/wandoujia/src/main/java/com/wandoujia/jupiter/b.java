package com.wandoujia.jupiter;

import android.net.NetworkInfo;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.nirvana.framework.network.a;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.n;

final class b
  implements n
{
  b(JupiterApplication paramJupiterApplication)
  {
  }

  public final void a(NetworkInfo paramNetworkInfo)
  {
    if (NetworkUtil.isNetworkConnected(GlobalConfig.getAppContext()))
    {
      j.a().a("accessibility");
      a locala = (a)j.a().a("api_context");
      AccessibilityManager.a(locala);
      AccessibilityManager.b(locala);
      ReceiverMonitor.a().b(JupiterApplication.a(this.a));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.b
 * JD-Core Version:    0.6.0
 */