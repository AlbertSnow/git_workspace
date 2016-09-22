package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;

public final class t
  implements Parcelable.Creator
{
  public static NativeAdOptionsParcel a(Parcel paramParcel)
  {
    int i = 0;
    int j = aob.a(paramParcel);
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      default:
        aob.b(paramParcel, n);
        break;
      case 1:
        m = aob.d(paramParcel, n);
        break;
      case 2:
        bool2 = aob.c(paramParcel, n);
        break;
      case 3:
        k = aob.d(paramParcel, n);
        break;
      case 4:
        bool1 = aob.c(paramParcel, n);
        break;
      case 5:
        i = aob.d(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new aoc(37 + "Overread allowed size end=" + j, paramParcel);
    return new NativeAdOptionsParcel(m, bool2, k, bool1, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.t
 * JD-Core Version:    0.6.0
 */