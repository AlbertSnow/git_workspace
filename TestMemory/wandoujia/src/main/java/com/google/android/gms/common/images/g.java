package com.google.android.gms.common.images;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class g
  implements Parcelable.Creator<WebImage>
{
  static void a(WebImage paramWebImage, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramWebImage.a());
    b.a(paramParcel, 2, paramWebImage.b(), paramInt);
    b.a(paramParcel, 3, paramWebImage.c());
    b.a(paramParcel, 4, paramWebImage.d());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.images.g
 * JD-Core Version:    0.6.0
 */