package com.wandoujia.appmanager.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

@SuppressLint({"CommitPrefEdits"})
public final class Config
{
  private static final String[] a = { "app", "music", "video", "image", "book", "backup", "diagnosis", "export", ".config", ".md5", "data", ".client", "capture", "wandoujia photos", "misc", "mario" };
  private static SharedPreferences b;
  private static Context c = com.wandoujia.appmanager.a.a().h();

  public static SharedPreferences a()
  {
    monitorenter;
    try
    {
      if (b == null)
        b = c.getSharedPreferences("com.wandoujia.phoenix2", 2);
      SharedPreferences localSharedPreferences = b;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static String a(Config.ContentDir paramContentDir)
  {
    String str1 = c.getFilesDir().getAbsolutePath();
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      str2 = str1 + "/" + a[paramContentDir.ordinal()] + "/";
      File localFile = new File(str2);
      if ((localFile.exists()) || (localFile.mkdirs()));
    }
    else
    {
      return null;
    }
    return str2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.config.Config
 * JD-Core Version:    0.6.0
 */