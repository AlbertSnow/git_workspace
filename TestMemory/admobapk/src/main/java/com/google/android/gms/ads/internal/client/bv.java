package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;

public final class bv
  implements Parcelable.Creator
{
  public static VideoOptionsParcel a(Parcel paramParcel)
  {
    boolean bool = false;
    int i = aob.a(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default:
        aob.b(paramParcel, k);
        break;
      case 1:
        j = aob.d(paramParcel, k);
        break;
      case 2:
        bool = aob.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new aoc(37 + "Overread allowed size end=" + i, paramParcel);
    return new VideoOptionsParcel(j, bool);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.bv
 * JD-Core Version:    0.6.0
 */