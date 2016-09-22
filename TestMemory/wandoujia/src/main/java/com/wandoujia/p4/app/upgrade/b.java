package com.wandoujia.p4.app.upgrade;

import android.net.NetworkInfo;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.n;

final class b
  implements n
{
  public final void a(NetworkInfo paramNetworkInfo)
  {
    if (NetworkUtil.parseNetworkType(paramNetworkInfo) == 1);
    for (boolean bool = true; ; bool = false)
    {
      a.a(bool);
      if (System.currentTimeMillis() - Config.b() >= 3600000L)
        break;
      return;
    }
    a.a(true, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.b
 * JD-Core Version:    0.6.0
 */