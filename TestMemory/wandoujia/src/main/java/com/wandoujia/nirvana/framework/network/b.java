package com.wandoujia.nirvana.framework.network;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v7.app.f;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Request.Priority;
import com.android.volley.i;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.m;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.log.toolkit.LaunchLogger;
import com.wandoujia.p4.utils.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class b<T> extends Request<T>
{
  private final a a;
  private final k<T> b;
  private boolean c;
  private boolean d;
  private String e;
  private c f;
  private String g;
  private Map<String, String> h;
  private Map<String, String> i;
  private List<f<T>> j;
  private String[] k;

  public b(int paramInt, String paramString, Map<String, String> paramMap, a parama, k<T> paramk, j paramj)
  {
    super(paramInt, a(paramInt, paramString, paramMap, a.b()), paramj);
    this.g = paramString;
    this.h = paramMap;
    this.a = parama;
    this.b = paramk;
    this.c = false;
    this.d = true;
    a(new m(6000, 1, 1.0F));
  }

  private static String a(int paramInt, String paramString, Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    while ((paramMap2 == null) || (paramMap2.isEmpty()))
    {
      return paramString;
      paramMap2 = a(paramMap1, paramMap2);
    }
    Uri localUri = Uri.parse(paramString);
    Uri.Builder localBuilder = localUri.buildUpon();
    Iterator localIterator = paramMap2.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localUri.getQueryParameter((String)localEntry.getKey()) != null)
        continue;
      localBuilder.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    return localBuilder.toString();
  }

  private static Map<String, String> a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    HashMap localHashMap = new HashMap();
    if (paramMap2 != null)
      localHashMap.putAll(paramMap2);
    if (paramMap1 != null)
      localHashMap.putAll(paramMap1);
    return localHashMap;
  }

  protected final com.wandoujia.p4.app.detail.model.b<T> a(com.wandoujia.nirvana.framework.network.a.a parama)
  {
    Object localObject;
    try
    {
      localObject = b(parama);
      if (this.j != null)
      {
        Iterator localIterator = this.j.iterator();
        while (localIterator.hasNext())
          localIterator.next();
      }
    }
    catch (Throwable localThrowable)
    {
      Log.printStackTrace(localThrowable);
      ParseError localParseError = new ParseError(parama);
      localParseError.initCause(localThrowable);
      return com.wandoujia.p4.app.detail.model.b.a(localParseError);
    }
    if ((parama != null) && (n()))
      if (a() != 0)
        break label152;
    while (true)
    {
      return com.wandoujia.p4.app.detail.model.b.a(localObject, localLaunchLogger);
      if (this.f == null)
      {
        localLaunchLogger = android.support.v4.app.d.a(parama);
        continue;
      }
      LaunchLogger localLaunchLogger = android.support.v4.app.d.a(parama);
      long l = System.currentTimeMillis();
      localLaunchLogger.e = (300000L + l);
      localLaunchLogger.d = (l + 604800000L);
      continue;
      label152: localLaunchLogger = null;
    }
  }

  public final void a(f<T> paramf)
  {
    if (this.j == null)
      this.j = new ArrayList();
    this.j.add(paramf);
  }

  public final void a(c paramc)
  {
    this.f = paramc;
  }

  protected final void a(T paramT)
  {
    if (this.b == null);
    do
      return;
    while ((!this.d) && (this.c));
    this.b.onResponse(paramT);
    this.c = true;
  }

  public final void a(String paramString1, String paramString2)
  {
    if (this.i == null)
      this.i = new HashMap();
    this.i.put(paramString1, paramString2);
  }

  public final void a(String[] paramArrayOfString)
  {
    this.k = paramArrayOfString;
  }

  protected abstract T b(com.wandoujia.nirvana.framework.network.a.a parama);

  public final void b(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public final String d()
  {
    if (a() != 0)
      return super.d();
    if (this.e == null)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = null;
      arrayOfObject[1] = this.g;
      this.e = String.format("%s#%s", arrayOfObject);
      if (this.h != null)
        if (this.k == null)
          break label192;
    }
    label192: for (List localList = Arrays.asList(this.k); ; localList = null)
    {
      Iterator localIterator = this.h.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((!CollectionUtils.isEmpty(localList)) && (localList.contains(localEntry.getKey())))
          continue;
        this.e = (this.e + "#" + (String)localEntry.getKey() + "=" + (String)localEntry.getValue());
      }
      return this.e;
    }
  }

  public final Map<String, String> h()
  {
    HashMap localHashMap1 = new HashMap();
    a locala = this.a;
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("Cookie", "wdj_auth=" + com.wandoujia.account.a.i() + ";" + s.a().b());
    localHashMap2.put("Accept", "application/x-protobuf");
    localHashMap2.put("User-agent", "jupiter");
    localHashMap2.put("Https-download", "true");
    Log.e(locala.getClass().getName(), "wdj_auth=" + com.wandoujia.account.a.i(), new Object[0]);
    localHashMap1.putAll(localHashMap2);
    if (this.i != null)
      localHashMap1.putAll(this.i);
    return localHashMap1;
  }

  public final Map<String, String> k()
  {
    return a(this.h, a.b());
  }

  public final Request.Priority o()
  {
    return super.o();
  }

  public final void t()
  {
    d locald = new d(this.a.a().b(), d());
    this.a.a().a(locald);
  }

  public final void u()
  {
    this.a.a().a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.b
 * JD-Core Version:    0.6.0
 */