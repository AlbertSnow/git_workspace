package com.wandoujia.jupiter.paid.a;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import java.util.Map;

public abstract class c
{
  public static int a(String paramString1, int paramInt, String paramString2)
  {
    Map localMap = a(paramString2);
    if (localMap == null);
    String str;
    do
    {
      return paramInt;
      str = (String)localMap.get(paramString1);
    }
    while (str == null);
    try
    {
      int i = Integer.parseInt(str);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return paramInt;
  }

  public static String a(String paramString1, String paramString2)
  {
    Map localMap = a(paramString2);
    String str;
    if (localMap == null)
      str = "";
    do
    {
      return str;
      str = (String)localMap.get(paramString1);
    }
    while (str != null);
    return "";
  }

  private static Map<String, String> a(String paramString)
  {
    try
    {
      String str = android.support.v4.app.d.n(paramString);
      if (GlobalConfig.isDebug())
        Log.d("test", "config " + paramString + " => " + str, new Object[0]);
      Map localMap = (Map)new com.wandoujia.gson.c().a(str, new d().getType());
      return localMap;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static boolean a(String paramString1, boolean paramBoolean, String paramString2)
  {
    Map localMap = a(paramString2);
    if (localMap == null);
    String str;
    do
    {
      return paramBoolean;
      str = (String)localMap.get(paramString1);
      if (str.equals("true"))
        return true;
    }
    while (!str.equals("false"));
    return false;
  }

  public static long b(String paramString1, String paramString2)
  {
    Map localMap = a(paramString2);
    if (localMap == null)
      return 0L;
    String str = (String)localMap.get(paramString1);
    if (str == null)
      return 0L;
    try
    {
      long l = Long.parseLong(str);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0L;
  }

  public void a()
  {
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public void b(int paramInt1, int paramInt2)
  {
  }

  public void c(int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.a.c
 * JD-Core Version:    0.6.0
 */