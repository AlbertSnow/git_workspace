package com.google.android.gms.analytics.a;

import com.google.android.gms.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  private Map<String, String> a = new HashMap();

  public final Map<String, String> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(paramString + (String)localEntry.getKey(), localEntry.getValue());
    }
    return localHashMap;
  }

  public final String toString()
  {
    return x.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.a.c
 * JD-Core Version:    0.6.0
 */