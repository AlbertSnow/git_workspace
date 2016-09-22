package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class c
  implements Parcelable.Creator<FieldMappingDictionary.FieldMapPair>
{
  static void a(FieldMappingDictionary.FieldMapPair paramFieldMapPair, Parcel paramParcel, int paramInt)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramFieldMapPair.a);
    b.a(paramParcel, 2, paramFieldMapPair.b);
    b.a(paramParcel, 3, paramFieldMapPair.c, paramInt);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.c
 * JD-Core Version:    0.6.0
 */