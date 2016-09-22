package com.google.android.gms.ads.internal.directappinstall;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class c extends SQLiteOpenHelper
{
  public c(Context paramContext)
  {
    super(paramContext, "direct_app_install_log.db", null, 1);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE directappinstall( column_id INTEGER PRIMARY KEY AUTOINCREMENT, reference LONG, package TEXT, tracking_url TEXT, timestamp INTEGER, path TEXT);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS directappinstall");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.directappinstall.c
 * JD-Core Version:    0.6.0
 */