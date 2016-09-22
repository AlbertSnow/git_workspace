package com.alipay.wandoujia;

import android.content.Context;
import com.wandoujia.image.c.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class p
{
  private static p a;
  private Context b;
  private HashMap c = new HashMap();

  public static p a()
  {
    if (a == null)
    {
      p localp = new p();
      a = localp;
      localp.b = a.a().b();
    }
    return a;
  }

  protected final void a(l paraml)
  {
    if ((paraml == null) || (!paraml.g()));
    String str;
    do
    {
      return;
      str = paraml.getClass().getCanonicalName();
    }
    while (!this.c.containsKey(str));
    this.c.remove(str);
  }

  public final void a(String paramString)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (!"monitor".equals(paramString))
          continue;
        localObject2 = new q(this.b);
        if (localObject2 != null)
          break label64;
        return;
        if ("lbs".equals(paramString))
        {
          localObject2 = new o(this.b);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      Object localObject2 = null;
      continue;
      label64: String str = localObject2.getClass().getCanonicalName();
      if (!this.c.containsKey(str))
        this.c.put(str, localObject2);
      ((l)this.c.get(str)).a();
    }
  }

  public final void b()
  {
    monitorenter;
    try
    {
      Iterator localIterator = this.c.values().iterator();
      while (true)
      {
        boolean bool = localIterator.hasNext();
        if (!bool)
          return;
        l locall = (l)localIterator.next();
        if (locall == null)
          continue;
        try
        {
          locall.e();
        }
        catch (Exception localException)
        {
        }
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
 * Qualified Name:     com.alipay.wandoujia.p
 * JD-Core Version:    0.6.0
 */