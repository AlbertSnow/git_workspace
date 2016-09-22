package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.Collection;

@a
public abstract class d
{
  final String a;
  public final Object b;

  d(int paramInt, String paramString, Object paramObject)
  {
    this.a = paramString;
    this.b = paramObject;
    bc.a().m.a.add(this);
  }

  public static d a(int paramInt, String paramString)
  {
    d locald = a(paramInt, paramString, null);
    bc.a().m.b.add(locald);
    return locald;
  }

  public static d a(int paramInt1, String paramString, int paramInt2)
  {
    return new f(paramInt1, paramString, Integer.valueOf(paramInt2));
  }

  public static d a(int paramInt, String paramString, long paramLong)
  {
    return new g(paramInt, paramString, Long.valueOf(paramLong));
  }

  public static d a(int paramInt, String paramString, Boolean paramBoolean)
  {
    return new e(paramInt, paramString, paramBoolean);
  }

  public static d a(int paramInt, String paramString1, String paramString2)
  {
    return new h(paramInt, paramString1, paramString2);
  }

  public static d b(int paramInt, String paramString)
  {
    d locald = a(paramInt, paramString, null);
    bc.a().m.c.add(locald);
    return locald;
  }

  public final Object a()
  {
    return bc.a().n.a(this);
  }

  protected abstract Object a(SharedPreferences paramSharedPreferences);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.config.d
 * JD-Core Version:    0.6.0
 */