package com.wandoujia.base.utils;

import android.content.Context;

public class Phoenix2Util
{
  private static final String PHOENIX2_PREFIX = "com.wandoujia.phoenix2";

  public static boolean isPhoenix2(String paramString)
  {
    return (paramString != null) && (paramString.startsWith("com.wandoujia.phoenix2"));
  }

  public static String resolvePhoenix2PackageName(Context paramContext)
  {
    return "com.wandoujia.phoenix2";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.Phoenix2Util
 * JD-Core Version:    0.6.0
 */