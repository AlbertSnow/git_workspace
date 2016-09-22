package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class l extends q
{
  public l(Context paramContext, boolean paramBoolean)
  {
  }

  public final void a()
  {
    SharedPreferences.Editor localEditor = this.a.getSharedPreferences("admob", 0).edit();
    localEditor.putBoolean("content_url_opted_out", this.b);
    localEditor.apply();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.l
 * JD-Core Version:    0.6.0
 */