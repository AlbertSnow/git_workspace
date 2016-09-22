package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class r
  implements Parcelable.Creator<ResolveAccountRequest>
{
  static void a(ResolveAccountRequest paramResolveAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramResolveAccountRequest.a);
    b.a(paramParcel, 2, paramResolveAccountRequest.a(), paramInt);
    b.a(paramParcel, 3, paramResolveAccountRequest.b());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.r
 * JD-Core Version:    0.6.0
 */