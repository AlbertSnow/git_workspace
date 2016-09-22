package com.wandoujia.clean.b;

public final class b
{
  private static final String[] a = { "/xianguo/pad/cache/image2", "/wandoujia/music" };
  private static final String[] b = { "/android", "/android/data", "tencent", "/sina", "/miui", "/pictures", "/netease", "/dcim", "/baidu", "/appgame" };

  public static boolean a(String paramString)
  {
    String[] arrayOfString = a;
    for (int i = 0; ; i++)
    {
      int j = 0;
      if (i < 2)
      {
        if (!paramString.equalsIgnoreCase(arrayOfString[i]))
          continue;
        j = 1;
      }
      return j;
    }
  }

  public static boolean b(String paramString)
  {
    String[] arrayOfString = b;
    for (int i = 0; ; i++)
    {
      int j = 0;
      if (i < 10)
      {
        if (!paramString.equalsIgnoreCase(arrayOfString[i]))
          continue;
        j = 1;
      }
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.b.b
 * JD-Core Version:    0.6.0
 */