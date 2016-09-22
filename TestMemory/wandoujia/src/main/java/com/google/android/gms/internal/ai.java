package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public final class ai extends x<ai>
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  private String f;

  public final String a()
  {
    return this.f;
  }

  public final void a(String paramString)
  {
    this.f = paramString;
  }

  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("language", this.f);
    localHashMap.put("screenColors", Integer.valueOf(this.a));
    localHashMap.put("screenWidth", Integer.valueOf(this.b));
    localHashMap.put("screenHeight", Integer.valueOf(this.c));
    localHashMap.put("viewportWidth", Integer.valueOf(this.d));
    localHashMap.put("viewportHeight", Integer.valueOf(this.e));
    return a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ai
 * JD-Core Version:    0.6.0
 */