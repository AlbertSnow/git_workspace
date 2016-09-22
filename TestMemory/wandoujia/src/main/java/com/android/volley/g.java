package com.android.volley;

import java.util.concurrent.BlockingQueue;

public final class g extends Thread
{
  private final BlockingQueue<Request> a;
  private final f b;
  private final a c;
  private final l d;
  private volatile boolean e = false;

  public g(BlockingQueue<Request> paramBlockingQueue, f paramf, a parama, l paraml)
  {
    this.a = paramBlockingQueue;
    this.b = paramf;
    this.c = parama;
    this.d = paraml;
  }

  public final void a()
  {
    this.e = true;
    interrupt();
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 46	android/os/Process:setThreadPriority	(I)V
    //   5: aload_0
    //   6: getfield 24	com/android/volley/g:a	Ljava/util/concurrent/BlockingQueue;
    //   9: invokeinterface 52 1 0
    //   14: checkcast 54	com/android/volley/Request
    //   17: astore_2
    //   18: aload_2
    //   19: ldc 56
    //   21: invokevirtual 59	com/android/volley/Request:a	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: invokevirtual 63	com/android/volley/Request:g	()Z
    //   28: ifeq +43 -> 71
    //   31: aload_2
    //   32: ldc 65
    //   34: invokevirtual 67	com/android/volley/Request:b	(Ljava/lang/String;)V
    //   37: goto -32 -> 5
    //   40: astore 5
    //   42: aload 5
    //   44: invokestatic 70	com/android/volley/Request:a	(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;
    //   47: astore 6
    //   49: aload_0
    //   50: getfield 30	com/android/volley/g:d	Lcom/android/volley/l;
    //   53: aload_2
    //   54: aload 6
    //   56: invokevirtual 75	com/android/volley/l:a	(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    //   59: goto -54 -> 5
    //   62: astore_1
    //   63: aload_0
    //   64: getfield 22	com/android/volley/g:e	Z
    //   67: ifeq -62 -> 5
    //   70: return
    //   71: getstatic 81	android/os/Build$VERSION:SDK_INT	I
    //   74: bipush 14
    //   76: if_icmplt +10 -> 86
    //   79: aload_2
    //   80: invokevirtual 84	com/android/volley/Request:b	()I
    //   83: invokestatic 89	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   86: aload_0
    //   87: getfield 26	com/android/volley/g:b	Lcom/android/volley/f;
    //   90: aload_2
    //   91: invokeinterface 94 2 0
    //   96: astore 7
    //   98: aload_2
    //   99: ldc 96
    //   101: invokevirtual 59	com/android/volley/Request:a	(Ljava/lang/String;)V
    //   104: aload 7
    //   106: getfield 100	com/wandoujia/nirvana/framework/network/a/a:c	Z
    //   109: ifeq +60 -> 169
    //   112: aload_2
    //   113: invokevirtual 103	com/android/volley/Request:s	()Z
    //   116: ifeq +53 -> 169
    //   119: aload_2
    //   120: ldc 105
    //   122: invokevirtual 67	com/android/volley/Request:b	(Ljava/lang/String;)V
    //   125: goto -120 -> 5
    //   128: astore_3
    //   129: iconst_1
    //   130: anewarray 107	java/lang/Object
    //   133: astore 4
    //   135: aload 4
    //   137: iconst_0
    //   138: aload_3
    //   139: invokevirtual 111	java/lang/Throwable:toString	()Ljava/lang/String;
    //   142: aastore
    //   143: ldc 113
    //   145: aload 4
    //   147: invokestatic 118	com/android/volley/n:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload_0
    //   151: getfield 30	com/android/volley/g:d	Lcom/android/volley/l;
    //   154: aload_2
    //   155: new 38	com/android/volley/VolleyError
    //   158: dup
    //   159: aload_3
    //   160: invokespecial 121	com/android/volley/VolleyError:<init>	(Ljava/lang/Throwable;)V
    //   163: invokevirtual 75	com/android/volley/l:a	(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    //   166: goto -161 -> 5
    //   169: aload_2
    //   170: aload 7
    //   172: invokevirtual 124	com/android/volley/Request:a	(Lcom/wandoujia/nirvana/framework/network/a/a;)Lcom/wandoujia/p4/app/detail/model/b;
    //   175: astore 8
    //   177: aload_2
    //   178: ldc 126
    //   180: invokevirtual 59	com/android/volley/Request:a	(Ljava/lang/String;)V
    //   183: aload_2
    //   184: invokevirtual 129	com/android/volley/Request:n	()Z
    //   187: ifeq +44 -> 231
    //   190: aload 8
    //   192: getfield 134	com/wandoujia/p4/app/detail/model/b:b	Lcom/wandoujia/log/toolkit/LaunchLogger;
    //   195: ifnull +36 -> 231
    //   198: aload_0
    //   199: getfield 28	com/android/volley/g:c	Lcom/android/volley/a;
    //   202: aload_2
    //   203: invokevirtual 136	com/android/volley/Request:d	()Ljava/lang/String;
    //   206: aload 8
    //   208: getfield 134	com/wandoujia/p4/app/detail/model/b:b	Lcom/wandoujia/log/toolkit/LaunchLogger;
    //   211: invokeinterface 141 3 0
    //   216: aload_2
    //   217: aload 8
    //   219: getfield 134	com/wandoujia/p4/app/detail/model/b:b	Lcom/wandoujia/log/toolkit/LaunchLogger;
    //   222: invokevirtual 144	com/android/volley/Request:a	(Lcom/wandoujia/log/toolkit/LaunchLogger;)V
    //   225: aload_2
    //   226: ldc 146
    //   228: invokevirtual 59	com/android/volley/Request:a	(Ljava/lang/String;)V
    //   231: aload_2
    //   232: invokevirtual 149	com/android/volley/Request:r	()V
    //   235: aload_0
    //   236: getfield 30	com/android/volley/g:d	Lcom/android/volley/l;
    //   239: aload_2
    //   240: aload 8
    //   242: invokevirtual 152	com/android/volley/l:a	(Lcom/android/volley/Request;Lcom/wandoujia/p4/app/detail/model/b;)V
    //   245: goto -240 -> 5
    //
    // Exception table:
    //   from	to	target	type
    //   18	37	40	com/android/volley/VolleyError
    //   71	86	40	com/android/volley/VolleyError
    //   86	125	40	com/android/volley/VolleyError
    //   169	231	40	com/android/volley/VolleyError
    //   231	245	40	com/android/volley/VolleyError
    //   5	18	62	java/lang/InterruptedException
    //   18	37	128	java/lang/Throwable
    //   71	86	128	java/lang/Throwable
    //   86	125	128	java/lang/Throwable
    //   169	231	128	java/lang/Throwable
    //   231	245	128	java/lang/Throwable
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.g
 * JD-Core Version:    0.6.0
 */