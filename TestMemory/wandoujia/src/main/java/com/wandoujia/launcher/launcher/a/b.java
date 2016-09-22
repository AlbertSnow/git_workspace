package com.wandoujia.launcher.launcher.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;

public final class b
{
  private static b c;
  private final Context a;
  private SQLiteDatabase b;

  private b(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }

  public static b a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (c == null)
        c = new b(paramContext);
      b localb = c;
      return localb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private SQLiteDatabase b()
  {
    monitorenter;
    try
    {
      c localc;
      if (this.b == null)
        localc = new c(this.a);
      try
      {
        this.b = localc.getWritableDatabase();
        SQLiteDatabase localSQLiteDatabase = this.b;
        monitorexit;
        return localSQLiteDatabase;
      }
      catch (SQLiteException localSQLiteException)
      {
        while (true)
        {
          localc.close();
          this.b = null;
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
  private void b(com.wandoujia.launcher.launcher.models.SimpleAppInfo paramSimpleAppInfo)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +12 -> 15
    //   6: aload_0
    //   7: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnonnull +6 -> 18
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: astore 4
    //   24: getstatic 52	com/wandoujia/launcher/launcher/a/a:b	Ljava/lang/String;
    //   27: astore 5
    //   29: new 54	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   36: getstatic 57	com/wandoujia/launcher/launcher/a/a:c	Ljava/lang/String;
    //   39: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc 63
    //   44: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: astore 6
    //   52: iconst_1
    //   53: anewarray 69	java/lang/String
    //   56: astore 7
    //   58: aload 7
    //   60: iconst_0
    //   61: aload_1
    //   62: invokevirtual 74	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getPackageName	()Ljava/lang/String;
    //   65: aastore
    //   66: aload 4
    //   68: aload 5
    //   70: aconst_null
    //   71: aload 6
    //   73: aload 7
    //   75: aconst_null
    //   76: aconst_null
    //   77: aconst_null
    //   78: invokevirtual 80	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   81: astore 8
    //   83: aload 8
    //   85: ifnull -70 -> 15
    //   88: aload 8
    //   90: invokeinterface 86 1 0
    //   95: istore 11
    //   97: iload 11
    //   99: ifne +18 -> 117
    //   102: aload 8
    //   104: invokeinterface 87 1 0
    //   109: goto -94 -> 15
    //   112: astore 19
    //   114: goto -99 -> 15
    //   117: aload 8
    //   119: invokeinterface 91 1 0
    //   124: ifeq +152 -> 276
    //   127: new 93	android/content/ContentValues
    //   130: dup
    //   131: invokespecial 94	android/content/ContentValues:<init>	()V
    //   134: astore 12
    //   136: aload 12
    //   138: getstatic 57	com/wandoujia/launcher/launcher/a/a:c	Ljava/lang/String;
    //   141: aload_1
    //   142: invokevirtual 74	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getPackageName	()Ljava/lang/String;
    //   145: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aload 12
    //   150: getstatic 101	com/wandoujia/launcher/launcher/a/a:f	Ljava/lang/String;
    //   153: aload_1
    //   154: invokevirtual 104	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getAppType	()Ljava/lang/String;
    //   157: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload 12
    //   162: getstatic 107	com/wandoujia/launcher/launcher/a/a:d	Ljava/lang/String;
    //   165: aload_1
    //   166: invokevirtual 110	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getStartCount	()I
    //   169: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   172: invokevirtual 119	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   175: aload 12
    //   177: getstatic 122	com/wandoujia/launcher/launcher/a/a:e	Ljava/lang/String;
    //   180: aload_1
    //   181: invokevirtual 125	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getTitle	()Ljava/lang/String;
    //   184: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   187: aload 12
    //   189: getstatic 128	com/wandoujia/launcher/launcher/a/a:g	Ljava/lang/String;
    //   192: aload_1
    //   193: invokevirtual 132	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getIcons	()Lcom/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon;
    //   196: invokevirtual 137	com/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon:getPx256	()Ljava/lang/String;
    //   199: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: aload 12
    //   204: getstatic 140	com/wandoujia/launcher/launcher/a/a:h	Ljava/lang/String;
    //   207: aload_1
    //   208: invokevirtual 143	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getPinyinName	()Ljava/lang/String;
    //   211: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   214: aload_0
    //   215: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   218: astore 13
    //   220: getstatic 52	com/wandoujia/launcher/launcher/a/a:b	Ljava/lang/String;
    //   223: astore 14
    //   225: new 54	java/lang/StringBuilder
    //   228: dup
    //   229: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   232: getstatic 57	com/wandoujia/launcher/launcher/a/a:c	Ljava/lang/String;
    //   235: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: ldc 63
    //   240: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   246: astore 15
    //   248: iconst_1
    //   249: anewarray 69	java/lang/String
    //   252: astore 16
    //   254: aload 16
    //   256: iconst_0
    //   257: aload_1
    //   258: invokevirtual 74	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getPackageName	()Ljava/lang/String;
    //   261: aastore
    //   262: aload 13
    //   264: aload 14
    //   266: aload 12
    //   268: aload 15
    //   270: aload 16
    //   272: invokevirtual 147	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   275: pop
    //   276: aload 8
    //   278: invokeinterface 87 1 0
    //   283: goto -268 -> 15
    //   286: astore 18
    //   288: goto -273 -> 15
    //   291: astore 9
    //   293: aload 8
    //   295: invokeinterface 87 1 0
    //   300: aload 9
    //   302: athrow
    //   303: astore_2
    //   304: aload_0
    //   305: monitorexit
    //   306: aload_2
    //   307: athrow
    //   308: astore 10
    //   310: goto -10 -> 300
    //
    // Exception table:
    //   from	to	target	type
    //   102	109	112	java/lang/IllegalStateException
    //   276	283	286	java/lang/IllegalStateException
    //   88	97	291	finally
    //   117	276	291	finally
    //   6	11	303	finally
    //   18	83	303	finally
    //   102	109	303	finally
    //   276	283	303	finally
    //   293	300	303	finally
    //   300	303	303	finally
    //   293	300	308	java/lang/IllegalStateException
  }

  // ERROR //
  public final java.util.List<com.wandoujia.launcher.launcher.models.SimpleAppInfo> a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: aload_1
    //   8: ifnonnull +5 -> 13
    //   11: aload_2
    //   12: areturn
    //   13: aload_0
    //   14: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: getstatic 52	com/wandoujia/launcher/launcher/a/a:b	Ljava/lang/String;
    //   20: aconst_null
    //   21: aconst_null
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: invokevirtual 80	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_3
    //   30: new 152	java/util/ArrayList
    //   33: dup
    //   34: invokespecial 153	java/util/ArrayList:<init>	()V
    //   37: astore_2
    //   38: aload_3
    //   39: ifnull -28 -> 11
    //   42: aload_3
    //   43: invokeinterface 156 1 0
    //   48: ifeq +178 -> 226
    //   51: new 71	com/wandoujia/launcher/launcher/models/SimpleAppInfo
    //   54: dup
    //   55: invokespecial 157	com/wandoujia/launcher/launcher/models/SimpleAppInfo:<init>	()V
    //   58: astore 8
    //   60: aload 8
    //   62: aload_3
    //   63: aload_3
    //   64: getstatic 57	com/wandoujia/launcher/launcher/a/a:c	Ljava/lang/String;
    //   67: invokeinterface 161 2 0
    //   72: invokeinterface 165 2 0
    //   77: invokevirtual 169	com/wandoujia/launcher/launcher/models/SimpleAppInfo:setPackageName	(Ljava/lang/String;)V
    //   80: aload 8
    //   82: aload_3
    //   83: aload_3
    //   84: getstatic 122	com/wandoujia/launcher/launcher/a/a:e	Ljava/lang/String;
    //   87: invokeinterface 161 2 0
    //   92: invokeinterface 165 2 0
    //   97: invokevirtual 172	com/wandoujia/launcher/launcher/models/SimpleAppInfo:setTitle	(Ljava/lang/String;)V
    //   100: aload 8
    //   102: aload_3
    //   103: aload_3
    //   104: getstatic 107	com/wandoujia/launcher/launcher/a/a:d	Ljava/lang/String;
    //   107: invokeinterface 161 2 0
    //   112: invokeinterface 176 2 0
    //   117: invokevirtual 180	com/wandoujia/launcher/launcher/models/SimpleAppInfo:setStartCount	(I)V
    //   120: aload 8
    //   122: aload_3
    //   123: aload_3
    //   124: getstatic 101	com/wandoujia/launcher/launcher/a/a:f	Ljava/lang/String;
    //   127: invokeinterface 161 2 0
    //   132: invokeinterface 165 2 0
    //   137: invokevirtual 183	com/wandoujia/launcher/launcher/models/SimpleAppInfo:setAppType	(Ljava/lang/String;)V
    //   140: aload_3
    //   141: getstatic 128	com/wandoujia/launcher/launcher/a/a:g	Ljava/lang/String;
    //   144: invokeinterface 161 2 0
    //   149: istore 9
    //   151: new 134	com/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon
    //   154: dup
    //   155: invokespecial 184	com/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon:<init>	()V
    //   158: astore 10
    //   160: aload 10
    //   162: aload_3
    //   163: iload 9
    //   165: invokeinterface 165 2 0
    //   170: invokevirtual 187	com/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon:setPx256	(Ljava/lang/String;)V
    //   173: aload 8
    //   175: aload 10
    //   177: invokevirtual 191	com/wandoujia/launcher/launcher/models/SimpleAppInfo:setIcons	(Lcom/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon;)V
    //   180: aload 8
    //   182: aload_3
    //   183: aload_3
    //   184: getstatic 140	com/wandoujia/launcher/launcher/a/a:h	Ljava/lang/String;
    //   187: invokeinterface 161 2 0
    //   192: invokeinterface 165 2 0
    //   197: invokevirtual 194	com/wandoujia/launcher/launcher/models/SimpleAppInfo:setPinyinName	(Ljava/lang/String;)V
    //   200: aload_2
    //   201: aload 8
    //   203: invokeinterface 200 2 0
    //   208: pop
    //   209: goto -167 -> 42
    //   212: astore 6
    //   214: aload_3
    //   215: invokeinterface 87 1 0
    //   220: aload_2
    //   221: areturn
    //   222: astore 7
    //   224: aload_2
    //   225: areturn
    //   226: aload_3
    //   227: invokeinterface 87 1 0
    //   232: aload_2
    //   233: areturn
    //   234: astore 12
    //   236: aload_2
    //   237: areturn
    //   238: astore 4
    //   240: aload_3
    //   241: invokeinterface 87 1 0
    //   246: aload 4
    //   248: athrow
    //   249: astore 5
    //   251: goto -5 -> 246
    //
    // Exception table:
    //   from	to	target	type
    //   42	209	212	java/lang/Exception
    //   214	220	222	java/lang/IllegalStateException
    //   226	232	234	java/lang/IllegalStateException
    //   42	209	238	finally
    //   240	246	249	java/lang/IllegalStateException
  }

  // ERROR //
  public final void a(com.wandoujia.launcher.launcher.models.SimpleAppInfo paramSimpleAppInfo)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +12 -> 15
    //   6: aload_0
    //   7: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnonnull +6 -> 18
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: astore 4
    //   24: getstatic 52	com/wandoujia/launcher/launcher/a/a:b	Ljava/lang/String;
    //   27: astore 5
    //   29: new 54	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   36: getstatic 57	com/wandoujia/launcher/launcher/a/a:c	Ljava/lang/String;
    //   39: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc 63
    //   44: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: astore 6
    //   52: iconst_1
    //   53: anewarray 69	java/lang/String
    //   56: astore 7
    //   58: aload 7
    //   60: iconst_0
    //   61: aload_1
    //   62: invokevirtual 74	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getPackageName	()Ljava/lang/String;
    //   65: aastore
    //   66: aload 4
    //   68: aload 5
    //   70: aconst_null
    //   71: aload 6
    //   73: aload 7
    //   75: aconst_null
    //   76: aconst_null
    //   77: aconst_null
    //   78: invokevirtual 80	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   81: astore 8
    //   83: aload 8
    //   85: ifnull -70 -> 15
    //   88: aload 8
    //   90: invokeinterface 86 1 0
    //   95: ifle +23 -> 118
    //   98: aload_0
    //   99: aload_1
    //   100: invokespecial 202	com/wandoujia/launcher/launcher/a/b:b	(Lcom/wandoujia/launcher/launcher/models/SimpleAppInfo;)V
    //   103: aload 8
    //   105: invokeinterface 87 1 0
    //   110: goto -95 -> 15
    //   113: astore 15
    //   115: goto -100 -> 15
    //   118: aload 8
    //   120: invokeinterface 87 1 0
    //   125: new 93	android/content/ContentValues
    //   128: dup
    //   129: invokespecial 94	android/content/ContentValues:<init>	()V
    //   132: astore 12
    //   134: aload 12
    //   136: getstatic 57	com/wandoujia/launcher/launcher/a/a:c	Ljava/lang/String;
    //   139: aload_1
    //   140: invokevirtual 74	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getPackageName	()Ljava/lang/String;
    //   143: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   146: aload 12
    //   148: getstatic 101	com/wandoujia/launcher/launcher/a/a:f	Ljava/lang/String;
    //   151: aload_1
    //   152: invokevirtual 104	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getAppType	()Ljava/lang/String;
    //   155: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aload 12
    //   160: getstatic 122	com/wandoujia/launcher/launcher/a/a:e	Ljava/lang/String;
    //   163: aload_1
    //   164: invokevirtual 125	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getTitle	()Ljava/lang/String;
    //   167: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: aload 12
    //   172: getstatic 107	com/wandoujia/launcher/launcher/a/a:d	Ljava/lang/String;
    //   175: aload_1
    //   176: invokevirtual 110	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getStartCount	()I
    //   179: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: invokevirtual 119	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   185: aload 12
    //   187: getstatic 128	com/wandoujia/launcher/launcher/a/a:g	Ljava/lang/String;
    //   190: aload_1
    //   191: invokevirtual 132	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getIcons	()Lcom/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon;
    //   194: invokevirtual 137	com/wandoujia/launcher/launcher/models/SimpleAppInfo$Icon:getPx256	()Ljava/lang/String;
    //   197: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: aload 12
    //   202: getstatic 140	com/wandoujia/launcher/launcher/a/a:h	Ljava/lang/String;
    //   205: aload_1
    //   206: invokevirtual 143	com/wandoujia/launcher/launcher/models/SimpleAppInfo:getPinyinName	()Ljava/lang/String;
    //   209: invokevirtual 98	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: aload_0
    //   213: invokespecial 47	com/wandoujia/launcher/launcher/a/b:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   216: getstatic 52	com/wandoujia/launcher/launcher/a/a:b	Ljava/lang/String;
    //   219: aconst_null
    //   220: aload 12
    //   222: invokevirtual 206	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   225: pop2
    //   226: goto -211 -> 15
    //   229: astore_2
    //   230: aload_0
    //   231: monitorexit
    //   232: aload_2
    //   233: athrow
    //   234: astore 9
    //   236: aload 8
    //   238: invokeinterface 87 1 0
    //   243: aload 9
    //   245: athrow
    //   246: astore 11
    //   248: goto -123 -> 125
    //   251: astore 10
    //   253: goto -10 -> 243
    //
    // Exception table:
    //   from	to	target	type
    //   103	110	113	java/lang/IllegalStateException
    //   6	11	229	finally
    //   18	83	229	finally
    //   103	110	229	finally
    //   118	125	229	finally
    //   125	226	229	finally
    //   236	243	229	finally
    //   243	246	229	finally
    //   88	103	234	finally
    //   118	125	246	java/lang/IllegalStateException
    //   236	243	251	java/lang/IllegalStateException
  }

  public final void a(String paramString)
  {
    monitorenter;
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        SQLiteDatabase localSQLiteDatabase = b();
        if (localSQLiteDatabase != null)
          break label21;
      }
      while (true)
      {
        return;
        label21: b().delete(a.b, a.c + " = ?", new String[] { paramString });
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.a.b
 * JD-Core Version:    0.6.0
 */