package com.google.android.gms.ads;

import android.app.Activity;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.internal.purchase.client.k;
import com.google.android.gms.ads.internal.purchase.f;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraInAppPurchaseManagerCreatorImpl extends k
{
  public final IBinder newInAppPurchaseManager(apj paramapj)
  {
    return new f((Activity)apn.a(paramapj));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.ChimeraInAppPurchaseManagerCreatorImpl
 * JD-Core Version:    0.6.0
 */