package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public final class ao extends x<ao>
{
  public String a;
  public long b;
  public String c;
  public String d;

  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("variableName", this.a);
    localHashMap.put("timeInMillis", Long.valueOf(this.b));
    localHashMap.put("category", this.c);
    localHashMap.put("label", this.d);
    return a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ao
 * JD-Core Version:    0.6.0
 */