package com.google.android.gms.ads;

import android.app.Activity;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.overlay.client.f;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraAdOverlayCreatorImpl extends f
{
  public final IBinder newAdOverlay(apj paramapj)
  {
    return new ab((Activity)apn.a(paramapj));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl
 * JD-Core Version:    0.6.0
 */