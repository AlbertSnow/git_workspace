package com.alipay.mobilesecuritysdk.deviceID;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class c extends SQLiteOpenHelper
{
  public c(Context paramContext)
  {
    super(paramContext, "device.db", null, 1);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE devices(_idINTEGER PRIMARY KEY,AH1TEXT,AH2TEXT,AH3TEXT,AH4TEXT,AH5TEXT,AH6TEXT,AH7TEXT,AH8TEXT,AH9TEXT,AH10TEXT,AS1TEXT,AS2TEXT,AS3TEXT,AS4TEXT);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTSdevices");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.c
 * JD-Core Version:    0.6.0
 */