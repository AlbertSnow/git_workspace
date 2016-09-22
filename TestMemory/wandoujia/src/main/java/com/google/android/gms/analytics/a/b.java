package com.google.android.gms.analytics.a;

import com.google.android.gms.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = null.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((String)localEntry.getKey()).startsWith("&"))
      {
        localHashMap.put(((String)localEntry.getKey()).substring(1), localEntry.getValue());
        continue;
      }
      localHashMap.put(localEntry.getKey(), localEntry.getValue());
    }
    return x.a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.a.b
 * JD-Core Version:    0.6.0
 */