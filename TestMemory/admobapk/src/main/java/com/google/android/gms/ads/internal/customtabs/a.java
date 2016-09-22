package com.google.android.gms.ads.internal.customtabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import aww;
import awx;
import awy;
import f;
import h;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class a
  implements awy
{
  public b a;
  public b b;
  private h c;
  private f d;

  public static boolean a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager == null);
    while (true)
    {
      return false;
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
      ResolveInfo localResolveInfo1 = localPackageManager.resolveActivity(localIntent, 0);
      List localList = localPackageManager.queryIntentActivities(localIntent, 65536);
      if ((localList == null) || (localResolveInfo1 == null))
        continue;
      for (int i = 0; i < localList.size(); i++)
      {
        ResolveInfo localResolveInfo2 = (ResolveInfo)localList.get(i);
        if (localResolveInfo1.activityInfo.name.equals(localResolveInfo2.activityInfo.name))
          return localResolveInfo1.activityInfo.packageName.equals(aww.a(paramContext));
      }
    }
  }

  public final h a()
  {
    if (this.a == null)
      this.c = null;
    while (true)
    {
      return this.c;
      if (this.c != null)
        continue;
      this.c = this.a.a(null);
    }
  }

  public final void a(Activity paramActivity)
  {
    if (this.d == null)
      return;
    paramActivity.unbindService(this.d);
    this.a = null;
    this.c = null;
    this.d = null;
  }

  public final void a(b paramb)
  {
    this.a = paramb;
    this.a.a(0L);
    if (this.b != null)
      this.b.a();
  }

  public final void b()
  {
    this.a = null;
    this.c = null;
    if (this.b != null)
      this.b.b();
  }

  public final void b(Activity paramActivity)
  {
    if (this.a != null);
    String str;
    do
    {
      return;
      str = aww.a(paramActivity);
    }
    while (str == null);
    this.d = new awx(this);
    f localf = this.d;
    Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(str))
      localIntent.setPackage(str);
    paramActivity.bindService(localIntent, localf, 33);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.customtabs.a
 * JD-Core Version:    0.6.0
 */