package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class an extends SQLiteOpenHelper
{
  an(ak paramak, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }

  // ERROR //
  private static boolean a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ldc 18
    //   5: iconst_1
    //   6: anewarray 20	java/lang/String
    //   9: dup
    //   10: iconst_0
    //   11: ldc 22
    //   13: aastore
    //   14: ldc 24
    //   16: iconst_1
    //   17: anewarray 20	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_0
    //   23: aastore
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 30	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore 7
    //   32: aload 7
    //   34: invokeinterface 36 1 0
    //   39: istore 9
    //   41: aload 7
    //   43: ifnull +10 -> 53
    //   46: aload 7
    //   48: invokeinterface 40 1 0
    //   53: iload 9
    //   55: ireturn
    //   56: astore 4
    //   58: aconst_null
    //   59: astore 5
    //   61: invokestatic 45	com/google/android/gms/tagmanager/q:c	()V
    //   64: aload 5
    //   66: ifnull +10 -> 76
    //   69: aload 5
    //   71: invokeinterface 40 1 0
    //   76: iconst_0
    //   77: ireturn
    //   78: astore_3
    //   79: aload_2
    //   80: ifnull +9 -> 89
    //   83: aload_2
    //   84: invokeinterface 40 1 0
    //   89: aload_3
    //   90: athrow
    //   91: astore_3
    //   92: aload 7
    //   94: astore_2
    //   95: goto -16 -> 79
    //   98: astore 6
    //   100: aload 5
    //   102: astore_2
    //   103: aload 6
    //   105: astore_3
    //   106: goto -27 -> 79
    //   109: astore 8
    //   111: aload 7
    //   113: astore 5
    //   115: goto -54 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   2	32	56	android/database/sqlite/SQLiteException
    //   2	32	78	finally
    //   32	41	91	finally
    //   61	64	98	finally
    //   32	41	109	android/database/sqlite/SQLiteException
  }

  public final SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
      localSQLiteDatabase1 = localSQLiteDatabase2;
      if (localSQLiteDatabase1 == null)
        localSQLiteDatabase1 = super.getWritableDatabase();
      return localSQLiteDatabase1;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        ak.b(this.a).getDatabasePath("google_tagmanager.db").delete();
        SQLiteDatabase localSQLiteDatabase1 = null;
      }
    }
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    String str = paramSQLiteDatabase.getPath();
    if (a.b() >= 9)
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
    Cursor localCursor2;
    if (Build.VERSION.SDK_INT < 15)
      localCursor2 = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    HashSet localHashSet;
    do
    {
      try
      {
        localCursor2.moveToFirst();
        localCursor2.close();
        if (!a("datalayer", paramSQLiteDatabase))
        {
          paramSQLiteDatabase.execSQL(ak.a());
          return;
        }
      }
      finally
      {
        localCursor2.close();
      }
      Cursor localCursor1 = paramSQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
      localHashSet = new HashSet();
      try
      {
        String[] arrayOfString = localCursor1.getColumnNames();
        for (int i = 0; i < arrayOfString.length; i++)
          localHashSet.add(arrayOfString[i]);
        localCursor1.close();
        if ((localHashSet.remove("key")) && (localHashSet.remove("value")) && (localHashSet.remove("ID")) && (localHashSet.remove("expires")))
          continue;
        throw new SQLiteException("Database column missing");
      }
      finally
      {
        localCursor1.close();
      }
    }
    while (localHashSet.isEmpty());
    throw new SQLiteException("Database has extra columns");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.an
 * JD-Core Version:    0.6.0
 */