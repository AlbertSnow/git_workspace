package com.unipay.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class a extends SQLiteOpenHelper
{
  public a(c paramc, Context paramContext)
  {
    super(paramContext, c.c(paramc), null, 1);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE " + c.d(this.a) + " (" + this.a.a + " TEXT PRIMARY KEY," + this.a.b + " TEXT," + this.a.c + " TEXT," + this.a.d + " TEXT," + this.a.e + " TEXT);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXITS " + c.d(this.a));
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.d.a
 * JD-Core Version:    0.6.0
 */