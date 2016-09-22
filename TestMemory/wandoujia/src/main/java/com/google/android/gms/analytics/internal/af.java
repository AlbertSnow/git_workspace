package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.support.v4.app.b;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class af extends SQLiteOpenHelper
{
  af(ae paramae, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }

  private static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    Set localSet = b(paramSQLiteDatabase, "properties");
    String[] arrayOfString = { "app_uid", "cid", "tid", "params", "adid", "hits_count" };
    while (i < 6)
    {
      String str = arrayOfString[i];
      if (!localSet.remove(str))
        throw new SQLiteException("Database properties is missing required column: " + str);
      i++;
    }
    if (!localSet.isEmpty())
      throw new SQLiteException("Database properties table has extra columns");
  }

  // ERROR //
  private boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ldc 67
    //   5: iconst_1
    //   6: anewarray 22	java/lang/String
    //   9: dup
    //   10: iconst_0
    //   11: ldc 69
    //   13: aastore
    //   14: ldc 71
    //   16: iconst_1
    //   17: anewarray 22	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_2
    //   23: aastore
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 77	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore 7
    //   32: aload 7
    //   34: astore 6
    //   36: aload 6
    //   38: invokeinterface 82 1 0
    //   43: istore 8
    //   45: aload 6
    //   47: ifnull +10 -> 57
    //   50: aload 6
    //   52: invokeinterface 86 1 0
    //   57: iload 8
    //   59: ireturn
    //   60: astore 5
    //   62: aconst_null
    //   63: astore 6
    //   65: aload_0
    //   66: getfield 10	com/google/android/gms/analytics/internal/af:a	Lcom/google/android/gms/analytics/internal/ae;
    //   69: ldc 88
    //   71: aload_2
    //   72: aload 5
    //   74: invokevirtual 94	com/google/android/gms/analytics/internal/ae:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   77: aload 6
    //   79: ifnull +10 -> 89
    //   82: aload 6
    //   84: invokeinterface 86 1 0
    //   89: iconst_0
    //   90: ireturn
    //   91: astore 4
    //   93: aload_3
    //   94: ifnull +9 -> 103
    //   97: aload_3
    //   98: invokeinterface 86 1 0
    //   103: aload 4
    //   105: athrow
    //   106: astore 4
    //   108: aload 6
    //   110: astore_3
    //   111: goto -18 -> 93
    //   114: astore 5
    //   116: goto -51 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   2	32	60	android/database/sqlite/SQLiteException
    //   2	32	91	finally
    //   36	45	106	finally
    //   65	77	106	finally
    //   36	45	114	android/database/sqlite/SQLiteException
  }

  private static Set<String> b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    Cursor localCursor = paramSQLiteDatabase.rawQuery("SELECT * FROM " + paramString + " LIMIT 0", null);
    try
    {
      String[] arrayOfString = localCursor.getColumnNames();
      for (int i = 0; i < arrayOfString.length; i++)
        localHashSet.add(arrayOfString[i]);
      return localHashSet;
    }
    finally
    {
      localCursor.close();
    }
    throw localObject;
  }

  public final SQLiteDatabase getWritableDatabase()
  {
    if (!ae.a(this.a).a(3600000L))
      throw new SQLiteException("Database open failed");
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
      return localSQLiteDatabase2;
    }
    catch (SQLiteException localSQLiteException1)
    {
      ae.a(this.a).a();
      this.a.g("Opening the database failed, dropping the table and recreating it");
      String str = ae.B();
      this.a.k().getDatabasePath(str).delete();
      try
      {
        SQLiteDatabase localSQLiteDatabase1 = super.getWritableDatabase();
        ae.a(this.a).b();
        return localSQLiteDatabase1;
      }
      catch (SQLiteException localSQLiteException2)
      {
        this.a.e("Failed to open freshly created database", localSQLiteException2);
      }
    }
    throw localSQLiteException2;
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    String str = paramSQLiteDatabase.getPath();
    if (b.l() >= 9)
    {
      File localFile = new File(str);
      localFile.setReadable(false, false);
      localFile.setWritable(false, false);
      localFile.setReadable(true, true);
      localFile.setWritable(true, true);
    }
  }

  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 1;
    Cursor localCursor;
    if (Build.VERSION.SDK_INT < 15)
      localCursor = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    while (true)
    {
      try
      {
        localCursor.moveToFirst();
        localCursor.close();
        if (!a(paramSQLiteDatabase, "hits2"))
        {
          paramSQLiteDatabase.execSQL(ae.C());
          if (a(paramSQLiteDatabase, "properties"))
            break;
          paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
          return;
        }
      }
      finally
      {
        localCursor.close();
      }
      Set localSet = b(paramSQLiteDatabase, "hits2");
      String[] arrayOfString = new String[4];
      arrayOfString[0] = "hit_id";
      arrayOfString[i] = "hit_string";
      arrayOfString[2] = "hit_time";
      arrayOfString[3] = "hit_url";
      for (int j = 0; j < 4; j++)
      {
        String str = arrayOfString[j];
        if (localSet.remove(str))
          continue;
        throw new SQLiteException("Database hits2 is missing required column: " + str);
      }
      if (!localSet.remove("hit_app_id"));
      while (!localSet.isEmpty())
      {
        throw new SQLiteException("Database hits2 has extra columns");
        i = 0;
      }
      if (i == 0)
        continue;
      paramSQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
    }
    a(paramSQLiteDatabase);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.af
 * JD-Core Version:    0.6.0
 */