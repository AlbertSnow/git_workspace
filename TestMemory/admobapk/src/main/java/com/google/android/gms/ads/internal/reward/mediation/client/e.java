package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;

public final class e
  implements Parcelable.Creator
{
  public static RewardItemParcel a(Parcel paramParcel)
  {
    int i = 0;
    int j = aob.a(paramParcel);
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default:
        aob.b(paramParcel, m);
        break;
      case 1:
        k = aob.d(paramParcel, m);
        break;
      case 2:
        str = aob.h(paramParcel, m);
        break;
      case 3:
        i = aob.d(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new aoc(37 + "Overread allowed size end=" + j, paramParcel);
    return new RewardItemParcel(k, str, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.e
 * JD-Core Version:    0.6.0
 */