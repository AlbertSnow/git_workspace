package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.util.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class b
{
  final Object a = new Object();
  int b;
  List c = new LinkedList();

  public final a a()
  {
    Object localObject4;
    for (Object localObject1 = null; ; localObject1 = localObject4)
    {
      synchronized (this.a)
      {
        if (this.c.size() == 0)
        {
          c.b("Queue empty");
          return null;
        }
        if (this.c.size() >= 2)
        {
          i = -2147483648;
          Iterator localIterator = this.c.iterator();
          if (localIterator.hasNext())
          {
            a locala1 = (a)localIterator.next();
            int j = locala1.e;
            if (j <= i)
              break label179;
            localObject4 = locala1;
            k = j;
            break label189;
          }
          this.c.remove(localObject1);
          return localObject1;
        }
      }
      a locala2 = (a)this.c.get(0);
      synchronized (locala2.a)
      {
        locala2.e = (-100 + locala2.e);
        monitorexit;
        return locala2;
      }
      label179: int k = i;
      localObject4 = localObject1;
      label189: int i = k;
    }
  }

  public final boolean a(a parama)
  {
    synchronized (this.a)
    {
      return this.c.contains(parama);
    }
  }

  public final boolean b(a parama)
  {
    synchronized (this.a)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if ((parama == locala) || (!locala.f.equals(parama.f)))
          continue;
        localIterator.remove();
        return true;
      }
      return false;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.b
 * JD-Core Version:    0.6.0
 */