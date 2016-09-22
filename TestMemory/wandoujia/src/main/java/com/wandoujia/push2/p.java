package com.wandoujia.push2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.wandoujia.push2.protocol.Message;

final class p
  implements Runnable
{
  p(o paramo, Message paramMessage)
  {
  }

  public final void run()
  {
    SQLiteDatabase localSQLiteDatabase = this.b.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("id", Long.valueOf(this.a.getId()));
    localContentValues.put("expired", Long.valueOf(this.a.getExpired()));
    localContentValues.put("type", Integer.valueOf(this.a.getBodyProtocol()));
    localContentValues.put("body", this.a.getBody());
    localSQLiteDatabase.insert("push", null, localContentValues);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.p
 * JD-Core Version:    0.6.0
 */