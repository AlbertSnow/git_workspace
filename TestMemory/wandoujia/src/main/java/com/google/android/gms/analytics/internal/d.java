package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private final Map<String, String> a;
  private final List<Command> b;
  private final long c;
  private final long d;
  private final int e;
  private final boolean f;
  private final String g;

  public d(t paramt, Map<String, String> paramMap, long paramLong, boolean paramBoolean)
  {
    this(paramt, paramMap, paramLong, paramBoolean, 0L, 0, null);
  }

  public d(t paramt, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(paramt, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }

  private d(t paramt, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List<Command> paramList)
  {
    android.support.v4.app.d.a(paramt);
    android.support.v4.app.d.a(paramMap);
    this.d = paramLong1;
    this.f = paramBoolean;
    this.c = paramLong2;
    this.e = paramInt;
    if (paramList != null);
    HashMap localHashMap;
    for (Object localObject = paramList; ; localObject = Collections.EMPTY_LIST)
    {
      this.b = ((List)localObject);
      this.g = a(paramList);
      localHashMap = new HashMap();
      Iterator localIterator1 = paramMap.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
        if (!a(localEntry2.getKey()))
          continue;
        String str2 = a(paramt, localEntry2.getKey());
        if (str2 == null)
          continue;
        localHashMap.put(str2, b(paramt, localEntry2.getValue()));
      }
    }
    Iterator localIterator2 = paramMap.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      if (a(localEntry1.getKey()))
        continue;
      String str1 = a(paramt, localEntry1.getKey());
      if (str1 == null)
        continue;
      localHashMap.put(str1, b(paramt, localEntry1.getValue()));
    }
    if (!TextUtils.isEmpty(this.g))
    {
      m.a(localHashMap, "_v", this.g);
      if ((this.g.equals("ma4.0.0")) || (this.g.equals("ma4.0.1")))
        localHashMap.remove("adid");
    }
    this.a = Collections.unmodifiableMap(localHashMap);
  }

  public static d a(t paramt, d paramd, Map<String, String> paramMap)
  {
    return new d(paramt, paramMap, paramd.d, paramd.f, paramd.c, paramd.e, paramd.b);
  }

  private static String a(t paramt, Object paramObject)
  {
    String str;
    if (paramObject == null)
      str = null;
    do
    {
      return str;
      str = paramObject.toString();
      if (str.startsWith("&"))
        str = str.substring(1);
      int i = str.length();
      if (i <= 256)
        continue;
      str = str.substring(0, 256);
      paramt.c("Hit param name is too long and will be trimmed", Integer.valueOf(i), str);
    }
    while (!TextUtils.isEmpty(str));
    return null;
  }

  private String a(String paramString1, String paramString2)
  {
    android.support.v4.app.d.i(paramString1);
    if (!paramString1.startsWith("&"));
    for (boolean bool = true; ; bool = false)
    {
      android.support.v4.app.d.b(bool, "Short param name required");
      String str = (String)this.a.get(paramString1);
      if (str == null)
        break;
      return str;
    }
    return paramString2;
  }

  private static String a(List<Command> paramList)
  {
    Command localCommand;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localCommand = (Command)localIterator.next();
      }
      while (!"appendVersion".equals(localCommand.a()));
    }
    for (String str = localCommand.b(); ; str = null)
    {
      if (TextUtils.isEmpty(str))
        return null;
      return str;
    }
  }

  private static boolean a(Object paramObject)
  {
    if (paramObject == null)
      return false;
    return paramObject.toString().startsWith("&");
  }

  private static String b(t paramt, Object paramObject)
  {
    if (paramObject == null);
    for (String str = ""; ; str = paramObject.toString())
    {
      int i = str.length();
      if (i > 8192)
      {
        str = str.substring(0, 8192);
        paramt.c("Hit param value is too long and will be trimmed", Integer.valueOf(i), str);
      }
      return str;
    }
  }

  public final int a()
  {
    return this.e;
  }

  public final Map<String, String> b()
  {
    return this.a;
  }

  public final long c()
  {
    return this.c;
  }

  public final long d()
  {
    return this.d;
  }

  public final boolean e()
  {
    return this.f;
  }

  public final long f()
  {
    return m.c(a("_s", "0"));
  }

  public final String g()
  {
    return a("_m", "");
  }

  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ht=").append(this.d);
    if (this.c != 0L)
      localStringBuffer.append(", dbId=").append(this.c);
    if (this.e != 0L)
      localStringBuffer.append(", appUID=").append(this.e);
    ArrayList localArrayList = new ArrayList(this.a.keySet());
    Collections.sort(localArrayList);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuffer.append(", ");
      localStringBuffer.append(str);
      localStringBuffer.append("=");
      localStringBuffer.append((String)this.a.get(str));
    }
    return localStringBuffer.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.d
 * JD-Core Version:    0.6.0
 */