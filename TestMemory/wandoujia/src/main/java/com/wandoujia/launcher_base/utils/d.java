package com.wandoujia.launcher_base.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.rootkit.b;

public class d
{
  private static Context a;

  static
  {
    d.class.getSimpleName();
    a = GlobalConfig.getAppContext();
  }

  public static void a(String paramString1, String paramString2)
  {
    a.a(paramString2);
    b.a();
    if (!b.b())
    {
      AppManager.a().a(paramString1, false);
      return;
    }
    if (PreferenceManager.getDefaultSharedPreferences(a).getBoolean("key_first_setting", true))
    {
      com.wandoujia.launcher_base.b.a.f();
      AppManager.a().a(paramString1, false);
      return;
    }
    boolean bool = PreferenceManager.getDefaultSharedPreferences(a).getBoolean("setting_root_install", false);
    AppManager.a().a(paramString1, bool);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.d
 * JD-Core Version:    0.6.0
 */