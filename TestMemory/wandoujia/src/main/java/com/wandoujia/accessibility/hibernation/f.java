package com.wandoujia.accessibility.hibernation;

import com.wandoujia.accessibility.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class f
  implements Runnable
{
  f(HibernationManager paramHibernationManager)
  {
  }

  public final void run()
  {
    Iterator localIterator1 = HibernationManager.c(this.a).iterator();
    while (localIterator1.hasNext())
    {
      String str2 = (String)localIterator1.next();
      if (!HibernationManager.k(this.a).contains(str2))
        continue;
      HibernationManager.l(this.a).remove(str2);
      HibernationManager.m(this.a).add(str2);
    }
    Iterator localIterator2 = HibernationManager.n(this.a).iterator();
    while (localIterator2.hasNext())
    {
      String str1 = (String)localIterator2.next();
      if (HibernationManager.c(this.a).contains(str1))
        continue;
      HibernationManager.l(this.a).add(str1);
      HibernationManager.m(this.a).remove(str1);
    }
    a.a(HibernationManager.l(this.a));
    a.b(HibernationManager.m(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.f
 * JD-Core Version:    0.6.0
 */