package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public final class ak extends x<ak>
{
  private String a;
  private String b;
  private String c;
  private long d;

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final String c()
  {
    return this.c;
  }

  public final long d()
  {
    return this.d;
  }

  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("category", this.a);
    localHashMap.put("action", this.b);
    localHashMap.put("label", this.c);
    localHashMap.put("value", Long.valueOf(this.d));
    return a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ak
 * JD-Core Version:    0.6.0
 */