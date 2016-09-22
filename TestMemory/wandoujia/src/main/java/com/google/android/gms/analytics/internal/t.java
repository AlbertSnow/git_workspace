package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.f;
import com.google.android.gms.internal.r;
import com.google.android.gms.internal.z;

public class t
{
  private final w a;

  protected t(w paramw)
  {
    d.a(paramw);
    this.a = paramw;
  }

  private static String a(Object paramObject)
  {
    if (paramObject == null)
      return "";
    if ((paramObject instanceof String))
      return (String)paramObject;
    if ((paramObject instanceof Boolean))
    {
      if (paramObject == Boolean.TRUE)
        return "true";
      return "false";
    }
    if ((paramObject instanceof Throwable))
      return ((Throwable)paramObject).toString();
    return paramObject.toString();
  }

  private void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    w localw = this.a;
    g localg = null;
    if (localw != null)
      localg = this.a.f();
    if (localg != null)
      localg.a(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    String str;
    do
    {
      return;
      str = (String)az.b.a();
    }
    while (!Log.isLoggable(str, paramInt));
    Log.println(paramInt, str, c(paramString, paramObject1, paramObject2, paramObject3));
  }

  protected static String c(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if (paramString == null)
      paramString = "";
    String str1 = a(paramObject1);
    String str2 = a(paramObject2);
    String str3 = a(paramObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    String str4 = "";
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(paramString);
      str4 = ": ";
    }
    if (!TextUtils.isEmpty(str1))
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str1);
      str4 = ", ";
    }
    if (!TextUtils.isEmpty(str2))
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str2);
      str4 = ", ";
    }
    if (!TextUtils.isEmpty(str3))
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str3);
    }
    return localStringBuilder.toString();
  }

  public static boolean x()
  {
    return Log.isLoggable((String)az.b.a(), 2);
  }

  public final void a(String paramString, Object paramObject)
  {
    a(2, paramString, paramObject, null, null);
  }

  public final void a(String paramString, Object paramObject1, Object paramObject2)
  {
    a(2, paramString, paramObject1, paramObject2, null);
  }

  public final void a(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    a(3, paramString, paramObject1, paramObject2, paramObject3);
  }

  public final void b(String paramString, Object paramObject)
  {
    a(3, paramString, paramObject, null, null);
  }

  public final void b(String paramString, Object paramObject1, Object paramObject2)
  {
    a(3, paramString, paramObject1, paramObject2, null);
  }

  public final void b(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    a(5, paramString, paramObject1, paramObject2, paramObject3);
  }

  public final void c(String paramString)
  {
    a(2, paramString, null, null, null);
  }

  public final void c(String paramString, Object paramObject)
  {
    a(4, paramString, paramObject, null, null);
  }

  public final void c(String paramString, Object paramObject1, Object paramObject2)
  {
    a(5, paramString, paramObject1, paramObject2, null);
  }

  public final void d(String paramString)
  {
    a(3, paramString, null, null, null);
  }

  public final void d(String paramString, Object paramObject)
  {
    a(5, paramString, paramObject, null, null);
  }

  public final void d(String paramString, Object paramObject1, Object paramObject2)
  {
    a(6, paramString, paramObject1, paramObject2, null);
  }

  public final void e(String paramString)
  {
    a(4, paramString, null, null, null);
  }

  public final void e(String paramString, Object paramObject)
  {
    a(6, paramString, paramObject, null, null);
  }

  public final void f(String paramString)
  {
    a(5, paramString, null, null, null);
  }

  public final void g(String paramString)
  {
    a(6, paramString, null, null, null);
  }

  public final w i()
  {
    return this.a;
  }

  protected final r j()
  {
    return this.a.c();
  }

  protected final Context k()
  {
    return this.a.a();
  }

  protected final g l()
  {
    return this.a.e();
  }

  protected final as m()
  {
    return this.a.d();
  }

  protected final z n()
  {
    return this.a.g();
  }

  public final f o()
  {
    return this.a.j();
  }

  protected final o p()
  {
    return this.a.h();
  }

  protected final ax q()
  {
    return this.a.i();
  }

  protected final n r()
  {
    return this.a.k();
  }

  protected final j s()
  {
    return this.a.l();
  }

  protected final am t()
  {
    return this.a.o();
  }

  protected final b u()
  {
    return this.a.n();
  }

  protected final ag v()
  {
    return this.a.p();
  }

  protected final aw w()
  {
    return this.a.q();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.t
 * JD-Core Version:    0.6.0
 */