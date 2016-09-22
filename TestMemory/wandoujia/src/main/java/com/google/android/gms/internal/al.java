package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public final class al extends x<al>
{
  public String a;
  public boolean b;

  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("description", this.a);
    localHashMap.put("fatal", Boolean.valueOf(this.b));
    return a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.al
 * JD-Core Version:    0.6.0
 */