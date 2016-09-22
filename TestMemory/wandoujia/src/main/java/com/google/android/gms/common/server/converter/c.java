package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<StringToIntConverter.Entry>
{
  static void a(StringToIntConverter.Entry paramEntry, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramEntry.a);
    b.a(paramParcel, 2, paramEntry.b);
    b.a(paramParcel, 3, paramEntry.c);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.c
 * JD-Core Version:    0.6.0
 */