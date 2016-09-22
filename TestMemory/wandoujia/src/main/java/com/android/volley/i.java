package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class i
{
  private AtomicInteger a = new AtomicInteger();
  private final Map<String, Queue<Request>> b = new HashMap();
  private final Set<Request> c = new HashSet();
  private final PriorityBlockingQueue<Request> d = new PriorityBlockingQueue();
  private final PriorityBlockingQueue<Request> e = new PriorityBlockingQueue();
  private final a f;
  private final f g;
  private final l h;
  private g[] i;
  private b j;

  public i(a parama, f paramf)
  {
    this(parama, paramf, 4);
  }

  public i(a parama, f paramf, int paramInt)
  {
    this(parama, paramf, paramInt, new l(new Handler(Looper.getMainLooper())));
  }

  private i(a parama, f paramf, int paramInt, l paraml)
  {
    this.f = parama;
    this.g = paramf;
    this.i = new g[paramInt];
    this.h = paraml;
  }

  public final Request a(Request paramRequest)
  {
    paramRequest.a(this);
    synchronized (this.c)
    {
      this.c.add(paramRequest);
      paramRequest.a(this.a.incrementAndGet());
      paramRequest.a("add-to-queue");
      if (!paramRequest.n())
      {
        this.e.add(paramRequest);
        return paramRequest;
      }
    }
    while (true)
    {
      String str;
      synchronized (this.b)
      {
        str = paramRequest.d();
        if (this.b.containsKey(str))
        {
          Object localObject3 = (Queue)this.b.get(str);
          if (localObject3 != null)
            continue;
          localObject3 = new LinkedList();
          ((Queue)localObject3).add(paramRequest);
          this.b.put(str, localObject3);
          if (!n.a)
            continue;
          n.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
          return paramRequest;
        }
      }
      this.b.put(str, null);
      this.d.add(paramRequest);
    }
  }

  public final void a()
  {
    int k = 0;
    if (this.j != null)
      this.j.a();
    for (int m = 0; m < this.i.length; m++)
    {
      if (this.i[m] == null)
        continue;
      this.i[m].a();
    }
    this.j = new b(this.d, this.e, this.f, this.h);
    this.j.start();
    while (k < this.i.length)
    {
      g localg = new g(this.e, this.g, this.f, this.h);
      this.i[k] = localg;
      localg.start();
      k++;
    }
  }

  public final a b()
  {
    return this.f;
  }

  final void b(Request paramRequest)
  {
    synchronized (this.c)
    {
      this.c.remove(paramRequest);
      if (!paramRequest.n());
    }
    synchronized (this.b)
    {
      String str = paramRequest.d();
      Queue localQueue = (Queue)this.b.remove(str);
      if (localQueue != null)
      {
        if (n.a)
        {
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(localQueue.size());
          arrayOfObject[1] = str;
          n.a("Releasing %d waiting requests for cacheKey=%s.", arrayOfObject);
        }
        this.d.addAll(localQueue);
      }
      return;
      localObject1 = finally;
      monitorexit;
      throw localObject1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.i
 * JD-Core Version:    0.6.0
 */