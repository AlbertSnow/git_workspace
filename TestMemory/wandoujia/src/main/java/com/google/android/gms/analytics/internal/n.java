package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class n extends u
{
  private String a;
  private String b;
  private boolean c;
  private int d;
  private boolean e;
  private boolean f;

  public n(w paramw)
  {
    super(paramw);
  }

  protected final void a()
  {
    Context localContext = k();
    c localc;
    try
    {
      ApplicationInfo localApplicationInfo2 = localContext.getPackageManager().getApplicationInfo(localContext.getPackageName(), 129);
      localApplicationInfo1 = localApplicationInfo2;
      if (localApplicationInfo1 == null)
      {
        f("Couldn't get ApplicationInfo to load global config");
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      do
      {
        int i;
        do
        {
          Bundle localBundle;
          do
          {
            ApplicationInfo localApplicationInfo1;
            while (true)
            {
              d("PackageManager doesn't know about the app package", localNameNotFoundException);
              localApplicationInfo1 = null;
            }
            localBundle = localApplicationInfo1.metaData;
          }
          while (localBundle == null);
          i = localBundle.getInt("com.google.android.gms.analytics.globalConfigResource");
        }
        while (i <= 0);
        localc = (c)new bb(i()).a(i);
      }
      while (localc == null);
      c("Loading global XML config values");
      if (localc.a == null)
        break label331;
    }
    int j = 1;
    label116: if (j != 0)
    {
      String str3 = localc.a;
      this.b = str3;
      b("XML config - app name", str3);
    }
    int k;
    label153: int m;
    label190: String str1;
    int i3;
    label218: int n;
    label245: int i1;
    if (localc.b != null)
    {
      k = 1;
      if (k != 0)
      {
        String str2 = localc.b;
        this.a = str2;
        b("XML config - app version", str2);
      }
      if (localc.c == null)
        break label343;
      m = 1;
      if (m != 0)
      {
        str1 = localc.c.toLowerCase();
        if (!"verbose".equals(str1))
          break label349;
        i3 = 0;
        if (i3 >= 0)
          a("XML config - log level", Integer.valueOf(i3));
      }
      if (localc.d < 0)
        break label403;
      n = 1;
      if (n != 0)
      {
        int i2 = localc.d;
        this.d = i2;
        this.c = true;
        b("XML config - dispatch period (sec)", Integer.valueOf(i2));
      }
      if (localc.e == -1)
        break label409;
      i1 = 1;
      label291: if (i1 == 0)
        break label413;
      if (localc.e != 1)
        break label415;
    }
    label403: label409: label413: label415: for (boolean bool = true; ; bool = false)
    {
      this.f = bool;
      this.e = true;
      b("XML config - dry run", Boolean.valueOf(bool));
      return;
      label331: j = 0;
      break label116;
      k = 0;
      break label153;
      label343: m = 0;
      break label190;
      label349: if ("info".equals(str1))
      {
        i3 = 1;
        break label218;
      }
      if ("warning".equals(str1))
      {
        i3 = 2;
        break label218;
      }
      if ("error".equals(str1))
      {
        i3 = 3;
        break label218;
      }
      i3 = -1;
      break label218;
      n = 0;
      break label245;
      i1 = 0;
      break label291;
      break;
    }
  }

  public final String b()
  {
    z();
    return this.a;
  }

  public final String c()
  {
    z();
    return this.b;
  }

  public final boolean d()
  {
    z();
    return false;
  }

  public final boolean e()
  {
    z();
    return this.c;
  }

  public final int f()
  {
    z();
    return this.d;
  }

  public final boolean g()
  {
    z();
    return this.e;
  }

  public final boolean h()
  {
    z();
    return this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.n
 * JD-Core Version:    0.6.0
 */