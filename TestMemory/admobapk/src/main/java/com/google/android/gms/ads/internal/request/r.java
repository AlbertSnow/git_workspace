package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

public final class r
  implements Parcelable.Creator
{
  public static AdRequestInfoParcel a(Parcel paramParcel)
  {
    int i = aob.a(paramParcel);
    int j = 0;
    Bundle localBundle1 = null;
    AdRequestParcel localAdRequestParcel = null;
    AdSizeParcel localAdSizeParcel = null;
    String str1 = null;
    ApplicationInfo localApplicationInfo = null;
    PackageInfo localPackageInfo = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    VersionInfoParcel localVersionInfoParcel = null;
    Bundle localBundle2 = null;
    int k = 0;
    ArrayList localArrayList1 = null;
    Bundle localBundle3 = null;
    boolean bool1 = false;
    Messenger localMessenger = null;
    int m = 0;
    int n = 0;
    float f1 = 0.0F;
    String str5 = null;
    long l1 = 0L;
    String str6 = null;
    ArrayList localArrayList2 = null;
    String str7 = null;
    NativeAdOptionsParcel localNativeAdOptionsParcel = null;
    ArrayList localArrayList3 = null;
    long l2 = 0L;
    CapabilityParcel localCapabilityParcel = null;
    String str8 = null;
    float f2 = 0.0F;
    boolean bool2 = false;
    int i1 = 0;
    int i2 = 0;
    boolean bool3 = false;
    boolean bool4 = false;
    String str9 = null;
    String str10 = null;
    boolean bool5 = false;
    int i3 = 0;
    Bundle localBundle4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int i4 = paramParcel.readInt();
      switch (0xFFFF & i4)
      {
      case 22:
      case 23:
      case 24:
      default:
        aob.b(paramParcel, i4);
        break;
      case 1:
        j = aob.d(paramParcel, i4);
        break;
      case 2:
        localBundle1 = aob.j(paramParcel, i4);
        break;
      case 3:
        localAdRequestParcel = (AdRequestParcel)aob.a(paramParcel, i4, AdRequestParcel.CREATOR);
        break;
      case 4:
        localAdSizeParcel = (AdSizeParcel)aob.a(paramParcel, i4, AdSizeParcel.CREATOR);
        break;
      case 5:
        str1 = aob.h(paramParcel, i4);
        break;
      case 6:
        localApplicationInfo = (ApplicationInfo)aob.a(paramParcel, i4, ApplicationInfo.CREATOR);
        break;
      case 7:
        localPackageInfo = (PackageInfo)aob.a(paramParcel, i4, PackageInfo.CREATOR);
        break;
      case 8:
        str2 = aob.h(paramParcel, i4);
        break;
      case 9:
        str3 = aob.h(paramParcel, i4);
        break;
      case 10:
        str4 = aob.h(paramParcel, i4);
        break;
      case 11:
        localVersionInfoParcel = (VersionInfoParcel)aob.a(paramParcel, i4, VersionInfoParcel.CREATOR);
        break;
      case 12:
        localBundle2 = aob.j(paramParcel, i4);
        break;
      case 13:
        k = aob.d(paramParcel, i4);
        break;
      case 14:
        localArrayList1 = aob.m(paramParcel, i4);
        break;
      case 15:
        localBundle3 = aob.j(paramParcel, i4);
        break;
      case 16:
        bool1 = aob.c(paramParcel, i4);
        break;
      case 17:
        localMessenger = (Messenger)aob.a(paramParcel, i4, Messenger.CREATOR);
        break;
      case 18:
        m = aob.d(paramParcel, i4);
        break;
      case 19:
        n = aob.d(paramParcel, i4);
        break;
      case 20:
        f1 = aob.g(paramParcel, i4);
        break;
      case 21:
        str5 = aob.h(paramParcel, i4);
        break;
      case 25:
        l1 = aob.f(paramParcel, i4);
        break;
      case 26:
        str6 = aob.h(paramParcel, i4);
        break;
      case 27:
        localArrayList2 = aob.m(paramParcel, i4);
        break;
      case 28:
        str7 = aob.h(paramParcel, i4);
        break;
      case 29:
        localNativeAdOptionsParcel = (NativeAdOptionsParcel)aob.a(paramParcel, i4, NativeAdOptionsParcel.CREATOR);
        break;
      case 30:
        localArrayList3 = aob.m(paramParcel, i4);
        break;
      case 31:
        l2 = aob.f(paramParcel, i4);
        break;
      case 32:
        localCapabilityParcel = (CapabilityParcel)aob.a(paramParcel, i4, CapabilityParcel.CREATOR);
        break;
      case 33:
        str8 = aob.h(paramParcel, i4);
        break;
      case 34:
        f2 = aob.g(paramParcel, i4);
        break;
      case 35:
        i1 = aob.d(paramParcel, i4);
        break;
      case 36:
        i2 = aob.d(paramParcel, i4);
        break;
      case 37:
        bool3 = aob.c(paramParcel, i4);
        break;
      case 38:
        bool4 = aob.c(paramParcel, i4);
        break;
      case 39:
        str9 = aob.h(paramParcel, i4);
        break;
      case 40:
        bool2 = aob.c(paramParcel, i4);
        break;
      case 41:
        str10 = aob.h(paramParcel, i4);
        break;
      case 42:
        bool5 = aob.c(paramParcel, i4);
        break;
      case 43:
        i3 = aob.d(paramParcel, i4);
        break;
      case 44:
        localBundle4 = aob.j(paramParcel, i4);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new aoc(37 + "Overread allowed size end=" + i, paramParcel);
    return new AdRequestInfoParcel(j, localBundle1, localAdRequestParcel, localAdSizeParcel, str1, localApplicationInfo, localPackageInfo, str2, str3, str4, localVersionInfoParcel, localBundle2, k, localArrayList1, localBundle3, bool1, localMessenger, m, n, f1, str5, l1, str6, localArrayList2, str7, localNativeAdOptionsParcel, localArrayList3, l2, localCapabilityParcel, str8, f2, bool2, i1, i2, bool3, bool4, str9, str10, bool5, i3, localBundle4);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.r
 * JD-Core Version:    0.6.0
 */