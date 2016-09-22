package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import aoq;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;

@a
public abstract class an
{
  protected static boolean a(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    return (aoq.a(14)) && ((localApplicationInfo == null) || (localApplicationInfo.targetSdkVersion >= 11));
  }

  protected static boolean a(b paramb)
  {
    return paramb.k().e;
  }

  public abstract am a(Context paramContext, b paramb, int paramInt, boolean paramBoolean, l paraml, j paramj);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.an
 * JD-Core Version:    0.6.0
 */