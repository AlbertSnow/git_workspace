package com.wandoujia.p4.app.upgrade;

import android.net.NetworkInfo;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.ripple_framework.n;

final class m
  implements n
{
  m(UpgradeNotifyCardGenerator paramUpgradeNotifyCardGenerator)
  {
  }

  public final void a(NetworkInfo paramNetworkInfo)
  {
    if (!NetworkUtil.isNetworkConnected(UpgradeNotifyCardGenerator.e()));
    for (boolean bool = true; ; bool = false)
    {
      UpgradeNotifyCardGenerator.a(bool);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.m
 * JD-Core Version:    0.6.0
 */