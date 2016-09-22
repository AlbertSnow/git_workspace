package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.r;
import com.google.android.gms.internal.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class ak
  implements f
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] { "datalayer", "ID", "key", "value", "expires" });
  private final Executor b;
  private final Context c;
  private an d;
  private r e;
  private int f;

  public ak(Context paramContext)
  {
    this(paramContext, s.c(), "google_tagmanager.db", Executors.newSingleThreadExecutor());
  }

  private ak(Context paramContext, r paramr, String paramString, Executor paramExecutor)
  {
    this.c = paramContext;
    this.e = paramr;
    this.f = 2000;
    this.b = paramExecutor;
    this.d = new an(this, this.c, paramString);
  }

  // ERROR //
  private static Object a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 82	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 85	java/io/ByteArrayInputStream:<init>	([B)V
    //   8: astore_1
    //   9: new 87	java/io/ObjectInputStream
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 90	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual 94	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   22: astore 9
    //   24: aload_2
    //   25: invokevirtual 97	java/io/ObjectInputStream:close	()V
    //   28: aload_1
    //   29: invokevirtual 98	java/io/ByteArrayInputStream:close	()V
    //   32: aload 9
    //   34: areturn
    //   35: astore 13
    //   37: aconst_null
    //   38: astore_2
    //   39: aload_2
    //   40: ifnull +7 -> 47
    //   43: aload_2
    //   44: invokevirtual 97	java/io/ObjectInputStream:close	()V
    //   47: aload_1
    //   48: invokevirtual 98	java/io/ByteArrayInputStream:close	()V
    //   51: aconst_null
    //   52: areturn
    //   53: astore 4
    //   55: aconst_null
    //   56: areturn
    //   57: astore 12
    //   59: aconst_null
    //   60: astore_2
    //   61: aload_2
    //   62: ifnull +7 -> 69
    //   65: aload_2
    //   66: invokevirtual 97	java/io/ObjectInputStream:close	()V
    //   69: aload_1
    //   70: invokevirtual 98	java/io/ByteArrayInputStream:close	()V
    //   73: aconst_null
    //   74: areturn
    //   75: astore 6
    //   77: aconst_null
    //   78: areturn
    //   79: astore 11
    //   81: aconst_null
    //   82: astore_2
    //   83: aload 11
    //   85: astore 7
    //   87: aload_2
    //   88: ifnull +7 -> 95
    //   91: aload_2
    //   92: invokevirtual 97	java/io/ObjectInputStream:close	()V
    //   95: aload_1
    //   96: invokevirtual 98	java/io/ByteArrayInputStream:close	()V
    //   99: aload 7
    //   101: athrow
    //   102: astore 8
    //   104: goto -5 -> 99
    //   107: astore 7
    //   109: goto -22 -> 87
    //   112: astore 5
    //   114: goto -53 -> 61
    //   117: astore_3
    //   118: goto -79 -> 39
    //   121: astore 10
    //   123: aload 9
    //   125: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   9	18	35	java/io/IOException
    //   43	47	53	java/io/IOException
    //   47	51	53	java/io/IOException
    //   9	18	57	java/lang/ClassNotFoundException
    //   65	69	75	java/io/IOException
    //   69	73	75	java/io/IOException
    //   9	18	79	finally
    //   91	95	102	java/io/IOException
    //   95	99	102	java/io/IOException
    //   18	24	107	finally
    //   18	24	112	java/lang/ClassNotFoundException
    //   18	24	117	java/io/IOException
    //   24	32	121	java/io/IOException
  }

  // ERROR //
  private List<String> a(int paramInt)
  {
    // Byte code:
    //   0: new 104	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 105	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: iload_1
    //   9: ifgt +8 -> 17
    //   12: invokestatic 109	com/google/android/gms/tagmanager/q:c	()V
    //   15: aload_2
    //   16: areturn
    //   17: aload_0
    //   18: invokespecial 112	com/google/android/gms/tagmanager/ak:e	()Landroid/database/sqlite/SQLiteDatabase;
    //   21: astore_3
    //   22: aload_3
    //   23: ifnonnull +5 -> 28
    //   26: aload_2
    //   27: areturn
    //   28: aload_3
    //   29: ldc 24
    //   31: iconst_1
    //   32: anewarray 34	java/lang/String
    //   35: dup
    //   36: iconst_0
    //   37: ldc 26
    //   39: aastore
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: aconst_null
    //   44: ldc 114
    //   46: iconst_1
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: ldc 26
    //   54: aastore
    //   55: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   58: iload_1
    //   59: invokestatic 120	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   62: invokevirtual 126	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   65: astore 8
    //   67: aload 8
    //   69: astore 5
    //   71: aload 5
    //   73: invokeinterface 132 1 0
    //   78: ifeq +35 -> 113
    //   81: aload_2
    //   82: aload 5
    //   84: iconst_0
    //   85: invokeinterface 136 2 0
    //   90: invokestatic 140	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   93: invokeinterface 146 2 0
    //   98: pop
    //   99: aload 5
    //   101: invokeinterface 149 1 0
    //   106: istore 10
    //   108: iload 10
    //   110: ifne -29 -> 81
    //   113: aload 5
    //   115: ifnull +10 -> 125
    //   118: aload 5
    //   120: invokeinterface 150 1 0
    //   125: aload_2
    //   126: areturn
    //   127: astore 6
    //   129: aconst_null
    //   130: astore 5
    //   132: new 152	java/lang/StringBuilder
    //   135: dup
    //   136: ldc 154
    //   138: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   141: aload 6
    //   143: invokevirtual 160	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   146: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: invokestatic 109	com/google/android/gms/tagmanager/q:c	()V
    //   153: aload 5
    //   155: ifnull -30 -> 125
    //   158: aload 5
    //   160: invokeinterface 150 1 0
    //   165: goto -40 -> 125
    //   168: astore 4
    //   170: aconst_null
    //   171: astore 5
    //   173: aload 5
    //   175: ifnull +10 -> 185
    //   178: aload 5
    //   180: invokeinterface 150 1 0
    //   185: aload 4
    //   187: athrow
    //   188: astore 4
    //   190: goto -17 -> 173
    //   193: astore 6
    //   195: goto -63 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   28	67	127	android/database/sqlite/SQLiteException
    //   28	67	168	finally
    //   71	81	188	finally
    //   81	108	188	finally
    //   132	153	188	finally
    //   71	81	193	android/database/sqlite/SQLiteException
    //   81	108	193	android/database/sqlite/SQLiteException
  }

  private void a(long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = e();
    if (localSQLiteDatabase == null)
      return;
    try
    {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong);
      int i = localSQLiteDatabase.delete("datalayer", "expires <= ?", arrayOfString);
      new StringBuilder("Deleted ").append(i).append(" expired items");
      q.e();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      q.c();
    }
  }

  // ERROR //
  private static byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: new 195	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 196	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: new 198	java/io/ObjectOutputStream
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 201	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: invokevirtual 205	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   22: aload_1
    //   23: invokevirtual 209	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   26: astore 7
    //   28: aload_2
    //   29: invokevirtual 210	java/io/ObjectOutputStream:close	()V
    //   32: aload_1
    //   33: invokevirtual 211	java/io/ByteArrayOutputStream:close	()V
    //   36: aload 7
    //   38: areturn
    //   39: astore 10
    //   41: aconst_null
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull +7 -> 51
    //   47: aload_2
    //   48: invokevirtual 210	java/io/ObjectOutputStream:close	()V
    //   51: aload_1
    //   52: invokevirtual 211	java/io/ByteArrayOutputStream:close	()V
    //   55: aconst_null
    //   56: areturn
    //   57: astore 4
    //   59: aconst_null
    //   60: areturn
    //   61: astore 9
    //   63: aconst_null
    //   64: astore_2
    //   65: aload 9
    //   67: astore 5
    //   69: aload_2
    //   70: ifnull +7 -> 77
    //   73: aload_2
    //   74: invokevirtual 210	java/io/ObjectOutputStream:close	()V
    //   77: aload_1
    //   78: invokevirtual 211	java/io/ByteArrayOutputStream:close	()V
    //   81: aload 5
    //   83: athrow
    //   84: astore 6
    //   86: goto -5 -> 81
    //   89: astore 5
    //   91: goto -22 -> 69
    //   94: astore_3
    //   95: goto -52 -> 43
    //   98: astore 8
    //   100: aload 7
    //   102: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   8	17	39	java/io/IOException
    //   47	51	57	java/io/IOException
    //   51	55	57	java/io/IOException
    //   8	17	61	finally
    //   73	77	84	java/io/IOException
    //   77	81	84	java/io/IOException
    //   17	28	89	finally
    //   17	28	94	java/io/IOException
    //   28	36	98	java/io/IOException
  }

  private List<d> b()
  {
    ArrayList localArrayList;
    try
    {
      a(this.e.a());
      List localList = c();
      localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ao localao = (ao)localIterator.next();
        localArrayList.add(new d(localao.a, a(localao.b)));
      }
    }
    finally
    {
      f();
    }
    f();
    return localArrayList;
  }

  // ERROR //
  private void b(List<ao> paramList, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/google/android/gms/tagmanager/ak:e	Lcom/google/android/gms/internal/r;
    //   6: invokeinterface 217 1 0
    //   11: lstore 6
    //   13: aload_0
    //   14: lload 6
    //   16: invokespecial 219	com/google/android/gms/tagmanager/ak:a	(J)V
    //   19: aload_1
    //   20: invokeinterface 252 1 0
    //   25: aload_0
    //   26: invokespecial 254	com/google/android/gms/tagmanager/ak:d	()I
    //   29: aload_0
    //   30: getfield 66	com/google/android/gms/tagmanager/ak:f	I
    //   33: isub
    //   34: iadd
    //   35: istore 8
    //   37: iload 8
    //   39: ifle +68 -> 107
    //   42: aload_0
    //   43: iload 8
    //   45: invokespecial 256	com/google/android/gms/tagmanager/ak:a	(I)Ljava/util/List;
    //   48: astore 9
    //   50: new 152	java/lang/StringBuilder
    //   53: dup
    //   54: ldc_w 258
    //   57: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   60: aload 9
    //   62: invokeinterface 252 1 0
    //   67: invokevirtual 184	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   70: ldc_w 260
    //   73: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: invokestatic 262	com/google/android/gms/tagmanager/q:d	()V
    //   80: aload 9
    //   82: iconst_0
    //   83: anewarray 34	java/lang/String
    //   86: invokeinterface 266 2 0
    //   91: checkcast 268	[Ljava/lang/String;
    //   94: astore 11
    //   96: aload 11
    //   98: ifnull +9 -> 107
    //   101: aload 11
    //   103: arraylength
    //   104: ifne +19 -> 123
    //   107: aload_0
    //   108: aload_1
    //   109: lload 6
    //   111: lload_2
    //   112: ladd
    //   113: invokespecial 270	com/google/android/gms/tagmanager/ak:c	(Ljava/util/List;J)V
    //   116: aload_0
    //   117: invokespecial 248	com/google/android/gms/tagmanager/ak:f	()V
    //   120: aload_0
    //   121: monitorexit
    //   122: return
    //   123: aload_0
    //   124: invokespecial 112	com/google/android/gms/tagmanager/ak:e	()Landroid/database/sqlite/SQLiteDatabase;
    //   127: astore 12
    //   129: aload 12
    //   131: ifnull -24 -> 107
    //   134: iconst_2
    //   135: anewarray 4	java/lang/Object
    //   138: astore 13
    //   140: aload 13
    //   142: iconst_0
    //   143: ldc 26
    //   145: aastore
    //   146: aload 13
    //   148: iconst_1
    //   149: ldc_w 272
    //   152: aload 11
    //   154: arraylength
    //   155: ldc_w 274
    //   158: invokestatic 280	java/util/Collections:nCopies	(ILjava/lang/Object;)Ljava/util/List;
    //   161: invokestatic 286	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   164: aastore
    //   165: ldc_w 288
    //   168: aload 13
    //   170: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   173: astore 14
    //   175: aload 12
    //   177: ldc 24
    //   179: aload 14
    //   181: aload 11
    //   183: invokevirtual 179	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   186: pop
    //   187: goto -80 -> 107
    //   190: astore 15
    //   192: new 152	java/lang/StringBuilder
    //   195: dup
    //   196: ldc_w 290
    //   199: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: aload 11
    //   204: invokestatic 295	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   207: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: invokestatic 109	com/google/android/gms/tagmanager/q:c	()V
    //   214: goto -107 -> 107
    //   217: astore 4
    //   219: aload_0
    //   220: invokespecial 248	com/google/android/gms/tagmanager/ak:f	()V
    //   223: aload 4
    //   225: athrow
    //   226: astore 5
    //   228: aload_0
    //   229: monitorexit
    //   230: aload 5
    //   232: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   175	187	190	android/database/sqlite/SQLiteException
    //   2	37	217	finally
    //   42	96	217	finally
    //   101	107	217	finally
    //   107	116	217	finally
    //   123	129	217	finally
    //   134	175	217	finally
    //   175	187	217	finally
    //   192	214	217	finally
    //   116	120	226	finally
    //   219	226	226	finally
  }

  private List<ao> c()
  {
    SQLiteDatabase localSQLiteDatabase = e();
    ArrayList localArrayList = new ArrayList();
    if (localSQLiteDatabase == null)
      return localArrayList;
    Cursor localCursor = localSQLiteDatabase.query("datalayer", new String[] { "key", "value" }, null, null, null, null, "ID", null);
    try
    {
      if (localCursor.moveToNext())
        localArrayList.add(new ao(localCursor.getString(0), localCursor.getBlob(1)));
    }
    finally
    {
      localCursor.close();
    }
    return localArrayList;
  }

  private void c(List<ao> paramList, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = e();
    if (localSQLiteDatabase == null);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        ao localao = (ao)localIterator.next();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("expires", Long.valueOf(paramLong));
        localContentValues.put("key", localao.a);
        localContentValues.put("value", localao.b);
        localSQLiteDatabase.insert("datalayer", null, localContentValues);
      }
    }
  }

  private int d()
  {
    Cursor localCursor = null;
    SQLiteDatabase localSQLiteDatabase = e();
    int i = 0;
    if (localSQLiteDatabase == null);
    while (true)
    {
      return i;
      try
      {
        localCursor = localSQLiteDatabase.rawQuery("SELECT COUNT(*) from datalayer", null);
        boolean bool = localCursor.moveToFirst();
        i = 0;
        if (bool)
        {
          long l = localCursor.getLong(0);
          i = (int)l;
        }
        return i;
      }
      catch (SQLiteException localSQLiteException)
      {
        q.c();
        i = 0;
        return 0;
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
    }
    throw localObject;
  }

  private SQLiteDatabase e()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.d.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      q.c();
    }
    return null;
  }

  private void f()
  {
    try
    {
      this.d.close();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
    }
  }

  public final void a(g paramg)
  {
    this.b.execute(new am(this, paramg));
  }

  public final void a(List<d> paramList, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      localArrayList.add(new ao(locald.a, a(locald.b)));
    }
    this.b.execute(new al(this, localArrayList, paramLong));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ak
 * JD-Core Version:    0.6.0
 */