package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.support.v4.app.d;

public final class ab
  implements ServiceConnection
{
  private volatile zzac b;
  private volatile boolean c;

  protected ab(z paramz)
  {
  }

  // ERROR //
  public final zzac a()
  {
    // Byte code:
    //   0: invokestatic 27	com/google/android/gms/analytics/internal/w:r	()V
    //   3: new 29	android/content/Intent
    //   6: dup
    //   7: ldc 31
    //   9: invokespecial 34	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   12: astore_1
    //   13: aload_1
    //   14: new 36	android/content/ComponentName
    //   17: dup
    //   18: ldc 38
    //   20: ldc 40
    //   22: invokespecial 43	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: invokevirtual 47	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   28: pop
    //   29: aload_0
    //   30: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   33: invokevirtual 53	com/google/android/gms/analytics/internal/z:k	()Landroid/content/Context;
    //   36: astore_3
    //   37: aload_1
    //   38: ldc 55
    //   40: aload_3
    //   41: invokevirtual 61	android/content/Context:getPackageName	()Ljava/lang/String;
    //   44: invokevirtual 65	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   47: pop
    //   48: invokestatic 70	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   51: pop
    //   52: aload_0
    //   53: monitorenter
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 72	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/zzac;
    //   59: aload_0
    //   60: iconst_1
    //   61: putfield 74	com/google/android/gms/analytics/internal/ab:c	Z
    //   64: aload_3
    //   65: aload_1
    //   66: aload_0
    //   67: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   70: invokestatic 77	com/google/android/gms/analytics/internal/z:a	(Lcom/google/android/gms/analytics/internal/z;)Lcom/google/android/gms/analytics/internal/ab;
    //   73: sipush 129
    //   76: invokestatic 80	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   79: istore 7
    //   81: aload_0
    //   82: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   85: ldc 82
    //   87: iload 7
    //   89: invokestatic 88	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   92: invokevirtual 91	com/google/android/gms/analytics/internal/z:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   95: iload 7
    //   97: ifne +12 -> 109
    //   100: aload_0
    //   101: iconst_0
    //   102: putfield 74	com/google/android/gms/analytics/internal/ab:c	Z
    //   105: aload_0
    //   106: monitorexit
    //   107: aconst_null
    //   108: areturn
    //   109: aload_0
    //   110: getstatic 97	com/google/android/gms/analytics/internal/az:B	Lcom/google/android/gms/analytics/internal/ba;
    //   113: invokevirtual 102	com/google/android/gms/analytics/internal/ba:a	()Ljava/lang/Object;
    //   116: checkcast 104	java/lang/Long
    //   119: invokevirtual 108	java/lang/Long:longValue	()J
    //   122: invokevirtual 112	java/lang/Object:wait	(J)V
    //   125: aload_0
    //   126: iconst_0
    //   127: putfield 74	com/google/android/gms/analytics/internal/ab:c	Z
    //   130: aload_0
    //   131: getfield 72	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/zzac;
    //   134: astore 9
    //   136: aload_0
    //   137: aconst_null
    //   138: putfield 72	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/zzac;
    //   141: aload 9
    //   143: ifnonnull +12 -> 155
    //   146: aload_0
    //   147: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   150: ldc 114
    //   152: invokevirtual 117	com/google/android/gms/analytics/internal/z:g	(Ljava/lang/String;)V
    //   155: aload_0
    //   156: monitorexit
    //   157: aload 9
    //   159: areturn
    //   160: astore 6
    //   162: aload_0
    //   163: monitorexit
    //   164: aload 6
    //   166: athrow
    //   167: astore 8
    //   169: aload_0
    //   170: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   173: ldc 119
    //   175: invokevirtual 122	com/google/android/gms/analytics/internal/z:f	(Ljava/lang/String;)V
    //   178: goto -53 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   54	95	160	finally
    //   100	107	160	finally
    //   109	125	160	finally
    //   125	141	160	finally
    //   146	155	160	finally
    //   155	157	160	finally
    //   162	164	160	finally
    //   169	178	160	finally
    //   109	125	167	java/lang/InterruptedException
  }

  // ERROR //
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: ldc 130
    //   2: invokestatic 135	android/support/v4/app/d:j	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_2
    //   8: ifnonnull +19 -> 27
    //   11: aload_0
    //   12: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   15: ldc 137
    //   17: invokevirtual 117	com/google/android/gms/analytics/internal/z:g	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: invokevirtual 140	java/lang/Object:notifyAll	()V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aconst_null
    //   28: astore_3
    //   29: aload_2
    //   30: invokeinterface 145 1 0
    //   35: astore 9
    //   37: ldc 147
    //   39: aload 9
    //   41: invokevirtual 153	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   44: istore 10
    //   46: aconst_null
    //   47: astore_3
    //   48: iload 10
    //   50: ifeq +56 -> 106
    //   53: aload_2
    //   54: invokestatic 158	com/google/android/gms/analytics/internal/zzac$zza:a	(Landroid/os/IBinder;)Lcom/google/android/gms/analytics/internal/zzac;
    //   57: astore_3
    //   58: aload_0
    //   59: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   62: ldc 160
    //   64: invokevirtual 162	com/google/android/gms/analytics/internal/z:c	(Ljava/lang/String;)V
    //   67: aload_3
    //   68: ifnonnull +77 -> 145
    //   71: invokestatic 70	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   74: pop
    //   75: aload_0
    //   76: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   79: invokevirtual 53	com/google/android/gms/analytics/internal/z:k	()Landroid/content/Context;
    //   82: aload_0
    //   83: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   86: invokestatic 77	com/google/android/gms/analytics/internal/z:a	(Lcom/google/android/gms/analytics/internal/z;)Lcom/google/android/gms/analytics/internal/ab;
    //   89: invokevirtual 166	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   92: aload_0
    //   93: invokevirtual 140	java/lang/Object:notifyAll	()V
    //   96: aload_0
    //   97: monitorexit
    //   98: return
    //   99: astore 5
    //   101: aload_0
    //   102: monitorexit
    //   103: aload 5
    //   105: athrow
    //   106: aload_0
    //   107: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   110: ldc 168
    //   112: aload 9
    //   114: invokevirtual 171	com/google/android/gms/analytics/internal/z:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   117: aconst_null
    //   118: astore_3
    //   119: goto -52 -> 67
    //   122: astore 6
    //   124: aload_0
    //   125: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   128: ldc 173
    //   130: invokevirtual 117	com/google/android/gms/analytics/internal/z:g	(Ljava/lang/String;)V
    //   133: goto -66 -> 67
    //   136: astore 4
    //   138: aload_0
    //   139: invokevirtual 140	java/lang/Object:notifyAll	()V
    //   142: aload 4
    //   144: athrow
    //   145: aload_0
    //   146: getfield 74	com/google/android/gms/analytics/internal/ab:c	Z
    //   149: ifne +34 -> 183
    //   152: aload_0
    //   153: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   156: ldc 175
    //   158: invokevirtual 122	com/google/android/gms/analytics/internal/z:f	(Ljava/lang/String;)V
    //   161: aload_0
    //   162: getfield 16	com/google/android/gms/analytics/internal/ab:a	Lcom/google/android/gms/analytics/internal/z;
    //   165: invokevirtual 179	com/google/android/gms/analytics/internal/z:n	()Lcom/google/android/gms/internal/z;
    //   168: new 181	com/google/android/gms/analytics/internal/ac
    //   171: dup
    //   172: aload_0
    //   173: aload_3
    //   174: invokespecial 184	com/google/android/gms/analytics/internal/ac:<init>	(Lcom/google/android/gms/analytics/internal/ab;Lcom/google/android/gms/analytics/internal/zzac;)V
    //   177: invokevirtual 189	com/google/android/gms/internal/z:a	(Ljava/lang/Runnable;)V
    //   180: goto -88 -> 92
    //   183: aload_0
    //   184: aload_3
    //   185: putfield 72	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/zzac;
    //   188: goto -96 -> 92
    //   191: astore 7
    //   193: goto -101 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   20	26	99	finally
    //   92	98	99	finally
    //   101	103	99	finally
    //   138	145	99	finally
    //   29	46	122	android/os/RemoteException
    //   53	67	122	android/os/RemoteException
    //   106	117	122	android/os/RemoteException
    //   11	20	136	finally
    //   29	46	136	finally
    //   53	67	136	finally
    //   71	92	136	finally
    //   106	117	136	finally
    //   124	133	136	finally
    //   145	180	136	finally
    //   183	188	136	finally
    //   71	92	191	java/lang/IllegalArgumentException
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    d.j("AnalyticsServiceConnection.onServiceDisconnected");
    this.a.n().a(new ad(this, paramComponentName));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.ab
 * JD-Core Version:    0.6.0
 */