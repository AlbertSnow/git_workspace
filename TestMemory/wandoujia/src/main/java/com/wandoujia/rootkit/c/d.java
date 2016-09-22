package com.wandoujia.rootkit.c;

import com.wandoujia.rootkit.b.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class d extends a
{
  d(String[] paramArrayOfString)
  {
    super(7002, paramArrayOfString);
  }

  public final void a(int paramInt, String paramString)
  {
    if (paramInt == 7002)
    {
      Iterator localIterator = new HashSet(Arrays.asList(paramString.split(" "))).iterator();
      while (localIterator.hasNext())
      {
        if (!((String)localIterator.next()).toLowerCase().contains("uid=0"))
          continue;
        a.a = true;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.c.d
 * JD-Core Version:    0.6.0
 */