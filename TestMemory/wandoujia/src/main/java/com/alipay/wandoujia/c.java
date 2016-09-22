package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;

public final class c
  implements bh
{
  private a a;
  private String b;
  private ag c;
  private be d;
  private Queue e;
  private be f;
  private long g;
  private int h;
  private String i;
  private String j;
  private String k;
  private boolean l = false;
  private boolean m;
  private md n;

  public c(a parama)
  {
    this.a = parama;
    this.d = be.a;
    this.e = new LinkedList();
    this.e.add(this.d);
    this.c = new ag(parama.m$24af20d5());
    parama.k().a(this);
    this.g = 0L;
    this.h = 0;
  }

  private void a(Exception paramException)
  {
    int i1;
    int i2;
    if (this.a.k().a() == null)
    {
      i1 = 1;
      if ((this.n != md.a) || (i1 != 0))
        break label52;
      i2 = 1;
    }
    while (true)
    {
      this.a.i().a(this, paramException, i2);
      return;
      i1 = 0;
      break;
      label52: md localmd1 = this.n;
      md localmd2 = md.b;
      i2 = 0;
      if (localmd1 != localmd2)
        continue;
      i2 = 0;
      if (i1 != 0)
        continue;
      i2 = 4;
    }
  }

  private boolean a(be parambe)
  {
    int i1 = 1;
    monitorenter;
    while (true)
    {
      try
      {
        if (parambe != be.g)
          continue;
        this.d = be.g;
        this.f = be.g;
        this.e.clear();
        this.e.add(be.g);
        this.a.e();
        return i1;
        if (parambe == be.c)
        {
          this.d = be.c;
          this.f = be.c;
          this.e.clear();
          this.e.add(be.c);
          this.a.e();
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      if (((this.m) || (this.f != parambe)) && (!this.e.contains(parambe)) && (!this.e.contains(be.f)))
      {
        this.f = parambe;
        this.e.add(parambe);
        this.a.e();
        continue;
      }
      i1 = 0;
    }
  }

  private boolean h()
  {
    try
    {
      boolean bool = this.a.k().b();
      if (bool)
        this.a.k().e();
      return bool;
    }
    catch (Exception localException)
    {
      b.b(localException);
    }
    return true;
  }

  private boolean i()
  {
    try
    {
      boolean bool = this.a.k().c();
      return bool;
    }
    catch (Exception localException)
    {
      b.b(localException);
    }
    return true;
  }

  private boolean j()
  {
    try
    {
      boolean bool = this.a.k().d();
      if (bool)
        this.a.k().e();
      return bool;
    }
    catch (Exception localException)
    {
      b.b(localException);
    }
    return true;
  }

  private void k()
  {
    long l1 = Calendar.getInstance().getTimeInMillis();
    long l2;
    if (this.g == 0L)
      l2 = 0L;
    while (true)
    {
      if ((l2 > 0L) && (this.h > 0) && (this.h - l2 > 0L));
      try
      {
        Thread.sleep(this.h - l2);
        return;
        l2 = l1 - this.g;
      }
      catch (InterruptedException localInterruptedException)
      {
        b.b(localInterruptedException);
      }
    }
  }

  public final String a()
  {
    if (TextUtils.isEmpty(this.i))
      this.i = b.a(com.wandoujia.image.c.a.a().c().p(), "6001", "");
    return this.i;
  }

  public final void a(d paramd, ae paramae)
  {
    if ((paramae instanceof ai))
    {
      ai localai = (ai)paramae;
      if (localai != null)
        this.k = null;
      this.a.i().a(this, localai);
    }
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  public final String b()
  {
    return this.j;
  }

  // ERROR //
  public final boolean c()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: ifne +19 -> 22
    //   6: aload_0
    //   7: getfield 51	com/alipay/wandoujia/c:e	Ljava/util/Queue;
    //   10: invokeinterface 219 1 0
    //   15: istore 6
    //   17: iload 6
    //   19: ifeq +15 -> 34
    //   22: aload_0
    //   23: aconst_null
    //   24: putfield 107	com/alipay/wandoujia/c:f	Lcom/alipay/wandoujia/be;
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   32: iload_1
    //   33: ireturn
    //   34: aload_0
    //   35: invokespecial 221	com/alipay/wandoujia/c:k	()V
    //   38: aload_0
    //   39: aload_0
    //   40: getfield 51	com/alipay/wandoujia/c:e	Ljava/util/Queue;
    //   43: invokeinterface 225 1 0
    //   48: checkcast 42	com/alipay/wandoujia/be
    //   51: putfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   54: invokestatic 227	com/alipay/wandoujia/c:l	()[I
    //   57: aload_0
    //   58: getfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   61: invokevirtual 167	com/alipay/wandoujia/be:ordinal	()I
    //   64: iaload
    //   65: tableswitch	default:+795 -> 860, 1:+43->108, 2:+515->580, 3:+577->642, 4:+523->588, 5:+531->596, 6:+800->865, 7:+539->604
    //   109: getfield 38	com/alipay/wandoujia/c:l	Z
    //   112: ifeq +8 -> 120
    //   115: iconst_1
    //   116: istore_1
    //   117: goto -115 -> 2
    //   120: aload_0
    //   121: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   124: invokevirtual 73	com/alipay/wandoujia/a:k	()Lcom/alipay/wandoujia/d;
    //   127: invokevirtual 86	com/alipay/wandoujia/d:a	()Lcom/alipay/wandoujia/ae;
    //   130: astore 9
    //   132: aload 9
    //   134: ifnull +19 -> 153
    //   137: aload 9
    //   139: invokevirtual 232	com/alipay/wandoujia/ae:b	()Lcom/alipay/wandoujia/u;
    //   142: invokevirtual 236	com/alipay/wandoujia/u:e	()Z
    //   145: ifeq +8 -> 153
    //   148: iconst_1
    //   149: istore_1
    //   150: goto -148 -> 2
    //   153: aload_0
    //   154: iconst_0
    //   155: putfield 38	com/alipay/wandoujia/c:l	Z
    //   158: aload_0
    //   159: iconst_0
    //   160: putfield 116	com/alipay/wandoujia/c:m	Z
    //   163: iconst_0
    //   164: istore 10
    //   166: aload_0
    //   167: getfield 51	com/alipay/wandoujia/c:e	Ljava/util/Queue;
    //   170: invokeinterface 239 1 0
    //   175: ifle +19 -> 194
    //   178: aload_0
    //   179: aload_0
    //   180: getfield 51	com/alipay/wandoujia/c:e	Ljava/util/Queue;
    //   183: invokeinterface 242 1 0
    //   188: checkcast 42	com/alipay/wandoujia/be
    //   191: putfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   194: aload_0
    //   195: getfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   198: getstatic 114	com/alipay/wandoujia/be:c	Lcom/alipay/wandoujia/be;
    //   201: if_acmpne +8 -> 209
    //   204: iconst_1
    //   205: istore_1
    //   206: goto -204 -> 2
    //   209: aload_0
    //   210: getfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   213: getstatic 105	com/alipay/wandoujia/be:g	Lcom/alipay/wandoujia/be;
    //   216: if_acmpne +8 -> 224
    //   219: iconst_0
    //   220: istore_1
    //   221: goto -219 -> 2
    //   224: aload_0
    //   225: getfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   228: getstatic 120	com/alipay/wandoujia/be:f	Lcom/alipay/wandoujia/be;
    //   231: if_acmpne +8 -> 239
    //   234: iconst_0
    //   235: istore_1
    //   236: goto -234 -> 2
    //   239: aload_0
    //   240: invokespecial 221	com/alipay/wandoujia/c:k	()V
    //   243: invokestatic 185	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   246: invokevirtual 245	com/wandoujia/image/c/a:b	()Landroid/content/Context;
    //   249: astore 11
    //   251: aload_0
    //   252: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   255: invokevirtual 248	com/alipay/wandoujia/a:g	()Lcom/alipay/wandoujia/f;
    //   258: invokevirtual 253	com/alipay/wandoujia/f:a	()Lcom/alipay/wandoujia/t;
    //   261: astore 12
    //   263: aload 12
    //   265: ifnonnull +33 -> 298
    //   268: aload_0
    //   269: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   272: invokevirtual 248	com/alipay/wandoujia/a:g	()Lcom/alipay/wandoujia/f;
    //   275: invokevirtual 256	com/alipay/wandoujia/f:d	()Lorg/json/JSONObject;
    //   278: astore 13
    //   280: aload_0
    //   281: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   284: invokevirtual 65	com/alipay/wandoujia/a:m$24af20d5	()Lcom/wandoujia/clean/b/a;
    //   287: aload_0
    //   288: getfield 211	com/alipay/wandoujia/c:b	Ljava/lang/String;
    //   291: aload 13
    //   293: invokestatic 261	android/support/v4/app/d:a	(Lcom/wandoujia/clean/b/a;Ljava/lang/String;Lorg/json/JSONObject;)Lcom/alipay/wandoujia/t;
    //   296: astore 12
    //   298: aload_0
    //   299: aload 12
    //   301: invokevirtual 266	com/alipay/wandoujia/t:d	()Lcom/alipay/wandoujia/md;
    //   304: putfield 88	com/alipay/wandoujia/c:n	Lcom/alipay/wandoujia/md;
    //   307: aload_0
    //   308: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   311: invokevirtual 248	com/alipay/wandoujia/a:g	()Lcom/alipay/wandoujia/f;
    //   314: invokevirtual 268	com/alipay/wandoujia/f:f	()V
    //   317: aload_0
    //   318: getfield 70	com/alipay/wandoujia/c:c	Lcom/alipay/wandoujia/ag;
    //   321: aload 11
    //   323: aload 12
    //   325: invokevirtual 271	com/alipay/wandoujia/ag:b	(Landroid/content/Context;Lcom/alipay/wandoujia/t;)Lcom/alipay/wandoujia/ae;
    //   328: astore 14
    //   330: aload 14
    //   332: ifnull +521 -> 853
    //   335: aload 14
    //   337: ifnull +533 -> 870
    //   340: aload 14
    //   342: instanceof 203
    //   345: ifeq +525 -> 870
    //   348: aload 14
    //   350: checkcast 203	com/alipay/wandoujia/ai
    //   353: invokevirtual 273	com/alipay/wandoujia/ai:f	()I
    //   356: tableswitch	default:+514 -> 870, -10:+530->886, -9:+514->870, -8:+514->870, -7:+514->870, -6:+514->870, -5:+514->870, -4:+514->870, -3:+514->870, -2:+514->870, -1:+514->870, 0:+514->870, 1:+530->886, 2:+530->886, 3:+514->870, 4:+530->886, 5:+530->886, 6:+530->886, 7:+530->886, 8:+530->886, 9:+530->886, 10:+530->886
    //   457: aload 14
    //   459: invokevirtual 232	com/alipay/wandoujia/ae:b	()Lcom/alipay/wandoujia/u;
    //   462: invokevirtual 236	com/alipay/wandoujia/u:e	()Z
    //   465: putfield 38	com/alipay/wandoujia/c:l	Z
    //   468: iload 15
    //   470: ifne +422 -> 892
    //   473: aload_0
    //   474: getfield 38	com/alipay/wandoujia/c:l	Z
    //   477: ifne +415 -> 892
    //   480: iconst_0
    //   481: istore 16
    //   483: aload_0
    //   484: iload 16
    //   486: putfield 116	com/alipay/wandoujia/c:m	Z
    //   489: aload_0
    //   490: aload 14
    //   492: invokevirtual 232	com/alipay/wandoujia/ae:b	()Lcom/alipay/wandoujia/u;
    //   495: invokevirtual 275	com/alipay/wandoujia/u:d	()J
    //   498: putfield 80	com/alipay/wandoujia/c:g	J
    //   501: aload_0
    //   502: aload 14
    //   504: invokevirtual 277	com/alipay/wandoujia/ae:c	()I
    //   507: putfield 82	com/alipay/wandoujia/c:h	I
    //   510: aload_0
    //   511: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   514: invokevirtual 73	com/alipay/wandoujia/a:k	()Lcom/alipay/wandoujia/d;
    //   517: aload 14
    //   519: invokevirtual 280	com/alipay/wandoujia/d:a	(Lcom/alipay/wandoujia/ae;)V
    //   522: aload_0
    //   523: getfield 116	com/alipay/wandoujia/c:m	Z
    //   526: ifeq +320 -> 846
    //   529: aload_0
    //   530: invokespecial 221	com/alipay/wandoujia/c:k	()V
    //   533: aload_0
    //   534: aconst_null
    //   535: putfield 174	com/alipay/wandoujia/c:i	Ljava/lang/String;
    //   538: aload_0
    //   539: getfield 38	com/alipay/wandoujia/c:l	Z
    //   542: ifeq +334 -> 876
    //   545: aload_0
    //   546: aload 14
    //   548: invokevirtual 232	com/alipay/wandoujia/ae:b	()Lcom/alipay/wandoujia/u;
    //   551: invokevirtual 282	com/alipay/wandoujia/u:f	()Ljava/lang/String;
    //   554: putfield 174	com/alipay/wandoujia/c:i	Ljava/lang/String;
    //   557: aload_0
    //   558: aload 14
    //   560: invokevirtual 232	com/alipay/wandoujia/ae:b	()Lcom/alipay/wandoujia/u;
    //   563: invokevirtual 284	com/alipay/wandoujia/u:g	()Ljava/lang/String;
    //   566: putfield 213	com/alipay/wandoujia/c:j	Ljava/lang/String;
    //   569: goto +307 -> 876
    //   572: aload_0
    //   573: getfield 38	com/alipay/wandoujia/c:l	Z
    //   576: istore_1
    //   577: goto -575 -> 2
    //   580: aload_0
    //   581: invokespecial 286	com/alipay/wandoujia/c:h	()Z
    //   584: istore_1
    //   585: goto -583 -> 2
    //   588: aload_0
    //   589: invokespecial 288	com/alipay/wandoujia/c:i	()Z
    //   592: istore_1
    //   593: goto -591 -> 2
    //   596: aload_0
    //   597: invokespecial 290	com/alipay/wandoujia/c:j	()Z
    //   600: istore_1
    //   601: goto -599 -> 2
    //   604: aload_0
    //   605: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   608: invokevirtual 248	com/alipay/wandoujia/a:g	()Lcom/alipay/wandoujia/f;
    //   611: invokevirtual 292	com/alipay/wandoujia/f:b	()V
    //   614: aload_0
    //   615: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   618: invokevirtual 73	com/alipay/wandoujia/a:k	()Lcom/alipay/wandoujia/d;
    //   621: invokevirtual 293	com/alipay/wandoujia/d:f	()V
    //   624: aload_0
    //   625: getfield 51	com/alipay/wandoujia/c:e	Ljava/util/Queue;
    //   628: getstatic 44	com/alipay/wandoujia/be:a	Lcom/alipay/wandoujia/be;
    //   631: invokeinterface 57 2 0
    //   636: pop
    //   637: iconst_0
    //   638: istore_1
    //   639: goto -637 -> 2
    //   642: aload_0
    //   643: getfield 205	com/alipay/wandoujia/c:k	Ljava/lang/String;
    //   646: invokestatic 180	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   649: ifeq +10 -> 659
    //   652: aload_0
    //   653: ldc_w 295
    //   656: putfield 205	com/alipay/wandoujia/c:k	Ljava/lang/String;
    //   659: aload_0
    //   660: getfield 38	com/alipay/wandoujia/c:l	Z
    //   663: ifne +13 -> 676
    //   666: invokestatic 300	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   669: aload_0
    //   670: getfield 205	com/alipay/wandoujia/c:k	Ljava/lang/String;
    //   673: invokevirtual 302	com/alipay/wandoujia/i:a	(Ljava/lang/String;)V
    //   676: aload_0
    //   677: getfield 40	com/alipay/wandoujia/c:a	Lcom/alipay/wandoujia/a;
    //   680: invokevirtual 73	com/alipay/wandoujia/a:k	()Lcom/alipay/wandoujia/d;
    //   683: invokevirtual 126	com/alipay/wandoujia/d:e	()V
    //   686: goto +174 -> 860
    //   689: astore 5
    //   691: aload_0
    //   692: invokestatic 185	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   695: invokevirtual 188	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   698: invokeinterface 193 1 0
    //   703: ldc_w 304
    //   706: ldc 197
    //   708: invokestatic 200	android/support/v4/app/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   711: putfield 174	com/alipay/wandoujia/c:i	Ljava/lang/String;
    //   714: aload_0
    //   715: aload 5
    //   717: invokespecial 306	com/alipay/wandoujia/c:a	(Ljava/lang/Exception;)V
    //   720: aload_0
    //   721: aconst_null
    //   722: putfield 107	com/alipay/wandoujia/c:f	Lcom/alipay/wandoujia/be;
    //   725: aload_0
    //   726: aconst_null
    //   727: putfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   730: iconst_0
    //   731: ireturn
    //   732: astore 4
    //   734: aload_0
    //   735: invokestatic 185	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   738: invokevirtual 188	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   741: invokeinterface 309 1 0
    //   746: ldc 195
    //   748: ldc 197
    //   750: invokestatic 200	android/support/v4/app/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   753: putfield 174	com/alipay/wandoujia/c:i	Ljava/lang/String;
    //   756: aload_0
    //   757: aload 4
    //   759: invokespecial 306	com/alipay/wandoujia/c:a	(Ljava/lang/Exception;)V
    //   762: aload_0
    //   763: aconst_null
    //   764: putfield 107	com/alipay/wandoujia/c:f	Lcom/alipay/wandoujia/be;
    //   767: aload_0
    //   768: aconst_null
    //   769: putfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   772: iconst_0
    //   773: ireturn
    //   774: astore_3
    //   775: aload_3
    //   776: invokestatic 131	android/support/v4/app/b:b	(Ljava/lang/Object;)V
    //   779: invokestatic 300	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   782: aload_3
    //   783: ldc_w 311
    //   786: invokevirtual 314	com/alipay/wandoujia/i:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   789: aload_0
    //   790: invokestatic 185	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   793: invokevirtual 188	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   796: invokeinterface 317 1 0
    //   801: ldc 195
    //   803: ldc 197
    //   805: invokestatic 200	android/support/v4/app/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   808: putfield 174	com/alipay/wandoujia/c:i	Ljava/lang/String;
    //   811: aload_0
    //   812: aload_3
    //   813: invokespecial 306	com/alipay/wandoujia/c:a	(Ljava/lang/Exception;)V
    //   816: aload_0
    //   817: aconst_null
    //   818: putfield 107	com/alipay/wandoujia/c:f	Lcom/alipay/wandoujia/be;
    //   821: aload_0
    //   822: aconst_null
    //   823: putfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   826: iconst_0
    //   827: ireturn
    //   828: astore_2
    //   829: aload_0
    //   830: aconst_null
    //   831: putfield 107	com/alipay/wandoujia/c:f	Lcom/alipay/wandoujia/be;
    //   834: aload_0
    //   835: aconst_null
    //   836: putfield 46	com/alipay/wandoujia/c:d	Lcom/alipay/wandoujia/be;
    //   839: aload_2
    //   840: athrow
    //   841: astore 7
    //   843: goto -167 -> 676
    //   846: iload 15
    //   848: istore 10
    //   850: goto -684 -> 166
    //   853: iload 10
    //   855: istore 15
    //   857: goto -335 -> 522
    //   860: iconst_1
    //   861: istore_1
    //   862: goto -860 -> 2
    //   865: iconst_0
    //   866: istore_1
    //   867: goto -865 -> 2
    //   870: iconst_0
    //   871: istore 15
    //   873: goto -417 -> 456
    //   876: iload 15
    //   878: ifeq -306 -> 572
    //   881: iconst_0
    //   882: istore_1
    //   883: goto -881 -> 2
    //   886: iconst_1
    //   887: istore 15
    //   889: goto -433 -> 456
    //   892: iconst_1
    //   893: istore 16
    //   895: goto -412 -> 483
    //
    // Exception table:
    //   from	to	target	type
    //   6	17	689	com/alipay/android/app/exception/NetErrorException
    //   34	108	689	com/alipay/android/app/exception/NetErrorException
    //   108	115	689	com/alipay/android/app/exception/NetErrorException
    //   120	132	689	com/alipay/android/app/exception/NetErrorException
    //   137	148	689	com/alipay/android/app/exception/NetErrorException
    //   153	163	689	com/alipay/android/app/exception/NetErrorException
    //   166	194	689	com/alipay/android/app/exception/NetErrorException
    //   194	204	689	com/alipay/android/app/exception/NetErrorException
    //   209	219	689	com/alipay/android/app/exception/NetErrorException
    //   224	234	689	com/alipay/android/app/exception/NetErrorException
    //   239	263	689	com/alipay/android/app/exception/NetErrorException
    //   268	298	689	com/alipay/android/app/exception/NetErrorException
    //   298	330	689	com/alipay/android/app/exception/NetErrorException
    //   340	456	689	com/alipay/android/app/exception/NetErrorException
    //   456	468	689	com/alipay/android/app/exception/NetErrorException
    //   473	480	689	com/alipay/android/app/exception/NetErrorException
    //   483	522	689	com/alipay/android/app/exception/NetErrorException
    //   522	569	689	com/alipay/android/app/exception/NetErrorException
    //   572	577	689	com/alipay/android/app/exception/NetErrorException
    //   580	585	689	com/alipay/android/app/exception/NetErrorException
    //   588	593	689	com/alipay/android/app/exception/NetErrorException
    //   596	601	689	com/alipay/android/app/exception/NetErrorException
    //   604	637	689	com/alipay/android/app/exception/NetErrorException
    //   642	659	689	com/alipay/android/app/exception/NetErrorException
    //   659	676	689	com/alipay/android/app/exception/NetErrorException
    //   676	686	689	com/alipay/android/app/exception/NetErrorException
    //   6	17	732	com/alipay/android/app/exception/FailOperatingException
    //   34	108	732	com/alipay/android/app/exception/FailOperatingException
    //   108	115	732	com/alipay/android/app/exception/FailOperatingException
    //   120	132	732	com/alipay/android/app/exception/FailOperatingException
    //   137	148	732	com/alipay/android/app/exception/FailOperatingException
    //   153	163	732	com/alipay/android/app/exception/FailOperatingException
    //   166	194	732	com/alipay/android/app/exception/FailOperatingException
    //   194	204	732	com/alipay/android/app/exception/FailOperatingException
    //   209	219	732	com/alipay/android/app/exception/FailOperatingException
    //   224	234	732	com/alipay/android/app/exception/FailOperatingException
    //   239	263	732	com/alipay/android/app/exception/FailOperatingException
    //   268	298	732	com/alipay/android/app/exception/FailOperatingException
    //   298	330	732	com/alipay/android/app/exception/FailOperatingException
    //   340	456	732	com/alipay/android/app/exception/FailOperatingException
    //   456	468	732	com/alipay/android/app/exception/FailOperatingException
    //   473	480	732	com/alipay/android/app/exception/FailOperatingException
    //   483	522	732	com/alipay/android/app/exception/FailOperatingException
    //   522	569	732	com/alipay/android/app/exception/FailOperatingException
    //   572	577	732	com/alipay/android/app/exception/FailOperatingException
    //   580	585	732	com/alipay/android/app/exception/FailOperatingException
    //   588	593	732	com/alipay/android/app/exception/FailOperatingException
    //   596	601	732	com/alipay/android/app/exception/FailOperatingException
    //   604	637	732	com/alipay/android/app/exception/FailOperatingException
    //   642	659	732	com/alipay/android/app/exception/FailOperatingException
    //   659	676	732	com/alipay/android/app/exception/FailOperatingException
    //   676	686	732	com/alipay/android/app/exception/FailOperatingException
    //   6	17	774	java/lang/Exception
    //   34	108	774	java/lang/Exception
    //   108	115	774	java/lang/Exception
    //   120	132	774	java/lang/Exception
    //   137	148	774	java/lang/Exception
    //   153	163	774	java/lang/Exception
    //   166	194	774	java/lang/Exception
    //   194	204	774	java/lang/Exception
    //   209	219	774	java/lang/Exception
    //   224	234	774	java/lang/Exception
    //   239	263	774	java/lang/Exception
    //   268	298	774	java/lang/Exception
    //   298	330	774	java/lang/Exception
    //   340	456	774	java/lang/Exception
    //   456	468	774	java/lang/Exception
    //   473	480	774	java/lang/Exception
    //   483	522	774	java/lang/Exception
    //   522	569	774	java/lang/Exception
    //   572	577	774	java/lang/Exception
    //   580	585	774	java/lang/Exception
    //   588	593	774	java/lang/Exception
    //   596	601	774	java/lang/Exception
    //   604	637	774	java/lang/Exception
    //   676	686	774	java/lang/Exception
    //   6	17	828	finally
    //   34	108	828	finally
    //   108	115	828	finally
    //   120	132	828	finally
    //   137	148	828	finally
    //   153	163	828	finally
    //   166	194	828	finally
    //   194	204	828	finally
    //   209	219	828	finally
    //   224	234	828	finally
    //   239	263	828	finally
    //   268	298	828	finally
    //   298	330	828	finally
    //   340	456	828	finally
    //   456	468	828	finally
    //   473	480	828	finally
    //   483	522	828	finally
    //   522	569	828	finally
    //   572	577	828	finally
    //   580	585	828	finally
    //   588	593	828	finally
    //   596	601	828	finally
    //   604	637	828	finally
    //   642	659	828	finally
    //   659	676	828	finally
    //   676	686	828	finally
    //   691	720	828	finally
    //   734	762	828	finally
    //   775	816	828	finally
    //   642	659	841	java/lang/Exception
    //   659	676	841	java/lang/Exception
  }

  public final boolean d()
  {
    return a(be.a);
  }

  public final boolean e()
  {
    return a(be.b);
  }

  public final boolean f()
  {
    return a(be.e);
  }

  public final boolean g()
  {
    try
    {
      this.a.k().e();
      return a(be.c);
    }
    catch (Exception localException)
    {
      while (true)
        b.b(localException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.c
 * JD-Core Version:    0.6.0
 */