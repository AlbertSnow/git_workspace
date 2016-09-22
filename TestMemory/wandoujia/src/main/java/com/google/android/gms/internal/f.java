package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public final class f extends x<f>
{
  private String a;
  private String b;
  private String c;
  private String d;
  private boolean e;
  private String f;
  private boolean g;
  private double h;

  public final String a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
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

  public final boolean e()
  {
    return this.e;
  }

  public final String f()
  {
    return this.f;
  }

  public final boolean g()
  {
    return this.g;
  }

  public final void h()
  {
    this.g = true;
  }

  public final double i()
  {
    return this.h;
  }

  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hitType", this.a);
    localHashMap.put("clientId", this.b);
    localHashMap.put("userId", this.c);
    localHashMap.put("androidAdId", this.d);
    localHashMap.put("AdTargetingEnabled", Boolean.valueOf(this.e));
    localHashMap.put("sessionControl", this.f);
    localHashMap.put("nonInteraction", Boolean.valueOf(this.g));
    localHashMap.put("sampleRate", Double.valueOf(this.h));
    return a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.f
 * JD-Core Version:    0.6.0
 */