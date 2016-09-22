package com.wandoujia.jupiter.notification.notifycard;

import com.wandoujia.jupiter.notification.notifycard.generator.INotifyCardGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class h
  implements Runnable
{
  h(e parame)
  {
  }

  public final void run()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.a.a.iterator();
    while (localIterator1.hasNext())
    {
      d locald2 = ((INotifyCardGenerator)localIterator1.next()).b();
      if (locald2 == null)
        continue;
      localArrayList.add(locald2);
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      d locald1 = (d)localIterator2.next();
      com.wandoujia.jupiter.notification.e.a().a(locald1.a(), locald1.c());
      if (locald1.d() == null)
        continue;
      locald1.d().a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.notifycard.h
 * JD-Core Version:    0.6.0
 */