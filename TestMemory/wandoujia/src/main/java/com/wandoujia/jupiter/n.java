package com.wandoujia.jupiter;

import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;
import com.wandoujia.ripple_framework.Config;

final class n
  implements Runnable
{
  public final void run()
  {
    c.a();
    Config.a(ConfigStorage.a("jupiter_download_https_enable", false));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.n
 * JD-Core Version:    0.6.0
 */