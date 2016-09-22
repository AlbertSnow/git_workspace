package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.wandoujia.log.toolkit.LaunchLogger;
import com.wandoujia.nirvana.framework.network.a.a;
import com.wandoujia.p4.app.detail.model.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class Request<T>
  implements Comparable<Request<T>>
{
  private final o a;
  private final int b;
  private final String c;
  private final int d;
  private final j e;
  private Integer f;
  private i g;
  private boolean h;
  private boolean i;
  private boolean j;
  private long k;
  private m l;
  private LaunchLogger m;

  public Request(int paramInt, String paramString, j paramj)
  {
    if (o.a);
    for (o localo = new o(); ; localo = null)
    {
      this.a = localo;
      this.h = true;
      this.i = false;
      this.j = false;
      this.k = 0L;
      this.m = null;
      this.b = paramInt;
      this.c = paramString;
      this.e = paramj;
      this.l = new m();
      if (!TextUtils.isEmpty(paramString))
        break;
      this.d = 0;
      return;
    }
    Uri localUri = Uri.parse(paramString);
    if (localUri.getHost() == null)
    {
      this.d = 0;
      return;
    }
    this.d = localUri.getHost().hashCode();
  }

  protected static VolleyError a(VolleyError paramVolleyError)
  {
    return paramVolleyError;
  }

  private static byte[] a(Map<String, String> paramMap, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getKey(), paramString));
        localStringBuilder.append('=');
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getValue(), paramString));
        localStringBuilder.append('&');
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("Encoding not supported: " + paramString, localUnsupportedEncodingException);
    }
    byte[] arrayOfByte = localStringBuilder.toString().getBytes(paramString);
    return arrayOfByte;
  }

  public final int a()
  {
    return this.b;
  }

  protected abstract b<T> a(a parama);

  public final void a(int paramInt)
  {
    this.f = Integer.valueOf(paramInt);
  }

  public final void a(i parami)
  {
    this.g = parami;
  }

  public final void a(m paramm)
  {
    this.l = paramm;
  }

  public final void a(LaunchLogger paramLaunchLogger)
  {
    this.m = paramLaunchLogger;
  }

  protected abstract void a(T paramT);

  public final void a(String paramString)
  {
    if (o.a)
      this.a.a(paramString, Thread.currentThread().getId());
    do
      return;
    while (this.k != 0L);
    this.k = SystemClock.elapsedRealtime();
  }

  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public final int b()
  {
    return this.d;
  }

  public final void b(VolleyError paramVolleyError)
  {
    if (this.e != null)
      this.e.onErrorResponse(paramVolleyError);
  }

  final void b(String paramString)
  {
    if (this.g != null)
      this.g.b(this);
    long l2;
    if (o.a)
    {
      l2 = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper())
        new Handler(Looper.getMainLooper()).post(new h(this, paramString, l2));
    }
    long l1;
    do
    {
      return;
      this.a.a(paramString, l2);
      this.a.a(toString());
      return;
      l1 = SystemClock.elapsedRealtime() - this.k;
    }
    while (l1 < 3000L);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(l1);
    arrayOfObject[1] = toString();
    n.b("%d ms: %s", arrayOfObject);
  }

  public final String c()
  {
    return this.c;
  }

  public String d()
  {
    return this.c;
  }

  public final LaunchLogger e()
  {
    return this.m;
  }

  public final void f()
  {
    this.i = true;
  }

  public boolean g()
  {
    return this.i;
  }

  public Map<String, String> h()
  {
    return Collections.emptyMap();
  }

  public String i()
  {
    return l();
  }

  public byte[] j()
  {
    Map localMap = k();
    if ((localMap != null) && (localMap.size() > 0))
      return a(localMap, "UTF-8");
    return null;
  }

  protected Map<String, String> k()
  {
    return null;
  }

  public String l()
  {
    return "application/x-www-form-urlencoded; charset=UTF-8";
  }

  public byte[] m()
  {
    Map localMap = k();
    if ((localMap != null) && (localMap.size() > 0))
      return a(localMap, "UTF-8");
    return null;
  }

  public final boolean n()
  {
    return this.h;
  }

  public Request.Priority o()
  {
    return Request.Priority.NORMAL;
  }

  public final int p()
  {
    return this.l.a();
  }

  public final m q()
  {
    return this.l;
  }

  public final void r()
  {
    this.j = true;
  }

  public final boolean s()
  {
    return this.j;
  }

  public String toString()
  {
    String str1 = "0x" + Integer.toHexString(this.d);
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.i);
    for (String str2 = "[X] "; ; str2 = "[ ] ")
      return str2 + this.c + " " + str1 + " " + o() + " " + this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.Request
 * JD-Core Version:    0.6.0
 */