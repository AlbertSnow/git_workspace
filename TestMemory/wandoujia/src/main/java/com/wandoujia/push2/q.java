package com.wandoujia.push2;

import android.database.sqlite.SQLiteDatabase;

final class q
  implements Runnable
{
  q(o paramo, long paramLong)
  {
  }

  public final void run()
  {
    SQLiteDatabase localSQLiteDatabase = this.b.getWritableDatabase();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(this.a);
    localSQLiteDatabase.delete("push", "id = ?", arrayOfString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.q
 * JD-Core Version:    0.6.0
 */