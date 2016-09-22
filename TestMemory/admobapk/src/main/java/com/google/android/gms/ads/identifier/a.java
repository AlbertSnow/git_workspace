package com.google.android.gms.ads.identifier;

import aht;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import anw;
import aof;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ou;
import oy;

public final class a
{
  private ou a;
  private com.google.android.gms.ads.identifier.internal.a b;
  private boolean c;
  private Object d = new Object();
  private b e;
  private final Context f;
  private long g;

  public a(Context paramContext)
  {
    this(paramContext, 30000L);
  }

  private a(Context paramContext, long paramLong)
  {
    anw.a(paramContext);
    this.f = paramContext;
    this.c = false;
    this.g = paramLong;
  }

  public static c a(Context paramContext)
  {
    a locala = new a(paramContext, -1L);
    try
    {
      locala.a(false);
      c localc = locala.a();
      return localc;
    }
    finally
    {
      locala.b();
    }
    throw localObject;
  }

  private static com.google.android.gms.ads.identifier.internal.a a(ou paramou)
  {
    IBinder localIBinder;
    try
    {
      localTimeUnit = TimeUnit.MILLISECONDS;
      anw.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
      if (paramou.a)
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
    catch (InterruptedException localInterruptedException)
    {
      TimeUnit localTimeUnit;
      throw new IOException("Interrupted exception");
      paramou.a = true;
      localIBinder = (IBinder)paramou.b.poll(10000L, localTimeUnit);
      if (localIBinder == null)
        throw new TimeoutException("Timed out waiting for the service connection");
    }
    catch (Throwable localThrowable)
    {
      throw new IOException(localThrowable);
    }
    if (localIBinder == null)
      return null;
    IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    if ((localIInterface != null) && ((localIInterface instanceof com.google.android.gms.ads.identifier.internal.a)))
      return (com.google.android.gms.ads.identifier.internal.a)localIInterface;
    com.google.android.gms.ads.identifier.internal.c localc = new com.google.android.gms.ads.identifier.internal.c(localIBinder);
    return localc;
  }

  private static ou b(Context paramContext)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      switch (oy.c.a(paramContext))
      {
      case 1:
      default:
        throw new IOException("Google Play services not available");
      case 0:
      case 2:
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new aht(9);
    }
    ou localou = new ou();
    Intent localIntent = new Intent("com.google.android.gms.ads.identifier.service.START");
    localIntent.setPackage("com.google.android.gms");
    try
    {
      boolean bool = aof.a().a(paramContext, localIntent, localou, 1);
      if (bool)
        return localou;
    }
    catch (Throwable localThrowable)
    {
      throw new IOException(localThrowable);
    }
    throw new IOException("Connection failure");
  }

  private final void c()
  {
    synchronized (this.d)
    {
      if (this.e != null)
        this.e.a.countDown();
    }
    try
    {
      this.e.join();
      label31: if (this.g > 0L)
        this.e = new b(this, this.g);
      monitorexit;
      return;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label31;
    }
  }

  // ERROR //
  public final c a()
  {
    // Byte code:
    //   0: ldc 195
    //   2: invokestatic 68	anw:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 39	com/google/android/gms/ads/identifier/a:c	Z
    //   11: ifne +91 -> 102
    //   14: aload_0
    //   15: getfield 30	com/google/android/gms/ads/identifier/a:d	Ljava/lang/Object;
    //   18: astore 7
    //   20: aload 7
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 173	com/google/android/gms/ads/identifier/a:e	Lcom/google/android/gms/ads/identifier/b;
    //   27: ifnull +13 -> 40
    //   30: aload_0
    //   31: getfield 173	com/google/android/gms/ads/identifier/a:e	Lcom/google/android/gms/ads/identifier/b;
    //   34: getfield 197	com/google/android/gms/ads/identifier/b:b	Z
    //   37: ifne +26 -> 63
    //   40: new 80	java/io/IOException
    //   43: dup
    //   44: ldc 199
    //   46: invokespecial 83	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   49: athrow
    //   50: astore 8
    //   52: aload 7
    //   54: monitorexit
    //   55: aload 8
    //   57: athrow
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: aload 7
    //   65: monitorexit
    //   66: aload_0
    //   67: iconst_0
    //   68: invokevirtual 47	com/google/android/gms/ads/identifier/a:a	(Z)V
    //   71: aload_0
    //   72: getfield 39	com/google/android/gms/ads/identifier/a:c	Z
    //   75: ifne +27 -> 102
    //   78: new 80	java/io/IOException
    //   81: dup
    //   82: ldc 201
    //   84: invokespecial 83	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   87: athrow
    //   88: astore 9
    //   90: new 80	java/io/IOException
    //   93: dup
    //   94: ldc 201
    //   96: aload 9
    //   98: invokespecial 204	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: athrow
    //   102: aload_0
    //   103: getfield 206	com/google/android/gms/ads/identifier/a:a	Lou;
    //   106: invokestatic 35	anw:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   109: pop
    //   110: aload_0
    //   111: getfield 208	com/google/android/gms/ads/identifier/a:b	Lcom/google/android/gms/ads/identifier/internal/a;
    //   114: invokestatic 35	anw:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: new 210	com/google/android/gms/ads/identifier/c
    //   121: dup
    //   122: aload_0
    //   123: getfield 208	com/google/android/gms/ads/identifier/a:b	Lcom/google/android/gms/ads/identifier/internal/a;
    //   126: invokeinterface 213 1 0
    //   131: aload_0
    //   132: getfield 208	com/google/android/gms/ads/identifier/a:b	Lcom/google/android/gms/ads/identifier/internal/a;
    //   135: iconst_1
    //   136: invokeinterface 216 2 0
    //   141: invokespecial 219	com/google/android/gms/ads/identifier/c:<init>	(Ljava/lang/String;Z)V
    //   144: astore 4
    //   146: aload_0
    //   147: monitorexit
    //   148: aload_0
    //   149: invokespecial 221	com/google/android/gms/ads/identifier/a:c	()V
    //   152: aload 4
    //   154: areturn
    //   155: astore 5
    //   157: ldc 223
    //   159: ldc 225
    //   161: aload 5
    //   163: invokestatic 231	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   166: pop
    //   167: new 80	java/io/IOException
    //   170: dup
    //   171: ldc 233
    //   173: invokespecial 83	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   176: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   23	40	50	finally
    //   40	50	50	finally
    //   52	55	50	finally
    //   63	66	50	finally
    //   7	23	58	finally
    //   55	58	58	finally
    //   59	61	58	finally
    //   66	71	58	finally
    //   71	88	58	finally
    //   90	102	58	finally
    //   102	118	58	finally
    //   118	146	58	finally
    //   146	148	58	finally
    //   157	177	58	finally
    //   66	71	88	java/lang/Exception
    //   118	146	155	android/os/RemoteException
  }

  public final void a(boolean paramBoolean)
  {
    anw.c("Calling this from your main thread can lead to deadlock");
    monitorenter;
    try
    {
      if (this.c)
        b();
      this.a = b(this.f);
      this.b = a(this.a);
      this.c = true;
      if (paramBoolean)
        c();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  public final void b()
  {
    // Byte code:
    //   0: ldc 195
    //   2: invokestatic 68	anw:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 37	com/google/android/gms/ads/identifier/a:f	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 206	com/google/android/gms/ads/identifier/a:a	Lou;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 39	com/google/android/gms/ads/identifier/a:c	Z
    //   28: ifeq +17 -> 45
    //   31: invokestatic 166	aof:a	()Laof;
    //   34: aload_0
    //   35: getfield 37	com/google/android/gms/ads/identifier/a:f	Landroid/content/Context;
    //   38: aload_0
    //   39: getfield 206	com/google/android/gms/ads/identifier/a:a	Lou;
    //   42: invokevirtual 242	aof:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 39	com/google/android/gms/ads/identifier/a:c	Z
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 208	com/google/android/gms/ads/identifier/a:b	Lcom/google/android/gms/ads/identifier/internal/a;
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 206	com/google/android/gms/ads/identifier/a:a	Lou;
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_2
    //   69: ldc 223
    //   71: ldc 244
    //   73: aload_2
    //   74: invokestatic 231	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   77: pop
    //   78: goto -33 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	63	finally
    //   21	23	63	finally
    //   24	45	63	finally
    //   45	62	63	finally
    //   64	66	63	finally
    //   69	78	63	finally
    //   24	45	68	java/lang/IllegalArgumentException
  }

  protected final void finalize()
  {
    b();
    super.finalize();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.a
 * JD-Core Version:    0.6.0
 */