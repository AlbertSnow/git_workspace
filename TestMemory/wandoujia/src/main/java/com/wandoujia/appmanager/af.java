package com.wandoujia.appmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.shared_storage.AppIgnoreUpdateStorage;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class af
{
  private static af a;
  private final AtomicBoolean b = new AtomicBoolean(false);
  private final AtomicBoolean c = new AtomicBoolean(false);
  private final Context d;
  private SQLiteDatabase e;
  private AppIgnoreUpdateStorage f;

  static
  {
    if (!af.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      g = bool;
      af.class.getSimpleName();
      return;
    }
  }

  private af(Context paramContext)
  {
    this.d = paramContext;
  }

  private static LocalAppInfo a(Cursor paramCursor, Set<String> paramSet)
  {
    String str = b("packagename", paramCursor);
    if (TextUtils.isEmpty(str))
      return null;
    LocalAppInfo localLocalAppInfo = new LocalAppInfo();
    localLocalAppInfo.packageName = str;
    localLocalAppInfo.title = b("title", paramCursor);
    localLocalAppInfo.titlePinyinFirstChar = b("title_pinyin_first_char", paramCursor);
    localLocalAppInfo.size = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("size"));
    localLocalAppInfo.isUpgradeIgnored = paramSet.contains(str);
    localLocalAppInfo.versionCode = c("versioncode", paramCursor);
    localLocalAppInfo.upgradeInfo = LocalAppInfo.UpgradeInfo.parseFromJson(b("upgrade_info", paramCursor));
    localLocalAppInfo.showIndex = c("show_index", paramCursor);
    return localLocalAppInfo;
  }

  public static af a()
  {
    return a;
  }

  public static void a(Context paramContext)
  {
    a = new af(paramContext);
  }

  private boolean a(LocalAppInfo paramLocalAppInfo)
  {
    int i = 1;
    e();
    if ((paramLocalAppInfo == null) || (TextUtils.isEmpty(paramLocalAppInfo.getPackageName())))
      i = 0;
    while (true)
    {
      return i;
      try
      {
        a(paramLocalAppInfo.getPackageName(), paramLocalAppInfo.isUpgradeIgnored());
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("packagename", paramLocalAppInfo.getPackageName());
        localContentValues.put("title", paramLocalAppInfo.getTitle());
        localContentValues.put("title_pinyin_first_char", paramLocalAppInfo.getTitlePinyinFirstChar());
        localContentValues.put("size", Long.valueOf(paramLocalAppInfo.getSize()));
        localContentValues.put("versioncode", Integer.valueOf(paramLocalAppInfo.getVersionCode()));
        localContentValues.put("md5", paramLocalAppInfo.getMD5());
        LocalAppInfo.UpgradeInfo localUpgradeInfo = paramLocalAppInfo.getUpgradeInfo();
        if (localUpgradeInfo == null);
        String str;
        for (Object localObject = ""; ; localObject = str)
        {
          localContentValues.put("upgrade_info", (String)localObject);
          localContentValues.put("show_index", Integer.valueOf(paramLocalAppInfo.getIndex()));
          SQLiteDatabase localSQLiteDatabase = this.e;
          String[] arrayOfString = new String[1];
          arrayOfString[0] = paramLocalAppInfo.getPackageName();
          if ((localSQLiteDatabase.update("apps", localContentValues, "packagename=?", arrayOfString) > 0) || (this.e.insert("apps", null, localContentValues) != -1L))
            break;
          return false;
          str = localUpgradeInfo.toJson();
        }
      }
      catch (SQLiteException localSQLiteException)
      {
      }
    }
    return false;
  }

  private static String b(String paramString, Cursor paramCursor)
  {
    return paramCursor.getString(paramCursor.getColumnIndexOrThrow(paramString));
  }

  private static int c(String paramString, Cursor paramCursor)
  {
    return paramCursor.getInt(paramCursor.getColumnIndexOrThrow(paramString));
  }

  private void e()
  {
    if (!this.c.get())
      b();
    while (true)
    {
      synchronized (this.b)
      {
        boolean bool = this.b.get();
        if (bool);
      }
      try
      {
        if ((!g) && (Looper.getMainLooper() == Looper.myLooper()))
          throw new AssertionError();
        this.b.wait();
        continue;
        localObject = finally;
        monitorexit;
        throw localObject;
        monitorexit;
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }

  // ERROR //
  public final java.util.List<LocalAppInfo> a(java.util.List<String> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 137	com/wandoujia/appmanager/af:e	()V
    //   4: aload_1
    //   5: ifnull +12 -> 17
    //   8: aload_1
    //   9: invokeinterface 257 1 0
    //   14: ifeq +9 -> 23
    //   17: invokestatic 263	java/util/Collections:emptyList	()Ljava/util/List;
    //   20: astore_2
    //   21: aload_2
    //   22: areturn
    //   23: new 265	java/lang/StringBuilder
    //   26: dup
    //   27: ldc_w 267
    //   30: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: astore_3
    //   34: aload_1
    //   35: invokeinterface 274 1 0
    //   40: astore 4
    //   42: aload 4
    //   44: invokeinterface 279 1 0
    //   49: ifeq +51 -> 100
    //   52: aload 4
    //   54: invokeinterface 283 1 0
    //   59: pop
    //   60: aload_3
    //   61: ldc_w 285
    //   64: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload 4
    //   70: invokeinterface 279 1 0
    //   75: ifeq +14 -> 89
    //   78: aload_3
    //   79: ldc_w 291
    //   82: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: goto -44 -> 42
    //   89: aload_3
    //   90: ldc_w 293
    //   93: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: goto -55 -> 42
    //   100: aload_3
    //   101: invokevirtual 296	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: astore 5
    //   106: aload_1
    //   107: iconst_0
    //   108: anewarray 201	java/lang/String
    //   111: invokeinterface 300 2 0
    //   116: checkcast 302	[Ljava/lang/String;
    //   119: astore 6
    //   121: aload_0
    //   122: getfield 130	com/wandoujia/appmanager/af:f	Lcom/wandoujia/shared_storage/AppIgnoreUpdateStorage;
    //   125: invokevirtual 307	com/wandoujia/shared_storage/AppIgnoreUpdateStorage:d	()Ljava/util/Set;
    //   128: astore 11
    //   130: aload_0
    //   131: getfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   134: ldc 203
    //   136: aconst_null
    //   137: aload 5
    //   139: aload 6
    //   141: aconst_null
    //   142: aconst_null
    //   143: aconst_null
    //   144: invokevirtual 311	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   147: astore 12
    //   149: aload 12
    //   151: astore 10
    //   153: new 313	java/util/ArrayList
    //   156: dup
    //   157: aload 10
    //   159: invokeinterface 316 1 0
    //   164: invokespecial 319	java/util/ArrayList:<init>	(I)V
    //   167: astore_2
    //   168: aload 10
    //   170: invokeinterface 322 1 0
    //   175: pop
    //   176: aload 10
    //   178: invokeinterface 325 1 0
    //   183: ifne +59 -> 242
    //   186: aload 10
    //   188: aload 11
    //   190: invokestatic 327	com/wandoujia/appmanager/af:a	(Landroid/database/Cursor;Ljava/util/Set;)Lcom/wandoujia/appmanager/LocalAppInfo;
    //   193: astore 15
    //   195: aload 15
    //   197: ifnull +12 -> 209
    //   200: aload_2
    //   201: aload 15
    //   203: invokeinterface 330 2 0
    //   208: pop
    //   209: aload 10
    //   211: invokeinterface 333 1 0
    //   216: pop
    //   217: goto -41 -> 176
    //   220: astore 13
    //   222: aload 10
    //   224: astore 8
    //   226: aload 8
    //   228: ifnull +10 -> 238
    //   231: aload 8
    //   233: invokeinterface 336 1 0
    //   238: invokestatic 263	java/util/Collections:emptyList	()Ljava/util/List;
    //   241: areturn
    //   242: aload 10
    //   244: ifnull -223 -> 21
    //   247: aload 10
    //   249: invokeinterface 336 1 0
    //   254: aload_2
    //   255: areturn
    //   256: astore 9
    //   258: aconst_null
    //   259: astore 10
    //   261: aload 10
    //   263: ifnull +10 -> 273
    //   266: aload 10
    //   268: invokeinterface 336 1 0
    //   273: aload 9
    //   275: athrow
    //   276: astore 9
    //   278: goto -17 -> 261
    //   281: astore 7
    //   283: aconst_null
    //   284: astore 8
    //   286: goto -60 -> 226
    //
    // Exception table:
    //   from	to	target	type
    //   153	176	220	java/lang/RuntimeException
    //   176	195	220	java/lang/RuntimeException
    //   200	209	220	java/lang/RuntimeException
    //   209	217	220	java/lang/RuntimeException
    //   121	149	256	finally
    //   153	176	276	finally
    //   176	195	276	finally
    //   200	209	276	finally
    //   209	217	276	finally
    //   121	149	281	java/lang/RuntimeException
  }

  public final boolean a(String paramString, boolean paramBoolean)
  {
    e();
    if (paramBoolean)
      this.f.a(paramString);
    while (true)
    {
      return true;
      this.f.b(paramString);
    }
  }

  // ERROR //
  public final boolean a(java.util.Collection<LocalAppInfo> paramCollection)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 137	com/wandoujia/appmanager/af:e	()V
    //   6: aload_1
    //   7: ifnull +14 -> 21
    //   10: aload_1
    //   11: invokeinterface 346 1 0
    //   16: istore_3
    //   17: iload_3
    //   18: ifeq +11 -> 29
    //   21: iconst_0
    //   22: istore 8
    //   24: aload_0
    //   25: monitorexit
    //   26: iload 8
    //   28: ireturn
    //   29: aload_0
    //   30: getfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   33: invokevirtual 349	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   36: aload_1
    //   37: invokeinterface 350 1 0
    //   42: astore 9
    //   44: aload 9
    //   46: invokeinterface 279 1 0
    //   51: ifeq +36 -> 87
    //   54: aload_0
    //   55: aload 9
    //   57: invokeinterface 283 1 0
    //   62: checkcast 60	com/wandoujia/appmanager/LocalAppInfo
    //   65: invokespecial 352	com/wandoujia/appmanager/af:a	(Lcom/wandoujia/appmanager/LocalAppInfo;)Z
    //   68: pop
    //   69: goto -25 -> 44
    //   72: astore 6
    //   74: aload_0
    //   75: getfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   78: invokevirtual 355	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   81: iconst_0
    //   82: istore 8
    //   84: goto -60 -> 24
    //   87: aload_0
    //   88: getfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   91: invokevirtual 358	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   94: aload_0
    //   95: getfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   98: invokevirtual 355	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   101: iconst_1
    //   102: istore 8
    //   104: goto -80 -> 24
    //   107: astore 4
    //   109: aload_0
    //   110: getfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   113: invokevirtual 355	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   116: aload 4
    //   118: athrow
    //   119: astore_2
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_2
    //   123: athrow
    //   124: astore 5
    //   126: goto -10 -> 116
    //   129: astore 7
    //   131: goto -50 -> 81
    //   134: astore 10
    //   136: goto -35 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   29	44	72	android/database/sqlite/SQLiteException
    //   44	69	72	android/database/sqlite/SQLiteException
    //   87	94	72	android/database/sqlite/SQLiteException
    //   29	44	107	finally
    //   44	69	107	finally
    //   87	94	107	finally
    //   2	6	119	finally
    //   10	17	119	finally
    //   74	81	119	finally
    //   94	101	119	finally
    //   109	116	119	finally
    //   116	119	119	finally
    //   109	116	124	java/lang/Exception
    //   74	81	129	java/lang/Exception
    //   94	101	134	java/lang/Exception
  }

  // ERROR //
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/wandoujia/appmanager/af:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: invokevirtual 233	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   9: istore_2
    //   10: iload_2
    //   11: ifeq +6 -> 17
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield 44	com/wandoujia/appmanager/af:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   21: iconst_1
    //   22: invokevirtual 361	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   25: aload_0
    //   26: invokestatic 364	com/wandoujia/shared_storage/AppIgnoreUpdateStorage:a	()Lcom/wandoujia/shared_storage/AppIgnoreUpdateStorage;
    //   29: putfield 130	com/wandoujia/appmanager/af:f	Lcom/wandoujia/shared_storage/AppIgnoreUpdateStorage;
    //   32: new 366	com/wandoujia/appmanager/ag
    //   35: dup
    //   36: aload_0
    //   37: aload_0
    //   38: getfield 46	com/wandoujia/appmanager/af:d	Landroid/content/Context;
    //   41: iconst_0
    //   42: invokespecial 369	com/wandoujia/appmanager/ag:<init>	(Lcom/wandoujia/appmanager/af;Landroid/content/Context;B)V
    //   45: astore_3
    //   46: aload_0
    //   47: aconst_null
    //   48: putfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   51: aload_0
    //   52: aload_3
    //   53: invokevirtual 373	com/wandoujia/appmanager/ag:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   56: putfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   59: aload_0
    //   60: getfield 42	com/wandoujia/appmanager/af:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   63: astore 5
    //   65: aload 5
    //   67: monitorenter
    //   68: aload_0
    //   69: getfield 42	com/wandoujia/appmanager/af:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   72: iconst_1
    //   73: invokevirtual 361	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   76: aload_0
    //   77: getfield 42	com/wandoujia/appmanager/af:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   80: invokevirtual 376	java/lang/Object:notifyAll	()V
    //   83: aload 5
    //   85: monitorexit
    //   86: goto -72 -> 14
    //   89: astore 6
    //   91: aload 5
    //   93: monitorexit
    //   94: aload 6
    //   96: athrow
    //   97: astore_1
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_1
    //   101: athrow
    //   102: astore 4
    //   104: aload 4
    //   106: invokestatic 382	com/wandoujia/base/log/Log:printStackTrace	(Ljava/lang/Throwable;)V
    //   109: goto -95 -> 14
    //
    // Exception table:
    //   from	to	target	type
    //   68	86	89	finally
    //   91	94	89	finally
    //   2	10	97	finally
    //   17	51	97	finally
    //   51	59	97	finally
    //   59	68	97	finally
    //   94	97	97	finally
    //   104	109	97	finally
    //   51	59	102	android/database/sqlite/SQLiteException
  }

  // ERROR //
  public final java.util.List<LocalAppInfo> c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 313	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 383	java/util/ArrayList:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: invokespecial 137	com/wandoujia/appmanager/af:e	()V
    //   14: aload_0
    //   15: getfield 130	com/wandoujia/appmanager/af:f	Lcom/wandoujia/shared_storage/AppIgnoreUpdateStorage;
    //   18: invokevirtual 307	com/wandoujia/shared_storage/AppIgnoreUpdateStorage:d	()Ljava/util/Set;
    //   21: astore 7
    //   23: aload_0
    //   24: getfield 199	com/wandoujia/appmanager/af:e	Landroid/database/sqlite/SQLiteDatabase;
    //   27: ldc 203
    //   29: aconst_null
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: invokevirtual 311	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore 8
    //   40: aload 8
    //   42: astore 4
    //   44: aload 4
    //   46: invokeinterface 322 1 0
    //   51: pop
    //   52: aload 4
    //   54: invokeinterface 325 1 0
    //   59: ifne +44 -> 103
    //   62: aload_2
    //   63: aload 4
    //   65: aload 7
    //   67: invokestatic 327	com/wandoujia/appmanager/af:a	(Landroid/database/Cursor;Ljava/util/Set;)Lcom/wandoujia/appmanager/LocalAppInfo;
    //   70: invokeinterface 330 2 0
    //   75: pop
    //   76: aload 4
    //   78: invokeinterface 333 1 0
    //   83: pop
    //   84: goto -32 -> 52
    //   87: astore 11
    //   89: aload 4
    //   91: ifnull +10 -> 101
    //   94: aload 4
    //   96: invokeinterface 336 1 0
    //   101: aload_2
    //   102: areturn
    //   103: aload 4
    //   105: ifnull -4 -> 101
    //   108: aload 4
    //   110: invokeinterface 336 1 0
    //   115: aload_2
    //   116: areturn
    //   117: astore 6
    //   119: aload_1
    //   120: ifnull -19 -> 101
    //   123: aload_1
    //   124: invokeinterface 336 1 0
    //   129: aload_2
    //   130: areturn
    //   131: astore 5
    //   133: aload_1
    //   134: ifnull +9 -> 143
    //   137: aload_1
    //   138: invokeinterface 336 1 0
    //   143: aload 5
    //   145: athrow
    //   146: astore 10
    //   148: aload 4
    //   150: astore_1
    //   151: aload 10
    //   153: astore 5
    //   155: goto -22 -> 133
    //   158: astore 9
    //   160: aload 4
    //   162: astore_1
    //   163: goto -44 -> 119
    //   166: astore_3
    //   167: aconst_null
    //   168: astore 4
    //   170: goto -81 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   44	52	87	android/database/sqlite/SQLiteException
    //   52	84	87	android/database/sqlite/SQLiteException
    //   10	40	117	java/lang/Exception
    //   10	40	131	finally
    //   44	52	146	finally
    //   52	84	146	finally
    //   44	52	158	java/lang/Exception
    //   52	84	158	java/lang/Exception
    //   10	40	166	android/database/sqlite/SQLiteException
  }

  public final Set<String> d()
  {
    return this.f.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.af
 * JD-Core Version:    0.6.0
 */