package com.wandoujia.download2;

import com.wandoujia.base.log.Log;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.net.g;
import java.util.Iterator;
import java.util.List;

final class n
  implements g
{
  n(m paramm)
  {
  }

  public final void a(long paramLong)
  {
    Iterator localIterator = m.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (paramLong != locali.m())
        continue;
      locali.a();
    }
  }

  public final void b(long paramLong)
  {
    Iterator localIterator = m.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (paramLong != locali.m())
        continue;
      locali.b();
    }
  }

  public final void c(long paramLong)
  {
    String str = m.a();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    Log.d(str, "request completed requestid = %d", arrayOfObject);
    Iterator localIterator = m.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali.m() != paramLong)
        continue;
      locali.c();
      if (!locali.l().a())
        break;
      m.a(this.a, TaskEvent.Status.END, TaskEvent.Result.SUCCESS, locali);
      if (m.b(this.a) != null)
        m.b(this.a).a(locali.l());
      m.a(this.a, locali);
    }
  }

  public final void d(long paramLong)
  {
    String str = m.a();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    Log.d(str, "request exception requestid = %d", arrayOfObject);
    Iterator localIterator = m.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali.m() != paramLong)
        continue;
      locali.d();
      if (!locali.l().a())
        break;
      m.a(this.a, TaskEvent.Status.END, TaskEvent.Result.FAIL, locali);
      if (m.b(this.a) != null)
        m.b(this.a).a(locali.l());
      m.a(this.a, locali);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.n
 * JD-Core Version:    0.6.0
 */