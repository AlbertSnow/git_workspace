package com.wandoujia.push2;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.push2.protocol.Message;
import java.util.ArrayList;
import java.util.List;

final class o extends SQLiteOpenHelper
{
  public o(Context paramContext)
  {
    super(paramContext, "push2.db", null, 2);
  }

  public final List<Message> a()
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      Cursor localCursor = getWritableDatabase().rawQuery("SELECT * FROM push", null);
      while (localCursor.moveToNext())
        localArrayList.add(new Message(localCursor.getLong(localCursor.getColumnIndex("id")), localCursor.getLong(localCursor.getColumnIndex("expired")), localCursor.getInt(localCursor.getColumnIndex("type")), localCursor.getString(localCursor.getColumnIndex("body"))));
      localCursor.close();
      return localArrayList;
    }
    catch (SQLException localSQLException)
    {
    }
    return localArrayList;
  }

  public final void a(long paramLong)
  {
    ThreadPool.execute(new q(this, paramLong));
  }

  public final void a(Message paramMessage)
  {
    ThreadPool.execute(new p(this, paramMessage));
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS push(id INTEGER PRIMARY KEY, expired INTEGER, type INTEGER, body TEXT)");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("drop table push");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.o
 * JD-Core Version:    0.6.0
 */