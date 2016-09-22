package com.wandoujia.base.concurrent;

import java.util.concurrent.LinkedBlockingQueue;

public class RestrictGivenPeriodExecutor
{
  private static final String TAG = RestrictGivenPeriodExecutor.class.getSimpleName();
  private static final int THREAD_POOL_CACHE_TIME = 3000;
  private final long givenIntervalTime;
  private long lastExecuteMoment;
  private boolean mQuit = false;
  private final CachedThreadPoolExecutorWithCapacity threadPool;

  public RestrictGivenPeriodExecutor(long paramLong)
  {
    this.givenIntervalTime = paramLong;
    this.lastExecuteMoment = System.currentTimeMillis();
    this.threadPool = new CachedThreadPoolExecutorWithCapacity(1, new LinkedBlockingQueue(1), 3000L, "RestrictGivenPeriodExecutor");
  }

  public void execute(Runnable paramRunnable)
  {
    try
    {
      this.threadPool.execute(new f(this, paramRunnable));
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
  }

  public void shutdown()
  {
    this.mQuit = true;
    this.threadPool.shutdown();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.concurrent.RestrictGivenPeriodExecutor
 * JD-Core Version:    0.6.0
 */