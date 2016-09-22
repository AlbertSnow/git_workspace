package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<BitmapTeleporter>
{
  static void a(BitmapTeleporter paramBitmapTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramBitmapTeleporter.a);
    b.a(paramParcel, 2, paramBitmapTeleporter.b, paramInt);
    b.a(paramParcel, 3, paramBitmapTeleporter.c);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.data.c
 * JD-Core Version:    0.6.0
 */