package com.google.android.gms.ads.internal.renderer;

import android.content.Context;
import aoq;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.c;
import ha;

@com.google.android.gms.ads.internal.report.client.a
public final class j
{
  public static com.google.android.gms.ads.internal.util.an a(Context paramContext, com.google.android.gms.ads.internal.a parama, com.google.android.gms.ads.internal.state.b paramb, ha paramha, com.google.android.gms.ads.internal.webview.b paramb1, com.google.android.gms.ads.internal.mediation.client.b paramb2, k paramk, com.google.android.gms.ads.internal.csi.l paraml)
  {
    AdResponseParcel localAdResponseParcel = paramb.b;
    Object localObject;
    String str1;
    if (localAdResponseParcel.h)
    {
      localObject = new n(paramContext, paramb, paramb2, paramk, paraml, paramb1);
      str1 = String.valueOf(localObject.getClass().getName());
      if (str1.length() == 0)
        break label297;
    }
    label297: for (String str2 = "AdRenderer: ".concat(str1); ; str2 = new String("AdRenderer: "))
    {
      c.b(str2);
      ((com.google.android.gms.ads.internal.util.an)localObject).d();
      return localObject;
      if (localAdResponseParcel.t)
      {
        if ((parama instanceof com.google.android.gms.ads.internal.an))
        {
          localObject = new p(paramContext, (com.google.android.gms.ads.internal.an)parama, paramb, paramha, paramk);
          break;
        }
        if (parama != null);
        for (String str3 = parama.getClass().getName(); ; str3 = "null")
        {
          String str4 = String.valueOf(str3);
          throw new IllegalArgumentException(65 + String.valueOf(str4).length() + "Invalid NativeAdManager type. Found: " + str4 + "; Required: NativeAdManager.");
        }
      }
      if (localAdResponseParcel.p)
      {
        localObject = new e(paramContext, paramb, paramb1, paramk);
        break;
      }
      if ((((Boolean)com.google.android.gms.ads.internal.config.m.H.a()).booleanValue()) && (aoq.a(19)) && (!aoq.a(21)) && (paramb1 != null) && (paramb1.k().e))
      {
        localObject = new m(paramContext, paramb, paramb1, paramk);
        break;
      }
      localObject = new l(paramContext, paramb, paramb1, paramk);
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.j
 * JD-Core Version:    0.6.0
 */