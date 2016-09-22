package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.util.c;

public final class j extends SQLiteOpenHelper
{
  public j(i parami, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 4);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(i.a);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    c.d(64 + "Database updated from version " + paramInt1 + " to version " + paramInt2);
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.j
 * JD-Core Version:    0.6.0
 */