package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;

@a
public final class av extends an
{
  public final am a(Context paramContext, b paramb, int paramInt, boolean paramBoolean, l paraml, j paramj)
  {
    if (!a(paramContext))
      return null;
    return new t(paramContext, paramBoolean, a(paramb), new bm(paramContext, paramb.o(), paramb.v(), paraml, paramj));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.av
 * JD-Core Version:    0.6.0
 */