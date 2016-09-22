package com.wandoujia.ripple_framework;

import android.text.TextUtils;
import com.wandoujia.gson.c;

class f
{
  private final long a;
  private final String b;
  private final long c;

  public f()
  {
    this(null, 0L, 0L);
  }

  public f(String paramString, long paramLong1, long paramLong2)
  {
    this.a = paramLong1;
    this.b = paramString;
    this.c = paramLong2;
  }

  public static f a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      f localf2 = (f)new c().a(paramString, f.class);
      return localf2;
    }
    catch (Exception localException)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        String[] arrayOfString = paramString.split(",");
        if (arrayOfString.length == 3)
        {
          String str = arrayOfString[1];
          try
          {
            f localf1 = new f(str, Long.parseLong(arrayOfString[0]), 0L);
            return localf1;
          }
          catch (NumberFormatException localNumberFormatException)
          {
          }
        }
      }
    }
    return null;
  }

  public String toString()
  {
    return new c().a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.f
 * JD-Core Version:    0.6.0
 */