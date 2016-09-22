package com.google.android.gms.analytics;

import android.support.v4.app.d;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.w;
import com.google.android.gms.internal.r;
import com.google.android.gms.internal.z;
import com.wandoujia.p4.app_launcher.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class l extends u
{
  private boolean a;
  private final Map<String, String> b = new HashMap();
  private final Map<String, String> c = new HashMap();
  private final a d;
  private final n e;

  l(w paramw, String paramString)
  {
    super(paramw);
    if (paramString != null)
      this.b.put("&tid", paramString);
    this.b.put("useSecure", "1");
    this.b.put("&a", Integer.toString(1 + new Random().nextInt(2147483647)));
    this.d = new a("tracking", 0);
    this.e = new n(paramw);
  }

  private static String a(Map.Entry<String, String> paramEntry)
  {
    String str = (String)paramEntry.getKey();
    paramEntry.getValue();
    if ((!str.startsWith("&")) || (str.length() < 2));
    for (int i = 0; i == 0; i = 1)
      return null;
    return ((String)paramEntry.getKey()).substring(1);
  }

  private static void a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    d.a(paramMap2);
    if (paramMap1 == null);
    while (true)
    {
      return;
      Iterator localIterator = paramMap1.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = a(localEntry);
        if (str == null)
          continue;
        paramMap2.put(str, localEntry.getValue());
      }
    }
  }

  private static void b(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    d.a(paramMap2);
    if (paramMap1 == null);
    while (true)
    {
      return;
      Iterator localIterator = paramMap1.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = a(localEntry);
        if ((str == null) || (paramMap2.containsKey(str)))
          continue;
        paramMap2.put(str, localEntry.getValue());
      }
    }
  }

  protected final void a()
  {
    this.e.A();
    String str1 = r().c();
    if (str1 != null)
      a("&an", str1);
    String str2 = r().b();
    if (str2 != null)
      a("&av", str2);
  }

  public final void a(String paramString)
  {
    a("&cd", paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    d.a(paramString1, "Key should be non-null");
    if (TextUtils.isEmpty(paramString1))
      return;
    this.b.put(paramString1, paramString2);
  }

  public final void a(Map<String, String> paramMap)
  {
    long l = j().a();
    o();
    boolean bool1 = o().d();
    HashMap localHashMap = new HashMap();
    a(this.b, localHashMap);
    a(paramMap, localHashMap);
    boolean bool2 = com.google.android.gms.analytics.internal.m.d((String)this.b.get("useSecure"));
    b(this.c, localHashMap);
    this.c.clear();
    String str1 = (String)localHashMap.get("t");
    if (TextUtils.isEmpty(str1))
    {
      l().a(localHashMap, "Missing hit type parameter");
      return;
    }
    String str2 = (String)localHashMap.get("tid");
    if (TextUtils.isEmpty(str2))
    {
      l().a(localHashMap, "Missing tracking id parameter");
      return;
    }
    boolean bool3 = this.a;
    monitorenter;
    try
    {
      if (("screenview".equalsIgnoreCase(str1)) || ("pageview".equalsIgnoreCase(str1)) || ("appview".equalsIgnoreCase(str1)) || (TextUtils.isEmpty(str1)))
      {
        int i = 1 + Integer.parseInt((String)this.b.get("&a"));
        if (i >= 2147483647)
          i = 1;
        this.b.put("&a", Integer.toString(i));
      }
      monitorexit;
      n().a(new m(this, localHashMap, bool3, str1, l, bool1, bool2, str2));
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void b()
  {
    this.a = true;
  }

  public final void b(String paramString)
  {
    a("&cid", paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.l
 * JD-Core Version:    0.6.0
 */