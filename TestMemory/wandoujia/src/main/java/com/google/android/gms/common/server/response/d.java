package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class d
  implements Parcelable.Creator<FieldMappingDictionary>
{
  static void a(FieldMappingDictionary paramFieldMappingDictionary, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramFieldMappingDictionary.a());
    b.a(paramParcel, 2, paramFieldMappingDictionary.b());
    b.a(paramParcel, 3, paramFieldMappingDictionary.c());
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.d
 * JD-Core Version:    0.6.0
 */