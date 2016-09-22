package com.wandoujia.p4.gift.d;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.p4.gift.http.model.GiftModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
{
  private static a a;
  private final Map<Long, List<WeakReference<c>>> b = new LinkedHashMap();
  private final Handler c = new Handler(Looper.getMainLooper());

  public static a a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new a();
      a locala = a;
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(long paramLong, c paramc)
  {
    synchronized (this.b)
    {
      if (this.b.containsKey(Long.valueOf(paramLong)))
      {
        localObject2 = (List)this.b.get(Long.valueOf(paramLong));
        Iterator localIterator = ((List)localObject2).iterator();
        c localc;
        do
        {
          if (!localIterator.hasNext())
            break;
          localc = (c)((WeakReference)localIterator.next()).get();
        }
        while ((localc == null) || (!localc.equals(paramc)));
        return;
      }
      Object localObject2 = new LinkedList();
      ((List)localObject2).add(new WeakReference(paramc));
      this.b.put(Long.valueOf(paramLong), localObject2);
      return;
    }
  }

  public final void a(GiftModel paramGiftModel)
  {
    if (paramGiftModel == null);
    while (true)
    {
      return;
      if (this.b.get(Long.valueOf(paramGiftModel.getId())) == null)
        continue;
      Iterator localIterator = ((List)this.b.get(Long.valueOf(paramGiftModel.getId()))).iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)((WeakReference)localIterator.next()).get();
        if (localc == null)
          continue;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
          localc.a(paramGiftModel);
          continue;
        }
        this.c.post(new b(localc, paramGiftModel));
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.d.a
 * JD-Core Version:    0.6.0
 */