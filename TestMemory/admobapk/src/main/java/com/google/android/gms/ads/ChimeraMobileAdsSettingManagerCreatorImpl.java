package com.google.android.gms.ads;

import amj;
import android.content.Context;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.internal.al;
import com.google.android.gms.ads.internal.client.ba;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraMobileAdsSettingManagerCreatorImpl extends ba
{
  public final IBinder getMobileAdsSettingManager(apj paramapj, int paramInt)
  {
    VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(amj.a, paramInt, false);
    return al.a((Context)apn.a(paramapj), localVersionInfoParcel);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl
 * JD-Core Version:    0.6.0
 */