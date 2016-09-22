package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.aq;
import com.google.android.gms.tagmanager.s<Lcom.google.android.gms.internal.a;>;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a
{
  private final String a;
  private final Set<aq> b = new HashSet();
  private final Map<aq, List<ap>> c = new HashMap();
  private final Map<aq, List<ap>> d = new HashMap();
  private final Map<aq, List<String>> e = new HashMap();
  private final Map<aq, List<String>> f = new HashMap();

  private static s<com.google.android.gms.internal.a> a(s<com.google.android.gms.internal.a> params)
  {
    try
    {
      s locals = new s(ah.a(b(ah.a((com.google.android.gms.internal.a)params.a()))), params.b());
      return locals;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      q.b();
    }
    return params;
  }

  static s<com.google.android.gms.internal.a> a(s<com.google.android.gms.internal.a> params, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    Object localObject1 = params;
    if (j < i)
    {
      int k = paramArrayOfInt[j];
      if ((ah.c((com.google.android.gms.internal.a)((s)localObject1).a()) instanceof String));
      switch (k)
      {
      default:
        q.a();
      case 12:
      }
      for (Object localObject2 = localObject1; ; localObject2 = a((s)localObject1))
      {
        j++;
        localObject1 = localObject2;
        break;
      }
    }
    return (s<com.google.android.gms.internal.a>)(s<com.google.android.gms.internal.a>)localObject1;
  }

  public static String a()
  {
    return null.a;
  }

  static void a(String paramString)
  {
    null.h().a(paramString);
  }

  public static int b()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      new StringBuilder("Invalid version number: ").append(Build.VERSION.SDK);
      q.a();
    }
    return 0;
  }

  static String b(String paramString)
  {
    return URLEncoder.encode(paramString, "UTF-8").replaceAll("\\+", "%20");
  }

  private x h()
  {
    monitorenter;
    monitorexit;
    return null;
  }

  public final Set<aq> c()
  {
    return this.b;
  }

  public final Map<aq, List<ap>> d()
  {
    return this.c;
  }

  public final Map<aq, List<String>> e()
  {
    return this.e;
  }

  public final Map<aq, List<String>> f()
  {
    return this.f;
  }

  public final Map<aq, List<ap>> g()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.a
 * JD-Core Version:    0.6.0
 */