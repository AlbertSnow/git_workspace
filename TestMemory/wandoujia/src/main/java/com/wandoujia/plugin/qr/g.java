package com.wandoujia.plugin.qr;

import java.util.concurrent.ThreadFactory;

final class g
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new Thread(paramRunnable);
    localThread.setDaemon(true);
    return localThread;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.g
 * JD-Core Version:    0.6.0
 */