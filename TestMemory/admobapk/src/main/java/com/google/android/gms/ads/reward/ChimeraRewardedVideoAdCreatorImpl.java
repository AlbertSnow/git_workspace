package com.google.android.gms.ads.reward;

import amj;
import android.content.Context;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.reward.client.h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.x;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraRewardedVideoAdCreatorImpl extends h
{
  public final IBinder newRewardedVideoAd(apj paramapj, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Context localContext = (Context)apn.a(paramapj);
    VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(amj.a, paramInt, false);
    return new com.google.android.gms.ads.internal.reward.b(localContext, x.a(), paramb, localVersionInfoParcel);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.reward.ChimeraRewardedVideoAdCreatorImpl
 * JD-Core Version:    0.6.0
 */