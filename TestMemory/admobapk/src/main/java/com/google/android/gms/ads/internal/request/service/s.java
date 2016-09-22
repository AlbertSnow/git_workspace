package com.google.android.gms.ads.internal.request.service;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import aoo;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.y;
import java.util.Locale;

public final class s
{
  private int a;
  private boolean b;
  private boolean c;
  private int d;
  private int e;
  private int f;
  private String g;
  private int h;
  private int i;
  private int j;
  private boolean k;
  private int l;
  private double m;
  private boolean n;
  private String o;
  private boolean p;
  private boolean q;
  private String r;
  private boolean s;
  private boolean t;
  private String u;
  private String v;
  private float w;
  private int x;
  private int y;
  private boolean z;

  public s(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    a(paramContext);
    a(paramContext, localPackageManager);
    b(paramContext);
    Locale localLocale = Locale.getDefault();
    boolean bool2;
    label59: Resources localResources;
    if (a(localPackageManager, "geo:0,0?q=donuts") != null)
    {
      bool2 = bool1;
      this.p = bool2;
      if (a(localPackageManager, "http://www.google.com") == null)
        break label130;
      this.q = bool1;
      this.r = localLocale.getCountry();
      this.s = com.google.android.gms.ads.internal.util.client.a.a();
      this.t = aoo.b(paramContext);
      this.u = localLocale.getLanguage();
      this.v = a(localPackageManager);
      localResources = paramContext.getResources();
      if (localResources != null)
        break label135;
    }
    label130: label135: DisplayMetrics localDisplayMetrics;
    do
    {
      return;
      bool2 = false;
      break;
      bool1 = false;
      break label59;
      localDisplayMetrics = localResources.getDisplayMetrics();
    }
    while (localDisplayMetrics == null);
    this.w = localDisplayMetrics.density;
    this.x = localDisplayMetrics.widthPixels;
    this.y = localDisplayMetrics.heightPixels;
  }

  public s(Context paramContext, r paramr)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    a(paramContext);
    a(paramContext, localPackageManager);
    b(paramContext);
    this.o = Build.FINGERPRINT;
    this.z = com.google.android.gms.ads.internal.customtabs.a.a(paramContext);
    this.p = paramr.b;
    this.q = paramr.c;
    this.r = paramr.e;
    this.s = paramr.f;
    this.t = paramr.g;
    this.u = paramr.j;
    this.v = paramr.k;
    this.w = paramr.r;
    this.x = paramr.s;
    this.y = paramr.t;
  }

  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }

  private static String a(PackageManager paramPackageManager)
  {
    ResolveInfo localResolveInfo = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localResolveInfo == null);
    while (true)
    {
      return null;
      ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
      if (localActivityInfo == null)
        continue;
      try
      {
        PackageInfo localPackageInfo = paramPackageManager.getPackageInfo(localActivityInfo.packageName, 0);
        if (localPackageInfo == null)
          continue;
        int i1 = localPackageInfo.versionCode;
        String str1 = String.valueOf(localActivityInfo.packageName);
        String str2 = 12 + String.valueOf(str1).length() + i1 + "." + str1;
        return str2;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
    return null;
  }

  private final void a(Context paramContext)
  {
    AudioManager localAudioManager = y.g(paramContext);
    if (localAudioManager != null)
      try
      {
        this.a = localAudioManager.getMode();
        this.b = localAudioManager.isMusicActive();
        this.c = localAudioManager.isSpeakerphoneOn();
        this.d = localAudioManager.getStreamVolume(3);
        this.e = localAudioManager.getRingerMode();
        this.f = localAudioManager.getStreamVolume(2);
        return;
      }
      catch (Throwable localThrowable)
      {
        bc.a().h.a(localThrowable, true);
      }
    this.a = -2;
    this.b = false;
    this.c = false;
    this.d = 0;
    this.e = 0;
    this.f = 0;
  }

  @TargetApi(16)
  private final void a(Context paramContext, PackageManager paramPackageManager)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.g = localTelephonyManager.getNetworkOperator();
    this.i = localTelephonyManager.getNetworkType();
    this.j = localTelephonyManager.getPhoneType();
    this.h = -2;
    this.k = false;
    this.l = -1;
    if (y.a(paramPackageManager, paramContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
    {
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo == null)
        break label135;
      this.h = localNetworkInfo.getType();
      this.l = localNetworkInfo.getDetailedState().ordinal();
    }
    while (true)
    {
      if (Build.VERSION.SDK_INT >= 16)
        this.k = localConnectivityManager.isActiveNetworkMetered();
      return;
      label135: this.h = -1;
    }
  }

  private final void b(Context paramContext)
  {
    Intent localIntent = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    if (localIntent != null)
    {
      int i1 = localIntent.getIntExtra("status", -1);
      int i2 = localIntent.getIntExtra("level", -1);
      int i3 = localIntent.getIntExtra("scale", -1);
      this.m = (i2 / i3);
      boolean bool;
      if (i1 != 2)
      {
        bool = false;
        if (i1 != 5);
      }
      else
      {
        bool = true;
      }
      this.n = bool;
      return;
    }
    this.m = -1.0D;
    this.n = false;
  }

  public final r a()
  {
    return new r(this.a, this.p, this.q, this.g, this.r, this.s, this.t, this.b, this.c, this.u, this.v, this.d, this.h, this.i, this.j, this.e, this.f, this.w, this.x, this.y, this.m, this.n, this.k, this.l, this.o, this.z);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.s
 * JD-Core Version:    0.6.0
 */