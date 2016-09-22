package android.support.v4.content;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

abstract class ModernAsyncTask<Params, Progress, Result>
{
  private static final ThreadFactory a = new l();
  private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(10);
  private static Executor c = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
  private static volatile Executor d;
  private final FutureTask<Result> e;
  private volatile ModernAsyncTask.Status f;

  static
  {
    new n(0);
    d = c;
  }

  protected static void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.ModernAsyncTask
 * JD-Core Version:    0.6.0
 */