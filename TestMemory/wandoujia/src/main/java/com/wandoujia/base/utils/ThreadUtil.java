package com.wandoujia.base.utils;

public class ThreadUtil
{
  public static boolean isInterrupted()
  {
    return Thread.currentThread().isInterrupted();
  }

  public static void throwIfInterrupted()
  {
    if (Thread.currentThread().isInterrupted())
      throw new InterruptedException();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ThreadUtil
 * JD-Core Version:    0.6.0
 */