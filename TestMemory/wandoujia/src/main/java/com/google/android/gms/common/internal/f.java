package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class f
  implements Parcelable.Creator<GetServiceRequest>
{
  static void a(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramGetServiceRequest.a);
    b.a(paramParcel, 2, paramGetServiceRequest.b);
    b.a(paramParcel, 3, paramGetServiceRequest.c);
    b.a(paramParcel, 4, paramGetServiceRequest.d);
    b.a(paramParcel, 5, paramGetServiceRequest.e);
    b.a(paramParcel, 6, paramGetServiceRequest.f, paramInt);
    b.a(paramParcel, 7, paramGetServiceRequest.g);
    b.a(paramParcel, 8, paramGetServiceRequest.h, paramInt);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.f
 * JD-Core Version:    0.6.0
 */