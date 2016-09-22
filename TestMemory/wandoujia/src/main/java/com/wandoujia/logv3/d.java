package com.wandoujia.logv3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class d
{
  private a a;

  d(Context paramContext, String paramString)
  {
    this.a = new a(paramContext, paramString);
  }

  public final int a()
  {
    return this.a.getWritableDatabase().delete("log_data", "is_real_time = 0", null);
  }

  public final boolean a(long paramLong)
  {
    try
    {
      this.a.getWritableDatabase().execSQL("DELETE FROM log_data WHERE _id IN ( SELECT _id FROM log_data ORDER BY _id LIMIT " + paramLong + ")");
      return true;
    }
    catch (SQLException localSQLException)
    {
    }
    return false;
  }

  public final boolean a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("is_real_time", Integer.valueOf(i));
      localContentValues.put("log_content", paramArrayOfByte);
      if (this.a.getWritableDatabase().insert("log_data", null, localContentValues) <= 0L)
        break;
      return true;
    }
    return false;
  }

  public final Cursor b()
  {
    return this.a.getWritableDatabase().query("log_data", new String[] { "_id", "log_content" }, null, null, null, null, "_id");
  }

  public final int c()
  {
    return this.a.getWritableDatabase().query("log_data", new String[] { "_id" }, null, null, null, null, null).getCount();
  }

  public final String d()
  {
    return this.a.getReadableDatabase().getPath();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.d
 * JD-Core Version:    0.6.0
 */