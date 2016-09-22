package com.unipay.d;

import java.io.File;

public final class e
{
  private static int a = -1;

  public static boolean a()
  {
    if (a == 0)
      return false;
    if (a == 1)
      return true;
    String[] arrayOfString = { "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/" };
    int i = 0;
    while (i < 5)
      try
      {
        if (new File(arrayOfString[i] + "su").exists())
        {
          a = 1;
          return true;
        }
        i++;
      }
      catch (Exception localException)
      {
      }
    a = 0;
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.d.e
 * JD-Core Version:    0.6.0
 */