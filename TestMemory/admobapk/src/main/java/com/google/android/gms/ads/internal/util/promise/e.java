package com.google.android.gms.ads.internal.util.promise;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@com.google.android.gms.ads.internal.report.client.a
public class e
  implements a
{
  private final Object a = new Object();
  private int b = 0;
  private BlockingQueue c = new LinkedBlockingQueue();
  private Object d;

  public void a(d paramd, b paramb)
  {
    while (true)
    {
      synchronized (this.a)
      {
        if (this.b != 1)
          continue;
        paramd.a(this.d);
        return;
        if (this.b == -1)
          paramb.a();
      }
      if (this.b != 0)
        continue;
      this.c.add(new f(this, paramd, paramb));
    }
  }

  public void a(Object paramObject)
  {
    synchronized (this.a)
    {
      if (this.b != 0)
        throw new UnsupportedOperationException();
    }
    this.d = paramObject;
    this.b = 1;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
      ((f)localIterator.next()).a.a(paramObject);
    this.c.clear();
    monitorexit;
  }

  public int b()
  {
    return this.b;
  }

  public void c_()
  {
    synchronized (this.a)
    {
      if (this.b != 0)
        throw new UnsupportedOperationException();
    }
    this.b = -1;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
      ((f)localIterator.next()).b.a();
    this.c.clear();
    monitorexit;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.promise.e
 * JD-Core Version:    0.6.0
 */