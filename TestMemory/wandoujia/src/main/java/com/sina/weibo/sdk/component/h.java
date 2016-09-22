package com.sina.weibo.sdk.component;

import android.text.TextUtils;
import com.sina.weibo.sdk.auth.c;
import java.util.HashMap;
import java.util.Map;

public final class h
{
  private static h a;
  private Map<String, c> b = new HashMap();
  private Map<String, n> c = new HashMap();

  public static h a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new h();
      h localh = a;
      return localh;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final c a(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      for (c localc = null; ; localc = (c)this.b.get(paramString))
        return localc;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(String paramString, c paramc)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if ((bool) || (paramc == null));
      while (true)
      {
        return;
        this.b.put(paramString, paramc);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(String paramString, n paramn)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if ((bool) || (paramn == null));
      while (true)
      {
        return;
        this.c.put(paramString, paramn);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void b(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      while (true)
      {
        return;
        this.b.remove(paramString);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final n c(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      for (n localn = null; ; localn = (n)this.c.get(paramString))
        return localn;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void d(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      while (true)
      {
        return;
        this.c.remove(paramString);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.h
 * JD-Core Version:    0.6.0
 */