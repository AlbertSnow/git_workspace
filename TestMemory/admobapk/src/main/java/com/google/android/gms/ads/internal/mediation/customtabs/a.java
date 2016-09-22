package com.google.android.gms.ads.internal.mediation.customtabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;

@com.google.android.gms.ads.internal.report.client.a
public final class a
  implements f
{
  Activity a;
  com.google.android.gms.ads.internal.customtabs.a b;
  g c;
  private Uri d;

  public final void a()
  {
    com.google.android.gms.ads.internal.util.client.e.b("Destroying AdMobCustomTabsAdapter adapter.");
    try
    {
      this.b.a(this.a);
      return;
    }
    catch (Exception localException)
    {
      com.google.android.gms.ads.internal.util.client.e.b("Exception while unbinding from CustomTabsService.", localException);
    }
  }

  public final void a(Context paramContext, g paramg, Bundle paramBundle1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    this.c = paramg;
    if (this.c == null)
    {
      com.google.android.gms.ads.internal.util.client.e.e("Listener not set for mediation. Returning.");
      return;
    }
    if (!(paramContext instanceof Activity))
    {
      com.google.android.gms.ads.internal.util.client.e.e("AdMobCustomTabs can only work with Activity context. Bailing out.");
      this.c.b(0);
      return;
    }
    if (!com.google.android.gms.ads.internal.customtabs.a.a(paramContext))
    {
      com.google.android.gms.ads.internal.util.client.e.e("Default browser does not support custom tabs. Bailing out.");
      this.c.b(0);
      return;
    }
    String str = paramBundle1.getString("tab_url");
    if (TextUtils.isEmpty(str))
    {
      com.google.android.gms.ads.internal.util.client.e.e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
      this.c.b(0);
      return;
    }
    this.a = ((Activity)paramContext);
    this.d = Uri.parse(str);
    this.b = new com.google.android.gms.ads.internal.customtabs.a();
    b localb = new b(this);
    this.b.b = localb;
    this.b.b(this.a);
    this.c.j();
  }

  public final void b()
  {
    com.google.android.gms.ads.internal.util.client.e.b("Pausing AdMobCustomTabsAdapter adapter.");
  }

  public final void c()
  {
    com.google.android.gms.ads.internal.util.client.e.b("Resuming AdMobCustomTabsAdapter adapter.");
  }

  public final void e()
  {
    d locald = new d(new e(this.b.a()).a, null);
    locald.a.setData(this.d);
    AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(new AdLauncherIntentInfoParcel(locald.a), null, new c(this), null, new VersionInfoParcel(0, 0, false));
    y.a.post(new d(this, localAdOverlayInfoParcel));
    bc.a().h.h = false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.customtabs.a
 * JD-Core Version:    0.6.0
 */