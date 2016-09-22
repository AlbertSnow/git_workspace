package com.wandoujia.base.utils;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool
{
  private static final int CORE_THREAD_NUM = 5;
  private static final long KEEP_ALIVE_TIME = 10L;
  public static final ThreadPoolExecutor MIN_PRIOR_EXECUTOR = new ThreadPoolExecutor(1, 2147483647, 10L, TimeUnit.SECONDS, new SynchronousQueue(true), new m(1));
  public static final ThreadPoolExecutor NORMAL_PRIOR_EXECUTOR = new ThreadPoolExecutor(5, 2147483647, 10L, TimeUnit.SECONDS, new SynchronousQueue(true), new m(5));

  public static void cancel(Runnable paramRunnable)
  {
    if (paramRunnable == null)
      return;
    MIN_PRIOR_EXECUTOR.remove(paramRunnable);
    NORMAL_PRIOR_EXECUTOR.remove(paramRunnable);
  }

  public static void execute(Runnable paramRunnable)
  {
    execute(paramRunnable, ThreadPool.Priority.NORMAL);
  }

  public static void execute(Runnable paramRunnable, ThreadPool.Priority paramPriority)
  {
    if (paramPriority == ThreadPool.Priority.LOW)
    {
      MIN_PRIOR_EXECUTOR.execute(paramRunnable);
      return;
    }
    NORMAL_PRIOR_EXECUTOR.execute(paramRunnable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ThreadPool
 * JD-Core Version:    0.6.0
 */