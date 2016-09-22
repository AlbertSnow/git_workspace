package com.wandoujia.base.utils;

public class HardwareUtil
{
  public static boolean isArmArch()
  {
    String str = System.getProperty("os.arch");
    if (str == null)
      return true;
    return str.toLowerCase().startsWith("arm");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.HardwareUtil
 * JD-Core Version:    0.6.0
 */