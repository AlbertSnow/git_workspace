package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.internal.r;
import com.wandoujia.p4.app_launcher.manager.b;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

final class ae extends u
  implements Closeable
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] { "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id" });
  private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] { "hit_time", "hits2" });
  private final af c;
  private final l d = new l(j());
  private final l e = new l(j());

  ae(w paramw)
  {
    super(paramw);
    this.c = new af(this, paramw.a(), "google_analytics_v4.db");
  }

  private long D()
  {
    w.r();
    z();
    return a("SELECT COUNT(*) FROM hits2");
  }

  private SQLiteDatabase E()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      d("Error opening database", localSQLiteException);
    }
    throw localSQLiteException;
  }

  private long a(String paramString)
  {
    Cursor localCursor = null;
    SQLiteDatabase localSQLiteDatabase = E();
    try
    {
      localCursor = localSQLiteDatabase.rawQuery(paramString, null);
      if (localCursor.moveToFirst())
      {
        long l = localCursor.getLong(0);
        return l;
      }
      throw new SQLiteException("Database returned empty set");
    }
    catch (SQLiteException localSQLiteException)
    {
      d("Database error", paramString, localSQLiteException);
      throw localSQLiteException;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
    throw localObject;
  }

  // ERROR //
  private long a(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 105	com/google/android/gms/analytics/internal/ae:E	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: aload_3
    //   9: aload_1
    //   10: aload_2
    //   11: invokevirtual 111	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   14: astore 7
    //   16: aload 7
    //   18: invokeinterface 117 1 0
    //   23: ifeq +28 -> 51
    //   26: aload 7
    //   28: iconst_0
    //   29: invokeinterface 121 2 0
    //   34: lstore 8
    //   36: aload 7
    //   38: ifnull +10 -> 48
    //   41: aload 7
    //   43: invokeinterface 124 1 0
    //   48: lload 8
    //   50: lreturn
    //   51: aload 7
    //   53: ifnull +10 -> 63
    //   56: aload 7
    //   58: invokeinterface 124 1 0
    //   63: lconst_0
    //   64: lreturn
    //   65: astore 6
    //   67: aload_0
    //   68: ldc 131
    //   70: aload_1
    //   71: aload 6
    //   73: invokevirtual 134	com/google/android/gms/analytics/internal/ae:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   76: aload 6
    //   78: athrow
    //   79: astore 5
    //   81: aload 4
    //   83: ifnull +10 -> 93
    //   86: aload 4
    //   88: invokeinterface 124 1 0
    //   93: aload 5
    //   95: athrow
    //   96: astore 5
    //   98: aload 7
    //   100: astore 4
    //   102: goto -21 -> 81
    //   105: astore 6
    //   107: aload 7
    //   109: astore 4
    //   111: goto -44 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   8	16	65	android/database/sqlite/SQLiteException
    //   8	16	79	finally
    //   67	79	79	finally
    //   16	36	96	finally
    //   16	36	105	android/database/sqlite/SQLiteException
  }

  private Map<String, String> b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return new HashMap(0);
    HashMap localHashMap;
    while (true)
    {
      try
      {
        if (paramString.startsWith("?"))
        {
          List localList = URLEncodedUtils.parse(new URI(paramString), "UTF-8");
          localHashMap = new HashMap(localList.size());
          Iterator localIterator = localList.iterator();
          if (!localIterator.hasNext())
            break;
          NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
          localHashMap.put(localNameValuePair.getName(), localNameValuePair.getValue());
          continue;
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        e("Error parsing hit parameters", localURISyntaxException);
        return new HashMap(0);
      }
      String str = "?" + paramString;
      paramString = str;
    }
    return localHashMap;
  }

  // ERROR //
  private List<Long> c(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 83	com/google/android/gms/analytics/internal/w:r	()V
    //   5: aload_0
    //   6: invokevirtual 86	com/google/android/gms/analytics/internal/ae:z	()V
    //   9: lload_1
    //   10: lconst_0
    //   11: lcmp
    //   12: ifgt +7 -> 19
    //   15: invokestatic 221	java/util/Collections:emptyList	()Ljava/util/List;
    //   18: areturn
    //   19: aload_0
    //   20: invokespecial 105	com/google/android/gms/analytics/internal/ae:E	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore 4
    //   25: new 223	java/util/ArrayList
    //   28: dup
    //   29: invokespecial 225	java/util/ArrayList:<init>	()V
    //   32: astore 5
    //   34: aload 4
    //   36: ldc 22
    //   38: iconst_1
    //   39: anewarray 34	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: ldc 24
    //   46: aastore
    //   47: aconst_null
    //   48: aconst_null
    //   49: aconst_null
    //   50: aconst_null
    //   51: ldc 227
    //   53: iconst_1
    //   54: anewarray 20	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: ldc 24
    //   61: aastore
    //   62: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   65: lload_1
    //   66: invokestatic 232	java/lang/Long:toString	(J)Ljava/lang/String;
    //   69: invokevirtual 236	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore 9
    //   74: aload 9
    //   76: astore 8
    //   78: aload 8
    //   80: invokeinterface 117 1 0
    //   85: ifeq +36 -> 121
    //   88: aload 5
    //   90: aload 8
    //   92: iconst_0
    //   93: invokeinterface 121 2 0
    //   98: invokestatic 240	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   101: invokeinterface 244 2 0
    //   106: pop
    //   107: aload 8
    //   109: invokeinterface 247 1 0
    //   114: istore 11
    //   116: iload 11
    //   118: ifne -30 -> 88
    //   121: aload 8
    //   123: ifnull +10 -> 133
    //   126: aload 8
    //   128: invokeinterface 124 1 0
    //   133: aload 5
    //   135: areturn
    //   136: astore 7
    //   138: aconst_null
    //   139: astore 8
    //   141: aload_0
    //   142: ldc 249
    //   144: aload 7
    //   146: invokevirtual 103	com/google/android/gms/analytics/internal/ae:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   149: aload 8
    //   151: ifnull -18 -> 133
    //   154: aload 8
    //   156: invokeinterface 124 1 0
    //   161: goto -28 -> 133
    //   164: astore 6
    //   166: aload_3
    //   167: ifnull +9 -> 176
    //   170: aload_3
    //   171: invokeinterface 124 1 0
    //   176: aload 6
    //   178: athrow
    //   179: astore 6
    //   181: aload 8
    //   183: astore_3
    //   184: goto -18 -> 166
    //   187: astore 7
    //   189: goto -48 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   34	74	136	android/database/sqlite/SQLiteException
    //   34	74	164	finally
    //   78	88	179	finally
    //   88	116	179	finally
    //   141	149	179	finally
    //   78	88	187	android/database/sqlite/SQLiteException
    //   88	116	187	android/database/sqlite/SQLiteException
  }

  private Map<String, String> h(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return new HashMap(0);
    HashMap localHashMap;
    try
    {
      List localList = URLEncodedUtils.parse(new URI("?" + paramString), "UTF-8");
      localHashMap = new HashMap(localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
        localHashMap.put(localNameValuePair.getName(), localNameValuePair.getValue());
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      e("Error parsing property parameters", localURISyntaxException);
      return new HashMap(0);
    }
    return localHashMap;
  }

  public final long a(long paramLong, String paramString1, String paramString2)
  {
    android.support.v4.app.d.i(paramString1);
    android.support.v4.app.d.i(paramString2);
    z();
    w.r();
    return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] { "0", paramString1, paramString2 });
  }

  // ERROR //
  public final List<d> a(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: lload_1
    //   6: lconst_0
    //   7: lcmp
    //   8: iflt +215 -> 223
    //   11: iload_3
    //   12: invokestatic 268	android/support/v4/app/d:b	(Z)V
    //   15: invokestatic 83	com/google/android/gms/analytics/internal/w:r	()V
    //   18: aload_0
    //   19: invokevirtual 86	com/google/android/gms/analytics/internal/ae:z	()V
    //   22: aload_0
    //   23: invokespecial 105	com/google/android/gms/analytics/internal/ae:E	()Landroid/database/sqlite/SQLiteDatabase;
    //   26: astore 5
    //   28: aload 5
    //   30: ldc 22
    //   32: iconst_5
    //   33: anewarray 34	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: ldc 24
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: ldc 26
    //   45: aastore
    //   46: dup
    //   47: iconst_2
    //   48: ldc 30
    //   50: aastore
    //   51: dup
    //   52: iconst_3
    //   53: ldc 28
    //   55: aastore
    //   56: dup
    //   57: iconst_4
    //   58: ldc 32
    //   60: aastore
    //   61: aconst_null
    //   62: aconst_null
    //   63: aconst_null
    //   64: aconst_null
    //   65: ldc 227
    //   67: iconst_1
    //   68: anewarray 20	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: ldc 24
    //   75: aastore
    //   76: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   79: lload_1
    //   80: invokestatic 232	java/lang/Long:toString	(J)Ljava/lang/String;
    //   83: invokevirtual 236	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   86: astore 9
    //   88: aload 9
    //   90: astore 4
    //   92: new 223	java/util/ArrayList
    //   95: dup
    //   96: invokespecial 225	java/util/ArrayList:<init>	()V
    //   99: astore 10
    //   101: aload 4
    //   103: invokeinterface 117 1 0
    //   108: ifeq +100 -> 208
    //   111: aload 4
    //   113: iconst_0
    //   114: invokeinterface 121 2 0
    //   119: lstore 11
    //   121: aload 4
    //   123: iconst_1
    //   124: invokeinterface 121 2 0
    //   129: lstore 13
    //   131: aload 4
    //   133: iconst_2
    //   134: invokeinterface 272 2 0
    //   139: astore 15
    //   141: aload 4
    //   143: iconst_3
    //   144: invokeinterface 272 2 0
    //   149: astore 16
    //   151: aload 4
    //   153: iconst_4
    //   154: invokeinterface 276 2 0
    //   159: istore 17
    //   161: aload 10
    //   163: new 278	com/google/android/gms/analytics/internal/d
    //   166: dup
    //   167: aload_0
    //   168: aload_0
    //   169: aload 15
    //   171: invokespecial 280	com/google/android/gms/analytics/internal/ae:b	(Ljava/lang/String;)Ljava/util/Map;
    //   174: lload 13
    //   176: aload 16
    //   178: invokestatic 285	com/google/android/gms/analytics/internal/m:g	(Ljava/lang/String;)Z
    //   181: lload 11
    //   183: iload 17
    //   185: invokespecial 288	com/google/android/gms/analytics/internal/d:<init>	(Lcom/google/android/gms/analytics/internal/t;Ljava/util/Map;JZJI)V
    //   188: invokeinterface 244 2 0
    //   193: pop
    //   194: aload 4
    //   196: invokeinterface 247 1 0
    //   201: istore 19
    //   203: iload 19
    //   205: ifne -94 -> 111
    //   208: aload 4
    //   210: ifnull +10 -> 220
    //   213: aload 4
    //   215: invokeinterface 124 1 0
    //   220: aload 10
    //   222: areturn
    //   223: iconst_0
    //   224: istore_3
    //   225: goto -214 -> 11
    //   228: astore 7
    //   230: aconst_null
    //   231: astore 8
    //   233: aload_0
    //   234: ldc_w 290
    //   237: aload 7
    //   239: invokevirtual 204	com/google/android/gms/analytics/internal/ae:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   242: aload 7
    //   244: athrow
    //   245: astore 6
    //   247: aload 8
    //   249: astore 4
    //   251: aload 4
    //   253: ifnull +10 -> 263
    //   256: aload 4
    //   258: invokeinterface 124 1 0
    //   263: aload 6
    //   265: athrow
    //   266: astore 6
    //   268: goto -17 -> 251
    //   271: astore 7
    //   273: aload 4
    //   275: astore 8
    //   277: goto -44 -> 233
    //
    // Exception table:
    //   from	to	target	type
    //   28	88	228	android/database/sqlite/SQLiteException
    //   233	245	245	finally
    //   28	88	266	finally
    //   92	111	266	finally
    //   111	203	266	finally
    //   92	111	271	android/database/sqlite/SQLiteException
    //   111	203	271	android/database/sqlite/SQLiteException
  }

  protected final void a()
  {
  }

  public final void a(long paramLong, String paramString)
  {
    android.support.v4.app.d.i(paramString);
    z();
    w.r();
    int i = E().delete("properties", "app_uid=? AND cid<>?", new String[] { "0", paramString });
    if (i > 0)
      a("Deleted property records", Integer.valueOf(i));
  }

  public final void a(d paramd)
  {
    android.support.v4.app.d.a(paramd);
    w.r();
    z();
    android.support.v4.app.d.a(paramd);
    Uri.Builder localBuilder = new Uri.Builder();
    Iterator localIterator = paramd.b().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str4 = (String)localEntry.getKey();
      if (("ht".equals(str4)) || ("qt".equals(str4)) || ("AppUID".equals(str4)))
        continue;
      localBuilder.appendQueryParameter(str4, (String)localEntry.getValue());
    }
    String str1 = localBuilder.build().getEncodedQuery();
    if (str1 == null);
    for (String str2 = ""; str2.length() > 8192; str2 = str1)
    {
      l().a(paramd, "Hit length exceeds the maximum allowed size");
      return;
    }
    int i = ((Integer)az.c.a()).intValue();
    long l1 = D();
    if (l1 > i - 1)
    {
      List localList = c(1L + (l1 - i));
      d("Store full, deleting hits to make room, count", Integer.valueOf(localList.size()));
      a(localList);
    }
    SQLiteDatabase localSQLiteDatabase = E();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("hit_string", str2);
    localContentValues.put("hit_time", Long.valueOf(paramd.d()));
    localContentValues.put("hit_app_id", Integer.valueOf(paramd.a()));
    if (paramd.e());
    long l2;
    for (String str3 = as.h(); ; str3 = as.i())
    {
      localContentValues.put("hit_url", str3);
      try
      {
        l2 = localSQLiteDatabase.insert("hits2", null, localContentValues);
        if (l2 != -1L)
          break;
        g("Failed to insert a hit (got -1)");
        return;
      }
      catch (SQLiteException localSQLiteException)
      {
        e("Error storing a hit", localSQLiteException);
        return;
      }
    }
    b("Hit saved to database. db-id, hit", Long.valueOf(l2), paramd);
  }

  public final void a(b paramb)
  {
    android.support.v4.app.d.a(paramb);
    z();
    w.r();
    SQLiteDatabase localSQLiteDatabase = E();
    Map localMap = paramb.h();
    android.support.v4.app.d.a(localMap);
    Uri.Builder localBuilder = new Uri.Builder();
    Iterator localIterator = localMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localBuilder.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    String str = localBuilder.build().getEncodedQuery();
    if (str == null)
      str = "";
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_uid", Long.valueOf(0L));
    localContentValues.put("cid", paramb.d());
    localContentValues.put("tid", paramb.e());
    int i;
    if (paramb.f())
      i = 1;
    while (true)
    {
      localContentValues.put("adid", Integer.valueOf(i));
      localContentValues.put("hits_count", Long.valueOf(paramb.g()));
      localContentValues.put("params", str);
      try
      {
        if (localSQLiteDatabase.insertWithOnConflict("properties", null, localContentValues, 5) == -1L)
          g("Failed to insert/update a property (got -1)");
        return;
        i = 0;
      }
      catch (SQLiteException localSQLiteException)
      {
        e("Error storing a property", localSQLiteException);
      }
    }
  }

  public final void a(List<Long> paramList)
  {
    android.support.v4.app.d.a(paramList);
    w.r();
    z();
    if (paramList.isEmpty());
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder("hit_id");
      localStringBuilder.append(" in (");
      for (int i = 0; i < paramList.size(); i++)
      {
        Long localLong = (Long)paramList.get(i);
        if ((localLong == null) || (localLong.longValue() == 0L))
          throw new SQLiteException("Invalid hit id");
        if (i > 0)
          localStringBuilder.append(",");
        localStringBuilder.append(localLong);
      }
      localStringBuilder.append(")");
      String str = localStringBuilder.toString();
      try
      {
        SQLiteDatabase localSQLiteDatabase = E();
        a("Deleting dispatched hits. count", Integer.valueOf(paramList.size()));
        int j = localSQLiteDatabase.delete("hits2", str, null);
        if (j == paramList.size())
          continue;
        b("Deleted fewer hits then expected", Integer.valueOf(paramList.size()), Integer.valueOf(j), str);
        return;
      }
      catch (SQLiteException localSQLiteException)
      {
        e("Error deleting hits", localSQLiteException);
      }
    }
    throw localSQLiteException;
  }

  public final void b()
  {
    z();
    E().beginTransaction();
  }

  public final void b(long paramLong)
  {
    w.r();
    z();
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(Long.valueOf(paramLong));
    a("Deleting hit, id", Long.valueOf(paramLong));
    a(localArrayList);
  }

  public final void c()
  {
    z();
    E().setTransactionSuccessful();
  }

  public final void close()
  {
    try
    {
      this.c.close();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      e("Sql error closing database", localSQLiteException);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      e("Error closing database", localIllegalStateException);
    }
  }

  public final void d()
  {
    z();
    E().endTransaction();
  }

  final boolean e()
  {
    return D() == 0L;
  }

  public final int f()
  {
    w.r();
    z();
    if (!this.d.a(86400000L))
      return 0;
    this.d.a();
    c("Deleting stale hits (if any)");
    SQLiteDatabase localSQLiteDatabase = E();
    long l = j().a() - 2592000000L;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Long.toString(l);
    int i = localSQLiteDatabase.delete("hits2", "hit_time < ?", arrayOfString);
    a("Deleted stale hits, count", Integer.valueOf(i));
    return i;
  }

  public final long g()
  {
    w.r();
    z();
    return a(b, null);
  }

  // ERROR //
  public final List<b> h()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 86	com/google/android/gms/analytics/internal/ae:z	()V
    //   4: invokestatic 83	com/google/android/gms/analytics/internal/w:r	()V
    //   7: aload_0
    //   8: invokespecial 105	com/google/android/gms/analytics/internal/ae:E	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore_1
    //   12: iconst_5
    //   13: anewarray 34	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc_w 440
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: ldc_w 444
    //   27: aastore
    //   28: dup
    //   29: iconst_2
    //   30: ldc_w 451
    //   33: aastore
    //   34: dup
    //   35: iconst_3
    //   36: ldc_w 453
    //   39: aastore
    //   40: dup
    //   41: iconst_4
    //   42: ldc_w 457
    //   45: aastore
    //   46: astore_2
    //   47: getstatic 537	com/google/android/gms/analytics/internal/az:d	Lcom/google/android/gms/analytics/internal/ba;
    //   50: invokevirtual 379	com/google/android/gms/analytics/internal/ba:a	()Ljava/lang/Object;
    //   53: checkcast 303	java/lang/Integer
    //   56: invokevirtual 382	java/lang/Integer:intValue	()I
    //   59: istore 7
    //   61: iload 7
    //   63: invokestatic 539	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   66: astore 8
    //   68: aload_1
    //   69: ldc_w 293
    //   72: aload_2
    //   73: ldc_w 541
    //   76: iconst_1
    //   77: anewarray 34	java/lang/String
    //   80: dup
    //   81: iconst_0
    //   82: ldc_w 263
    //   85: aastore
    //   86: aconst_null
    //   87: aconst_null
    //   88: aconst_null
    //   89: aload 8
    //   91: invokevirtual 236	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   94: astore 9
    //   96: new 223	java/util/ArrayList
    //   99: dup
    //   100: invokespecial 225	java/util/ArrayList:<init>	()V
    //   103: astore 10
    //   105: aload 9
    //   107: invokeinterface 117 1 0
    //   112: ifeq +99 -> 211
    //   115: aload 9
    //   117: iconst_0
    //   118: invokeinterface 272 2 0
    //   123: astore 11
    //   125: aload 9
    //   127: iconst_1
    //   128: invokeinterface 272 2 0
    //   133: astore 12
    //   135: aload 9
    //   137: iconst_2
    //   138: invokeinterface 276 2 0
    //   143: ifeq +102 -> 245
    //   146: iconst_1
    //   147: istore 13
    //   149: aload 9
    //   151: iconst_3
    //   152: invokeinterface 276 2 0
    //   157: i2l
    //   158: lstore 14
    //   160: aload_0
    //   161: aload 9
    //   163: iconst_4
    //   164: invokeinterface 272 2 0
    //   169: invokespecial 543	com/google/android/gms/analytics/internal/ae:h	(Ljava/lang/String;)Ljava/util/Map;
    //   172: astore 16
    //   174: aload 11
    //   176: invokestatic 145	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   179: ifne +11 -> 190
    //   182: aload 12
    //   184: invokestatic 145	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   187: ifeq +64 -> 251
    //   190: aload_0
    //   191: ldc_w 545
    //   194: aload 11
    //   196: aload 12
    //   198: invokevirtual 547	com/google/android/gms/analytics/internal/ae:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   201: aload 9
    //   203: invokeinterface 247 1 0
    //   208: ifne -93 -> 115
    //   211: aload 10
    //   213: invokeinterface 173 1 0
    //   218: iload 7
    //   220: if_icmplt +10 -> 230
    //   223: aload_0
    //   224: ldc_w 549
    //   227: invokevirtual 551	com/google/android/gms/analytics/internal/ae:f	(Ljava/lang/String;)V
    //   230: aload 9
    //   232: ifnull +10 -> 242
    //   235: aload 9
    //   237: invokeinterface 124 1 0
    //   242: aload 10
    //   244: areturn
    //   245: iconst_0
    //   246: istore 13
    //   248: goto -99 -> 149
    //   251: aload 10
    //   253: new 434	com/wandoujia/p4/app_launcher/manager/b
    //   256: dup
    //   257: aload 11
    //   259: aload 12
    //   261: iload 13
    //   263: lload 14
    //   265: aload 16
    //   267: invokespecial 554	com/wandoujia/p4/app_launcher/manager/b:<init>	(Ljava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V
    //   270: invokeinterface 244 2 0
    //   275: pop
    //   276: goto -75 -> 201
    //   279: astore_3
    //   280: aload 9
    //   282: astore 4
    //   284: aload_0
    //   285: ldc_w 290
    //   288: aload_3
    //   289: invokevirtual 204	com/google/android/gms/analytics/internal/ae:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   292: aload_3
    //   293: athrow
    //   294: astore 5
    //   296: aload 4
    //   298: astore 6
    //   300: aload 6
    //   302: ifnull +10 -> 312
    //   305: aload 6
    //   307: invokeinterface 124 1 0
    //   312: aload 5
    //   314: athrow
    //   315: astore 5
    //   317: aconst_null
    //   318: astore 6
    //   320: goto -20 -> 300
    //   323: astore 5
    //   325: aload 9
    //   327: astore 6
    //   329: goto -29 -> 300
    //   332: astore_3
    //   333: aconst_null
    //   334: astore 4
    //   336: goto -52 -> 284
    //
    // Exception table:
    //   from	to	target	type
    //   96	115	279	android/database/sqlite/SQLiteException
    //   115	146	279	android/database/sqlite/SQLiteException
    //   149	190	279	android/database/sqlite/SQLiteException
    //   190	201	279	android/database/sqlite/SQLiteException
    //   201	211	279	android/database/sqlite/SQLiteException
    //   211	230	279	android/database/sqlite/SQLiteException
    //   251	276	279	android/database/sqlite/SQLiteException
    //   284	294	294	finally
    //   12	96	315	finally
    //   96	115	323	finally
    //   115	146	323	finally
    //   149	190	323	finally
    //   190	201	323	finally
    //   201	211	323	finally
    //   211	230	323	finally
    //   251	276	323	finally
    //   12	96	332	android/database/sqlite/SQLiteException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.ae
 * JD-Core Version:    0.6.0
 */