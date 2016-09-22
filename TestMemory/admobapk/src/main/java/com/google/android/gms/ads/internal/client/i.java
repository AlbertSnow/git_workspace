package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;

public final class i
  implements Parcelable.Creator
{
  public static AdSizeParcel a(Parcel paramParcel)
  {
    AdSizeParcel[] arrayOfAdSizeParcel = null;
    boolean bool1 = false;
    int i = aob.a(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    int k = 0;
    boolean bool4 = false;
    int m = 0;
    int n = 0;
    String str = null;
    int i1 = 0;
    while (paramParcel.dataPosition() < i)
    {
      int i2 = paramParcel.readInt();
      switch (0xFFFF & i2)
      {
      default:
        aob.b(paramParcel, i2);
        break;
      case 1:
        i1 = aob.d(paramParcel, i2);
        break;
      case 2:
        str = aob.h(paramParcel, i2);
        break;
      case 3:
        n = aob.d(paramParcel, i2);
        break;
      case 4:
        m = aob.d(paramParcel, i2);
        break;
      case 5:
        bool4 = aob.c(paramParcel, i2);
        break;
      case 6:
        k = aob.d(paramParcel, i2);
        break;
      case 7:
        j = aob.d(paramParcel, i2);
        break;
      case 8:
        arrayOfAdSizeParcel = (AdSizeParcel[])aob.b(paramParcel, i2, AdSizeParcel.CREATOR);
        break;
      case 9:
        bool3 = aob.c(paramParcel, i2);
        break;
      case 10:
        bool2 = aob.c(paramParcel, i2);
        break;
      case 11:
        bool1 = aob.c(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new aoc(37 + "Overread allowed size end=" + i, paramParcel);
    return new AdSizeParcel(i1, str, n, m, bool4, k, j, arrayOfAdSizeParcel, bool3, bool2, bool1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.i
 * JD-Core Version:    0.6.0
 */