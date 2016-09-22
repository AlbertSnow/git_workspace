package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public final class k extends q
{
  public k(Context paramContext, r paramr)
  {
  }

  public final void a()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("admob", 0);
    Bundle localBundle = new Bundle();
    localBundle.putInt("webview_cache_version", localSharedPreferences.getInt("webview_cache_version", 0));
    if (this.b != null)
      this.b.a(localBundle);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.k
 * JD-Core Version:    0.6.0
 */