package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.b;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public final class a
  implements Parcelable.Creator<LogEvent>
{
  public static LogEvent a(Parcel paramParcel)
  {
    Bundle localBundle = null;
    int i = b.a(paramParcel);
    int j = 0;
    long l = 0L;
    byte[] arrayOfByte = null;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default:
        b.b(paramParcel, k);
        break;
      case 1:
        j = b.d(paramParcel, k);
        break;
      case 2:
        l = b.e(paramParcel, k);
        break;
      case 3:
        str = b.j(paramParcel, k);
        break;
      case 4:
        arrayOfByte = b.m(paramParcel, k);
        break;
      case 5:
        localBundle = b.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    return new LogEvent(j, l, str, arrayOfByte, localBundle);
  }

  static void a(LogEvent paramLogEvent, Parcel paramParcel)
  {
    int i = b.b(paramParcel);
    b.a(paramParcel, 1, paramLogEvent.a);
    b.a(paramParcel, 2, paramLogEvent.b);
    b.a(paramParcel, 3, paramLogEvent.c);
    b.a(paramParcel, 4, paramLogEvent.d);
    b.a(paramParcel, 5, paramLogEvent.e);
    b.r(paramParcel, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.playlog.internal.a
 * JD-Core Version:    0.6.0
 */