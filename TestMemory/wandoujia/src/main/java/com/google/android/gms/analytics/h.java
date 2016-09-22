package com.google.android.gms.analytics;

import android.support.v4.app.b;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class h<T extends h>
{
  private Map<String, String> a = new HashMap();
  private Map<String, List<a>> b = new HashMap();
  private List<c> c = new ArrayList();
  private List<a> d = new ArrayList();

  public final T a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      this.a.put(paramString1, paramString2);
      return this;
    }
    f.a(" HitBuilder.set() called with a null paramName.");
    return this;
  }

  public Map<String, String> a()
  {
    HashMap localHashMap = new HashMap(this.a);
    Iterator localIterator1 = this.c.iterator();
    for (int i = 1; localIterator1.hasNext(); i++)
      localHashMap.putAll(((c)localIterator1.next()).a(b.f(i)));
    Iterator localIterator2 = this.d.iterator();
    for (int j = 1; localIterator2.hasNext(); j++)
      localHashMap.putAll(((a)localIterator2.next()).a(b.d(j)));
    Iterator localIterator3 = this.b.entrySet().iterator();
    for (int k = 1; localIterator3.hasNext(); k++)
    {
      Map.Entry localEntry = (Map.Entry)localIterator3.next();
      List localList = (List)localEntry.getValue();
      String str = b.i(k);
      Iterator localIterator4 = localList.iterator();
      for (int m = 1; localIterator4.hasNext(); m++)
        localHashMap.putAll(((a)localIterator4.next()).a(str + b.h(m)));
      if (TextUtils.isEmpty((CharSequence)localEntry.getKey()))
        continue;
      localHashMap.put(str + "nm", localEntry.getKey());
    }
    return localHashMap;
  }

  public final T d(String paramString)
  {
    String str = m.e(paramString);
    if (TextUtils.isEmpty(str))
      return this;
    Map localMap = m.a(str);
    a("&cc", (String)localMap.get("utm_content"));
    a("&cm", (String)localMap.get("utm_medium"));
    a("&cn", (String)localMap.get("utm_campaign"));
    a("&cs", (String)localMap.get("utm_source"));
    a("&ck", (String)localMap.get("utm_term"));
    a("&ci", (String)localMap.get("utm_id"));
    a("&anid", (String)localMap.get("anid"));
    a("&gclid", (String)localMap.get("gclid"));
    a("&dclid", (String)localMap.get("dclid"));
    a("&aclid", (String)localMap.get("aclid"));
    a("&gmob_t", (String)localMap.get("gmob_t"));
    return this;
  }

  public final T e(String paramString)
  {
    a(b.m(), paramString);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.h
 * JD-Core Version:    0.6.0
 */