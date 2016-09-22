package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import apj;
import com.google.android.gms.ads.internal.mediation.client.b;

public abstract interface ak extends IInterface
{
  public abstract IBinder newAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, b paramb, int paramInt);

  public abstract IBinder newAdManagerByType(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, b paramb, int paramInt1, int paramInt2);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ak
 * JD-Core Version:    0.6.0
 */