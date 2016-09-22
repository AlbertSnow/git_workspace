package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.IInterface;
import apj;

public abstract interface f extends IInterface
{
  public abstract IBinder newAdShieldClient(String paramString, apj paramapj);

  public abstract IBinder newAdShieldClientWithoutAdvertisingId(String paramString, apj paramapj);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.adshield.internal.f
 * JD-Core Version:    0.6.0
 */