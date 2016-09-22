package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public final class m extends q
{
  public m(Context paramContext, r paramr)
  {
  }

  public final void a()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("admob", 0);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("content_url_opted_out", localSharedPreferences.getBoolean("content_url_opted_out", true));
    if (this.b != null)
      this.b.a(localBundle);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.m
 * JD-Core Version:    0.6.0
 */