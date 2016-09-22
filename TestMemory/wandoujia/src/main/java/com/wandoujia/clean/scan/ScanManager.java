package com.wandoujia.clean.scan;

import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.p4.utils.x;

public final class ScanManager
{
  private volatile boolean a = false;

  static
  {
    new ScanManager();
  }

  private ScanManager()
  {
    new x();
    new CachedThreadPoolExecutorWithCapacity(2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.scan.ScanManager
 * JD-Core Version:    0.6.0
 */