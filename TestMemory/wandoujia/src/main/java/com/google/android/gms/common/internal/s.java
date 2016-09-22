package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class s
  implements Parcelable.Creator<ResolveAccountResponse>
{
  static void a(ResolveAccountResponse paramResolveAccountResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramResolveAccountResponse.a);
    b.a(paramParcel, 2, paramResolveAccountResponse.b);
    b.a(paramParcel, 3, paramResolveAccountResponse.b(), paramInt);
    b.a(paramParcel, 4, paramResolveAccountResponse.c());
    b.a(paramParcel, 5, paramResolveAccountResponse.d());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.s
 * JD-Core Version:    0.6.0
 */