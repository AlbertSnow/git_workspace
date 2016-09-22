package com.alipay.wandoujia;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.image.c.a;

public final class ac
{
  private static ac a;
  private String b;
  private String c;
  private long d;

  public static boolean d()
  {
    return TextUtils.isEmpty(a.b);
  }

  // ERROR //
  public static ac e()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 2
    //   4: monitorenter
    //   5: invokestatic 35	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   8: invokevirtual 38	com/wandoujia/image/c/a:b	()Landroid/content/Context;
    //   11: astore_2
    //   12: new 40	com/alipay/wandoujia/ab
    //   15: dup
    //   16: aload_2
    //   17: invokespecial 43	com/alipay/wandoujia/ab:<init>	(Landroid/content/Context;)V
    //   20: astore_3
    //   21: aload_2
    //   22: invokestatic 48	com/alipay/wandoujia/x:a	(Landroid/content/Context;)Lcom/alipay/wandoujia/x;
    //   25: invokevirtual 51	com/alipay/wandoujia/x:b	()Ljava/lang/String;
    //   28: astore 8
    //   30: aload_2
    //   31: invokestatic 48	com/alipay/wandoujia/x:a	(Landroid/content/Context;)Lcom/alipay/wandoujia/x;
    //   34: invokevirtual 53	com/alipay/wandoujia/x:c	()Ljava/lang/String;
    //   37: astore 9
    //   39: aconst_null
    //   40: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   43: ifne +10 -> 53
    //   46: aconst_null
    //   47: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   50: ifeq +110 -> 160
    //   53: aload_3
    //   54: aload 8
    //   56: aload 9
    //   58: invokevirtual 56	com/alipay/wandoujia/ab:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   61: astore 10
    //   63: aload 10
    //   65: astore 5
    //   67: aload_3
    //   68: aload 8
    //   70: aload 9
    //   72: invokevirtual 58	com/alipay/wandoujia/ab:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   75: astore_0
    //   76: aload_3
    //   77: aload 8
    //   79: aload 9
    //   81: invokevirtual 61	com/alipay/wandoujia/ab:c	(Ljava/lang/String;Ljava/lang/String;)J
    //   84: lstore 11
    //   86: aload 5
    //   88: astore 13
    //   90: aload_0
    //   91: astore 14
    //   93: lload 11
    //   95: lstore 15
    //   97: aload_3
    //   98: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   101: invokestatic 67	com/alipay/wandoujia/ac:i	()V
    //   104: aload 14
    //   106: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   109: ifeq +258 -> 367
    //   112: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   115: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   118: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   121: ifeq +246 -> 367
    //   124: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   127: invokestatic 72	com/alipay/wandoujia/ac:h	()Ljava/lang/String;
    //   130: putfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   133: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   136: lload 15
    //   138: putfield 74	com/alipay/wandoujia/ac:d	J
    //   141: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   144: aload 13
    //   146: putfield 20	com/alipay/wandoujia/ac:b	Ljava/lang/String;
    //   149: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   152: astore 7
    //   154: ldc 2
    //   156: monitorexit
    //   157: aload 7
    //   159: areturn
    //   160: aload_3
    //   161: aload 8
    //   163: aload 9
    //   165: aconst_null
    //   166: aconst_null
    //   167: invokevirtual 77	com/alipay/wandoujia/ab:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   170: lconst_0
    //   171: lstore 15
    //   173: aconst_null
    //   174: astore 14
    //   176: aconst_null
    //   177: astore 13
    //   179: goto -82 -> 97
    //   182: astore 6
    //   184: aconst_null
    //   185: astore 5
    //   187: invokestatic 82	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   190: aload 6
    //   192: ldc 84
    //   194: invokevirtual 87	com/alipay/wandoujia/i:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   197: aload_3
    //   198: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   201: invokestatic 67	com/alipay/wandoujia/ac:i	()V
    //   204: aload_0
    //   205: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   208: ifeq +48 -> 256
    //   211: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   214: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   217: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   220: ifeq +36 -> 256
    //   223: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   226: invokestatic 72	com/alipay/wandoujia/ac:h	()Ljava/lang/String;
    //   229: putfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   232: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   235: lconst_0
    //   236: putfield 74	com/alipay/wandoujia/ac:d	J
    //   239: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   242: aload 5
    //   244: putfield 20	com/alipay/wandoujia/ac:b	Ljava/lang/String;
    //   247: goto -98 -> 149
    //   250: astore_1
    //   251: ldc 2
    //   253: monitorexit
    //   254: aload_1
    //   255: athrow
    //   256: aload_0
    //   257: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   260: ifeq +15 -> 275
    //   263: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   266: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   269: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   272: ifeq -40 -> 232
    //   275: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   278: aload_0
    //   279: putfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   282: goto -50 -> 232
    //   285: aload_3
    //   286: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   289: invokestatic 67	com/alipay/wandoujia/ac:i	()V
    //   292: aload_0
    //   293: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   296: ifeq +42 -> 338
    //   299: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   302: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   305: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   308: ifeq +30 -> 338
    //   311: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   314: invokestatic 72	com/alipay/wandoujia/ac:h	()Ljava/lang/String;
    //   317: putfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   320: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   323: lconst_0
    //   324: putfield 74	com/alipay/wandoujia/ac:d	J
    //   327: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   330: aload 5
    //   332: putfield 20	com/alipay/wandoujia/ac:b	Ljava/lang/String;
    //   335: aload 4
    //   337: athrow
    //   338: aload_0
    //   339: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   342: ifeq +15 -> 357
    //   345: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   348: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   351: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   354: ifeq -34 -> 320
    //   357: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   360: aload_0
    //   361: putfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   364: goto -44 -> 320
    //   367: aload 14
    //   369: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   372: ifeq +15 -> 387
    //   375: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   378: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   381: invokestatic 26	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   384: ifeq -251 -> 133
    //   387: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   390: aload 14
    //   392: putfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   395: goto -262 -> 133
    //   398: astore 4
    //   400: goto -115 -> 285
    //   403: astore 6
    //   405: goto -218 -> 187
    //   408: astore 4
    //   410: aconst_null
    //   411: astore_0
    //   412: aconst_null
    //   413: astore 5
    //   415: goto -130 -> 285
    //
    // Exception table:
    //   from	to	target	type
    //   21	53	182	java/lang/Exception
    //   53	63	182	java/lang/Exception
    //   160	170	182	java/lang/Exception
    //   5	21	250	finally
    //   97	133	250	finally
    //   133	149	250	finally
    //   149	154	250	finally
    //   197	232	250	finally
    //   232	247	250	finally
    //   256	275	250	finally
    //   275	282	250	finally
    //   285	320	250	finally
    //   320	338	250	finally
    //   338	357	250	finally
    //   357	364	250	finally
    //   367	387	250	finally
    //   387	395	250	finally
    //   67	86	398	finally
    //   187	197	398	finally
    //   67	86	403	java/lang/Exception
    //   21	53	408	finally
    //   53	63	408	finally
    //   160	170	408	finally
  }

  public static void f()
  {
    a.b = null;
    a.c = h();
    a.d = 0L;
    a = null;
    Context localContext = a.a().b();
    String str1 = x.a(localContext).b();
    String str2 = x.a(localContext).c();
    ab localab = new ab(localContext);
    localab.a(str1, str2);
    localab.close();
  }

  // ERROR //
  public static java.util.List g()
  {
    // Byte code:
    //   0: new 40	com/alipay/wandoujia/ab
    //   3: dup
    //   4: invokestatic 35	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   7: invokevirtual 38	com/wandoujia/image/c/a:b	()Landroid/content/Context;
    //   10: invokespecial 43	com/alipay/wandoujia/ab:<init>	(Landroid/content/Context;)V
    //   13: astore_0
    //   14: aload_0
    //   15: invokevirtual 95	com/alipay/wandoujia/ab:a	()Ljava/util/List;
    //   18: astore_3
    //   19: aload_0
    //   20: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   23: aload_3
    //   24: areturn
    //   25: astore_2
    //   26: aload_0
    //   27: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   30: aconst_null
    //   31: areturn
    //   32: astore_1
    //   33: aload_0
    //   34: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   37: aload_1
    //   38: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   14	19	25	java/lang/Exception
    //   14	19	32	finally
  }

  public static String h()
  {
    String str = Long.toHexString(System.currentTimeMillis());
    if (str.length() > 10)
      str = str.substring(-10 + str.length());
    return str;
  }

  private static void i()
  {
    if (a == null)
      a = new ac();
  }

  public final String a()
  {
    return this.b;
  }

  // ERROR //
  public final void a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 67	com/alipay/wandoujia/ac:i	()V
    //   5: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   8: aload_0
    //   9: getfield 20	com/alipay/wandoujia/ac:b	Ljava/lang/String;
    //   12: putfield 20	com/alipay/wandoujia/ac:b	Ljava/lang/String;
    //   15: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   18: aload_0
    //   19: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   22: putfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   25: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   28: aload_0
    //   29: getfield 74	com/alipay/wandoujia/ac:d	J
    //   32: putfield 74	com/alipay/wandoujia/ac:d	J
    //   35: new 40	com/alipay/wandoujia/ab
    //   38: dup
    //   39: aload_1
    //   40: invokespecial 43	com/alipay/wandoujia/ab:<init>	(Landroid/content/Context;)V
    //   43: astore_3
    //   44: aload_3
    //   45: aload_1
    //   46: invokestatic 48	com/alipay/wandoujia/x:a	(Landroid/content/Context;)Lcom/alipay/wandoujia/x;
    //   49: invokevirtual 51	com/alipay/wandoujia/x:b	()Ljava/lang/String;
    //   52: aload_1
    //   53: invokestatic 48	com/alipay/wandoujia/x:a	(Landroid/content/Context;)Lcom/alipay/wandoujia/x;
    //   56: invokevirtual 53	com/alipay/wandoujia/x:c	()Ljava/lang/String;
    //   59: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   62: getfield 20	com/alipay/wandoujia/ac:b	Ljava/lang/String;
    //   65: getstatic 18	com/alipay/wandoujia/ac:a	Lcom/alipay/wandoujia/ac;
    //   68: getfield 69	com/alipay/wandoujia/ac:c	Ljava/lang/String;
    //   71: invokevirtual 77	com/alipay/wandoujia/ab:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   74: aload_3
    //   75: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   78: aload_0
    //   79: monitorexit
    //   80: return
    //   81: astore 5
    //   83: invokestatic 82	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   86: aload 5
    //   88: ldc 120
    //   90: invokevirtual 87	com/alipay/wandoujia/i:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   93: aload_3
    //   94: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   97: goto -19 -> 78
    //   100: astore_2
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_2
    //   104: athrow
    //   105: astore 4
    //   107: aload_3
    //   108: invokevirtual 64	com/alipay/wandoujia/ab:close	()V
    //   111: aload 4
    //   113: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   44	74	81	java/lang/Exception
    //   2	44	100	finally
    //   74	78	100	finally
    //   93	97	100	finally
    //   107	114	100	finally
    //   44	74	105	finally
    //   83	93	105	finally
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  public final String b()
  {
    return this.c;
  }

  public final void b(String paramString)
  {
    this.c = paramString;
  }

  public final void c()
  {
    this.c = h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ac
 * JD-Core Version:    0.6.0
 */