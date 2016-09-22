package com.wandoujia.jupiter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public final class h extends i
{
  public final <T> T a(String paramString)
  {
    return j.a().a(paramString);
  }

  public final String a()
  {
    return j.a().e();
  }

  public final String b()
  {
    return j.a().f();
  }

  public final String c()
  {
    return j.a().g();
  }

  public final Class<?> d()
  {
    return j.a().h();
  }

  public final String e()
  {
    return PreferenceManager.getDefaultSharedPreferences(j.a().c()).getString("KEY_COLOR_THEME", null);
  }

  public final boolean f()
  {
    return j.a().k();
  }

  public final Context g()
  {
    return j.a().c();
  }

  public final Logger h()
  {
    return j.a().d();
  }

  public final Class<?> i()
  {
    return j.a().b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.h
 * JD-Core Version:    0.6.0
 */