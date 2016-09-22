package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class a
  implements Parcelable.Creator<ConverterWrapper>
{
  static void a(ConverterWrapper paramConverterWrapper, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramConverterWrapper.a());
    b.a(paramParcel, 2, paramConverterWrapper.b(), paramInt);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.a
 * JD-Core Version:    0.6.0
 */