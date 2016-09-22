package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import aoq;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;

@com.google.android.gms.ads.internal.report.client.a
public final class ai
{
  public static void a(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    if ((paramAdOverlayInfoParcel.l == 4) && (paramAdOverlayInfoParcel.d == null))
    {
      if (paramAdOverlayInfoParcel.c != null)
        paramAdOverlayInfoParcel.c.e();
      bc.a().b.a(paramContext, paramAdOverlayInfoParcel.b, paramAdOverlayInfoParcel.j);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", paramAdOverlayInfoParcel.n.e);
    localIntent.putExtra("shouldCallOnOverlayOpened", paramBoolean);
    AdOverlayInfoParcel.a(localIntent, paramAdOverlayInfoParcel);
    if (!aoq.a(21))
      localIntent.addFlags(524288);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    y.a(paramContext, localIntent);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.ai
 * JD-Core Version:    0.6.0
 */