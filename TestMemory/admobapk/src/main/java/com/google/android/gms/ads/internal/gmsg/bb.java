package com.google.android.gms.ads.internal.gmsg;

import android.annotation.TargetApi;
import com.google.android.gms.ads.internal.webview.b;
import iv;

@com.google.android.gms.ads.internal.report.client.a
@TargetApi(16)
public abstract class bb extends ar
{
  public final com.google.android.gms.ads.internal.overlay.a d = new com.google.android.gms.ads.internal.overlay.a();
  String e = null;
  public boolean f;
  private boolean g;

  public bb(b paramb)
  {
    super(paramb);
    this.d.a(new bc(this));
  }

  public final void a()
  {
    monitorenter;
    try
    {
      this.g = true;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  public final boolean a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 48	com/google/android/gms/ads/internal/gmsg/bb:c	(Ljava/lang/String;)Liv;
    //   5: astore_2
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 52	com/google/android/gms/ads/internal/gmsg/bb:b	(Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_3
    //   12: ldc 54
    //   14: astore 4
    //   16: aconst_null
    //   17: astore 5
    //   19: aload_0
    //   20: getfield 28	com/google/android/gms/ads/internal/gmsg/bb:d	Lcom/google/android/gms/ads/internal/overlay/a;
    //   23: aload_2
    //   24: invokevirtual 57	com/google/android/gms/ads/internal/overlay/a:a	(Liv;)Z
    //   27: ifne +100 -> 127
    //   30: ldc 59
    //   32: astore 4
    //   34: ldc 61
    //   36: astore 5
    //   38: aload_0
    //   39: invokevirtual 63	com/google/android/gms/ads/internal/gmsg/bb:b	()V
    //   42: new 42	java/io/IOException
    //   45: dup
    //   46: ldc 65
    //   48: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   51: athrow
    //   52: astore 6
    //   54: aload 6
    //   56: invokevirtual 72	java/io/IOException:getMessage	()Ljava/lang/String;
    //   59: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   62: astore 7
    //   64: new 80	java/lang/StringBuilder
    //   67: dup
    //   68: bipush 34
    //   70: aload_1
    //   71: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   74: invokevirtual 84	java/lang/String:length	()I
    //   77: iadd
    //   78: aload 7
    //   80: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   83: invokevirtual 84	java/lang/String:length	()I
    //   86: iadd
    //   87: invokespecial 87	java/lang/StringBuilder:<init>	(I)V
    //   90: ldc 89
    //   92: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: aload_1
    //   96: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: ldc 95
    //   101: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: aload 7
    //   106: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokestatic 102	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   115: aload_0
    //   116: aload_1
    //   117: aload_3
    //   118: aload 4
    //   120: aload 5
    //   122: invokevirtual 105	com/google/android/gms/ads/internal/gmsg/bb:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   125: iconst_0
    //   126: ireturn
    //   127: aload_0
    //   128: getfield 28	com/google/android/gms/ads/internal/gmsg/bb:d	Lcom/google/android/gms/ads/internal/overlay/a;
    //   131: getfield 108	com/google/android/gms/ads/internal/overlay/a:a	Lhn;
    //   134: astore 8
    //   136: aload 8
    //   138: ifnonnull +25 -> 163
    //   141: ldc 59
    //   143: astore 4
    //   145: ldc 110
    //   147: astore 5
    //   149: aload_0
    //   150: invokevirtual 63	com/google/android/gms/ads/internal/gmsg/bb:b	()V
    //   153: new 42	java/io/IOException
    //   156: dup
    //   157: ldc 112
    //   159: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   162: athrow
    //   163: aload_0
    //   164: getfield 115	com/google/android/gms/ads/internal/gmsg/bb:c	Ljava/lang/ref/WeakReference;
    //   167: invokevirtual 121	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   170: checkcast 123	com/google/android/gms/ads/internal/webview/b
    //   173: astore 9
    //   175: aload 9
    //   177: ifnull +12 -> 189
    //   180: aload 9
    //   182: aload_3
    //   183: aload_0
    //   184: invokeinterface 126 3 0
    //   189: invokestatic 131	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   192: getfield 135	com/google/android/gms/ads/internal/bc:i	Laom;
    //   195: astore 10
    //   197: aload 10
    //   199: invokeinterface 140 1 0
    //   204: lstore 11
    //   206: getstatic 146	com/google/android/gms/ads/internal/config/m:k	Lcom/google/android/gms/ads/internal/config/d;
    //   209: invokevirtual 150	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   212: checkcast 152	java/lang/Long
    //   215: invokevirtual 155	java/lang/Long:longValue	()J
    //   218: lstore 13
    //   220: ldc2_w 156
    //   223: getstatic 160	com/google/android/gms/ads/internal/config/m:j	Lcom/google/android/gms/ads/internal/config/d;
    //   226: invokevirtual 150	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   229: checkcast 152	java/lang/Long
    //   232: invokevirtual 155	java/lang/Long:longValue	()J
    //   235: lmul
    //   236: lstore 15
    //   238: ldc2_w 161
    //   241: lstore 17
    //   243: aload_0
    //   244: monitorenter
    //   245: aload 10
    //   247: invokeinterface 140 1 0
    //   252: lload 11
    //   254: lsub
    //   255: lload 15
    //   257: lcmp
    //   258: ifle +87 -> 345
    //   261: ldc 164
    //   263: astore 20
    //   265: lload 15
    //   267: invokestatic 167	java/lang/Long:toString	(J)Ljava/lang/String;
    //   270: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   273: astore 22
    //   275: new 80	java/lang/StringBuilder
    //   278: dup
    //   279: bipush 27
    //   281: aload 22
    //   283: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   286: invokevirtual 84	java/lang/String:length	()I
    //   289: iadd
    //   290: invokespecial 87	java/lang/StringBuilder:<init>	(I)V
    //   293: ldc 169
    //   295: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: aload 22
    //   300: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: ldc 171
    //   305: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: astore 23
    //   313: aload 23
    //   315: astore 21
    //   317: new 42	java/io/IOException
    //   320: dup
    //   321: ldc 173
    //   323: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   326: athrow
    //   327: aload_0
    //   328: monitorexit
    //   329: aload 19
    //   331: athrow
    //   332: astore 6
    //   334: aload 21
    //   336: astore 5
    //   338: aload 20
    //   340: astore 4
    //   342: goto -288 -> 54
    //   345: aload_0
    //   346: getfield 39	com/google/android/gms/ads/internal/gmsg/bb:g	Z
    //   349: ifeq +47 -> 396
    //   352: aload_0
    //   353: getfield 21	com/google/android/gms/ads/internal/gmsg/bb:e	Ljava/lang/String;
    //   356: invokestatic 179	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   359: ifne +27 -> 386
    //   362: aload_0
    //   363: getfield 21	com/google/android/gms/ads/internal/gmsg/bb:e	Ljava/lang/String;
    //   366: astore 32
    //   368: ldc 181
    //   370: astore 20
    //   372: aload 32
    //   374: astore 21
    //   376: new 42	java/io/IOException
    //   379: dup
    //   380: ldc 183
    //   382: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   385: athrow
    //   386: ldc 185
    //   388: astore 20
    //   390: aconst_null
    //   391: astore 21
    //   393: goto -17 -> 376
    //   396: aload_0
    //   397: getfield 187	com/google/android/gms/ads/internal/gmsg/bb:f	Z
    //   400: ifeq +8 -> 408
    //   403: aload_0
    //   404: monitorexit
    //   405: goto +160 -> 565
    //   408: aload 8
    //   410: invokeinterface 191 1 0
    //   415: lstore 24
    //   417: lload 24
    //   419: lconst_0
    //   420: lcmp
    //   421: ifle +89 -> 510
    //   424: aload 8
    //   426: invokeinterface 193 1 0
    //   431: lstore 26
    //   433: lload 26
    //   435: lload 17
    //   437: lcmp
    //   438: ifeq +40 -> 478
    //   441: lload 26
    //   443: lconst_0
    //   444: lcmp
    //   445: ifle +134 -> 579
    //   448: iconst_1
    //   449: istore 30
    //   451: getstatic 198	com/google/android/gms/ads/internal/util/client/a:a	Landroid/os/Handler;
    //   454: new 200	com/google/android/gms/ads/internal/gmsg/at
    //   457: dup
    //   458: aload_0
    //   459: aload_1
    //   460: aload_3
    //   461: lload 26
    //   463: lload 24
    //   465: iload 30
    //   467: invokespecial 203	com/google/android/gms/ads/internal/gmsg/at:<init>	(Lcom/google/android/gms/ads/internal/gmsg/ar;Ljava/lang/String;Ljava/lang/String;JJZ)V
    //   470: invokevirtual 209	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   473: pop
    //   474: lload 26
    //   476: lstore 17
    //   478: lload 26
    //   480: lload 24
    //   482: lcmp
    //   483: iflt +27 -> 510
    //   486: getstatic 198	com/google/android/gms/ads/internal/util/client/a:a	Landroid/os/Handler;
    //   489: new 211	com/google/android/gms/ads/internal/gmsg/av
    //   492: dup
    //   493: aload_0
    //   494: aload_1
    //   495: aload_3
    //   496: lload 24
    //   498: invokespecial 214	com/google/android/gms/ads/internal/gmsg/av:<init>	(Lcom/google/android/gms/ads/internal/gmsg/ar;Ljava/lang/String;Ljava/lang/String;J)V
    //   501: invokevirtual 209	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   504: pop
    //   505: aload_0
    //   506: monitorexit
    //   507: goto +58 -> 565
    //   510: aload_0
    //   511: monitorexit
    //   512: lload 13
    //   514: invokestatic 220	java/lang/Thread:sleep	(J)V
    //   517: goto -274 -> 243
    //   520: astore 29
    //   522: ldc 54
    //   524: astore 4
    //   526: ldc 222
    //   528: astore 5
    //   530: new 42	java/io/IOException
    //   533: dup
    //   534: ldc 224
    //   536: invokespecial 68	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   539: athrow
    //   540: astore 19
    //   542: aconst_null
    //   543: astore 21
    //   545: goto -218 -> 327
    //   548: astore 19
    //   550: ldc 181
    //   552: astore 20
    //   554: aconst_null
    //   555: astore 21
    //   557: goto -230 -> 327
    //   560: astore 19
    //   562: goto -235 -> 327
    //   565: iconst_1
    //   566: ireturn
    //   567: astore 19
    //   569: aload 4
    //   571: astore 20
    //   573: aconst_null
    //   574: astore 21
    //   576: goto -249 -> 327
    //   579: iconst_0
    //   580: istore 30
    //   582: goto -131 -> 451
    //
    // Exception table:
    //   from	to	target	type
    //   19	30	52	java/io/IOException
    //   38	52	52	java/io/IOException
    //   127	136	52	java/io/IOException
    //   149	163	52	java/io/IOException
    //   163	175	52	java/io/IOException
    //   180	189	52	java/io/IOException
    //   189	238	52	java/io/IOException
    //   243	245	52	java/io/IOException
    //   512	517	52	java/io/IOException
    //   530	540	52	java/io/IOException
    //   329	332	332	java/io/IOException
    //   512	517	520	java/lang/InterruptedException
    //   265	313	540	finally
    //   362	368	548	finally
    //   317	327	560	finally
    //   327	329	560	finally
    //   376	386	560	finally
    //   245	261	567	finally
    //   345	362	567	finally
    //   396	405	567	finally
    //   408	417	567	finally
    //   424	433	567	finally
    //   451	474	567	finally
    //   486	507	567	finally
    //   510	512	567	finally
  }

  protected final String b(String paramString)
  {
    String str1 = String.valueOf("cache:");
    String str2 = String.valueOf(super.b(paramString));
    if (str2.length() != 0)
      return str1.concat(str2);
    return new String(str1);
  }

  public final void b()
  {
    this.d.a();
    super.b();
  }

  protected abstract iv c(String paramString);

  public final void c()
  {
    monitorenter;
    try
    {
      this.f = true;
      this.d.b();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.bb
 * JD-Core Version:    0.6.0
 */