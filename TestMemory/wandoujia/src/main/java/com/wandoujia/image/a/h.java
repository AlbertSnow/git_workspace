package com.wandoujia.image.a;

import android.support.v4.e.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimerTask;

final class h extends TimerTask
{
  h(f paramf)
  {
  }

  public final void run()
  {
    Map localMap = f.a(this.a).b();
    long l = System.currentTimeMillis();
    Iterator localIterator = localMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (l - i.b((i)localEntry.getValue()) <= 60000L)
        continue;
      f.a(this.a).b(localEntry.getKey());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.a.h
 * JD-Core Version:    0.6.0
 */