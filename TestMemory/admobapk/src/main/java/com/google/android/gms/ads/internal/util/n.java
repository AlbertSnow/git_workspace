package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class n extends q
{
  public n(Context paramContext, String paramString)
  {
  }

  public final void a()
  {
    SharedPreferences.Editor localEditor = this.a.getSharedPreferences("admob", 0).edit();
    localEditor.putString("content_url_hashes", this.b);
    localEditor.apply();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.n
 * JD-Core Version:    0.6.0
 */