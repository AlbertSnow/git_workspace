package com.wandoujia.clean.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.wandoujia.base.config.GlobalConfig;

public final class h extends SQLiteOpenHelper
{
  private static h a;

  private h(Context paramContext)
  {
    super(paramContext, "storage_garbage.db", null, 5);
  }

  public static h a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new h(GlobalConfig.getAppContext());
      h localh = a;
      return localh;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS garbage_bean");
    paramSQLiteDatabase.execSQL("CREATE TABLE garbage_bean (id INTEGER PRIMARY KEY,alertInfo TEXT,appName TEXT,desc TEXT,latestModification LONG,pathMd5 TEXT,pathType INTEGER NOT NULL DEFAULT 0,pkgNameMd5 TEXT,simpleAlertInfo TEXT,subPathLevel INTEGER NOT NULL DEFAULT 0,flag INTEGER NOT NULL DEFAULT 0,subPath TEXT,contentType INTEGER,regPkgName TEXT,rootPathMd5 TEXT,title TEXT)");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS path_type_index ON garbage_bean(pathType)");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS path_md5_index ON garbage_bean(pathMd5)");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS pkg_md5_index ON garbage_bean(pkgNameMd5)");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS content_type");
    paramSQLiteDatabase.execSQL("CREATE TABLE content_type (id INTEGER PRIMARY KEY,labelId INTEGER NOT NULL DEFAULT 0,title TEXT,desc TEXT,alertInfo TEXT,adviceLevel INTEGER NOT NULL DEFAULT 0,orderType INTEGER NOT NULL DEFAULT 0,rank INTEGER NOT NULL DEFAULT 0)");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS content_type");
    paramSQLiteDatabase.execSQL("CREATE TABLE label (id INTEGER PRIMARY KEY,name TEXT,orderType INTEGER NOT NULL DEFAULT 0,rank INTEGER NOT NULL DEFAULT 0)");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS white_list");
    paramSQLiteDatabase.execSQL("CREATE TABLE white_list (type INTEGER,filePath TEXT)");
    paramSQLiteDatabase.setVersion(5);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase);
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    a(paramSQLiteDatabase);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 3)
      a(paramSQLiteDatabase);
    while (true)
    {
      return;
      while (paramInt1 < paramInt2)
      {
        paramInt1++;
        switch (paramInt1)
        {
        default:
          break;
        case 4:
          paramSQLiteDatabase.execSQL("ALTER TABLE garbage_bean ADD COLUMN flag INTEGER NOT NULL DEFAULT 0");
          paramSQLiteDatabase.execSQL("CREATE TABLE white_list (type INTEGER,filePath TEXT)");
          break;
        case 5:
          paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS white_list");
          paramSQLiteDatabase.execSQL("CREATE TABLE white_list (type INTEGER,filePath TEXT)");
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.h
 * JD-Core Version:    0.6.0
 */