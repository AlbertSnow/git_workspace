package com.wandoujia.launcher_base.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class e extends SQLiteOpenHelper
{
  private static e a;

  private e(Context paramContext)
  {
    super(paramContext, "phoenix2.db", null, 1);
  }

  public static e a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new e(paramContext.getApplicationContext());
      e locale = a;
      return locale;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS al_app_stat");
    paramSQLiteDatabase.execSQL("CREATE TABLE al_app_stat (_id INTEGER PRIMARY KEY AUTOINCREMENT,package_name TEXT NOT NULL,date DATE NOT NULL,duration INTEGER DEFAULT 0,start_count INTEGER DEFAULT 0);");
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.e
 * JD-Core Version:    0.6.0
 */