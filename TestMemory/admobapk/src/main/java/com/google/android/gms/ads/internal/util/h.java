package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class h extends q
{
  public h(Context paramContext, String paramString, long paramLong)
  {
  }

  public final void a()
  {
    SharedPreferences.Editor localEditor = this.a.getSharedPreferences("admob", 0).edit();
    localEditor.putString("app_settings_json", this.b);
    localEditor.putLong("app_settings_last_update_ms", this.c);
    localEditor.apply();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.h
 * JD-Core Version:    0.6.0
 */