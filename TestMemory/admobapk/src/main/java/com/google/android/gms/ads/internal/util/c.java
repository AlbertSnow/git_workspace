package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.e;

@a
public final class c extends e
{
  public static void a(String paramString)
  {
    if ((a(2)) && (((Boolean)m.Y.a()).booleanValue()));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        Log.v("Ads", paramString);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.c
 * JD-Core Version:    0.6.0
 */