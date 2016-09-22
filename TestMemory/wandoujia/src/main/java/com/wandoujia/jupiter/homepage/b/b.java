package com.wandoujia.jupiter.homepage.b;

import android.net.NetworkInfo;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.ripple_framework.n;

final class b
  implements n
{
  b(a parama)
  {
  }

  public final void a(NetworkInfo paramNetworkInfo)
  {
    if (NetworkUtil.isWifiConnected(a.a(this.a)))
      a.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.b.b
 * JD-Core Version:    0.6.0
 */