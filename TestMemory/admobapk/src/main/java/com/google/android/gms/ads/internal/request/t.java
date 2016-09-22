package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.ArrayList;

public final class t
  implements Parcelable.Creator
{
  public static AdResponseParcel a(Parcel paramParcel)
  {
    int i = aob.a(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    ArrayList localArrayList1 = null;
    int k = 0;
    ArrayList localArrayList2 = null;
    long l1 = 0L;
    boolean bool1 = false;
    long l2 = 0L;
    ArrayList localArrayList3 = null;
    long l3 = 0L;
    int m = 0;
    String str3 = null;
    long l4 = 0L;
    String str4 = null;
    boolean bool2 = false;
    String str5 = null;
    String str6 = null;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    LargeParcelTeleporter localLargeParcelTeleporter = null;
    String str7 = null;
    String str8 = null;
    boolean bool8 = false;
    boolean bool9 = false;
    RewardItemParcel localRewardItemParcel = null;
    ArrayList localArrayList4 = null;
    ArrayList localArrayList5 = null;
    boolean bool10 = false;
    AutoClickProtectionConfigurationParcel localAutoClickProtectionConfigurationParcel = null;
    boolean bool11 = false;
    String str9 = null;
    ArrayList localArrayList6 = null;
    String str10 = null;
    boolean bool12 = false;
    String str11 = null;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      case 16:
      case 17:
      case 20:
      case 27:
      default:
        aob.b(paramParcel, n);
        break;
      case 1:
        j = aob.d(paramParcel, n);
        break;
      case 2:
        str1 = aob.h(paramParcel, n);
        break;
      case 3:
        str2 = aob.h(paramParcel, n);
        break;
      case 4:
        localArrayList1 = aob.m(paramParcel, n);
        break;
      case 5:
        k = aob.d(paramParcel, n);
        break;
      case 6:
        localArrayList2 = aob.m(paramParcel, n);
        break;
      case 7:
        l1 = aob.f(paramParcel, n);
        break;
      case 8:
        bool1 = aob.c(paramParcel, n);
        break;
      case 9:
        l2 = aob.f(paramParcel, n);
        break;
      case 10:
        localArrayList3 = aob.m(paramParcel, n);
        break;
      case 11:
        l3 = aob.f(paramParcel, n);
        break;
      case 12:
        m = aob.d(paramParcel, n);
        break;
      case 13:
        str3 = aob.h(paramParcel, n);
        break;
      case 14:
        l4 = aob.f(paramParcel, n);
        break;
      case 15:
        str4 = aob.h(paramParcel, n);
        break;
      case 18:
        bool2 = aob.c(paramParcel, n);
        break;
      case 19:
        str5 = aob.h(paramParcel, n);
        break;
      case 21:
        str6 = aob.h(paramParcel, n);
        break;
      case 22:
        bool3 = aob.c(paramParcel, n);
        break;
      case 23:
        bool4 = aob.c(paramParcel, n);
        break;
      case 24:
        bool5 = aob.c(paramParcel, n);
        break;
      case 25:
        bool6 = aob.c(paramParcel, n);
        break;
      case 26:
        bool7 = aob.c(paramParcel, n);
        break;
      case 28:
        localLargeParcelTeleporter = (LargeParcelTeleporter)aob.a(paramParcel, n, LargeParcelTeleporter.CREATOR);
        break;
      case 29:
        str7 = aob.h(paramParcel, n);
        break;
      case 30:
        str8 = aob.h(paramParcel, n);
        break;
      case 31:
        bool8 = aob.c(paramParcel, n);
        break;
      case 32:
        bool9 = aob.c(paramParcel, n);
        break;
      case 33:
        localRewardItemParcel = (RewardItemParcel)aob.a(paramParcel, n, RewardItemParcel.CREATOR);
        break;
      case 34:
        localArrayList4 = aob.m(paramParcel, n);
        break;
      case 35:
        localArrayList5 = aob.m(paramParcel, n);
        break;
      case 36:
        bool10 = aob.c(paramParcel, n);
        break;
      case 37:
        localAutoClickProtectionConfigurationParcel = (AutoClickProtectionConfigurationParcel)aob.a(paramParcel, n, AutoClickProtectionConfigurationParcel.CREATOR);
        break;
      case 38:
        bool11 = aob.c(paramParcel, n);
        break;
      case 39:
        str9 = aob.h(paramParcel, n);
        break;
      case 40:
        localArrayList6 = aob.m(paramParcel, n);
        break;
      case 41:
        str10 = aob.h(paramParcel, n);
        break;
      case 42:
        bool12 = aob.c(paramParcel, n);
        break;
      case 43:
        str11 = aob.h(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new aoc(37 + "Overread allowed size end=" + i, paramParcel);
    return new AdResponseParcel(j, str1, str2, localArrayList1, k, localArrayList2, l1, bool1, l2, localArrayList3, l3, m, str3, l4, str4, bool2, str5, str6, bool3, bool4, bool5, bool6, bool7, localLargeParcelTeleporter, str7, str8, bool8, bool9, localRewardItemParcel, localArrayList4, localArrayList5, bool10, localAutoClickProtectionConfigurationParcel, bool11, str9, localArrayList6, str10, bool12, str11);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.t
 * JD-Core Version:    0.6.0
 */