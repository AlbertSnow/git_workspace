package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.support.v7.app.f;
import android.util.DisplayMetrics;
import com.google.android.gms.analytics.internal.m;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class z
{
  private static volatile z a;
  private final Context b;
  private final List<f> c;
  private final ab d;
  private volatile ag e;
  private Thread.UncaughtExceptionHandler f;

  private z(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    d.a(localContext);
    this.b = localContext;
    this.d = new ab(this);
    this.c = new CopyOnWriteArrayList();
    new u();
  }

  public static z a(Context paramContext)
  {
    d.a(paramContext);
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = new z(paramContext);
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void d()
  {
    if (!(Thread.currentThread() instanceof ae))
      throw new IllegalStateException("Call expected from worker thread");
  }

  // ERROR //
  public final ag a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 135	com/google/android/gms/internal/z:e	Lcom/google/android/gms/internal/ag;
    //   4: ifnonnull +129 -> 133
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 135	com/google/android/gms/internal/z:e	Lcom/google/android/gms/internal/ag;
    //   13: ifnonnull +118 -> 131
    //   16: new 137	com/google/android/gms/internal/ag
    //   19: dup
    //   20: invokespecial 138	com/google/android/gms/internal/ag:<init>	()V
    //   23: astore_2
    //   24: aload_0
    //   25: getfield 35	com/google/android/gms/internal/z:b	Landroid/content/Context;
    //   28: invokevirtual 142	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   31: astore_3
    //   32: aload_0
    //   33: getfield 35	com/google/android/gms/internal/z:b	Landroid/content/Context;
    //   36: invokevirtual 146	android/content/Context:getPackageName	()Ljava/lang/String;
    //   39: astore 4
    //   41: aload_2
    //   42: aload 4
    //   44: invokevirtual 148	com/google/android/gms/internal/ag:c	(Ljava/lang/String;)V
    //   47: aload_2
    //   48: aload_3
    //   49: aload 4
    //   51: invokevirtual 154	android/content/pm/PackageManager:getInstallerPackageName	(Ljava/lang/String;)Ljava/lang/String;
    //   54: invokevirtual 156	com/google/android/gms/internal/ag:d	(Ljava/lang/String;)V
    //   57: aload_3
    //   58: aload_0
    //   59: getfield 35	com/google/android/gms/internal/z:b	Landroid/content/Context;
    //   62: invokevirtual 146	android/content/Context:getPackageName	()Ljava/lang/String;
    //   65: iconst_0
    //   66: invokevirtual 160	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   69: astore 7
    //   71: aconst_null
    //   72: astore 6
    //   74: aload 7
    //   76: ifnull +38 -> 114
    //   79: aload_3
    //   80: aload 7
    //   82: getfield 166	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   85: invokevirtual 170	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   88: astore 8
    //   90: aload 8
    //   92: invokestatic 175	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   95: ifne +12 -> 107
    //   98: aload 8
    //   100: invokeinterface 180 1 0
    //   105: astore 4
    //   107: aload 7
    //   109: getfield 184	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   112: astore 6
    //   114: aload_2
    //   115: aload 4
    //   117: invokevirtual 186	com/google/android/gms/internal/ag:a	(Ljava/lang/String;)V
    //   120: aload_2
    //   121: aload 6
    //   123: invokevirtual 188	com/google/android/gms/internal/ag:b	(Ljava/lang/String;)V
    //   126: aload_0
    //   127: aload_2
    //   128: putfield 135	com/google/android/gms/internal/z:e	Lcom/google/android/gms/internal/ag;
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_0
    //   134: getfield 135	com/google/android/gms/internal/z:e	Lcom/google/android/gms/internal/ag;
    //   137: areturn
    //   138: astore_1
    //   139: aload_0
    //   140: monitorexit
    //   141: aload_1
    //   142: athrow
    //   143: astore 5
    //   145: aconst_null
    //   146: astore 6
    //   148: goto -34 -> 114
    //
    // Exception table:
    //   from	to	target	type
    //   9	57	138	finally
    //   57	71	138	finally
    //   79	107	138	finally
    //   107	114	138	finally
    //   114	131	138	finally
    //   131	133	138	finally
    //   139	141	138	finally
    //   57	71	143	android/content/pm/PackageManager$NameNotFoundException
    //   79	107	143	android/content/pm/PackageManager$NameNotFoundException
    //   107	114	143	android/content/pm/PackageManager$NameNotFoundException
  }

  public final <V> Future<V> a(Callable<V> paramCallable)
  {
    d.a(paramCallable);
    if ((Thread.currentThread() instanceof ae))
    {
      FutureTask localFutureTask = new FutureTask(paramCallable);
      localFutureTask.run();
      return localFutureTask;
    }
    return this.d.submit(paramCallable);
  }

  final void a(w paramw)
  {
    if (paramw.i())
      throw new IllegalStateException("Measurement prototype can't be submitted");
    if (paramw.f())
      throw new IllegalStateException("Measurement can only be submitted once");
    w localw = paramw.a();
    localw.g();
    this.d.execute(new aa(this, localw));
  }

  public final void a(Runnable paramRunnable)
  {
    d.a(paramRunnable);
    this.d.submit(paramRunnable);
  }

  public final void a(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.f = paramUncaughtExceptionHandler;
  }

  public final ai b()
  {
    DisplayMetrics localDisplayMetrics = this.b.getResources().getDisplayMetrics();
    ai localai = new ai();
    localai.a(m.a(Locale.getDefault()));
    localai.b = localDisplayMetrics.widthPixels;
    localai.c = localDisplayMetrics.heightPixels;
    return localai;
  }

  public final Context c()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.z
 * JD-Core Version:    0.6.0
 */