package com.wandoujia.ripple_framework.download.a.a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class c extends SQLiteOpenHelper
{
  public c(Context paramContext)
  {
    super(paramContext, "downloads.db", null, 125);
  }

  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
    onCreate(paramSQLiteDatabase);
  }

  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE " + paramString1 + " ADD COLUMN " + paramString2 + " " + paramString3);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    onUpgrade(paramSQLiteDatabase, 0, 125);
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    a(paramSQLiteDatabase);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 117);
    while (true)
    {
      try
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
        paramSQLiteDatabase.execSQL("CREATE TABLE downloads(_id INTEGER PRIMARY KEY AUTOINCREMENT,uri TEXT, current_bytes INTEGER, description TEXT, filename TEXT, destination INTEGER, visible INTEGER NOT NULL DEFAULT 1, lastmod BIGINT, mimetype TEXT, _data TEXT, resource_extras TEXT, resource_type INTEGERT, status INTEGER, title TEXT, total_bytes INTEGER, use_agent TEXT, allowed_download_without_wifi BOOLEAN, notification_class TEXT, etag TEXT, resouce_identity TEXT, no_integrity BOOLEAN, source TEXT, check_size INTEGER, icon_url TEXT, notification_extras TEXT, duration INTEGER NOT NULL DEFAULT 0, retried_urls TEXT, failed_times INTEGER NOT NULL DEFAULT 0, last_url_retried_times INTEGER NOT NULL DEFAULT 0);");
        int i = paramInt1 + 1;
        if (i > paramInt2)
          break;
        switch (i)
        {
        default:
          i++;
          continue;
        case 119:
        case 120:
        case 121:
        case 122:
        case 123:
        case 124:
        case 125:
        }
      }
      catch (SQLException localSQLException)
      {
        throw localSQLException;
      }
      a(paramSQLiteDatabase, "downloads", "segment_config", "TEXT");
      continue;
      a(paramSQLiteDatabase, "downloads", "md5_checksum", "TEXT");
      continue;
      a(paramSQLiteDatabase, "downloads", "dservice_urls", "TEXT");
      continue;
      a(paramSQLiteDatabase, "downloads", "speed_limit", "INTEGER");
      continue;
      a(paramSQLiteDatabase, "downloads", "verify_type", "TEXT");
      a(paramSQLiteDatabase, "downloads", "verify_value", "TEXT");
      continue;
      a(paramSQLiteDatabase, "downloads", "md5_state", "TEXT");
      continue;
      a(paramSQLiteDatabase, "downloads", "speed", "INTEGER");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.a.c
 * JD-Core Version:    0.6.0
 */