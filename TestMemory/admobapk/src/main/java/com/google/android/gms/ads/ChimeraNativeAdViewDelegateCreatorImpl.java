package com.google.android.gms.ads;

import android.os.IBinder;
import android.widget.FrameLayout;
import apj;
import apn;
import com.google.android.gms.ads.internal.formats.client.i;
import com.google.android.gms.ads.internal.formats.u;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraNativeAdViewDelegateCreatorImpl extends i
{
  public final IBinder newNativeAdViewDelegate(apj paramapj1, apj paramapj2, apj paramapj3, int paramInt)
  {
    return new u((FrameLayout)apn.a(paramapj2), (FrameLayout)apn.a(paramapj3));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl
 * JD-Core Version:    0.6.0
 */