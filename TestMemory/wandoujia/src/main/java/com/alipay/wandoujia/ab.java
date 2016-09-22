package com.alipay.wandoujia;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.alipay.android.app.d;
import com.wandoujia.image.c.a;
import java.lang.ref.WeakReference;

final class ab extends SQLiteOpenHelper
{
  private WeakReference a;

  public ab(Context paramContext)
  {
    super(paramContext, "msp.db", null, 1);
    this.a = new WeakReference(paramContext);
  }

  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    try
    {
      paramSQLiteDatabase.delete("tb_tid", "name=?", new String[] { paramString });
      return;
    }
    catch (Exception localException)
    {
      i.a().a(localException, "on delete tid");
      b.b(localException);
    }
  }

  private void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str = b.a(paramString3, x.e((Context)this.a.get()));
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = str;
    arrayOfObject[1] = paramString4;
    arrayOfObject[2] = e(paramString1, paramString2);
    paramSQLiteDatabase.execSQL("update tb_tid set tid=?, key_tid=?, dt=datetime('now', 'localtime') where name=?", arrayOfObject);
  }

  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    Cursor localCursor = null;
    while (true)
    {
      try
      {
        String[] arrayOfString = new String[1];
        arrayOfString[0] = e(paramString1, paramString2);
        localCursor = paramSQLiteDatabase.rawQuery("select count(*) from tb_tid where name=?", arrayOfString);
        if (!localCursor.moveToFirst())
          break label116;
        int j = localCursor.getInt(0);
        i = j;
        if (localCursor == null)
          continue;
        localCursor.close();
        if (i > 0)
          return true;
      }
      catch (Exception localException)
      {
        i.a().a(localException, "check has device tid error");
        if (localCursor == null)
          break label110;
        localCursor.close();
        i = 0;
        continue;
      }
      finally
      {
        if (localCursor == null)
          continue;
        localCursor.close();
      }
      return false;
      label110: int i = 0;
      continue;
      label116: i = 0;
    }
  }

  private static String e(String paramString1, String paramString2)
  {
    return paramString1 + paramString2;
  }

  // ERROR //
  public final java.util.List a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 119	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 121	java/util/ArrayList:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: invokevirtual 125	com/alipay/wandoujia/ab:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore 6
    //   16: aload 6
    //   18: astore 4
    //   20: aload 4
    //   22: ldc 127
    //   24: aconst_null
    //   25: invokevirtual 83	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 130 1 0
    //   35: istore 7
    //   37: iload 7
    //   39: ifne +33 -> 72
    //   42: aload_1
    //   43: ifnull +9 -> 52
    //   46: aload_1
    //   47: invokeinterface 97 1 0
    //   52: aload 4
    //   54: ifnull +16 -> 70
    //   57: aload 4
    //   59: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   62: ifeq +8 -> 70
    //   65: aload 4
    //   67: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   70: aload_2
    //   71: areturn
    //   72: aload_1
    //   73: iconst_0
    //   74: invokeinterface 138 2 0
    //   79: astore 8
    //   81: aload 8
    //   83: invokestatic 144	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   86: ifne -57 -> 29
    //   89: aload_2
    //   90: aload 8
    //   92: aload_0
    //   93: getfield 20	com/alipay/wandoujia/ab:a	Ljava/lang/ref/WeakReference;
    //   96: invokevirtual 55	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   99: checkcast 57	android/content/Context
    //   102: invokestatic 63	com/alipay/wandoujia/x:e	(Landroid/content/Context;)Ljava/lang/String;
    //   105: invokestatic 146	android/support/v4/app/b:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokeinterface 152 2 0
    //   113: pop
    //   114: goto -85 -> 29
    //   117: astore_3
    //   118: invokestatic 40	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   121: aload_3
    //   122: ldc 154
    //   124: invokevirtual 45	com/alipay/wandoujia/i:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   127: aload_1
    //   128: ifnull +9 -> 137
    //   131: aload_1
    //   132: invokeinterface 97 1 0
    //   137: aload 4
    //   139: ifnull -69 -> 70
    //   142: aload 4
    //   144: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   147: ifeq -77 -> 70
    //   150: aload 4
    //   152: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   155: aload_2
    //   156: areturn
    //   157: astore 5
    //   159: aconst_null
    //   160: astore 4
    //   162: aload_1
    //   163: ifnull +9 -> 172
    //   166: aload_1
    //   167: invokeinterface 97 1 0
    //   172: aload 4
    //   174: ifnull +16 -> 190
    //   177: aload 4
    //   179: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   182: ifeq +8 -> 190
    //   185: aload 4
    //   187: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   190: aload 5
    //   192: athrow
    //   193: astore 5
    //   195: goto -33 -> 162
    //   198: astore_3
    //   199: aconst_null
    //   200: astore_1
    //   201: aconst_null
    //   202: astore 4
    //   204: goto -86 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   20	29	117	java/lang/Exception
    //   29	37	117	java/lang/Exception
    //   72	114	117	java/lang/Exception
    //   10	16	157	finally
    //   20	29	193	finally
    //   29	37	193	finally
    //   72	114	193	finally
    //   118	127	193	finally
    //   10	16	198	java/lang/Exception
  }

  public final void a(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localSQLiteDatabase = getWritableDatabase();
      a(localSQLiteDatabase, paramString1, paramString2, "", "");
      a(localSQLiteDatabase, e(paramString1, paramString2));
      return;
    }
    catch (Exception localException)
    {
      i.a().b(localException, "delete tid error");
      return;
    }
    finally
    {
      if ((localSQLiteDatabase != null) && (localSQLiteDatabase.isOpen()))
        localSQLiteDatabase.close();
    }
    throw localObject;
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localSQLiteDatabase = getWritableDatabase();
      if (a(localSQLiteDatabase, paramString1, paramString2))
        a(localSQLiteDatabase, paramString1, paramString2, paramString3, paramString4);
      while (true)
      {
        return;
        String str = b.a(paramString3, x.e((Context)this.a.get()));
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = e(paramString1, paramString2);
        arrayOfObject[1] = str;
        arrayOfObject[2] = paramString4;
        localSQLiteDatabase.execSQL("insert into tb_tid (name, tid, key_tid, dt) values (?, ?, ?, datetime('now', 'localtime'))", arrayOfObject);
        localCursor = localSQLiteDatabase.rawQuery("select name from tb_tid where tid!='' order by dt asc", null);
        locald = a.a().c();
        if (localCursor.getCount() > locald.e())
          break;
        localCursor.close();
      }
    }
    catch (Exception localException)
    {
      Cursor localCursor;
      d locald;
      i.a().a(localException, "on alter tid");
      b.b(localException);
      return;
      int i = localCursor.getCount() - locald.e();
      String[] arrayOfString = new String[i];
      if (localCursor.moveToFirst())
      {
        int j = 0;
        do
        {
          arrayOfString[j] = localCursor.getString(0);
          j++;
        }
        while ((localCursor.moveToNext()) && (i > j));
      }
      localCursor.close();
      for (int k = 0; k < i; k++)
      {
        if (TextUtils.isEmpty(arrayOfString[k]))
          continue;
        a(localSQLiteDatabase, arrayOfString[k]);
      }
    }
    finally
    {
      if ((localSQLiteDatabase != null) && (localSQLiteDatabase.isOpen()))
        localSQLiteDatabase.close();
    }
    throw localObject;
  }

  // ERROR //
  public final String b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 125	com/alipay/wandoujia/ab:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 9
    //   6: aload 9
    //   8: astore 5
    //   10: iconst_1
    //   11: anewarray 29	java/lang/String
    //   14: astore 11
    //   16: aload 11
    //   18: iconst_0
    //   19: aload_1
    //   20: aload_2
    //   21: invokestatic 70	com/alipay/wandoujia/ab:e	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   24: aastore
    //   25: aload 5
    //   27: ldc 196
    //   29: aload 11
    //   31: invokevirtual 83	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore 12
    //   36: aload 12
    //   38: astore 4
    //   40: aload 4
    //   42: invokeinterface 89 1 0
    //   47: istore 13
    //   49: aconst_null
    //   50: astore 14
    //   52: iload 13
    //   54: ifeq +17 -> 71
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 138 2 0
    //   65: astore 15
    //   67: aload 15
    //   69: astore 14
    //   71: aload 4
    //   73: ifnull +10 -> 83
    //   76: aload 4
    //   78: invokeinterface 97 1 0
    //   83: aload 5
    //   85: ifnull +16 -> 101
    //   88: aload 5
    //   90: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   93: ifeq +8 -> 101
    //   96: aload 5
    //   98: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   101: aload 14
    //   103: astore 8
    //   105: aload 8
    //   107: invokestatic 144	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   110: ifne +23 -> 133
    //   113: aload 8
    //   115: aload_0
    //   116: getfield 20	com/alipay/wandoujia/ab:a	Ljava/lang/ref/WeakReference;
    //   119: invokevirtual 55	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   122: checkcast 57	android/content/Context
    //   125: invokestatic 63	com/alipay/wandoujia/x:e	(Landroid/content/Context;)Ljava/lang/String;
    //   128: invokestatic 146	android/support/v4/app/b:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: astore 8
    //   133: aload 8
    //   135: areturn
    //   136: astore 7
    //   138: aconst_null
    //   139: astore 4
    //   141: aconst_null
    //   142: astore 5
    //   144: invokestatic 40	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   147: aload 7
    //   149: ldc 154
    //   151: invokevirtual 45	com/alipay/wandoujia/i:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   154: aload 4
    //   156: ifnull +10 -> 166
    //   159: aload 4
    //   161: invokeinterface 97 1 0
    //   166: aload 5
    //   168: ifnull +95 -> 263
    //   171: aload 5
    //   173: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   176: ifeq +87 -> 263
    //   179: aload 5
    //   181: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   184: aconst_null
    //   185: astore 8
    //   187: goto -82 -> 105
    //   190: astore_3
    //   191: aconst_null
    //   192: astore 4
    //   194: aconst_null
    //   195: astore 5
    //   197: aload_3
    //   198: astore 6
    //   200: aload 4
    //   202: ifnull +10 -> 212
    //   205: aload 4
    //   207: invokeinterface 97 1 0
    //   212: aload 5
    //   214: ifnull +16 -> 230
    //   217: aload 5
    //   219: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   222: ifeq +8 -> 230
    //   225: aload 5
    //   227: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   230: aload 6
    //   232: athrow
    //   233: astore 10
    //   235: aload 10
    //   237: astore 6
    //   239: aconst_null
    //   240: astore 4
    //   242: goto -42 -> 200
    //   245: astore 6
    //   247: goto -47 -> 200
    //   250: astore 7
    //   252: aconst_null
    //   253: astore 4
    //   255: goto -111 -> 144
    //   258: astore 7
    //   260: goto -116 -> 144
    //   263: aconst_null
    //   264: astore 8
    //   266: goto -161 -> 105
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	136	java/lang/Exception
    //   0	6	190	finally
    //   10	36	233	finally
    //   40	49	245	finally
    //   57	67	245	finally
    //   144	154	245	finally
    //   10	36	250	java/lang/Exception
    //   40	49	258	java/lang/Exception
    //   57	67	258	java/lang/Exception
  }

  // ERROR //
  public final long c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: lconst_0
    //   3: lstore 4
    //   5: aload_0
    //   6: invokevirtual 125	com/alipay/wandoujia/ab:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   9: astore 9
    //   11: aload 9
    //   13: astore 7
    //   15: iconst_1
    //   16: anewarray 29	java/lang/String
    //   19: astore 10
    //   21: aload 10
    //   23: iconst_0
    //   24: aload_1
    //   25: aload_2
    //   26: invokestatic 70	com/alipay/wandoujia/ab:e	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   29: aastore
    //   30: aload 7
    //   32: ldc 199
    //   34: aload 10
    //   36: invokevirtual 83	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   39: astore_3
    //   40: aload_3
    //   41: invokeinterface 89 1 0
    //   46: ifeq +34 -> 80
    //   49: new 201	java/text/SimpleDateFormat
    //   52: dup
    //   53: ldc 203
    //   55: invokestatic 209	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   58: invokespecial 212	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   61: aload_3
    //   62: iconst_0
    //   63: invokeinterface 138 2 0
    //   68: invokevirtual 216	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   71: invokevirtual 222	java/util/Date:getTime	()J
    //   74: lstore 11
    //   76: lload 11
    //   78: lstore 4
    //   80: aload_3
    //   81: ifnull +9 -> 90
    //   84: aload_3
    //   85: invokeinterface 97 1 0
    //   90: aload 7
    //   92: ifnull +16 -> 108
    //   95: aload 7
    //   97: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   100: ifeq +8 -> 108
    //   103: aload 7
    //   105: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   108: lload 4
    //   110: lreturn
    //   111: astore 8
    //   113: aconst_null
    //   114: astore 7
    //   116: invokestatic 40	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   119: aload 8
    //   121: ldc 224
    //   123: invokevirtual 45	com/alipay/wandoujia/i:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   126: aload_3
    //   127: ifnull +9 -> 136
    //   130: aload_3
    //   131: invokeinterface 97 1 0
    //   136: aload 7
    //   138: ifnull -30 -> 108
    //   141: aload 7
    //   143: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   146: ifeq -38 -> 108
    //   149: aload 7
    //   151: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   154: lload 4
    //   156: lreturn
    //   157: astore 6
    //   159: aconst_null
    //   160: astore 7
    //   162: aload_3
    //   163: ifnull +9 -> 172
    //   166: aload_3
    //   167: invokeinterface 97 1 0
    //   172: aload 7
    //   174: ifnull +16 -> 190
    //   177: aload 7
    //   179: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   182: ifeq +8 -> 190
    //   185: aload 7
    //   187: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   190: aload 6
    //   192: athrow
    //   193: astore 6
    //   195: goto -33 -> 162
    //   198: astore 8
    //   200: goto -84 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   5	11	111	java/lang/Exception
    //   5	11	157	finally
    //   15	76	193	finally
    //   116	126	193	finally
    //   15	76	198	java/lang/Exception
  }

  // ERROR //
  public final String d(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 125	com/alipay/wandoujia/ab:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 10
    //   6: aload 10
    //   8: astore 5
    //   10: iconst_1
    //   11: anewarray 29	java/lang/String
    //   14: astore 12
    //   16: aload 12
    //   18: iconst_0
    //   19: aload_1
    //   20: aload_2
    //   21: invokestatic 70	com/alipay/wandoujia/ab:e	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   24: aastore
    //   25: aload 5
    //   27: ldc 227
    //   29: aload 12
    //   31: invokevirtual 83	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore 13
    //   36: aload 13
    //   38: astore 4
    //   40: aload 4
    //   42: invokeinterface 89 1 0
    //   47: istore 14
    //   49: aconst_null
    //   50: astore 8
    //   52: iload 14
    //   54: ifeq +17 -> 71
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 138 2 0
    //   65: astore 15
    //   67: aload 15
    //   69: astore 8
    //   71: aload 4
    //   73: ifnull +10 -> 83
    //   76: aload 4
    //   78: invokeinterface 97 1 0
    //   83: aload 5
    //   85: ifnull +16 -> 101
    //   88: aload 5
    //   90: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   93: ifeq +8 -> 101
    //   96: aload 5
    //   98: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   101: aload 8
    //   103: areturn
    //   104: astore 7
    //   106: aconst_null
    //   107: astore 4
    //   109: aconst_null
    //   110: astore 5
    //   112: invokestatic 40	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   115: aload 7
    //   117: ldc 229
    //   119: invokevirtual 168	com/alipay/wandoujia/i:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   122: aload 4
    //   124: ifnull +10 -> 134
    //   127: aload 4
    //   129: invokeinterface 97 1 0
    //   134: aconst_null
    //   135: astore 8
    //   137: aload 5
    //   139: ifnull -38 -> 101
    //   142: aload 5
    //   144: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   147: istore 9
    //   149: aconst_null
    //   150: astore 8
    //   152: iload 9
    //   154: ifeq -53 -> 101
    //   157: aload 5
    //   159: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   162: aconst_null
    //   163: areturn
    //   164: astore_3
    //   165: aconst_null
    //   166: astore 4
    //   168: aconst_null
    //   169: astore 5
    //   171: aload_3
    //   172: astore 6
    //   174: aload 4
    //   176: ifnull +10 -> 186
    //   179: aload 4
    //   181: invokeinterface 97 1 0
    //   186: aload 5
    //   188: ifnull +16 -> 204
    //   191: aload 5
    //   193: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   196: ifeq +8 -> 204
    //   199: aload 5
    //   201: invokevirtual 134	android/database/sqlite/SQLiteDatabase:close	()V
    //   204: aload 6
    //   206: athrow
    //   207: astore 11
    //   209: aload 11
    //   211: astore 6
    //   213: aconst_null
    //   214: astore 4
    //   216: goto -42 -> 174
    //   219: astore 6
    //   221: goto -47 -> 174
    //   224: astore 7
    //   226: aconst_null
    //   227: astore 4
    //   229: goto -117 -> 112
    //   232: astore 7
    //   234: goto -122 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	104	java/lang/Exception
    //   0	6	164	finally
    //   10	36	207	finally
    //   40	49	219	finally
    //   57	67	219	finally
    //   112	122	219	finally
    //   10	36	224	java/lang/Exception
    //   40	49	232	java/lang/Exception
    //   57	67	232	java/lang/Exception
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table if not exists tb_tid (name text primary key, tid text, key_tid text, dt datetime);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("drop table if exists tb_tid");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ab
 * JD-Core Version:    0.6.0
 */