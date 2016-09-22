package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class q
  implements Parcelable.Creator<Scope>
{
  static void a(Scope paramScope, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramScope.a);
    b.a(paramParcel, 2, paramScope.a());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.q
 * JD-Core Version:    0.6.0
 */