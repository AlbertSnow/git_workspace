package com.wandoujia.net.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Process;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

final class a extends SQLiteOpenHelper
{
  public a(Context paramContext)
  {
    super(paramContext, a(paramContext), null, 1);
  }

  private static String a(Context paramContext)
  {
    int i = Process.myPid();
    List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      }
      while (localRunningAppProcessInfo.pid != i);
    }
    for (String str1 = localRunningAppProcessInfo.processName; ; str1 = "")
      try
      {
        byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(str1.getBytes());
        StringBuffer localStringBuffer = new StringBuffer();
        for (int j = 0; j < arrayOfByte.length; j++)
          localStringBuffer.append(Integer.toHexString(0x100 | 0xFF & arrayOfByte[j]).substring(1, 3));
        String str2 = localStringBuffer.toString() + "_aysnc_downloader.db";
        return str2;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        return "aysnc_downloader.db";
      }
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS infos(id INTEGER PRIMARY KEY AUTOINCREMENT, received INTEGER, content_length INTEGER, url TEXT, path TEXT)");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("drop table infos");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.b.a
 * JD-Core Version:    0.6.0
 */