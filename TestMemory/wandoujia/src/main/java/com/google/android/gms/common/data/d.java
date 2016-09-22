package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class d
  implements Parcelable.Creator<DataHolder>
{
  static void a(DataHolder paramDataHolder, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramDataHolder.c());
    b.a(paramParcel, 1000, paramDataHolder.b());
    b.a(paramParcel, 2, paramDataHolder.d(), paramInt);
    b.a(paramParcel, 3, paramDataHolder.e());
    b.a(paramParcel, 4, paramDataHolder.f());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.data.d
 * JD-Core Version:    0.6.0
 */