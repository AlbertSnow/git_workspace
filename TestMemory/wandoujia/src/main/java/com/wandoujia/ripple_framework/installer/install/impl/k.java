package com.wandoujia.ripple_framework.installer.install.impl;

import android.os.HandlerThread;

final class k
{
  private static final HandlerThread a;

  static
  {
    HandlerThread localHandlerThread = new HandlerThread("installerThread");
    a = localHandlerThread;
    localHandlerThread.start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.k
 * JD-Core Version:    0.6.0
 */