package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<ProxyResponse>
{
  static void a(ProxyResponse paramProxyResponse, Parcel paramParcel, int paramInt)
  {
    int i = android.support.v4.app.b.b(paramParcel);
    android.support.v4.app.b.a(paramParcel, 1, paramProxyResponse.b);
    android.support.v4.app.b.a(paramParcel, 1000, paramProxyResponse.a);
    android.support.v4.app.b.a(paramParcel, 2, paramProxyResponse.c, paramInt);
    android.support.v4.app.b.a(paramParcel, 3, paramProxyResponse.d);
    android.support.v4.app.b.a(paramParcel, 4, paramProxyResponse.e);
    android.support.v4.app.b.a(paramParcel, 5, paramProxyResponse.f);
    android.support.v4.app.b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.proxy.b
 * JD-Core Version:    0.6.0
 */