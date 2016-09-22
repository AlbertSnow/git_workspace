package com.google.android.gms.ads.adshield;

import android.content.Context;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.adshield.internal.g;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@com.google.android.gms.ads.internal.report.client.a
@DynamiteApi
@RetainForClient
public final class ChimeraAdShieldCreatorImpl extends g
{
  public final IBinder newAdShieldClient(String paramString, apj paramapj)
  {
    return new com.google.android.gms.ads.adshield.internal.a(paramString, (Context)apn.a(paramapj), true);
  }

  public final IBinder newAdShieldClientWithoutAdvertisingId(String paramString, apj paramapj)
  {
    return new com.google.android.gms.ads.adshield.internal.a(paramString, (Context)apn.a(paramapj), false);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl
 * JD-Core Version:    0.6.0
 */