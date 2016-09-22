package com.wandoujia.account.g;

import android.database.ContentObserver;
import android.os.Handler;

final class s extends ContentObserver
{
  public s(p paramp, Handler paramHandler)
  {
    super(paramHandler);
  }

  // ERROR //
  public final void onChange(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokespecial 23	android/database/ContentObserver:onChange	(Z)V
    //   5: ldc 25
    //   7: invokestatic 31	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   10: astore_2
    //   11: bipush 6
    //   13: anewarray 33	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc 35
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: ldc 37
    //   25: aastore
    //   26: dup
    //   27: iconst_2
    //   28: ldc 39
    //   30: aastore
    //   31: dup
    //   32: iconst_3
    //   33: ldc 41
    //   35: aastore
    //   36: dup
    //   37: iconst_4
    //   38: ldc 43
    //   40: aastore
    //   41: dup
    //   42: iconst_5
    //   43: ldc 45
    //   45: aastore
    //   46: astore_3
    //   47: invokestatic 51	android/support/v4/app/b:A	()Landroid/content/Context;
    //   50: invokevirtual 57	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   53: aload_2
    //   54: aload_3
    //   55: aconst_null
    //   56: aconst_null
    //   57: ldc 59
    //   59: invokevirtual 65	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   62: astore 6
    //   64: aload 6
    //   66: ifnull +155 -> 221
    //   69: aload 6
    //   71: ldc 37
    //   73: invokeinterface 71 2 0
    //   78: istore 7
    //   80: aload 6
    //   82: ldc 41
    //   84: invokeinterface 71 2 0
    //   89: istore 8
    //   91: aload 6
    //   93: invokeinterface 75 1 0
    //   98: ifeq +174 -> 272
    //   101: aload 6
    //   103: iload 7
    //   105: invokeinterface 79 2 0
    //   110: astore 12
    //   112: aload 12
    //   114: invokestatic 85	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   117: ifne -26 -> 91
    //   120: aload 12
    //   122: ldc 87
    //   124: invokevirtual 91	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   127: ifeq -36 -> 91
    //   130: aload 6
    //   132: iload 8
    //   134: invokeinterface 79 2 0
    //   139: astore 13
    //   141: aload 13
    //   143: invokestatic 85	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   146: ifne +126 -> 272
    //   149: aload 13
    //   151: ldc 93
    //   153: invokevirtual 96	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   156: ifeq +116 -> 272
    //   159: aload 13
    //   161: ldc 93
    //   163: invokevirtual 99	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   166: istore 14
    //   168: aload 13
    //   170: ldc 101
    //   172: invokevirtual 104	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   175: istore 15
    //   177: iload 14
    //   179: iconst_m1
    //   180: if_icmpeq +92 -> 272
    //   183: iload 15
    //   185: iconst_m1
    //   186: if_icmpeq +86 -> 272
    //   189: iload 14
    //   191: iload 15
    //   193: if_icmpge +14 -> 207
    //   196: aload 13
    //   198: invokevirtual 108	java/lang/String:length	()I
    //   201: istore 16
    //   203: iload 16
    //   205: istore 14
    //   207: iload 14
    //   209: iload 15
    //   211: if_icmpge +11 -> 222
    //   214: aload 6
    //   216: invokeinterface 112 1 0
    //   221: return
    //   222: aload 13
    //   224: iload 15
    //   226: iload 14
    //   228: invokevirtual 116	java/lang/String:substring	(II)Ljava/lang/String;
    //   231: astore 17
    //   233: aload 17
    //   235: invokestatic 85	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   238: ifne +34 -> 272
    //   241: aload_0
    //   242: getfield 10	com/wandoujia/account/g/s:a	Lcom/wandoujia/account/g/p;
    //   245: getfield 122	com/wandoujia/account/g/p:d	Lcom/wandoujia/account/f/b;
    //   248: aload 17
    //   250: invokevirtual 126	java/lang/String:trim	()Ljava/lang/String;
    //   253: invokevirtual 132	com/wandoujia/account/f/b:c	(Ljava/lang/String;)V
    //   256: invokestatic 51	android/support/v4/app/b:A	()Landroid/content/Context;
    //   259: invokevirtual 57	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   262: aload_0
    //   263: getfield 10	com/wandoujia/account/g/s:a	Lcom/wandoujia/account/g/p;
    //   266: invokestatic 135	com/wandoujia/account/g/p:a	(Lcom/wandoujia/account/g/p;)Lcom/wandoujia/account/g/s;
    //   269: invokevirtual 139	android/content/ContentResolver:unregisterContentObserver	(Landroid/database/ContentObserver;)V
    //   272: aload 6
    //   274: invokeinterface 112 1 0
    //   279: return
    //   280: astore 11
    //   282: return
    //   283: astore 9
    //   285: aload 6
    //   287: invokeinterface 112 1 0
    //   292: aload 9
    //   294: athrow
    //   295: astore 5
    //   297: return
    //   298: astore 18
    //   300: return
    //   301: astore 10
    //   303: goto -11 -> 292
    //   306: astore 4
    //   308: return
    //
    // Exception table:
    //   from	to	target	type
    //   272	279	280	java/lang/IllegalStateException
    //   91	177	283	finally
    //   196	203	283	finally
    //   222	272	283	finally
    //   11	64	295	java/lang/SecurityException
    //   69	91	295	java/lang/SecurityException
    //   214	221	295	java/lang/SecurityException
    //   272	279	295	java/lang/SecurityException
    //   285	292	295	java/lang/SecurityException
    //   292	295	295	java/lang/SecurityException
    //   214	221	298	java/lang/IllegalStateException
    //   285	292	301	java/lang/IllegalStateException
    //   11	64	306	java/lang/Exception
    //   69	91	306	java/lang/Exception
    //   214	221	306	java/lang/Exception
    //   272	279	306	java/lang/Exception
    //   285	292	306	java/lang/Exception
    //   292	295	306	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.s
 * JD-Core Version:    0.6.0
 */