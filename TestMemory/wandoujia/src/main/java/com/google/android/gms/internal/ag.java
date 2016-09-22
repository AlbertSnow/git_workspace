package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ag extends x<ag>
{
  private String a;
  private String b;
  private String c;
  private String d;

  public final String a()
  {
    return this.a;
  }

  public final void a(ag paramag)
  {
    if (!TextUtils.isEmpty(this.a))
      paramag.a = this.a;
    if (!TextUtils.isEmpty(this.b))
      paramag.b = this.b;
    if (!TextUtils.isEmpty(this.c))
      paramag.c = this.c;
    if (!TextUtils.isEmpty(this.d))
      paramag.d = this.d;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final String b()
  {
    return this.b;
  }

  public final void b(String paramString)
  {
    this.b = paramString;
  }

  public final String c()
  {
    return this.c;
  }

  public final void c(String paramString)
  {
    this.c = paramString;
  }

  public final String d()
  {
    return this.d;
  }

  public final void d(String paramString)
  {
    this.d = paramString;
  }

  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appName", this.a);
    localHashMap.put("appVersion", this.b);
    localHashMap.put("appId", this.c);
    localHashMap.put("appInstallerId", this.d);
    return a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ag
 * JD-Core Version:    0.6.0
 */