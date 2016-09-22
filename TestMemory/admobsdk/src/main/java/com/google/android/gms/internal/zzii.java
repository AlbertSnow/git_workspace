package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;

@zzhb
public class zzii
{
  long zzLE = -1L;
  long zzLF = -1L;
  int zzLG = -1;
  private final Object zzpV = new Object();
  final String zzLq;
  int zzLH = 0;
  int zzLI = 0;

  public zzii(String paramString)
  {
    this.zzLq = paramString;
  }

  public long zzhl()
  {
    return this.zzLF;
  }

  public void zzgT()
  {
    synchronized (this.zzpV)
    {
      this.zzLH += 1;
    }
  }

  public void zzgS()
  {
    synchronized (this.zzpV)
    {
      this.zzLI += 1;
    }
  }

  public void zzb(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    synchronized (this.zzpV)
    {
      if (this.zzLF == -1L)
      {
        this.zzLF = paramLong;
        this.zzLE = this.zzLF;
      }
      else
      {
        this.zzLE = paramLong;
      }
      if (paramAdRequestParcel.extras != null)
      {
        int i = paramAdRequestParcel.extras.getInt("gw", 2);
        if (i == 1)
          return;
      }
      this.zzLG += 1;
    }
  }

  public Bundle zzc(Context paramContext, String paramString)
  {
    synchronized (this.zzpV)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", this.zzLq);
      localBundle.putLong("basets", this.zzLF);
      localBundle.putLong("currts", this.zzLE);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", this.zzLG);
      localBundle.putInt("pclick", this.zzLH);
      localBundle.putInt("pimp", this.zzLI);
      localBundle.putBoolean("support_transparent_background", zzH(paramContext));
      return localBundle;
    }
  }

  public static boolean zzH(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (i == 0)
    {
      zzin.zzaJ("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try
    {
      int j = paramContext.getPackageManager().getActivityInfo(localComponentName, 0).theme;
      if (i == j)
        return true;
      zzin.zzaJ("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      zzin.zzaK("Fail to fetch AdActivity theme");
      zzin.zzaJ("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    }
    return false;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzii
 * JD-Core Version:    0.6.0
 */