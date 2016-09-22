package com.google.android.gms.analytics.internal;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class g extends u
{
  private static String a = "3";
  private static String b = "01VDIWEA?";
  private static g c;

  public g(w paramw)
  {
    super(paramw);
  }

  private static String a(Object paramObject)
  {
    if (paramObject == null)
      return null;
    if ((paramObject instanceof Integer));
    for (Object localObject = new Long(((Integer)paramObject).intValue()); ; localObject = paramObject)
    {
      if ((localObject instanceof Long))
      {
        if (Math.abs(((Long)localObject).longValue()) < 100L)
          return String.valueOf(localObject);
        if (String.valueOf(localObject).charAt(0) == '-');
        for (String str1 = "-"; ; str1 = "")
        {
          String str2 = String.valueOf(Math.abs(((Long)localObject).longValue()));
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(str1);
          localStringBuilder.append(Math.round(Math.pow(10.0D, -1 + str2.length())));
          localStringBuilder.append("...");
          localStringBuilder.append(str1);
          localStringBuilder.append(Math.round(Math.pow(10.0D, str2.length()) - 1.0D));
          return localStringBuilder.toString();
        }
      }
      if ((localObject instanceof Boolean))
        return String.valueOf(localObject);
      if ((localObject instanceof Throwable))
        return localObject.getClass().getCanonicalName();
      return "-";
    }
  }

  public static g b()
  {
    return c;
  }

  private void b(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    monitorenter;
    while (true)
    {
      try
      {
        android.support.v4.app.d.a(paramString);
        i = 0;
        if (paramInt >= 0)
          break label185;
        if (i >= b.length())
        {
          j = -1 + b.length();
          if (!m().a())
            continue;
          char c1 = 'C';
          String str = a + b.charAt(j) + c1 + v.a + ":" + c(paramString, a(paramObject1), a(paramObject2), a(paramObject3));
          if (str.length() <= 1024)
            continue;
          str = str.substring(0, 1024);
          j localj = i().m();
          if (localj == null)
            continue;
          localj.g().a(str);
          return;
          c1 = 'c';
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      int j = i;
      continue;
      label185: int i = paramInt;
    }
  }

  protected final void a()
  {
    monitorenter;
    try
    {
      c = this;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str = (String)az.b.a();
    if (Log.isLoggable(str, paramInt))
      Log.println(paramInt, str, c(paramString, paramObject1, paramObject2, paramObject3));
    if (paramInt >= 5)
      b(paramInt, paramString, paramObject1, paramObject2, paramObject3);
  }

  public final void a(d paramd, String paramString)
  {
    if (paramd != null);
    for (String str = paramd.toString(); ; str = "no hit data")
    {
      d("Discarding hit. " + paramString, str);
      return;
    }
  }

  public final void a(Map<String, String> paramMap, String paramString)
  {
    StringBuilder localStringBuilder;
    if (paramMap != null)
    {
      localStringBuilder = new StringBuilder();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (localStringBuilder.length() > 0)
          localStringBuilder.append(',');
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append((String)localEntry.getValue());
      }
    }
    for (String str = localStringBuilder.toString(); ; str = "no hit data")
    {
      d("Discarding hit. " + paramString, str);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.g
 * JD-Core Version:    0.6.0
 */