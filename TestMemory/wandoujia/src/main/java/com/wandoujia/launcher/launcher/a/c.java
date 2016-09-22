package com.wandoujia.launcher.launcher.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class c extends SQLiteOpenHelper
{
  public c(Context paramContext)
  {
    super(paramContext, "gamelauncher.db", null, 4);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("create table if not exists ").append(a.b).append("(").append(a.a).append(" integer primary key autoincrement, ").append(a.c).append(" text, ").append(a.d).append(" integer, ").append(a.f).append(" text, ").append(a.e).append(" text, ").append(a.g).append(" text, ").append(a.h).append(" text)");
    paramSQLiteDatabase.execSQL(localStringBuilder.toString());
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("drop table " + a.b);
    onCreate(paramSQLiteDatabase);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("drop table " + a.b);
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.a.c
 * JD-Core Version:    0.6.0
 */