package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class a
  implements Parcelable.Creator<ProxyRequest>
{
  static void a(ProxyRequest paramProxyRequest, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramProxyRequest.b);
    b.a(paramParcel, 1000, paramProxyRequest.a);
    b.a(paramParcel, 2, paramProxyRequest.c);
    b.a(paramParcel, 3, paramProxyRequest.d);
    b.a(paramParcel, 4, paramProxyRequest.e);
    b.a(paramParcel, 5, paramProxyRequest.f);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.proxy.a
 * JD-Core Version:    0.6.0
 */