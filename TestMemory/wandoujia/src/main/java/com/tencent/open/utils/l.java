package com.tencent.open.utils;

import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class l
{
  public static final Executor a;
  private static Handler b;
  private static HandlerThread c;

  static
  {
    new Object();
    a = b();
  }

  public static Executor a()
  {
    return new m(0);
  }

  public static void a(Runnable paramRunnable)
  {
    c().post(paramRunnable);
  }

  private static Executor b()
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 11)
      localObject = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    while (true)
    {
      if ((localObject instanceof ThreadPoolExecutor))
        ((ThreadPoolExecutor)localObject).setCorePoolSize(3);
      return localObject;
      try
      {
        Field localField = AsyncTask.class.getDeclaredField("sExecutor");
        localField.setAccessible(true);
        Executor localExecutor = (Executor)localField.get(null);
        localObject = localExecutor;
      }
      catch (Exception localException)
      {
        localObject = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
      }
    }
  }

  private static Handler c()
  {
    if (b == null)
      monitorenter;
    try
    {
      HandlerThread localHandlerThread = new HandlerThread("SDK_SUB");
      c = localHandlerThread;
      localHandlerThread.start();
      b = new Handler(c.getLooper());
      return b;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.l
 * JD-Core Version:    0.6.0
 */