package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.future.g;
import com.google.android.gms.ads.internal.util.future.h;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

@com.google.android.gms.ads.internal.report.client.a
public final class s
{
  public static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
  private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

  public static g a(int paramInt, Runnable paramRunnable)
  {
    if (paramInt == 1)
      return a(b, new t(paramRunnable));
    return a(a, new u(paramRunnable));
  }

  public static g a(Runnable paramRunnable)
  {
    return a(0, paramRunnable);
  }

  public static g a(ExecutorService paramExecutorService, Callable paramCallable)
  {
    com.google.android.gms.ads.internal.util.future.a locala = new com.google.android.gms.ads.internal.util.future.a();
    try
    {
      w localw = new w(locala, paramExecutorService.submit(new v(locala, paramCallable)));
      locala.b.b(localw);
      return locala;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      c.c("Thread execution is rejected.", localRejectedExecutionException);
      locala.cancel(true);
    }
    return locala;
  }

  private static ThreadFactory a(String paramString)
  {
    return new x(paramString);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.s
 * JD-Core Version:    0.6.0
 */