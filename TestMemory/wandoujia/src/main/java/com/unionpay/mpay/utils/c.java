package com.unionpay.mpay.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class c
{
  private static SimpleDateFormat a = new SimpleDateFormat("yyyyMMddhhmmss");

  public static String a()
  {
    return a.format(new Date(System.currentTimeMillis()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.utils.c
 * JD-Core Version:    0.6.0
 */