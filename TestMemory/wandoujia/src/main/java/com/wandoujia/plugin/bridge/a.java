package com.wandoujia.plugin.bridge;

import android.content.SharedPreferences;
import android.content.res.Resources;

public abstract class a
{
  private static a a;

  public static void a(a parama)
  {
    monitorenter;
    try
    {
      a = parama;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public static a c()
  {
    monitorenter;
    try
    {
      a locala = a;
      monitorexit;
      return locala;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public abstract SharedPreferences a();

  public abstract Resources b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.bridge.a
 * JD-Core Version:    0.6.0
 */