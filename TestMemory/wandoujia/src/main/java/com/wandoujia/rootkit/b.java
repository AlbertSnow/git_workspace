package com.wandoujia.rootkit;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;

public final class b
{
  private static b a;
  private static com.wandoujia.rootkit.c.c b = null;
  private static int c = 0;
  private long d = -1L;
  private boolean e = false;
  private final boolean f;

  private b()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool;
    if (i != 14)
    {
      bool = false;
      if (i != 15);
    }
    else
    {
      bool = true;
    }
    this.f = bool;
  }

  public static b a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new b();
      b localb = a;
      return localb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void a(com.wandoujia.rootkit.c.c paramc)
  {
    b = paramc;
  }

  public static boolean b()
  {
    String[] arrayOfString = a.a;
    for (int i = 0; ; i++)
    {
      int j = 0;
      if (i < 6)
      {
        String str = arrayOfString[i];
        if (!new File(str + "/su").exists())
          continue;
        j = 1;
      }
      return j;
    }
  }

  public static boolean b(String paramString1, String paramString2)
  {
    new com.wandoujia.rootkit.c.b();
    return com.wandoujia.rootkit.c.b.a(paramString1, paramString2);
  }

  public static ArrayList<com.wandoujia.rootkit.a.a> d()
  {
    e();
    return com.wandoujia.rootkit.c.c.c();
  }

  private static final com.wandoujia.rootkit.c.c e()
  {
    if (b == null)
      com.wandoujia.rootkit.c.c.a();
    return b;
  }

  private static int f()
  {
    if (c >= 0)
      c = 1 + c;
    while (true)
    {
      return c;
      c = 0;
    }
  }

  public final com.wandoujia.rootkit.a.b a(String paramString)
  {
    monitorenter;
    while (true)
    {
      try
      {
        com.wandoujia.rootkit.a.b localb = new com.wandoujia.rootkit.a.b();
        if (!TextUtils.isEmpty(paramString))
          continue;
        localb.a(false);
        localb.a("Un-install package path is null or empty.");
        return localb;
        if (this.f)
        {
          str1 = "LD_LIBRARY_PATH=/vendor/lib:/system/lib pm uninstall ";
          String str2 = str1 + paramString;
          int i = f();
          d locald = new d(i, new String[] { str2 }, i, localb);
          com.wandoujia.rootkit.b.c.a().a(locald).c();
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      String str1 = "pm uninstall ";
    }
  }

  public final com.wandoujia.rootkit.a.b a(String paramString1, String paramString2)
  {
    monitorenter;
    while (true)
    {
      try
      {
        com.wandoujia.rootkit.a.b localb = new com.wandoujia.rootkit.a.b();
        if (!TextUtils.isEmpty(paramString1))
          continue;
        paramString1 = null;
        if (!TextUtils.isEmpty(paramString1))
          continue;
        localb.a(false);
        localb.a("Install package path is null or empty.");
        return localb;
        if ((!paramString1.contains("file://")) || (paramString1.length() <= 7))
          continue;
        paramString1 = paramString1.substring(7);
        continue;
        if (this.f)
        {
          localObject2 = "LD_LIBRARY_PATH=/vendor/lib:/system/lib pm install -r ";
          if (paramString2 == null)
            continue;
          if (!paramString2.equalsIgnoreCase("EXTERNAL"))
            break label196;
          localObject2 = (String)localObject2 + "-s ";
          String str2 = (String)localObject2 + "'" + paramString1 + "'";
          c localc = new c(f(), new String[] { str2 }, localb);
          com.wandoujia.rootkit.b.c.a().a(localc).c();
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      Object localObject2 = "pm install -r ";
      continue;
      label196: if (!paramString2.equalsIgnoreCase("INTERNAL"))
        continue;
      String str1 = (String)localObject2 + "-f ";
      localObject2 = str1;
    }
  }

  public final com.wandoujia.rootkit.a.b b(String paramString)
  {
    monitorenter;
    try
    {
      com.wandoujia.rootkit.a.b localb = new com.wandoujia.rootkit.a.b();
      if (TextUtils.isEmpty(paramString))
      {
        localb.a(false);
        localb.a("Command is empty.");
      }
      while (true)
      {
        return localb;
        int i = f();
        e locale = new e(i, new String[] { paramString }, i, localb);
        com.wandoujia.rootkit.b.c.a().a(locale).c();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final boolean c()
  {
    if (!this.e)
    {
      e();
      this.e = com.wandoujia.rootkit.c.c.b();
      this.d = System.currentTimeMillis();
    }
    while (true)
    {
      return this.e;
      if (System.currentTimeMillis() - this.d < 60000L)
        continue;
      e();
      this.e = com.wandoujia.rootkit.c.c.b();
      this.d = System.currentTimeMillis();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.rootkit.b
 * JD-Core Version:    0.6.0
 */