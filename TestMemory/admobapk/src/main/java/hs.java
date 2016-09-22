import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

final class hs
  implements Handler.Callback
{
  final Handler a;
  int b = 0;
  volatile long c;
  volatile long d;
  volatile long e;
  private final HandlerThread f;
  private final Handler g;
  private final hu h;
  private final boolean[] i;
  private final long j;
  private final long k;
  private final List l;
  private ix[] m;
  private ix n;
  private boolean o;
  private boolean p;
  private boolean q;
  private int r;
  private int s = 0;
  private long t;

  public hs(Handler paramHandler, boolean paramBoolean, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2)
  {
    this.g = paramHandler;
    this.p = paramBoolean;
    this.i = new boolean[paramArrayOfBoolean.length];
    this.j = (1000L * paramInt1);
    this.k = (1000L * paramInt2);
    while (i1 < paramArrayOfBoolean.length)
    {
      this.i[i1] = paramArrayOfBoolean[i1];
      i1++;
    }
    this.r = 1;
    this.c = -1L;
    this.e = -1L;
    this.h = new hu();
    this.l = new ArrayList(paramArrayOfBoolean.length);
    this.f = new lw(String.valueOf(getClass().getSimpleName()).concat(":Handler"), -16);
    this.f.start();
    this.a = new Handler(this.f.getLooper(), this);
  }

  private final void a(int paramInt)
  {
    if (this.r != paramInt)
    {
      this.r = paramInt;
      this.g.obtainMessage(1, paramInt, 0).sendToTarget();
    }
  }

  private final void a(int paramInt, long paramLong1, long paramLong2)
  {
    long l1 = paramLong1 + paramLong2 - SystemClock.elapsedRealtime();
    if (l1 <= 0L)
    {
      this.a.sendEmptyMessage(paramInt);
      return;
    }
    this.a.sendEmptyMessageDelayed(paramInt, l1);
  }

  private final boolean a(ix paramix)
  {
    if (paramix.d());
    while (true)
    {
      return true;
      if (!paramix.e())
        return false;
      if (this.r == 4)
        continue;
      long l1 = paramix.l();
      long l2 = paramix.m();
      long l3;
      if (this.q)
        l3 = this.k;
      while ((l3 > 0L) && (l2 != -1L) && (l2 != -3L) && (l2 < l3 + this.d) && ((l1 == -1L) || (l1 == -2L) || (l2 < l1)))
      {
        return false;
        l3 = this.j;
      }
    }
  }

  private final void b()
  {
    this.q = false;
    hu localhu = this.h;
    if (!localhu.a)
    {
      localhu.a = true;
      localhu.c = hu.b(localhu.b);
    }
    for (int i1 = 0; i1 < this.l.size(); i1++)
      ((ix)this.l.get(i1)).n();
  }

  private static void b(ix paramix)
  {
    if (paramix.g == 3)
      if (paramix.g != 3)
        break label32;
    label32: for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      paramix.g = 2;
      paramix.c();
      return;
    }
  }

  private final void c()
  {
    this.h.a();
    for (int i1 = 0; i1 < this.l.size(); i1++)
      b((ix)this.l.get(i1));
  }

  private final void d()
  {
    if ((this.n != null) && (this.l.contains(this.n)) && (!this.n.d()))
    {
      this.d = this.n.f();
      this.h.a(this.d);
      this.t = (1000L * SystemClock.elapsedRealtime());
      return;
    }
    hu localhu = this.h;
    long l1;
    if (localhu.a)
      l1 = hu.b(localhu.c);
    while (true)
    {
      this.d = l1;
      break;
      l1 = localhu.b;
    }
  }

  private final void e()
  {
    f();
    a(1);
  }

  // ERROR //
  private final void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 122	hs:a	Landroid/os/Handler;
    //   4: bipush 7
    //   6: invokevirtual 224	android/os/Handler:removeMessages	(I)V
    //   9: aload_0
    //   10: getfield 122	hs:a	Landroid/os/Handler;
    //   13: iconst_2
    //   14: invokevirtual 224	android/os/Handler:removeMessages	(I)V
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield 160	hs:q	Z
    //   22: aload_0
    //   23: getfield 70	hs:h	Lhu;
    //   26: invokevirtual 198	hu:a	()V
    //   29: aload_0
    //   30: getfield 226	hs:m	[Lix;
    //   33: ifnonnull +4 -> 37
    //   36: return
    //   37: iconst_0
    //   38: istore_1
    //   39: iload_1
    //   40: aload_0
    //   41: getfield 226	hs:m	[Lix;
    //   44: arraylength
    //   45: if_icmpge +139 -> 184
    //   48: aload_0
    //   49: getfield 226	hs:m	[Lix;
    //   52: iload_1
    //   53: aaload
    //   54: astore_2
    //   55: aload_2
    //   56: invokestatic 200	hs:b	(Lix;)V
    //   59: aload_2
    //   60: getfield 189	ix:g	I
    //   63: iconst_2
    //   64: if_icmpne +7 -> 71
    //   67: aload_2
    //   68: invokevirtual 228	ix:o	()V
    //   71: aload_2
    //   72: getfield 189	ix:g	I
    //   75: iconst_2
    //   76: if_icmpeq +72 -> 148
    //   79: aload_2
    //   80: getfield 189	ix:g	I
    //   83: iconst_3
    //   84: if_icmpeq +64 -> 148
    //   87: aload_2
    //   88: getfield 189	ix:g	I
    //   91: bipush 254
    //   93: if_icmpeq +55 -> 148
    //   96: iconst_1
    //   97: istore 9
    //   99: iload 9
    //   101: invokestatic 194	lp:b	(Z)V
    //   104: aload_2
    //   105: bipush 254
    //   107: putfield 189	ix:g	I
    //   110: aload_2
    //   111: invokevirtual 230	ix:k	()V
    //   114: iinc 1 1
    //   117: goto -78 -> 39
    //   120: astore 10
    //   122: ldc 232
    //   124: ldc 234
    //   126: aload 10
    //   128: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   131: pop
    //   132: goto -61 -> 71
    //   135: astore_3
    //   136: ldc 232
    //   138: ldc 234
    //   140: aload_3
    //   141: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   144: pop
    //   145: goto -74 -> 71
    //   148: iconst_0
    //   149: istore 9
    //   151: goto -52 -> 99
    //   154: astore 7
    //   156: ldc 232
    //   158: ldc 241
    //   160: aload 7
    //   162: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   165: pop
    //   166: goto -52 -> 114
    //   169: astore 5
    //   171: ldc 232
    //   173: ldc 241
    //   175: aload 5
    //   177: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   180: pop
    //   181: goto -67 -> 114
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield 226	hs:m	[Lix;
    //   189: aload_0
    //   190: aconst_null
    //   191: putfield 202	hs:n	Lix;
    //   194: aload_0
    //   195: getfield 77	hs:l	Ljava/util/List;
    //   198: invokeinterface 244 1 0
    //   203: return
    //
    // Exception table:
    //   from	to	target	type
    //   55	71	120	hm
    //   55	71	135	java/lang/RuntimeException
    //   71	96	154	hm
    //   99	114	154	hm
    //   71	96	169	java/lang/RuntimeException
    //   99	114	169	java/lang/RuntimeException
  }

  public final void a()
  {
    monitorenter;
    while (true)
    {
      try
      {
        boolean bool1 = this.o;
        if (bool1)
          return;
        this.a.sendEmptyMessage(5);
        boolean bool2 = this.o;
        if (!bool2)
        {
          try
          {
            wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      this.f.quit();
    }
  }

  public final void a(ho paramho, int paramInt, Object paramObject)
  {
    monitorenter;
    try
    {
      if (this.o)
      {
        Log.w("ExoPlayerImplInternal", 57 + "Sent message(" + paramInt + ") after release. Message ignored.");
        return;
      }
      int i1 = this.b;
      this.b = (i1 + 1);
      this.a.obtainMessage(9, paramInt, 0, Pair.create(paramho, paramObject)).sendToTarget();
      while (true)
      {
        int i2 = this.s;
        if (i2 > i1)
          break;
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  public final boolean handleMessage(Message paramMessage)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 299	android/os/Message:what	I
    //   4: tableswitch	default:+1516 -> 1520, 1:+52->56, 2:+136->140, 3:+566->570, 4:+1145->1149, 5:+1151->1155, 6:+1013->1017, 7:+685->689, 8:+1304->1308, 9:+1182->1186
    //   57: getfield 303	android/os/Message:obj	Ljava/lang/Object;
    //   60: checkcast 304	[Lix;
    //   63: astore 66
    //   65: aload_0
    //   66: invokespecial 215	hs:f	()V
    //   69: aload_0
    //   70: aload 66
    //   72: putfield 226	hs:m	[Lix;
    //   75: iconst_0
    //   76: istore 67
    //   78: iload 67
    //   80: aload 66
    //   82: arraylength
    //   83: if_icmpge +41 -> 124
    //   86: aload 66
    //   88: iload 67
    //   90: aaload
    //   91: invokevirtual 306	ix:a	()Z
    //   94: ifeq +1428 -> 1522
    //   97: aload_0
    //   98: getfield 202	hs:n	Lix;
    //   101: ifnonnull +1427 -> 1528
    //   104: iconst_1
    //   105: istore 69
    //   107: iload 69
    //   109: invokestatic 194	lp:b	(Z)V
    //   112: aload_0
    //   113: aload 66
    //   115: iload 67
    //   117: aaload
    //   118: putfield 202	hs:n	Lix;
    //   121: goto +1401 -> 1522
    //   124: aload_0
    //   125: iconst_2
    //   126: invokespecial 217	hs:a	(I)V
    //   129: aload_0
    //   130: getfield 122	hs:a	Landroid/os/Handler;
    //   133: iconst_2
    //   134: invokevirtual 142	android/os/Handler:sendEmptyMessage	(I)Z
    //   137: pop
    //   138: iconst_1
    //   139: ireturn
    //   140: invokestatic 138	android/os/SystemClock:elapsedRealtime	()J
    //   143: lstore 46
    //   145: iconst_0
    //   146: istore 48
    //   148: iconst_1
    //   149: istore 49
    //   151: iload 48
    //   153: aload_0
    //   154: getfield 226	hs:m	[Lix;
    //   157: arraylength
    //   158: if_icmpge +107 -> 265
    //   161: aload_0
    //   162: getfield 226	hs:m	[Lix;
    //   165: iload 48
    //   167: aaload
    //   168: getfield 189	ix:g	I
    //   171: ifne +1369 -> 1540
    //   174: aload_0
    //   175: getfield 226	hs:m	[Lix;
    //   178: iload 48
    //   180: aaload
    //   181: astore 61
    //   183: aload_0
    //   184: getfield 164	hs:d	J
    //   187: lstore 62
    //   189: aload 61
    //   191: getfield 189	ix:g	I
    //   194: ifne +1352 -> 1546
    //   197: iconst_1
    //   198: istore 64
    //   200: iload 64
    //   202: invokestatic 194	lp:b	(Z)V
    //   205: aload 61
    //   207: aload 61
    //   209: lload 62
    //   211: invokevirtual 309	ix:b	(J)I
    //   214: putfield 189	ix:g	I
    //   217: aload 61
    //   219: getfield 189	ix:g	I
    //   222: ifeq +1312 -> 1534
    //   225: aload 61
    //   227: getfield 189	ix:g	I
    //   230: iconst_1
    //   231: if_icmpeq +1303 -> 1534
    //   234: aload 61
    //   236: getfield 189	ix:g	I
    //   239: iconst_m1
    //   240: if_icmpne +1312 -> 1552
    //   243: goto +1291 -> 1534
    //   246: iload 65
    //   248: invokestatic 194	lp:b	(Z)V
    //   251: aload 61
    //   253: getfield 189	ix:g	I
    //   256: ifne +1284 -> 1540
    //   259: iconst_0
    //   260: istore 49
    //   262: goto +1278 -> 1540
    //   265: iload 49
    //   267: ifne +1293 -> 1560
    //   270: aload_0
    //   271: iconst_2
    //   272: lload 46
    //   274: ldc2_w 310
    //   277: invokespecial 313	hs:a	(IJJ)V
    //   280: goto +1278 -> 1558
    //   283: iload 54
    //   285: aload_0
    //   286: getfield 226	hs:m	[Lix;
    //   289: arraylength
    //   290: if_icmpge +140 -> 430
    //   293: aload_0
    //   294: getfield 226	hs:m	[Lix;
    //   297: iload 54
    //   299: aaload
    //   300: astore 57
    //   302: aload_0
    //   303: getfield 51	hs:i	[Z
    //   306: iload 54
    //   308: baload
    //   309: ifeq +1266 -> 1575
    //   312: aload 57
    //   314: getfield 189	ix:g	I
    //   317: iconst_1
    //   318: if_icmpne +1257 -> 1575
    //   321: aload 57
    //   323: aload_0
    //   324: getfield 164	hs:d	J
    //   327: iconst_0
    //   328: invokevirtual 316	ix:b	(JZ)V
    //   331: aload_0
    //   332: getfield 77	hs:l	Ljava/util/List;
    //   335: aload 57
    //   337: invokeinterface 319 2 0
    //   342: pop
    //   343: iload 51
    //   345: ifeq +1236 -> 1581
    //   348: aload 57
    //   350: invokevirtual 152	ix:d	()Z
    //   353: ifeq +1228 -> 1581
    //   356: iconst_1
    //   357: istore 51
    //   359: iload 50
    //   361: ifeq +1226 -> 1587
    //   364: aload_0
    //   365: aload 57
    //   367: invokespecial 321	hs:a	(Lix;)Z
    //   370: ifeq +1217 -> 1587
    //   373: iconst_1
    //   374: istore 50
    //   376: lload 52
    //   378: ldc2_w 60
    //   381: lcmp
    //   382: ifeq +1193 -> 1575
    //   385: aload 57
    //   387: invokevirtual 156	ix:l	()J
    //   390: lstore 59
    //   392: lload 59
    //   394: ldc2_w 60
    //   397: lcmp
    //   398: ifne +11 -> 409
    //   401: ldc2_w 60
    //   404: lstore 52
    //   406: goto +1169 -> 1575
    //   409: lload 59
    //   411: ldc2_w 165
    //   414: lcmp
    //   415: ifeq +1160 -> 1575
    //   418: lload 52
    //   420: lload 59
    //   422: invokestatic 327	java/lang/Math:max	(JJ)J
    //   425: lstore 52
    //   427: goto +1148 -> 1575
    //   430: aload_0
    //   431: lload 52
    //   433: putfield 63	hs:c	J
    //   436: iload 51
    //   438: ifeq +53 -> 491
    //   441: aload_0
    //   442: iconst_5
    //   443: invokespecial 217	hs:a	(I)V
    //   446: aload_0
    //   447: getfield 122	hs:a	Landroid/os/Handler;
    //   450: bipush 7
    //   452: invokevirtual 142	android/os/Handler:sendEmptyMessage	(I)Z
    //   455: pop
    //   456: goto +1102 -> 1558
    //   459: astore 4
    //   461: ldc 232
    //   463: ldc_w 329
    //   466: aload 4
    //   468: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   471: pop
    //   472: aload_0
    //   473: getfield 47	hs:g	Landroid/os/Handler;
    //   476: iconst_3
    //   477: aload 4
    //   479: invokevirtual 332	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   482: invokevirtual 131	android/os/Message:sendToTarget	()V
    //   485: aload_0
    //   486: invokespecial 334	hs:e	()V
    //   489: iconst_1
    //   490: ireturn
    //   491: iload 50
    //   493: ifeq +71 -> 564
    //   496: iconst_4
    //   497: istore 56
    //   499: aload_0
    //   500: iload 56
    //   502: invokespecial 217	hs:a	(I)V
    //   505: aload_0
    //   506: getfield 49	hs:p	Z
    //   509: ifeq -63 -> 446
    //   512: aload_0
    //   513: getfield 59	hs:r	I
    //   516: iconst_4
    //   517: if_icmpne -71 -> 446
    //   520: aload_0
    //   521: invokespecial 336	hs:b	()V
    //   524: goto -78 -> 446
    //   527: astore_2
    //   528: ldc 232
    //   530: ldc_w 338
    //   533: aload_2
    //   534: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   537: pop
    //   538: aload_0
    //   539: getfield 47	hs:g	Landroid/os/Handler;
    //   542: iconst_3
    //   543: new 219	hm
    //   546: dup
    //   547: aload_2
    //   548: iconst_1
    //   549: invokespecial 341	hm:<init>	(Ljava/lang/Throwable;Z)V
    //   552: invokevirtual 332	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   555: invokevirtual 131	android/os/Message:sendToTarget	()V
    //   558: aload_0
    //   559: invokespecial 334	hs:e	()V
    //   562: iconst_1
    //   563: ireturn
    //   564: iconst_3
    //   565: istore 56
    //   567: goto -68 -> 499
    //   570: aload_1
    //   571: getfield 344	android/os/Message:arg1	I
    //   574: istore 41
    //   576: iload 41
    //   578: ifeq +43 -> 621
    //   581: iconst_1
    //   582: istore 42
    //   584: aload_0
    //   585: iconst_0
    //   586: putfield 160	hs:q	Z
    //   589: aload_0
    //   590: iload 42
    //   592: putfield 49	hs:p	Z
    //   595: iload 42
    //   597: ifne +30 -> 627
    //   600: aload_0
    //   601: invokespecial 345	hs:c	()V
    //   604: aload_0
    //   605: invokespecial 347	hs:d	()V
    //   608: aload_0
    //   609: getfield 47	hs:g	Landroid/os/Handler;
    //   612: iconst_2
    //   613: invokevirtual 350	android/os/Handler:obtainMessage	(I)Landroid/os/Message;
    //   616: invokevirtual 131	android/os/Message:sendToTarget	()V
    //   619: iconst_1
    //   620: ireturn
    //   621: iconst_0
    //   622: istore 42
    //   624: goto -40 -> 584
    //   627: aload_0
    //   628: getfield 59	hs:r	I
    //   631: iconst_4
    //   632: if_icmpne +36 -> 668
    //   635: aload_0
    //   636: invokespecial 336	hs:b	()V
    //   639: aload_0
    //   640: getfield 122	hs:a	Landroid/os/Handler;
    //   643: bipush 7
    //   645: invokevirtual 142	android/os/Handler:sendEmptyMessage	(I)Z
    //   648: pop
    //   649: goto -41 -> 608
    //   652: astore 43
    //   654: aload_0
    //   655: getfield 47	hs:g	Landroid/os/Handler;
    //   658: iconst_2
    //   659: invokevirtual 350	android/os/Handler:obtainMessage	(I)Landroid/os/Message;
    //   662: invokevirtual 131	android/os/Message:sendToTarget	()V
    //   665: aload 43
    //   667: athrow
    //   668: aload_0
    //   669: getfield 59	hs:r	I
    //   672: iconst_3
    //   673: if_icmpne -65 -> 608
    //   676: aload_0
    //   677: getfield 122	hs:a	Landroid/os/Handler;
    //   680: bipush 7
    //   682: invokevirtual 142	android/os/Handler:sendEmptyMessage	(I)Z
    //   685: pop
    //   686: goto -78 -> 608
    //   689: ldc_w 352
    //   692: invokestatic 357	lx:a	(Ljava/lang/String;)V
    //   695: invokestatic 138	android/os/SystemClock:elapsedRealtime	()J
    //   698: lstore 27
    //   700: aload_0
    //   701: getfield 63	hs:c	J
    //   704: ldc2_w 60
    //   707: lcmp
    //   708: ifeq +895 -> 1603
    //   711: aload_0
    //   712: getfield 63	hs:c	J
    //   715: lstore 29
    //   717: iconst_1
    //   718: istore 31
    //   720: iconst_1
    //   721: istore 32
    //   723: aload_0
    //   724: invokespecial 347	hs:d	()V
    //   727: iconst_0
    //   728: istore 33
    //   730: iload 33
    //   732: aload_0
    //   733: getfield 77	hs:l	Ljava/util/List;
    //   736: invokeinterface 180 1 0
    //   741: if_icmpge +117 -> 858
    //   744: aload_0
    //   745: getfield 77	hs:l	Ljava/util/List;
    //   748: iload 33
    //   750: invokeinterface 184 2 0
    //   755: checkcast 149	ix
    //   758: astore 34
    //   760: aload 34
    //   762: aload_0
    //   763: getfield 164	hs:d	J
    //   766: aload_0
    //   767: getfield 213	hs:t	J
    //   770: invokevirtual 360	ix:a	(JJ)V
    //   773: iload 31
    //   775: ifeq +836 -> 1611
    //   778: aload 34
    //   780: invokevirtual 152	ix:d	()Z
    //   783: ifeq +828 -> 1611
    //   786: iconst_1
    //   787: istore 31
    //   789: iload 32
    //   791: ifeq +826 -> 1617
    //   794: aload_0
    //   795: aload 34
    //   797: invokespecial 321	hs:a	(Lix;)Z
    //   800: ifeq +817 -> 1617
    //   803: iconst_1
    //   804: istore 32
    //   806: lload 29
    //   808: ldc2_w 60
    //   811: lcmp
    //   812: ifeq +701 -> 1513
    //   815: aload 34
    //   817: invokevirtual 156	ix:l	()J
    //   820: lstore 35
    //   822: aload 34
    //   824: invokevirtual 158	ix:m	()J
    //   827: lstore 37
    //   829: lload 37
    //   831: ldc2_w 60
    //   834: lcmp
    //   835: ifne +788 -> 1623
    //   838: ldc2_w 60
    //   841: lstore 39
    //   843: goto +750 -> 1593
    //   846: lload 29
    //   848: lload 37
    //   850: invokestatic 363	java/lang/Math:min	(JJ)J
    //   853: lstore 39
    //   855: goto +738 -> 1593
    //   858: aload_0
    //   859: lload 29
    //   861: putfield 65	hs:e	J
    //   864: iload 31
    //   866: ifeq +60 -> 926
    //   869: aload_0
    //   870: iconst_5
    //   871: invokespecial 217	hs:a	(I)V
    //   874: aload_0
    //   875: invokespecial 345	hs:c	()V
    //   878: aload_0
    //   879: getfield 122	hs:a	Landroid/os/Handler;
    //   882: bipush 7
    //   884: invokevirtual 224	android/os/Handler:removeMessages	(I)V
    //   887: aload_0
    //   888: getfield 49	hs:p	Z
    //   891: ifeq +11 -> 902
    //   894: aload_0
    //   895: getfield 59	hs:r	I
    //   898: iconst_4
    //   899: if_icmpeq +11 -> 910
    //   902: aload_0
    //   903: getfield 59	hs:r	I
    //   906: iconst_3
    //   907: if_icmpne +84 -> 991
    //   910: aload_0
    //   911: bipush 7
    //   913: lload 27
    //   915: ldc2_w 310
    //   918: invokespecial 313	hs:a	(IJJ)V
    //   921: invokestatic 364	lx:a	()V
    //   924: iconst_1
    //   925: ireturn
    //   926: aload_0
    //   927: getfield 59	hs:r	I
    //   930: iconst_3
    //   931: if_icmpne +27 -> 958
    //   934: iload 32
    //   936: ifeq +22 -> 958
    //   939: aload_0
    //   940: iconst_4
    //   941: invokespecial 217	hs:a	(I)V
    //   944: aload_0
    //   945: getfield 49	hs:p	Z
    //   948: ifeq -70 -> 878
    //   951: aload_0
    //   952: invokespecial 336	hs:b	()V
    //   955: goto -77 -> 878
    //   958: aload_0
    //   959: getfield 59	hs:r	I
    //   962: iconst_4
    //   963: if_icmpne -85 -> 878
    //   966: iload 32
    //   968: ifne -90 -> 878
    //   971: aload_0
    //   972: aload_0
    //   973: getfield 49	hs:p	Z
    //   976: putfield 160	hs:q	Z
    //   979: aload_0
    //   980: iconst_3
    //   981: invokespecial 217	hs:a	(I)V
    //   984: aload_0
    //   985: invokespecial 345	hs:c	()V
    //   988: goto -110 -> 878
    //   991: aload_0
    //   992: getfield 77	hs:l	Ljava/util/List;
    //   995: invokeinterface 367 1 0
    //   1000: ifne -79 -> 921
    //   1003: aload_0
    //   1004: bipush 7
    //   1006: lload 27
    //   1008: ldc2_w 52
    //   1011: invokespecial 313	hs:a	(IJJ)V
    //   1014: goto -93 -> 921
    //   1017: aload_1
    //   1018: getfield 303	android/os/Message:obj	Ljava/lang/Object;
    //   1021: checkcast 369	java/lang/Long
    //   1024: invokevirtual 372	java/lang/Long:longValue	()J
    //   1027: lstore 22
    //   1029: aload_0
    //   1030: iconst_0
    //   1031: putfield 160	hs:q	Z
    //   1034: aload_0
    //   1035: lload 22
    //   1037: ldc2_w 52
    //   1040: lmul
    //   1041: putfield 164	hs:d	J
    //   1044: aload_0
    //   1045: getfield 70	hs:h	Lhu;
    //   1048: invokevirtual 198	hu:a	()V
    //   1051: aload_0
    //   1052: getfield 70	hs:h	Lhu;
    //   1055: aload_0
    //   1056: getfield 164	hs:d	J
    //   1059: invokevirtual 211	hu:a	(J)V
    //   1062: aload_0
    //   1063: getfield 59	hs:r	I
    //   1066: iconst_1
    //   1067: if_icmpeq +594 -> 1661
    //   1070: aload_0
    //   1071: getfield 59	hs:r	I
    //   1074: iconst_2
    //   1075: if_icmpne +588 -> 1663
    //   1078: goto +583 -> 1661
    //   1081: iload 24
    //   1083: aload_0
    //   1084: getfield 77	hs:l	Ljava/util/List;
    //   1087: invokeinterface 180 1 0
    //   1092: if_icmpge +39 -> 1131
    //   1095: aload_0
    //   1096: getfield 77	hs:l	Ljava/util/List;
    //   1099: iload 24
    //   1101: invokeinterface 184 2 0
    //   1106: checkcast 149	ix
    //   1109: astore 26
    //   1111: aload 26
    //   1113: invokestatic 200	hs:b	(Lix;)V
    //   1116: aload 26
    //   1118: aload_0
    //   1119: getfield 164	hs:d	J
    //   1122: invokevirtual 373	ix:a	(J)V
    //   1125: iinc 24 1
    //   1128: goto -47 -> 1081
    //   1131: aload_0
    //   1132: iconst_3
    //   1133: invokespecial 217	hs:a	(I)V
    //   1136: aload_0
    //   1137: getfield 122	hs:a	Landroid/os/Handler;
    //   1140: bipush 7
    //   1142: invokevirtual 142	android/os/Handler:sendEmptyMessage	(I)Z
    //   1145: pop
    //   1146: goto +515 -> 1661
    //   1149: aload_0
    //   1150: invokespecial 334	hs:e	()V
    //   1153: iconst_1
    //   1154: ireturn
    //   1155: aload_0
    //   1156: invokespecial 215	hs:f	()V
    //   1159: aload_0
    //   1160: iconst_1
    //   1161: invokespecial 217	hs:a	(I)V
    //   1164: aload_0
    //   1165: monitorenter
    //   1166: aload_0
    //   1167: iconst_1
    //   1168: putfield 248	hs:o	Z
    //   1171: aload_0
    //   1172: invokevirtual 376	java/lang/Object:notifyAll	()V
    //   1175: aload_0
    //   1176: monitorexit
    //   1177: iconst_1
    //   1178: ireturn
    //   1179: astore 21
    //   1181: aload_0
    //   1182: monitorexit
    //   1183: aload 21
    //   1185: athrow
    //   1186: aload_1
    //   1187: getfield 344	android/os/Message:arg1	I
    //   1190: istore 14
    //   1192: aload_1
    //   1193: getfield 303	android/os/Message:obj	Ljava/lang/Object;
    //   1196: astore 15
    //   1198: aload 15
    //   1200: checkcast 287	android/util/Pair
    //   1203: astore 18
    //   1205: aload 18
    //   1207: getfield 379	android/util/Pair:first	Ljava/lang/Object;
    //   1210: checkcast 381	ho
    //   1213: iload 14
    //   1215: aload 18
    //   1217: getfield 384	android/util/Pair:second	Ljava/lang/Object;
    //   1220: invokeinterface 387 3 0
    //   1225: aload_0
    //   1226: monitorenter
    //   1227: aload_0
    //   1228: iconst_1
    //   1229: aload_0
    //   1230: getfield 45	hs:s	I
    //   1233: iadd
    //   1234: putfield 45	hs:s	I
    //   1237: aload_0
    //   1238: invokevirtual 376	java/lang/Object:notifyAll	()V
    //   1241: aload_0
    //   1242: monitorexit
    //   1243: aload_0
    //   1244: getfield 59	hs:r	I
    //   1247: iconst_1
    //   1248: if_icmpeq +21 -> 1269
    //   1251: aload_0
    //   1252: getfield 59	hs:r	I
    //   1255: iconst_2
    //   1256: if_icmpeq +13 -> 1269
    //   1259: aload_0
    //   1260: getfield 122	hs:a	Landroid/os/Handler;
    //   1263: bipush 7
    //   1265: invokevirtual 142	android/os/Handler:sendEmptyMessage	(I)Z
    //   1268: pop
    //   1269: iconst_1
    //   1270: ireturn
    //   1271: astore 19
    //   1273: aload_0
    //   1274: monitorexit
    //   1275: aload 19
    //   1277: athrow
    //   1278: astore 16
    //   1280: aload_0
    //   1281: monitorenter
    //   1282: aload_0
    //   1283: iconst_1
    //   1284: aload_0
    //   1285: getfield 45	hs:s	I
    //   1288: iadd
    //   1289: putfield 45	hs:s	I
    //   1292: aload_0
    //   1293: invokevirtual 376	java/lang/Object:notifyAll	()V
    //   1296: aload_0
    //   1297: monitorexit
    //   1298: aload 16
    //   1300: athrow
    //   1301: astore 17
    //   1303: aload_0
    //   1304: monitorexit
    //   1305: aload 17
    //   1307: athrow
    //   1308: aload_1
    //   1309: getfield 344	android/os/Message:arg1	I
    //   1312: istore 6
    //   1314: aload_1
    //   1315: getfield 390	android/os/Message:arg2	I
    //   1318: ifeq +353 -> 1671
    //   1321: iconst_1
    //   1322: istore 7
    //   1324: aload_0
    //   1325: getfield 51	hs:i	[Z
    //   1328: iload 6
    //   1330: baload
    //   1331: iload 7
    //   1333: if_icmpeq +336 -> 1669
    //   1336: aload_0
    //   1337: getfield 51	hs:i	[Z
    //   1340: iload 6
    //   1342: iload 7
    //   1344: bastore
    //   1345: aload_0
    //   1346: getfield 59	hs:r	I
    //   1349: iconst_1
    //   1350: if_icmpeq +319 -> 1669
    //   1353: aload_0
    //   1354: getfield 59	hs:r	I
    //   1357: iconst_2
    //   1358: if_icmpne +6 -> 1364
    //   1361: goto +308 -> 1669
    //   1364: aload_0
    //   1365: getfield 226	hs:m	[Lix;
    //   1368: iload 6
    //   1370: aaload
    //   1371: astore 8
    //   1373: aload 8
    //   1375: getfield 189	ix:g	I
    //   1378: istore 9
    //   1380: iload 9
    //   1382: iconst_1
    //   1383: if_icmpeq +15 -> 1398
    //   1386: iload 9
    //   1388: iconst_2
    //   1389: if_icmpeq +9 -> 1398
    //   1392: iload 9
    //   1394: iconst_3
    //   1395: if_icmpne +274 -> 1669
    //   1398: iload 7
    //   1400: ifeq +67 -> 1467
    //   1403: aload_0
    //   1404: getfield 49	hs:p	Z
    //   1407: ifeq +270 -> 1677
    //   1410: aload_0
    //   1411: getfield 59	hs:r	I
    //   1414: iconst_4
    //   1415: if_icmpne +262 -> 1677
    //   1418: iconst_1
    //   1419: istore 10
    //   1421: aload 8
    //   1423: aload_0
    //   1424: getfield 164	hs:d	J
    //   1427: iload 10
    //   1429: invokevirtual 316	ix:b	(JZ)V
    //   1432: aload_0
    //   1433: getfield 77	hs:l	Ljava/util/List;
    //   1436: aload 8
    //   1438: invokeinterface 319 2 0
    //   1443: pop
    //   1444: iload 10
    //   1446: ifeq +8 -> 1454
    //   1449: aload 8
    //   1451: invokevirtual 186	ix:n	()V
    //   1454: aload_0
    //   1455: getfield 122	hs:a	Landroid/os/Handler;
    //   1458: bipush 7
    //   1460: invokevirtual 142	android/os/Handler:sendEmptyMessage	(I)Z
    //   1463: pop
    //   1464: goto +205 -> 1669
    //   1467: aload 8
    //   1469: aload_0
    //   1470: getfield 202	hs:n	Lix;
    //   1473: if_acmpne +15 -> 1488
    //   1476: aload_0
    //   1477: getfield 70	hs:h	Lhu;
    //   1480: aload 8
    //   1482: invokevirtual 208	ix:f	()J
    //   1485: invokevirtual 211	hu:a	(J)V
    //   1488: aload 8
    //   1490: invokestatic 200	hs:b	(Lix;)V
    //   1493: aload_0
    //   1494: getfield 77	hs:l	Ljava/util/List;
    //   1497: aload 8
    //   1499: invokeinterface 393 2 0
    //   1504: pop
    //   1505: aload 8
    //   1507: invokevirtual 228	ix:o	()V
    //   1510: goto +159 -> 1669
    //   1513: lload 29
    //   1515: lstore 39
    //   1517: goto +76 -> 1593
    //   1520: iconst_0
    //   1521: ireturn
    //   1522: iinc 67 1
    //   1525: goto -1447 -> 78
    //   1528: iconst_0
    //   1529: istore 69
    //   1531: goto -1424 -> 107
    //   1534: iconst_1
    //   1535: istore 65
    //   1537: goto -1291 -> 246
    //   1540: iinc 48 1
    //   1543: goto -1392 -> 151
    //   1546: iconst_0
    //   1547: istore 64
    //   1549: goto -1349 -> 200
    //   1552: iconst_0
    //   1553: istore 65
    //   1555: goto -1309 -> 246
    //   1558: iconst_1
    //   1559: ireturn
    //   1560: iconst_1
    //   1561: istore 50
    //   1563: iconst_1
    //   1564: istore 51
    //   1566: lconst_0
    //   1567: lstore 52
    //   1569: iconst_0
    //   1570: istore 54
    //   1572: goto -1289 -> 283
    //   1575: iinc 54 1
    //   1578: goto -1295 -> 283
    //   1581: iconst_0
    //   1582: istore 51
    //   1584: goto -1225 -> 359
    //   1587: iconst_0
    //   1588: istore 50
    //   1590: goto -1214 -> 376
    //   1593: iinc 33 1
    //   1596: lload 39
    //   1598: lstore 29
    //   1600: goto -870 -> 730
    //   1603: ldc2_w 394
    //   1606: lstore 29
    //   1608: goto -891 -> 717
    //   1611: iconst_0
    //   1612: istore 31
    //   1614: goto -825 -> 789
    //   1617: iconst_0
    //   1618: istore 32
    //   1620: goto -814 -> 806
    //   1623: lload 37
    //   1625: ldc2_w 161
    //   1628: lcmp
    //   1629: ifeq -116 -> 1513
    //   1632: lload 35
    //   1634: ldc2_w 60
    //   1637: lcmp
    //   1638: ifeq -792 -> 846
    //   1641: lload 35
    //   1643: ldc2_w 165
    //   1646: lcmp
    //   1647: ifeq -801 -> 846
    //   1650: lload 37
    //   1652: lload 35
    //   1654: lcmp
    //   1655: ifge -142 -> 1513
    //   1658: goto -812 -> 846
    //   1661: iconst_1
    //   1662: ireturn
    //   1663: iconst_0
    //   1664: istore 24
    //   1666: goto -585 -> 1081
    //   1669: iconst_1
    //   1670: ireturn
    //   1671: iconst_0
    //   1672: istore 7
    //   1674: goto -350 -> 1324
    //   1677: iconst_0
    //   1678: istore 10
    //   1680: goto -259 -> 1421
    //
    // Exception table:
    //   from	to	target	type
    //   0	56	459	hm
    //   56	75	459	hm
    //   78	104	459	hm
    //   107	121	459	hm
    //   124	138	459	hm
    //   140	145	459	hm
    //   151	197	459	hm
    //   200	243	459	hm
    //   246	259	459	hm
    //   270	280	459	hm
    //   283	343	459	hm
    //   348	356	459	hm
    //   364	373	459	hm
    //   385	392	459	hm
    //   418	427	459	hm
    //   430	436	459	hm
    //   441	446	459	hm
    //   446	456	459	hm
    //   499	524	459	hm
    //   570	576	459	hm
    //   608	619	459	hm
    //   654	668	459	hm
    //   689	717	459	hm
    //   723	727	459	hm
    //   730	773	459	hm
    //   778	786	459	hm
    //   794	803	459	hm
    //   815	829	459	hm
    //   846	855	459	hm
    //   858	864	459	hm
    //   869	878	459	hm
    //   878	902	459	hm
    //   902	910	459	hm
    //   910	921	459	hm
    //   921	924	459	hm
    //   926	934	459	hm
    //   939	955	459	hm
    //   958	966	459	hm
    //   971	988	459	hm
    //   991	1014	459	hm
    //   1017	1078	459	hm
    //   1081	1125	459	hm
    //   1131	1146	459	hm
    //   1149	1153	459	hm
    //   1155	1166	459	hm
    //   1183	1186	459	hm
    //   1186	1198	459	hm
    //   1225	1227	459	hm
    //   1243	1269	459	hm
    //   1275	1278	459	hm
    //   1280	1282	459	hm
    //   1298	1301	459	hm
    //   1305	1308	459	hm
    //   1308	1321	459	hm
    //   1324	1361	459	hm
    //   1364	1380	459	hm
    //   1403	1418	459	hm
    //   1421	1444	459	hm
    //   1449	1454	459	hm
    //   1454	1464	459	hm
    //   1467	1488	459	hm
    //   1488	1510	459	hm
    //   0	56	527	java/lang/RuntimeException
    //   56	75	527	java/lang/RuntimeException
    //   78	104	527	java/lang/RuntimeException
    //   107	121	527	java/lang/RuntimeException
    //   124	138	527	java/lang/RuntimeException
    //   140	145	527	java/lang/RuntimeException
    //   151	197	527	java/lang/RuntimeException
    //   200	243	527	java/lang/RuntimeException
    //   246	259	527	java/lang/RuntimeException
    //   270	280	527	java/lang/RuntimeException
    //   283	343	527	java/lang/RuntimeException
    //   348	356	527	java/lang/RuntimeException
    //   364	373	527	java/lang/RuntimeException
    //   385	392	527	java/lang/RuntimeException
    //   418	427	527	java/lang/RuntimeException
    //   430	436	527	java/lang/RuntimeException
    //   441	446	527	java/lang/RuntimeException
    //   446	456	527	java/lang/RuntimeException
    //   499	524	527	java/lang/RuntimeException
    //   570	576	527	java/lang/RuntimeException
    //   608	619	527	java/lang/RuntimeException
    //   654	668	527	java/lang/RuntimeException
    //   689	717	527	java/lang/RuntimeException
    //   723	727	527	java/lang/RuntimeException
    //   730	773	527	java/lang/RuntimeException
    //   778	786	527	java/lang/RuntimeException
    //   794	803	527	java/lang/RuntimeException
    //   815	829	527	java/lang/RuntimeException
    //   846	855	527	java/lang/RuntimeException
    //   858	864	527	java/lang/RuntimeException
    //   869	878	527	java/lang/RuntimeException
    //   878	902	527	java/lang/RuntimeException
    //   902	910	527	java/lang/RuntimeException
    //   910	921	527	java/lang/RuntimeException
    //   921	924	527	java/lang/RuntimeException
    //   926	934	527	java/lang/RuntimeException
    //   939	955	527	java/lang/RuntimeException
    //   958	966	527	java/lang/RuntimeException
    //   971	988	527	java/lang/RuntimeException
    //   991	1014	527	java/lang/RuntimeException
    //   1017	1078	527	java/lang/RuntimeException
    //   1081	1125	527	java/lang/RuntimeException
    //   1131	1146	527	java/lang/RuntimeException
    //   1149	1153	527	java/lang/RuntimeException
    //   1155	1166	527	java/lang/RuntimeException
    //   1183	1186	527	java/lang/RuntimeException
    //   1186	1198	527	java/lang/RuntimeException
    //   1225	1227	527	java/lang/RuntimeException
    //   1243	1269	527	java/lang/RuntimeException
    //   1275	1278	527	java/lang/RuntimeException
    //   1280	1282	527	java/lang/RuntimeException
    //   1298	1301	527	java/lang/RuntimeException
    //   1305	1308	527	java/lang/RuntimeException
    //   1308	1321	527	java/lang/RuntimeException
    //   1324	1361	527	java/lang/RuntimeException
    //   1364	1380	527	java/lang/RuntimeException
    //   1403	1418	527	java/lang/RuntimeException
    //   1421	1444	527	java/lang/RuntimeException
    //   1449	1454	527	java/lang/RuntimeException
    //   1454	1464	527	java/lang/RuntimeException
    //   1467	1488	527	java/lang/RuntimeException
    //   1488	1510	527	java/lang/RuntimeException
    //   584	595	652	finally
    //   600	608	652	finally
    //   627	649	652	finally
    //   668	686	652	finally
    //   1166	1177	1179	finally
    //   1181	1183	1179	finally
    //   1227	1243	1271	finally
    //   1273	1275	1271	finally
    //   1198	1225	1278	finally
    //   1282	1298	1301	finally
    //   1303	1305	1301	finally
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hs
 * JD-Core Version:    0.6.0
 */