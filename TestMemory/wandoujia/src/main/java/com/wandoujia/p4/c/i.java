package com.wandoujia.p4.c;

import java.util.HashMap;
import java.util.Map;

final class i
{
  private static Map<String, h> a = new HashMap();

  private static <T> h<T> b(String paramString)
  {
    monitorenter;
    try
    {
      h localh = (h)a.get(paramString);
      if (localh == null)
        localh = new h();
      a.put(paramString, localh);
      return localh;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.c.i
 * JD-Core Version:    0.6.0
 */