package com.google.android.gms.ads;

import amj;
import android.content.Context;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.internal.aa;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.mediation.client.b;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.x;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraAdLoaderBuilderCreatorImpl extends af
{
  public final IBinder newAdLoaderBuilder(apj paramapj, String paramString, b paramb, int paramInt)
  {
    return new aa((Context)apn.a(paramapj), paramString, paramb, new VersionInfoParcel(amj.a, paramInt, false), x.a());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl
 * JD-Core Version:    0.6.0
 */