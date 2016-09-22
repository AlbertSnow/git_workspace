package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class f
  implements Parcelable.Creator<SafeParcelResponse>
{
  static void a(SafeParcelResponse paramSafeParcelResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramSafeParcelResponse.d());
    b.a(paramParcel, paramSafeParcelResponse.e());
    b.a(paramParcel, 3, paramSafeParcelResponse.f(), paramInt);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.f
 * JD-Core Version:    0.6.0
 */