package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public final class i extends q
{
  public i(Context paramContext, r paramr)
  {
  }

  public final void a()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("admob", 0);
    Bundle localBundle = new Bundle();
    localBundle.putString("app_settings_json", localSharedPreferences.getString("app_settings_json", ""));
    localBundle.putLong("app_settings_last_update_ms", localSharedPreferences.getLong("app_settings_last_update_ms", 0L));
    if (this.b != null)
      this.b.a(localBundle);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.i
 * JD-Core Version:    0.6.0
 */