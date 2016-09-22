package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class o
{
  public static final boolean a = n.a;
  private final List<p> b = new ArrayList();
  private boolean c = false;

  public final void a(String paramString)
  {
    monitorenter;
    try
    {
      this.c = true;
      int i = this.b.size();
      long l2;
      if (i == 0)
      {
        l2 = 0L;
        if (l2 > 0L)
          break label86;
      }
      while (true)
      {
        return;
        long l1 = ((p)this.b.get(0)).c;
        l2 = ((p)this.b.get(-1 + this.b.size())).c - l1;
        break;
        label86: long l3 = ((p)this.b.get(0)).c;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Long.valueOf(l2);
        arrayOfObject1[1] = paramString;
        n.b("(%-4d ms) %s", arrayOfObject1);
        Iterator localIterator = this.b.iterator();
        long l4 = l3;
        while (localIterator.hasNext())
        {
          p localp = (p)localIterator.next();
          long l5 = localp.c;
          Object[] arrayOfObject2 = new Object[3];
          arrayOfObject2[0] = Long.valueOf(l5 - l4);
          arrayOfObject2[1] = Long.valueOf(localp.b);
          arrayOfObject2[2] = localp.a;
          n.b("(+%-4d) [%2d] %s", arrayOfObject2);
          l4 = l5;
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(String paramString, long paramLong)
  {
    monitorenter;
    try
    {
      if (this.c)
        throw new IllegalStateException("Marker added to finished log");
    }
    finally
    {
      monitorexit;
    }
    this.b.add(new p(paramString, paramLong, SystemClock.elapsedRealtime()));
    monitorexit;
  }

  protected final void finalize()
  {
    if (!this.c)
    {
      a("Request on the loose");
      n.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.o
 * JD-Core Version:    0.6.0
 */