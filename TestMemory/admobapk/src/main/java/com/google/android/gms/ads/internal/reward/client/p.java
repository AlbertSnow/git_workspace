package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;

public final class p
  implements Parcelable.Creator
{
  public static RewardedVideoAdRequestParcel a(Parcel paramParcel)
  {
    int i = aob.a(paramParcel);
    AdRequestParcel localAdRequestParcel = null;
    int j = 0;
    String str = null;
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
        localAdRequestParcel = (AdRequestParcel)aob.a(paramParcel, k, AdRequestParcel.CREATOR);
        break;
      case 3:
        str = aob.h(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new aoc(37 + "Overread allowed size end=" + i, paramParcel);
    return new RewardedVideoAdRequestParcel(j, localAdRequestParcel, str);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.p
 * JD-Core Version:    0.6.0
 */