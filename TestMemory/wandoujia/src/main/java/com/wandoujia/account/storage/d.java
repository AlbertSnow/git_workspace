package com.wandoujia.account.storage;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;

public final class d
  implements c
{
  private final SharedPreferences a;

  public d(SharedPreferences paramSharedPreferences)
  {
    this.a = paramSharedPreferences;
  }

  @TargetApi(9)
  private static void a(SharedPreferences.Editor paramEditor)
  {
    if (Build.VERSION.SDK_INT > 9)
    {
      paramEditor.apply();
      return;
    }
    paramEditor.commit();
  }

  public final boolean a()
  {
    return !TextUtils.isEmpty(this.a.getString("WDJ_AUTH", null));
  }

  public final boolean a(String paramString)
  {
    a(this.a.edit().putString("WDJ_AUTH", paramString));
    return true;
  }

  public final boolean a(String paramString1, String paramString2)
  {
    SharedPreferences.Editor localEditor = this.a.edit().putString("WDJ_ACCOUNT", paramString1);
    if (paramString2 == null)
      paramString2 = "";
    a(localEditor.putString("WDJ_AUTH", paramString2));
    return true;
  }

  public final String b()
  {
    return this.a.getString("WDJ_AUTH", "");
  }

  public final String b(String paramString)
  {
    return this.a.getString(paramString, "");
  }

  public final boolean b(String paramString1, String paramString2)
  {
    a(this.a.edit().putString(paramString1, paramString2));
    return true;
  }

  public final String c()
  {
    return this.a.getString("WDJ_ACCOUNT", "");
  }

  public final String d()
  {
    return this.a.getString("WDJ_ACCOUNT_UID", "");
  }

  public final String e()
  {
    return this.a.getString("WDJ_ACCOUNT_NICKNAME", "");
  }

  public final int f()
  {
    if (!this.a.contains("WDJ_AUTH"))
      return 0;
    a(this.a.edit().remove("WDJ_AUTH"));
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.d
 * JD-Core Version:    0.6.0
 */