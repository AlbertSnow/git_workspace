package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.util.Locale;

@a
public final class i
{
  static final String a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] { "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time" });
  static final Object b = new Object();
  private static i d;
  private final j c;

  private i(Context paramContext)
  {
    this.c = new j(this, paramContext, "google_inapp_purchase.db");
  }

  private static g a(Cursor paramCursor)
  {
    if (paramCursor == null)
      return null;
    return new g(paramCursor.getLong(0), paramCursor.getString(1), paramCursor.getString(2));
  }

  public static i a(Context paramContext)
  {
    synchronized (b)
    {
      if (d == null)
        d = new i(paramContext);
      i locali = d;
      return locali;
    }
  }

  public final SQLiteDatabase a()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      c.e("Error opening writable conversion tracking database");
    }
    return null;
  }

  // ERROR //
  public final java.util.List a(long paramLong)
  {
    // Byte code:
    //   0: getstatic 46	com/google/android/gms/ads/internal/purchase/i:b	Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: new 94	java/util/LinkedList
    //   9: dup
    //   10: invokespecial 95	java/util/LinkedList:<init>	()V
    //   13: astore 4
    //   15: ldc2_w 96
    //   18: lconst_0
    //   19: lcmp
    //   20: ifgt +8 -> 28
    //   23: aload_3
    //   24: monitorexit
    //   25: aload 4
    //   27: areturn
    //   28: aload_0
    //   29: invokevirtual 99	com/google/android/gms/ads/internal/purchase/i:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   32: astore 6
    //   34: aload 6
    //   36: ifnonnull +8 -> 44
    //   39: aload_3
    //   40: monitorexit
    //   41: aload 4
    //   43: areturn
    //   44: aload 6
    //   46: ldc 25
    //   48: aconst_null
    //   49: aconst_null
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: ldc 101
    //   55: ldc 103
    //   57: invokevirtual 109	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   60: astore 12
    //   62: aload 12
    //   64: astore 8
    //   66: aload 8
    //   68: invokeinterface 113 1 0
    //   73: ifeq +30 -> 103
    //   76: aload 4
    //   78: aload 8
    //   80: invokestatic 115	com/google/android/gms/ads/internal/purchase/i:a	(Landroid/database/Cursor;)Lcom/google/android/gms/ads/internal/purchase/g;
    //   83: invokeinterface 121 2 0
    //   88: pop
    //   89: aload 8
    //   91: invokeinterface 124 1 0
    //   96: istore 14
    //   98: iload 14
    //   100: ifne -24 -> 76
    //   103: aload 8
    //   105: ifnull +10 -> 115
    //   108: aload 8
    //   110: invokeinterface 127 1 0
    //   115: aload_3
    //   116: monitorexit
    //   117: aload 4
    //   119: areturn
    //   120: astore 9
    //   122: aconst_null
    //   123: astore 8
    //   125: aload 9
    //   127: invokevirtual 131	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   130: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   133: astore 10
    //   135: aload 10
    //   137: invokevirtual 139	java/lang/String:length	()I
    //   140: ifeq +39 -> 179
    //   143: ldc 141
    //   145: aload 10
    //   147: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   150: astore 11
    //   152: aload 11
    //   154: invokestatic 91	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   157: aload 8
    //   159: ifnull -44 -> 115
    //   162: aload 8
    //   164: invokeinterface 127 1 0
    //   169: goto -54 -> 115
    //   172: astore 5
    //   174: aload_3
    //   175: monitorexit
    //   176: aload 5
    //   178: athrow
    //   179: new 35	java/lang/String
    //   182: dup
    //   183: ldc 141
    //   185: invokespecial 147	java/lang/String:<init>	(Ljava/lang/String;)V
    //   188: astore 11
    //   190: goto -38 -> 152
    //   193: astore 7
    //   195: aload 8
    //   197: ifnull +10 -> 207
    //   200: aload 8
    //   202: invokeinterface 127 1 0
    //   207: aload 7
    //   209: athrow
    //   210: astore 7
    //   212: aconst_null
    //   213: astore 8
    //   215: goto -20 -> 195
    //   218: astore 9
    //   220: goto -95 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   44	62	120	android/database/sqlite/SQLiteException
    //   6	15	172	finally
    //   23	25	172	finally
    //   28	34	172	finally
    //   39	41	172	finally
    //   108	115	172	finally
    //   115	117	172	finally
    //   162	169	172	finally
    //   174	176	172	finally
    //   200	207	172	finally
    //   207	210	172	finally
    //   66	76	193	finally
    //   76	98	193	finally
    //   125	152	193	finally
    //   152	157	193	finally
    //   179	190	193	finally
    //   44	62	210	finally
    //   66	76	218	android/database/sqlite/SQLiteException
    //   76	98	218	android/database/sqlite/SQLiteException
  }

  public final void a(g paramg)
  {
    if (paramg == null)
      return;
    SQLiteDatabase localSQLiteDatabase;
    synchronized (b)
    {
      localSQLiteDatabase = a();
      if (localSQLiteDatabase == null)
        return;
    }
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "purchase_id";
    arrayOfObject[1] = Long.valueOf(paramg.a);
    localSQLiteDatabase.delete("InAppPurchase", String.format(localLocale, "%s = %d", arrayOfObject), null);
    monitorexit;
  }

  public final int b()
  {
    Cursor localCursor = null;
    SQLiteDatabase localSQLiteDatabase;
    synchronized (b)
    {
      localSQLiteDatabase = a();
      if (localSQLiteDatabase == null)
        return 0;
    }
    try
    {
      localCursor = localSQLiteDatabase.rawQuery("select count(*) from InAppPurchase", null);
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        if (localCursor != null)
          localCursor.close();
        monitorexit;
        return i;
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      if (localCursor != null)
        localCursor.close();
      monitorexit;
      return 0;
    }
    catch (SQLiteException localSQLiteException)
    {
      String str1 = String.valueOf(localSQLiteException.getMessage());
      if (str1.length() != 0);
      for (String str2 = "Error getting record count".concat(str1); ; str2 = new String("Error getting record count"))
      {
        c.e(str2);
        if (localCursor == null)
          break;
        localCursor.close();
        break;
      }
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
    throw localObject3;
  }

  // ERROR //
  public final void c()
  {
    // Byte code:
    //   0: getstatic 46	com/google/android/gms/ads/internal/purchase/i:b	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: aload_0
    //   7: invokevirtual 99	com/google/android/gms/ads/internal/purchase/i:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnonnull +6 -> 18
    //   15: aload_1
    //   16: monitorexit
    //   17: return
    //   18: aload_3
    //   19: ldc 25
    //   21: aconst_null
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: ldc 101
    //   28: ldc 176
    //   30: invokevirtual 109	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   33: astore 9
    //   35: aload 9
    //   37: astore 5
    //   39: aload 5
    //   41: ifnull +22 -> 63
    //   44: aload 5
    //   46: invokeinterface 113 1 0
    //   51: ifeq +12 -> 63
    //   54: aload_0
    //   55: aload 5
    //   57: invokestatic 115	com/google/android/gms/ads/internal/purchase/i:a	(Landroid/database/Cursor;)Lcom/google/android/gms/ads/internal/purchase/g;
    //   60: invokevirtual 178	com/google/android/gms/ads/internal/purchase/i:a	(Lcom/google/android/gms/ads/internal/purchase/g;)V
    //   63: aload 5
    //   65: ifnull +10 -> 75
    //   68: aload 5
    //   70: invokeinterface 127 1 0
    //   75: aload_1
    //   76: monitorexit
    //   77: return
    //   78: astore_2
    //   79: aload_1
    //   80: monitorexit
    //   81: aload_2
    //   82: athrow
    //   83: astore 6
    //   85: aconst_null
    //   86: astore 5
    //   88: aload 6
    //   90: invokevirtual 131	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   93: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   96: astore 7
    //   98: aload 7
    //   100: invokevirtual 139	java/lang/String:length	()I
    //   103: ifeq +32 -> 135
    //   106: ldc 180
    //   108: aload 7
    //   110: invokevirtual 145	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   113: astore 8
    //   115: aload 8
    //   117: invokestatic 91	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   120: aload 5
    //   122: ifnull -47 -> 75
    //   125: aload 5
    //   127: invokeinterface 127 1 0
    //   132: goto -57 -> 75
    //   135: new 35	java/lang/String
    //   138: dup
    //   139: ldc 180
    //   141: invokespecial 147	java/lang/String:<init>	(Ljava/lang/String;)V
    //   144: astore 8
    //   146: goto -31 -> 115
    //   149: astore 4
    //   151: aload 5
    //   153: ifnull +10 -> 163
    //   156: aload 5
    //   158: invokeinterface 127 1 0
    //   163: aload 4
    //   165: athrow
    //   166: astore 4
    //   168: aconst_null
    //   169: astore 5
    //   171: goto -20 -> 151
    //   174: astore 6
    //   176: goto -88 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   6	11	78	finally
    //   15	17	78	finally
    //   68	75	78	finally
    //   75	77	78	finally
    //   79	81	78	finally
    //   125	132	78	finally
    //   156	163	78	finally
    //   163	166	78	finally
    //   18	35	83	android/database/sqlite/SQLiteException
    //   44	63	149	finally
    //   88	115	149	finally
    //   115	120	149	finally
    //   135	146	149	finally
    //   18	35	166	finally
    //   44	63	174	android/database/sqlite/SQLiteException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.i
 * JD-Core Version:    0.6.0
 */