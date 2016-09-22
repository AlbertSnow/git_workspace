package com.google.android.gms.ads.internal.state;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;

@a
public final class i
{
  long a = -1L;
  public long b = -1L;
  int c = -1;
  final Object d = new Object();
  int e = 0;
  int f = 0;
  private String g;

  public i(String paramString)
  {
    this.g = paramString;
  }

  private static boolean a(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (i == 0)
    {
      c.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try
    {
      if (i == paramContext.getPackageManager().getActivityInfo(localComponentName, 0).theme)
        return true;
      c.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      c.e("Fail to fetch AdActivity theme");
      c.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    }
    return false;
  }

  public final Bundle a(Context paramContext, String paramString)
  {
    synchronized (this.d)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", this.g);
      localBundle.putLong("basets", this.b);
      localBundle.putLong("currts", this.a);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", this.c);
      localBundle.putInt("pclick", this.e);
      localBundle.putInt("pimp", this.f);
      localBundle.putBoolean("support_transparent_background", a(paramContext));
      return localBundle;
    }
  }

  public final void a()
  {
    synchronized (this.d)
    {
      this.e = (1 + this.e);
      return;
    }
  }

  public final void a(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    synchronized (this.d)
    {
      if (this.b == -1L)
      {
        this.b = paramLong;
        this.a = this.b;
        if ((paramAdRequestParcel.c != null) && (paramAdRequestParcel.c.getInt("gw", 2) == 1))
          return;
      }
      else
      {
        this.a = paramLong;
      }
    }
    this.c = (1 + this.c);
    monitorexit;
  }

  public final void b()
  {
    synchronized (this.d)
    {
      this.f = (1 + this.f);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.i
 * JD-Core Version:    0.6.0
 */