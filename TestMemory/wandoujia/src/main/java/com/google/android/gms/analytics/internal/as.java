package com.google.android.gms.analytics.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.support.v4.app.d;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class as
{
  private final w a;
  private Boolean b;
  private String c;
  private Set<Integer> d;

  protected as(w paramw)
  {
    d.a(paramw);
    this.a = paramw;
  }

  public static boolean b()
  {
    return ((Boolean)az.a.a()).booleanValue();
  }

  public static int c()
  {
    return ((Integer)az.r.a()).intValue();
  }

  public static long d()
  {
    return ((Long)az.f.a()).longValue();
  }

  public static long e()
  {
    return ((Long)az.g.a()).longValue();
  }

  public static int f()
  {
    return ((Integer)az.i.a()).intValue();
  }

  public static int g()
  {
    return ((Integer)az.j.a()).intValue();
  }

  public static String h()
  {
    return (String)az.l.a();
  }

  public static String i()
  {
    return (String)az.k.a();
  }

  public static String j()
  {
    return (String)az.m.a();
  }

  public static long l()
  {
    return ((Long)az.y.a()).longValue();
  }

  public final boolean a()
  {
    if (this.b == null)
      monitorenter;
    try
    {
      if (this.b == null)
      {
        Context localContext = this.a.a();
        ApplicationInfo localApplicationInfo = localContext.getApplicationInfo();
        if (localApplicationInfo != null)
        {
          String str = localApplicationInfo.processName;
          ActivityManager localActivityManager = (ActivityManager)localContext.getSystemService("activity");
          if (localActivityManager != null)
          {
            int i = Process.myPid();
            Iterator localIterator = localActivityManager.getRunningAppProcesses().iterator();
            while (localIterator.hasNext())
            {
              ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
              if (i != localRunningAppProcessInfo.pid)
                continue;
              if ((str == null) || (!str.equals(localRunningAppProcessInfo.processName)))
                break label170;
            }
          }
        }
      }
      label170: for (boolean bool = true; ; bool = false)
      {
        this.b = Boolean.valueOf(bool);
        if (this.b == null)
        {
          this.b = Boolean.TRUE;
          this.a.e().g("My process not in the list of running processes");
        }
        return this.b.booleanValue();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Set<Integer> k()
  {
    String str1 = (String)az.u.a();
    String[] arrayOfString;
    HashSet localHashSet;
    int i;
    int j;
    if ((this.d == null) || (this.c == null) || (!this.c.equals(str1)))
    {
      arrayOfString = TextUtils.split(str1, ",");
      localHashSet = new HashSet();
      i = arrayOfString.length;
      j = 0;
    }
    while (true)
    {
      String str2;
      if (j < i)
        str2 = arrayOfString[j];
      try
      {
        localHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        label85: j++;
        continue;
        this.c = str1;
        this.d = localHashSet;
        return this.d;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        break label85;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.as
 * JD-Core Version:    0.6.0
 */