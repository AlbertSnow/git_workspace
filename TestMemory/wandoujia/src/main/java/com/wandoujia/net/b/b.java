package com.wandoujia.net.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;

public final class b
{
  private static b b;
  private SQLiteDatabase a;

  private b(Context paramContext)
  {
    this.a = new a(paramContext).getWritableDatabase();
  }

  public static b a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (b == null)
        b = new b(paramContext);
      b localb = b;
      return localb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final long a(c paramc)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("received", Long.valueOf(paramc.b));
    localContentValues.put("content_length", Long.valueOf(paramc.c));
    localContentValues.put("url", paramc.d);
    localContentValues.put("path", paramc.e);
    return this.a.insert("infos", null, localContentValues);
  }

  public final c a(String paramString1, String paramString2)
  {
    Cursor localCursor = this.a.rawQuery("SELECT * FROM infos WHERE path = ? AND url = ?", new String[] { paramString1, paramString2 });
    try
    {
      if (localCursor.moveToNext())
      {
        c localc = new c();
        localc.a = localCursor.getLong(localCursor.getColumnIndex("id"));
        localc.b = localCursor.getLong(localCursor.getColumnIndex("received"));
        localc.c = localCursor.getLong(localCursor.getColumnIndex("content_length"));
        localc.d = localCursor.getString(localCursor.getColumnIndex("url"));
        localc.e = localCursor.getString(localCursor.getColumnIndex("path"));
        return localc;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
    throw localObject;
  }

  public final void a(Long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = this.a;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramLong.toString();
    localSQLiteDatabase.delete("infos", "id = ?", arrayOfString);
  }

  public final void a(String paramString)
  {
    this.a.delete("infos", "path = ?", new String[] { paramString });
  }

  public final void b(c paramc)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("received", Long.valueOf(paramc.b));
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.a;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = new Long(paramc.a).toString();
      localSQLiteDatabase.update("infos", localContentValues, "id = ?", arrayOfString);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
    }
  }

  public final void c(c paramc)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("content_length", Long.valueOf(paramc.c));
      SQLiteDatabase localSQLiteDatabase = this.a;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = new Long(paramc.a).toString();
      localSQLiteDatabase.update("infos", localContentValues, "id = ?", arrayOfString);
      return;
    }
    catch (SQLiteFullException localSQLiteFullException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.b.b
 * JD-Core Version:    0.6.0
 */