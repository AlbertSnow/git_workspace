package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;

public final class a
  implements Parcelable.Creator<FavaDiagnosticsEntity>
{
  static void a(FavaDiagnosticsEntity paramFavaDiagnosticsEntity, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramFavaDiagnosticsEntity.a);
    b.a(paramParcel, 2, paramFavaDiagnosticsEntity.b);
    b.a(paramParcel, 3, paramFavaDiagnosticsEntity.c);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.a
 * JD-Core Version:    0.6.0
 */