package com.google.android.gms.a.a;

import android.content.Context;
import android.support.v4.app.d;
import com.google.android.gms.internal.zzav;
import com.google.android.gms.internal.zzav.zza;
import java.io.IOException;

public final class a
{
  private com.google.android.gms.common.b a;
  private zzav b;
  private boolean c;
  private Object d = new Object();
  private c e;
  private final Context f;
  private long g;

  private a(Context paramContext)
  {
    d.a(paramContext);
    this.f = paramContext;
    this.c = false;
    this.g = -1L;
  }

  public static b a(Context paramContext)
  {
    a locala = new a(paramContext);
    try
    {
      locala.b();
      b localb = locala.c();
      return localb;
    }
    finally
    {
      locala.a();
    }
    throw localObject;
  }

  private static zzav a(com.google.android.gms.common.b paramb)
  {
    try
    {
      zzav localzzav = zzav.zza.a(paramb.a());
      return localzzav;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    throw new IOException("Interrupted exception");
  }

  // ERROR //
  private static com.google.android.gms.common.b b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 79	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: ldc 81
    //   6: iconst_0
    //   7: invokevirtual 87	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   10: pop
    //   11: aload_0
    //   12: invokestatic 91	com/google/android/gms/common/a:b	(Landroid/content/Context;)V
    //   15: new 53	com/google/android/gms/common/b
    //   18: dup
    //   19: invokespecial 92	com/google/android/gms/common/b:<init>	()V
    //   22: astore 4
    //   24: new 94	android/content/Intent
    //   27: dup
    //   28: ldc 96
    //   30: invokespecial 97	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   33: astore 5
    //   35: aload 5
    //   37: ldc 99
    //   39: invokevirtual 103	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   42: pop
    //   43: invokestatic 108	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   46: pop
    //   47: aload_0
    //   48: aload 5
    //   50: aload 4
    //   52: iconst_1
    //   53: invokestatic 111	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   56: ifeq +27 -> 83
    //   59: aload 4
    //   61: areturn
    //   62: astore_1
    //   63: new 73	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   66: dup
    //   67: bipush 9
    //   69: invokespecial 114	com/google/android/gms/common/GooglePlayServicesNotAvailableException:<init>	(I)V
    //   72: athrow
    //   73: astore_3
    //   74: new 63	java/io/IOException
    //   77: dup
    //   78: aload_3
    //   79: invokespecial 117	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   82: athrow
    //   83: new 63	java/io/IOException
    //   86: dup
    //   87: ldc 119
    //   89: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   92: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	11	62	android/content/pm/PackageManager$NameNotFoundException
    //   11	15	73	com/google/android/gms/common/GooglePlayServicesNotAvailableException
  }

  private void b()
  {
    d.k("Calling this from your main thread can lead to deadlock");
    monitorenter;
    try
    {
      if (this.c)
        a();
      this.a = b(this.f);
      this.b = a(this.a);
      this.c = true;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  private b c()
  {
    // Byte code:
    //   0: ldc 121
    //   2: invokestatic 124	android/support/v4/app/d:k	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 34	com/google/android/gms/a/a/a:c	Z
    //   11: ifne +90 -> 101
    //   14: aload_0
    //   15: getfield 25	com/google/android/gms/a/a/a:d	Ljava/lang/Object;
    //   18: astore 9
    //   20: aload 9
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 138	com/google/android/gms/a/a/a:e	Lcom/google/android/gms/a/a/c;
    //   27: ifnull +13 -> 40
    //   30: aload_0
    //   31: getfield 138	com/google/android/gms/a/a/a:e	Lcom/google/android/gms/a/a/c;
    //   34: getfield 142	com/google/android/gms/a/a/c:b	Z
    //   37: ifne +26 -> 63
    //   40: new 63	java/io/IOException
    //   43: dup
    //   44: ldc 144
    //   46: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   49: athrow
    //   50: astore 10
    //   52: aload 9
    //   54: monitorexit
    //   55: aload 10
    //   57: athrow
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: aload 9
    //   65: monitorexit
    //   66: aload_0
    //   67: invokespecial 43	com/google/android/gms/a/a/a:b	()V
    //   70: aload_0
    //   71: getfield 34	com/google/android/gms/a/a/a:c	Z
    //   74: ifne +27 -> 101
    //   77: new 63	java/io/IOException
    //   80: dup
    //   81: ldc 146
    //   83: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   86: athrow
    //   87: astore 11
    //   89: new 63	java/io/IOException
    //   92: dup
    //   93: ldc 146
    //   95: aload 11
    //   97: invokespecial 149	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   100: athrow
    //   101: aload_0
    //   102: getfield 128	com/google/android/gms/a/a/a:a	Lcom/google/android/gms/common/b;
    //   105: invokestatic 30	android/support/v4/app/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: aload_0
    //   110: getfield 132	com/google/android/gms/a/a/a:b	Lcom/google/android/gms/internal/zzav;
    //   113: invokestatic 30	android/support/v4/app/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   116: pop
    //   117: new 151	com/google/android/gms/a/a/b
    //   120: dup
    //   121: aload_0
    //   122: getfield 132	com/google/android/gms/a/a/a:b	Lcom/google/android/gms/internal/zzav;
    //   125: invokeinterface 156 1 0
    //   130: aload_0
    //   131: getfield 132	com/google/android/gms/a/a/a:b	Lcom/google/android/gms/internal/zzav;
    //   134: iconst_1
    //   135: invokeinterface 159 2 0
    //   140: invokespecial 162	com/google/android/gms/a/a/b:<init>	(Ljava/lang/String;Z)V
    //   143: astore 4
    //   145: aload_0
    //   146: monitorexit
    //   147: aload_0
    //   148: getfield 25	com/google/android/gms/a/a/a:d	Ljava/lang/Object;
    //   151: astore 5
    //   153: aload 5
    //   155: monitorenter
    //   156: aload_0
    //   157: getfield 138	com/google/android/gms/a/a/a:e	Lcom/google/android/gms/a/a/c;
    //   160: ifnull +20 -> 180
    //   163: aload_0
    //   164: getfield 138	com/google/android/gms/a/a/a:e	Lcom/google/android/gms/a/a/c;
    //   167: getfield 165	com/google/android/gms/a/a/c:a	Ljava/util/concurrent/CountDownLatch;
    //   170: invokevirtual 170	java/util/concurrent/CountDownLatch:countDown	()V
    //   173: aload_0
    //   174: getfield 138	com/google/android/gms/a/a/a:e	Lcom/google/android/gms/a/a/c;
    //   177: invokevirtual 173	com/google/android/gms/a/a/c:join	()V
    //   180: aload_0
    //   181: getfield 38	com/google/android/gms/a/a/a:g	J
    //   184: lconst_0
    //   185: lcmp
    //   186: ifle +19 -> 205
    //   189: aload_0
    //   190: new 140	com/google/android/gms/a/a/c
    //   193: dup
    //   194: aload_0
    //   195: aload_0
    //   196: getfield 38	com/google/android/gms/a/a/a:g	J
    //   199: invokespecial 176	com/google/android/gms/a/a/c:<init>	(Lcom/google/android/gms/a/a/a;J)V
    //   202: putfield 138	com/google/android/gms/a/a/a:e	Lcom/google/android/gms/a/a/c;
    //   205: aload 5
    //   207: monitorexit
    //   208: aload 4
    //   210: areturn
    //   211: astore 8
    //   213: new 63	java/io/IOException
    //   216: dup
    //   217: ldc 178
    //   219: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   222: athrow
    //   223: astore 6
    //   225: aload 5
    //   227: monitorexit
    //   228: aload 6
    //   230: athrow
    //   231: astore 7
    //   233: goto -53 -> 180
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
    //   66	70	58	finally
    //   70	87	58	finally
    //   89	101	58	finally
    //   101	117	58	finally
    //   117	145	58	finally
    //   145	147	58	finally
    //   213	223	58	finally
    //   66	70	87	java/lang/Exception
    //   117	145	211	android/os/RemoteException
    //   156	173	223	finally
    //   173	180	223	finally
    //   180	205	223	finally
    //   205	208	223	finally
    //   225	228	223	finally
    //   173	180	231	java/lang/InterruptedException
  }

  // ERROR //
  public final void a()
  {
    // Byte code:
    //   0: ldc 121
    //   2: invokestatic 124	android/support/v4/app/d:k	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 32	com/google/android/gms/a/a/a:f	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 128	com/google/android/gms/a/a/a:a	Lcom/google/android/gms/common/b;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 34	com/google/android/gms/a/a/a:c	Z
    //   28: ifeq +18 -> 46
    //   31: invokestatic 108	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   34: pop
    //   35: aload_0
    //   36: getfield 32	com/google/android/gms/a/a/a:f	Landroid/content/Context;
    //   39: aload_0
    //   40: getfield 128	com/google/android/gms/a/a/a:a	Lcom/google/android/gms/common/b;
    //   43: invokevirtual 184	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   46: aload_0
    //   47: iconst_0
    //   48: putfield 34	com/google/android/gms/a/a/a:c	Z
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield 132	com/google/android/gms/a/a/a:b	Lcom/google/android/gms/internal/zzav;
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 128	com/google/android/gms/a/a/a:a	Lcom/google/android/gms/common/b;
    //   61: aload_0
    //   62: monitorexit
    //   63: return
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: astore_2
    //   70: goto -24 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	64	finally
    //   21	23	64	finally
    //   24	46	64	finally
    //   46	63	64	finally
    //   65	67	64	finally
    //   24	46	69	java/lang/IllegalArgumentException
  }

  protected final void finalize()
  {
    a();
    super.finalize();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.a.a.a
 * JD-Core Version:    0.6.0
 */