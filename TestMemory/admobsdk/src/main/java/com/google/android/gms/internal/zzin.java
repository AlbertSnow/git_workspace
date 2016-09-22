package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzhb
public final class zzin extends zzb
{
  public static void v(String msg)
  {
    if (zzhp())
      Log.v("Ads", msg);
  }

  public static boolean zzho()
  {
    return ((Boolean)zzbt.zzwK.get()).booleanValue();
  }

  private static boolean zzhp()
  {
    return (zzQ(2)) && (zzho());
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzin
 * JD-Core Version:    0.6.0
 */