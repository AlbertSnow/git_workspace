package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class b
{
  private final Map<Integer, Integer> a = new HashMap();

  final void a(int paramInt)
  {
    Integer localInteger1 = (Integer)this.a.get(Integer.valueOf(paramInt));
    if (localInteger1 == null)
      localInteger1 = Integer.valueOf(0);
    Integer localInteger2 = Integer.valueOf(1 + localInteger1.intValue());
    this.a.put(Integer.valueOf(paramInt), localInteger2);
  }

  final int[] a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.entrySet().iterator();
    int i = -1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Integer)localEntry.getValue()).intValue() > i)
      {
        int j = ((Integer)localEntry.getValue()).intValue();
        localArrayList.clear();
        localArrayList.add(localEntry.getKey());
        i = j;
        continue;
      }
      if (((Integer)localEntry.getValue()).intValue() != i)
        continue;
      localArrayList.add(localEntry.getKey());
    }
    return a.a(localArrayList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.b
 * JD-Core Version:    0.6.0
 */