package com.google.android.gms.ads.internal.util.future;

import com.google.android.gms.ads.internal.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

final class e
  implements Runnable
{
  e(AtomicInteger paramAtomicInteger, int paramInt, a parama, List paramList)
  {
  }

  public final void run()
  {
    if (this.a.incrementAndGet() >= this.b);
    try
    {
      locala = this.c;
      List localList = this.d;
      localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = ((g)localIterator.next()).get();
        if (localObject == null)
          continue;
        localArrayList.add(localObject);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      a locala;
      ArrayList localArrayList;
      c.c("Unable to convert list of futures to a future of list", localExecutionException);
      return;
      locala.b(localArrayList);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      label87: break label87;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.future.e
 * JD-Core Version:    0.6.0
 */