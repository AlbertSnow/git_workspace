package com.wandoujia.appmanager;

import java.util.ArrayList;
import java.util.Map;

final class d
  implements Runnable
{
  d(AppManager paramAppManager, Map paramMap)
  {
  }

  public final void run()
  {
    AppManager.b(this.b, new ArrayList(this.a.keySet()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.d
 * JD-Core Version:    0.6.0
 */