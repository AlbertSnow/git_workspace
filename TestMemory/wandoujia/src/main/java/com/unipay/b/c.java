package com.unipay.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class c extends SQLiteOpenHelper
{
  public c(e parame, Context paramContext)
  {
    super(paramContext, e.a(parame), null, 1);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE " + e.b(this.a) + " (" + this.a.a + " INTEGER PRIMARY KEY," + this.a.b + " TEXT," + this.a.c + " TEXT," + this.a.d + " TEXT);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXITS " + e.b(this.a));
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.b.c
 * JD-Core Version:    0.6.0
 */