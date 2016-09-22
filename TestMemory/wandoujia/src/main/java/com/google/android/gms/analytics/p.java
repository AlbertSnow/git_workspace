package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.internal.af;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.aj;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.an;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.e;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import java.util.Set;

public final class p extends t
  implements af
{
  private static DecimalFormat a;
  private final com.google.android.gms.analytics.internal.w b;
  private final String c;
  private final Uri d;

  public p(com.google.android.gms.analytics.internal.w paramw, String paramString)
  {
    this(paramw, paramString, 0);
  }

  private p(com.google.android.gms.analytics.internal.w paramw, String paramString, byte paramByte)
  {
    super(paramw);
    android.support.v4.app.d.i(paramString);
    this.b = paramw;
    this.c = paramString;
    this.d = a(this.c);
  }

  static Uri a(String paramString)
  {
    android.support.v4.app.d.i(paramString);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }

  private static String a(double paramDouble)
  {
    if (a == null)
      a = new DecimalFormat("0.######");
    return a.format(paramDouble);
  }

  private static void a(Map<String, String> paramMap, String paramString, double paramDouble)
  {
    if (paramDouble != 0.0D)
      paramMap.put(paramString, a(paramDouble));
  }

  private static void a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
      paramMap.put(paramString, paramInt1 + "x" + paramInt2);
  }

  private static void a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2))
      paramMap.put(paramString1, paramString2);
  }

  private static void a(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      paramMap.put(paramString, "1");
  }

  private static Map<String, String> b(com.google.android.gms.internal.w paramw)
  {
    HashMap localHashMap = new HashMap();
    e locale = (e)paramw.a(e.class);
    if (locale != null)
    {
      Iterator localIterator8 = locale.a().entrySet().iterator();
      label211: 
      while (localIterator8.hasNext())
      {
        Map.Entry localEntry5 = (Map.Entry)localIterator8.next();
        Object localObject1 = localEntry5.getValue();
        Object localObject2;
        if (localObject1 == null)
          localObject2 = null;
        while (true)
        {
          if (localObject2 == null)
            break label211;
          localHashMap.put(localEntry5.getKey(), localObject2);
          break;
          if ((localObject1 instanceof String))
          {
            localObject2 = (String)localObject1;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
              continue;
            localObject2 = null;
            continue;
          }
          if ((localObject1 instanceof Double))
          {
            Double localDouble = (Double)localObject1;
            if (localDouble.doubleValue() != 0.0D)
            {
              localObject2 = a(localDouble.doubleValue());
              continue;
            }
            localObject2 = null;
            continue;
          }
          if ((localObject1 instanceof Boolean))
          {
            if (localObject1 != Boolean.FALSE)
            {
              localObject2 = "1";
              continue;
            }
            localObject2 = null;
            continue;
          }
          localObject2 = String.valueOf(localObject1);
        }
      }
    }
    com.google.android.gms.internal.f localf = (com.google.android.gms.internal.f)paramw.a(com.google.android.gms.internal.f.class);
    if (localf != null)
    {
      a(localHashMap, "t", localf.a());
      a(localHashMap, "cid", localf.b());
      a(localHashMap, "uid", localf.c());
      a(localHashMap, "sc", localf.f());
      a(localHashMap, "sf", localf.i());
      a(localHashMap, "ni", localf.g());
      a(localHashMap, "adid", localf.d());
      a(localHashMap, "ate", localf.e());
    }
    am localam = (am)paramw.a(am.class);
    if (localam != null)
    {
      a(localHashMap, "cd", localam.a());
      a(localHashMap, "a", localam.b());
      a(localHashMap, "dr", localam.c());
    }
    ak localak = (ak)paramw.a(ak.class);
    if (localak != null)
    {
      a(localHashMap, "ec", localak.a());
      a(localHashMap, "ea", localak.b());
      a(localHashMap, "el", localak.c());
      a(localHashMap, "ev", localak.d());
    }
    ah localah = (ah)paramw.a(ah.class);
    if (localah != null)
    {
      a(localHashMap, "cn", localah.a());
      a(localHashMap, "cs", localah.b());
      a(localHashMap, "cm", localah.c());
      a(localHashMap, "ck", localah.d());
      a(localHashMap, "cc", localah.e());
      a(localHashMap, "ci", localah.f());
      a(localHashMap, "anid", localah.g());
      a(localHashMap, "gclid", localah.h());
      a(localHashMap, "dclid", localah.i());
      a(localHashMap, "aclid", localah.j());
    }
    al localal = (al)paramw.a(al.class);
    if (localal != null)
    {
      a(localHashMap, "exd", localal.a);
      a(localHashMap, "exf", localal.b);
    }
    an localan = (an)paramw.a(an.class);
    if (localan != null)
    {
      a(localHashMap, "sn", localan.a);
      a(localHashMap, "sa", localan.b);
      a(localHashMap, "st", localan.c);
    }
    ao localao = (ao)paramw.a(ao.class);
    if (localao != null)
    {
      a(localHashMap, "utv", localao.a);
      a(localHashMap, "utt", localao.b);
      a(localHashMap, "utc", localao.c);
      a(localHashMap, "utl", localao.d);
    }
    com.google.android.gms.internal.c localc = (com.google.android.gms.internal.c)paramw.a(com.google.android.gms.internal.c.class);
    if (localc != null)
    {
      Iterator localIterator7 = localc.a().entrySet().iterator();
      while (localIterator7.hasNext())
      {
        Map.Entry localEntry4 = (Map.Entry)localIterator7.next();
        String str3 = android.support.v4.app.b.b(((Integer)localEntry4.getKey()).intValue());
        if (TextUtils.isEmpty(str3))
          continue;
        localHashMap.put(str3, localEntry4.getValue());
      }
    }
    com.google.android.gms.internal.d locald = (com.google.android.gms.internal.d)paramw.a(com.google.android.gms.internal.d.class);
    if (locald != null)
    {
      Iterator localIterator6 = locald.a().entrySet().iterator();
      while (localIterator6.hasNext())
      {
        Map.Entry localEntry3 = (Map.Entry)localIterator6.next();
        String str2 = android.support.v4.app.b.c(((Integer)localEntry3.getKey()).intValue());
        if (TextUtils.isEmpty(str2))
          continue;
        localHashMap.put(str2, a(((Double)localEntry3.getValue()).doubleValue()));
      }
    }
    aj localaj = (aj)paramw.a(aj.class);
    if (localaj != null)
    {
      if (localaj.a() != null)
      {
        Iterator localIterator5 = new HashMap(null).entrySet().iterator();
        while (localIterator5.hasNext())
        {
          Map.Entry localEntry2 = (Map.Entry)localIterator5.next();
          if (((String)localEntry2.getKey()).startsWith("&"))
          {
            localHashMap.put(((String)localEntry2.getKey()).substring(1), localEntry2.getValue());
            continue;
          }
          localHashMap.put(localEntry2.getKey(), localEntry2.getValue());
        }
      }
      Iterator localIterator1 = localaj.d().iterator();
      for (int i = 1; localIterator1.hasNext(); i++)
        localHashMap.putAll(((com.google.android.gms.analytics.a.c)localIterator1.next()).a(android.support.v4.app.b.g(i)));
      Iterator localIterator2 = localaj.b().iterator();
      for (int j = 1; localIterator2.hasNext(); j++)
        localHashMap.putAll(((a)localIterator2.next()).a(android.support.v4.app.b.e(j)));
      Iterator localIterator3 = localaj.c().entrySet().iterator();
      for (int k = 1; localIterator3.hasNext(); k++)
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator3.next();
        List localList = (List)localEntry1.getValue();
        String str1 = android.support.v4.app.b.j(k);
        Iterator localIterator4 = localList.iterator();
        for (int m = 1; localIterator4.hasNext(); m++)
          localHashMap.putAll(((a)localIterator4.next()).a(str1 + android.support.v4.app.b.h(m)));
        if (TextUtils.isEmpty((CharSequence)localEntry1.getKey()))
          continue;
        localHashMap.put(str1 + "nm", localEntry1.getKey());
      }
    }
    ai localai = (ai)paramw.a(ai.class);
    if (localai != null)
    {
      a(localHashMap, "ul", localai.a());
      a(localHashMap, "sd", localai.a);
      a(localHashMap, "sr", localai.b, localai.c);
      a(localHashMap, "vp", localai.d, localai.e);
    }
    ag localag = (ag)paramw.a(ag.class);
    if (localag != null)
    {
      a(localHashMap, "an", localag.a());
      a(localHashMap, "aid", localag.c());
      a(localHashMap, "aiid", localag.d());
      a(localHashMap, "av", localag.b());
    }
    return (Map<String, String>)localHashMap;
  }

  public final Uri a()
  {
    return this.d;
  }

  public final void a(com.google.android.gms.internal.w paramw)
  {
    android.support.v4.app.d.a(paramw);
    android.support.v4.app.d.b(paramw.f(), "Can't deliver not submitted measurement");
    android.support.v4.app.d.k("deliver should be called on worker thread");
    com.google.android.gms.internal.w localw = paramw.a();
    com.google.android.gms.internal.f localf = (com.google.android.gms.internal.f)localw.b(com.google.android.gms.internal.f.class);
    if (TextUtils.isEmpty(localf.a()))
    {
      l().a(b(localw), "Ignoring measurement without type");
      return;
    }
    if (TextUtils.isEmpty(localf.b()))
    {
      l().a(b(localw), "Ignoring measurement without client id");
      return;
    }
    this.b.j();
    double d1 = localf.i();
    if (m.a(d1, localf.b()))
    {
      b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
      return;
    }
    Map localMap = b(localw);
    localMap.put("v", "1");
    localMap.put("_v", v.b);
    localMap.put("tid", this.c);
    if (this.b.j().d())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (localStringBuilder.length() != 0)
          localStringBuilder.append(", ");
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append("=");
        localStringBuilder.append((String)localEntry.getValue());
      }
      c("Dry run is enabled. GoogleAnalytics would have sent", localStringBuilder.toString());
      return;
    }
    HashMap localHashMap = new HashMap();
    m.a(localHashMap, "uid", localf.c());
    ag localag = (ag)paramw.a(ag.class);
    if (localag != null)
    {
      m.a(localHashMap, "an", localag.a());
      m.a(localHashMap, "aid", localag.c());
      m.a(localHashMap, "av", localag.b());
      m.a(localHashMap, "aiid", localag.d());
    }
    String str1 = localf.b();
    String str2 = this.c;
    if (!TextUtils.isEmpty(localf.d()));
    for (boolean bool = true; ; bool = false)
    {
      com.wandoujia.p4.app_launcher.manager.b localb = new com.wandoujia.p4.app_launcher.manager.b(str1, str2, bool, 0L, localHashMap);
      localMap.put("_s", String.valueOf(p().a(localb)));
      com.google.android.gms.analytics.internal.d locald = new com.google.android.gms.analytics.internal.d(l(), localMap, paramw.d(), true);
      p().a(locald);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.p
 * JD-Core Version:    0.6.0
 */