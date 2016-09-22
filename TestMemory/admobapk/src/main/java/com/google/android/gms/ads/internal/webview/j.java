package com.google.android.gms.ads.internal.webview;

import android.content.Context;
import com.google.android.gms.ads.internal.av;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import ha;

@a
public final class j
{
  public static b a(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, ha paramha, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.csi.l paraml, av paramav, m paramm)
  {
    k localk = new k(new l(new n(paramContext), paramAdSizeParcel, paramBoolean1, paramha, paramVersionInfoParcel, paraml, paramav, paramm));
    localk.setWebViewClient(bc.a().g.a(localk, paramBoolean2));
    localk.setWebChromeClient(bc.a().g.c(localk));
    return localk;
  }

  public final b a(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, ha paramha, VersionInfoParcel paramVersionInfoParcel)
  {
    return a(paramContext, paramAdSizeParcel, false, false, paramha, paramVersionInfoParcel, null, null, null);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.j
 * JD-Core Version:    0.6.0
 */