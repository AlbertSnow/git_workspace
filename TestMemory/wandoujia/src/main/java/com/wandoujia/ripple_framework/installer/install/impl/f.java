package com.wandoujia.ripple_framework.installer.install.impl;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.b;
import android.support.v4.app.d;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.ripple_framework.installer.install.m;
import com.wandoujia.ripple_framework.installer.install.n;
import java.util.ArrayList;

public final class f extends m
{
  private final LocalAppChangedListener b = new g(this);
  private n c;
  private final Handler d;
  private ArrayList<j> e = new ArrayList();
  private Runnable f = new h(this);

  public f()
  {
    super(null);
    ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).a(this.b);
    new d(com.wandoujia.ripple_framework.i.k().g());
    this.d = new Handler(k.a().getLooper());
  }

  public final void a(String paramString)
  {
    PackageInfo localPackageInfo = b.K(paramString);
    if (localPackageInfo == null);
    while (true)
    {
      return;
      if ((0x1 & localPackageInfo.applicationInfo.flags) > 0)
        continue;
      try
      {
        Uri localUri = Uri.parse("package:" + paramString);
        if (localUri == null)
          continue;
        Intent localIntent = new Intent("android.intent.action.DELETE", localUri);
        localIntent.setFlags(268435456);
        com.wandoujia.ripple_framework.i.k().g().startActivity(localIntent);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
      }
    }
  }

  public final void a(String paramString, n paramn)
  {
    a(paramString, b.M(paramString), paramn);
  }

  public final void a(String paramString1, String paramString2, n paramn)
  {
    this.c = paramn;
    int i = d.a(paramString1, new i(paramn, paramString2));
    int j = 0;
    if (i < 0);
    while (j != 0)
    {
      return;
      j = 1;
    }
    this.d.removeCallbacks(this.f);
    synchronized (this.e)
    {
      this.e.add(new j(paramString1, paramString2, 0));
      this.d.postDelayed(this.f, 1000L);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.f
 * JD-Core Version:    0.6.0
 */