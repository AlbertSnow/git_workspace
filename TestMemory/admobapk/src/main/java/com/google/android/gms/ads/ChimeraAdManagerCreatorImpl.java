package com.google.android.gms.ads;

import amj;
import android.content.Context;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.internal.ab;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.al;
import com.google.android.gms.ads.internal.client.br;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.interstitial.ag;
import com.google.android.gms.ads.internal.mediation.client.b;
import com.google.android.gms.ads.internal.o;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.x;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraAdManagerCreatorImpl extends al
{
  public final IBinder newAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, b paramb, int paramInt)
  {
    if (paramAdSizeParcel.e);
    for (int i = 2; ; i = 1)
      return newAdManagerByType(paramapj, paramAdSizeParcel, paramString, paramb, paramInt, i);
  }

  public final IBinder newAdManagerByType(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, b paramb, int paramInt1, int paramInt2)
  {
    Context localContext = (Context)apn.a(paramapj);
    m.a(localContext);
    d locald1 = m.N;
    if (!((Boolean)bc.a().n.a(locald1)).booleanValue())
      return new br();
    VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(amj.a, paramInt1, false);
    switch (paramInt2)
    {
    default:
      throw new IllegalArgumentException(33 + "Invalid manager type: " + paramInt2);
    case 1:
      return new o(localContext, paramAdSizeParcel, paramString, paramb, localVersionInfoParcel, x.a());
    case 2:
      boolean bool = "reward_mb".equals(paramAdSizeParcel.b);
      if (!bool)
      {
        d locald4 = m.O;
        if (((Boolean)bc.a().n.a(locald4)).booleanValue());
      }
      else
      {
        if (!bool)
          break label238;
        d locald3 = m.P;
        if (!((Boolean)bc.a().n.a(locald3)).booleanValue())
          break label238;
      }
      label238: for (int i = 1; i != 0; i = 0)
        return new ag(localContext, paramString, paramb, localVersionInfoParcel, x.a());
      return new ab(localContext, paramAdSizeParcel, paramString, paramb, localVersionInfoParcel, x.a());
    case 3:
    }
    d locald2 = m.aM;
    if (((Boolean)bc.a().n.a(locald2)).booleanValue())
      return new aw(localContext, paramAdSizeParcel, paramString, localVersionInfoParcel);
    return new br();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.ChimeraAdManagerCreatorImpl
 * JD-Core Version:    0.6.0
 */