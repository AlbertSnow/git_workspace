package com.wandoujia.launcher_base.utils;

import android.os.Handler;
import com.wandoujia.base.log.Log;

public class a
{
  private static final String a = a.class.getSimpleName();

  public static void a(String paramString)
  {
    Log.i(a, "log install " + paramString + ", auto=false, source=" + null, new Object[0]);
    com.wandoujia.launcher_base.b.a.e().post(new b());
  }

  public static void a(String paramString1, String paramString2)
  {
    Log.i(a, "log uninstall " + paramString1 + ", " + paramString2, new Object[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.a
 * JD-Core Version:    0.6.0
 */