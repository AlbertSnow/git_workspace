package com.wandoujia.logv3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.wandoujia.base.utils.MD5Utils;
import com.wandoujia.base.utils.SystemUtil;
import java.io.IOException;

public final class a extends SQLiteOpenHelper
{
  public a(Context paramContext, String paramString)
  {
    super(paramContext, a(paramContext, paramString), null, 2);
  }

  private static String a(Context paramContext, String paramString)
  {
    String str1 = paramString + "-log.db";
    String str2 = SystemUtil.getProcessName(paramContext);
    String str3 = paramContext.getPackageName();
    Object localObject;
    if ((!TextUtils.isEmpty(str2)) && (!str2.equals(str3)))
      localObject = "";
    try
    {
      String str4 = MD5Utils.md5Digest(str2);
      localObject = str4;
      label61: str1 = (String)localObject + "_" + paramString + "-log.db";
      return str1;
    }
    catch (IOException localIOException)
    {
      break label61;
    }
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS log_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,is_real_time BIT NOT NULL,log_content BLOB);");
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_data");
    onCreate(paramSQLiteDatabase);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_data");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.a
 * JD-Core Version:    0.6.0
 */