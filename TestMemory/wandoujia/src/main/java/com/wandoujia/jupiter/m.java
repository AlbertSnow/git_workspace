package com.wandoujia.jupiter;

import com.wandoujia.appmanager.AppManager;
import com.wandoujia.ripple_framework.AppMd5Manager;

final class m
  implements Runnable
{
  m(l paraml)
  {
  }

  public final void run()
  {
    AppMd5Manager localAppMd5Manager = (AppMd5Manager)this.a.a.a("app_md5");
    AppManager localAppManager = (AppManager)this.a.a.a("app");
    localAppMd5Manager.a();
    localAppManager.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.m
 * JD-Core Version:    0.6.0
 */