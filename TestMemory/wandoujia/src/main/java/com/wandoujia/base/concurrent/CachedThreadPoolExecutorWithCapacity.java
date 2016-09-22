package com.wandoujia.base.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CachedThreadPoolExecutorWithCapacity
  implements ExecutorService
{
  private final long cacheTimeMs;
  private boolean isShutdown;
  private final int maxThreadNum;
  private final BlockingQueue<Runnable> queue;
  private final List<e> runningThreads = new LinkedList();
  private final AtomicInteger threadNum = new AtomicInteger(0);
  private final String threadPoolName;

  public CachedThreadPoolExecutorWithCapacity(int paramInt)
  {
    this(paramInt, 0L, null);
  }

  public CachedThreadPoolExecutorWithCapacity(int paramInt, long paramLong)
  {
    this(paramInt, new LinkedBlockingQueue(), paramLong, null);
  }

  public CachedThreadPoolExecutorWithCapacity(int paramInt, long paramLong, String paramString)
  {
    this(paramInt, new LinkedBlockingQueue(), paramLong, paramString);
  }

  public CachedThreadPoolExecutorWithCapacity(int paramInt, BlockingQueue<Runnable> paramBlockingQueue, long paramLong, String paramString)
  {
    this.maxThreadNum = paramInt;
    this.queue = paramBlockingQueue;
    this.cacheTimeMs = paramLong;
    this.threadPoolName = paramString;
  }

  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    synchronized (this.runningThreads)
    {
      while (!this.runningThreads.isEmpty())
      {
        long l1 = System.currentTimeMillis();
        long l2 = paramTimeUnit.toMillis(paramLong);
        this.runningThreads.wait(l2);
        if (System.currentTimeMillis() - l1 >= l2)
          return false;
      }
      return true;
    }
  }

  public boolean cancel(Runnable paramRunnable, boolean paramBoolean)
  {
    if (paramBoolean);
    synchronized (this.runningThreads)
    {
      Iterator localIterator = this.runningThreads.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        if (e.a(locale) != paramRunnable)
          continue;
        locale.interrupt();
        return true;
      }
      synchronized (this.queue)
      {
        boolean bool = this.queue.remove(paramRunnable);
        return bool;
      }
    }
  }

  public void execute(Runnable paramRunnable)
  {
    if (this.isShutdown)
      return;
    while (true)
    {
      synchronized (this.queue)
      {
        this.queue.add(paramRunnable);
        synchronized (this.runningThreads)
        {
          if (this.runningThreads.size() >= this.maxThreadNum)
            continue;
          if (this.threadPoolName != null)
          {
            locale = new e(this, this.threadPoolName + "-" + this.threadNum.getAndIncrement());
            this.runningThreads.add(locale);
            locale.start();
            return;
          }
        }
      }
      e locale = new e(this);
    }
  }

  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException();
  }

  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException();
  }

  public boolean isShutdown()
  {
    return this.isShutdown;
  }

  public boolean isTerminated()
  {
    return (this.isShutdown) && (this.runningThreads.isEmpty());
  }

  public void shutdown()
  {
    synchronized (this.queue)
    {
      this.queue.clear();
      synchronized (this.runningThreads)
      {
        Iterator localIterator = this.runningThreads.iterator();
        if (localIterator.hasNext())
          ((Thread)localIterator.next()).interrupt();
      }
    }
    monitorexit;
    this.isShutdown = true;
  }

  public List<Runnable> shutdownNow()
  {
    LinkedList localLinkedList = new LinkedList();
    synchronized (this.queue)
    {
      this.queue.drainTo(localLinkedList);
      this.queue.clear();
      synchronized (this.runningThreads)
      {
        Iterator localIterator = this.runningThreads.iterator();
        if (localIterator.hasNext())
          ((Thread)localIterator.next()).interrupt();
      }
    }
    monitorexit;
    this.isShutdown = true;
    return localLinkedList;
  }

  public Future<?> submit(Runnable paramRunnable)
  {
    if (this.isShutdown)
      throw new RejectedExecutionException("This executive service is shut down already.");
    d locald = new d(this, 0);
    c localc = new c(paramRunnable, locald);
    d.a(locald, localc);
    execute(localc);
    return locald;
  }

  public <T> Future<T> submit(Runnable paramRunnable, T paramT)
  {
    if (this.isShutdown)
      throw new RejectedExecutionException("This executive service is shut down already.");
    d locald = new d(this, 0);
    b localb = new b(paramRunnable, locald, paramT);
    d.a(locald, localb);
    execute(localb);
    return locald;
  }

  public <T> Future<T> submit(Callable<T> paramCallable)
  {
    if (this.isShutdown)
      throw new RejectedExecutionException("This executive service is shut down already.");
    d locald = new d(this, 0);
    a locala = new a(paramCallable, locald);
    d.a(locald, locala);
    execute(locala);
    return locald;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity
 * JD-Core Version:    0.6.0
 */