import java.util.concurrent.BlockingQueue;

public final class er extends Thread
{
  volatile boolean a = false;
  private final BlockingQueue b;
  private final eq c;
  private final ei d;
  private final fc e;

  public er(BlockingQueue paramBlockingQueue, eq parameq, ei paramei, fc paramfc)
  {
    super("VolleyNetworkDispatcher");
    this.b = paramBlockingQueue;
    this.c = parameq;
    this.d = paramei;
    this.e = paramfc;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 45	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 51	android/os/SystemClock:elapsedRealtime	()J
    //   8: pop2
    //   9: aload_0
    //   10: getfield 25	er:b	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 57 1 0
    //   18: checkcast 59	ev
    //   21: astore 4
    //   23: aload 4
    //   25: ldc 61
    //   27: invokevirtual 63	ev:a	(Ljava/lang/String;)V
    //   30: getstatic 69	android/os/Build$VERSION:SDK_INT	I
    //   33: bipush 14
    //   35: if_icmplt +11 -> 46
    //   38: aload 4
    //   40: getfield 71	ev:d	I
    //   43: invokestatic 76	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   46: aload_0
    //   47: getfield 27	er:c	Leq;
    //   50: aload 4
    //   52: invokeinterface 81 2 0
    //   57: astore 14
    //   59: aload 4
    //   61: ldc 83
    //   63: invokevirtual 63	ev:a	(Ljava/lang/String;)V
    //   66: aload 14
    //   68: getfield 87	et:c	Z
    //   71: ifeq +52 -> 123
    //   74: aload 4
    //   76: getfield 90	ev:i	Z
    //   79: ifeq +44 -> 123
    //   82: aload 4
    //   84: ldc 92
    //   86: invokevirtual 94	ev:b	(Ljava/lang/String;)V
    //   89: goto -84 -> 5
    //   92: astore 11
    //   94: invokestatic 51	android/os/SystemClock:elapsedRealtime	()J
    //   97: pop2
    //   98: aload_0
    //   99: getfield 31	er:e	Lfc;
    //   102: aload 4
    //   104: aload 11
    //   106: invokeinterface 99 3 0
    //   111: goto -106 -> 5
    //   114: astore_3
    //   115: aload_0
    //   116: getfield 23	er:a	Z
    //   119: ifeq -114 -> 5
    //   122: return
    //   123: aload 4
    //   125: aload 14
    //   127: invokevirtual 102	ev:a	(Let;)Lez;
    //   130: astore 15
    //   132: aload 4
    //   134: ldc 104
    //   136: invokevirtual 63	ev:a	(Ljava/lang/String;)V
    //   139: aload 4
    //   141: getfield 107	ev:h	Z
    //   144: ifeq +37 -> 181
    //   147: aload 15
    //   149: getfield 112	ez:b	Lej;
    //   152: ifnull +29 -> 181
    //   155: aload_0
    //   156: getfield 29	er:d	Lei;
    //   159: aload 4
    //   161: getfield 115	ev:c	Ljava/lang/String;
    //   164: aload 15
    //   166: getfield 112	ez:b	Lej;
    //   169: invokeinterface 120 3 0
    //   174: aload 4
    //   176: ldc 122
    //   178: invokevirtual 63	ev:a	(Ljava/lang/String;)V
    //   181: aload 4
    //   183: iconst_1
    //   184: putfield 90	ev:i	Z
    //   187: aload_0
    //   188: getfield 31	er:e	Lfc;
    //   191: aload 4
    //   193: aload 15
    //   195: invokeinterface 125 3 0
    //   200: goto -195 -> 5
    //   203: astore 5
    //   205: iconst_1
    //   206: anewarray 127	java/lang/Object
    //   209: astore 6
    //   211: aload 6
    //   213: iconst_0
    //   214: aload 5
    //   216: invokevirtual 131	java/lang/Exception:toString	()Ljava/lang/String;
    //   219: aastore
    //   220: getstatic 135	fh:a	Ljava/lang/String;
    //   223: ldc 137
    //   225: aload 6
    //   227: invokestatic 140	fh:d	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   230: aload 5
    //   232: invokestatic 145	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   235: pop
    //   236: new 37	fg
    //   239: dup
    //   240: aload 5
    //   242: invokespecial 148	fg:<init>	(Ljava/lang/Throwable;)V
    //   245: astore 8
    //   247: invokestatic 51	android/os/SystemClock:elapsedRealtime	()J
    //   250: pop2
    //   251: aload_0
    //   252: getfield 31	er:e	Lfc;
    //   255: aload 4
    //   257: aload 8
    //   259: invokeinterface 99 3 0
    //   264: goto -259 -> 5
    //
    // Exception table:
    //   from	to	target	type
    //   23	46	92	fg
    //   46	89	92	fg
    //   123	181	92	fg
    //   181	200	92	fg
    //   9	23	114	java/lang/InterruptedException
    //   23	46	203	java/lang/Exception
    //   46	89	203	java/lang/Exception
    //   123	181	203	java/lang/Exception
    //   181	200	203	java/lang/Exception
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     er
 * JD-Core Version:    0.6.0
 */