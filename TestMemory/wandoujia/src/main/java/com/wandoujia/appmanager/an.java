package com.wandoujia.appmanager;

import android.os.HandlerThread;

final class an
{
  private static final HandlerThread a;

  static
  {
    HandlerThread localHandlerThread = new HandlerThread("installerThread");
    a = localHandlerThread;
    localHandlerThread.start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.an
 * JD-Core Version:    0.6.0
 */