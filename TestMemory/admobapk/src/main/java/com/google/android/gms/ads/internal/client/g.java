package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aob;
import aoc;
import java.util.ArrayList;

public final class g
  implements Parcelable.Creator
{
  public static AdRequestParcel a(Parcel paramParcel)
  {
    int i = aob.a(paramParcel);
    int j = 0;
    long l = 0L;
    Bundle localBundle1 = null;
    int k = 0;
    ArrayList localArrayList1 = null;
    boolean bool1 = false;
    int m = 0;
    boolean bool2 = false;
    String str1 = null;
    SearchAdRequestParcel localSearchAdRequestParcel = null;
    Location localLocation = null;
    String str2 = null;
    Bundle localBundle2 = null;
    Bundle localBundle3 = null;
    ArrayList localArrayList2 = null;
    String str3 = null;
    String str4 = null;
    boolean bool3 = false;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      default:
        aob.b(paramParcel, n);
        break;
      case 1:
        j = aob.d(paramParcel, n);
        break;
      case 2:
        l = aob.f(paramParcel, n);
        break;
      case 3:
        localBundle1 = aob.j(paramParcel, n);
        break;
      case 4:
        k = aob.d(paramParcel, n);
        break;
      case 5:
        localArrayList1 = aob.m(paramParcel, n);
        break;
      case 6:
        bool1 = aob.c(paramParcel, n);
        break;
      case 7:
        m = aob.d(paramParcel, n);
        break;
      case 8:
        bool2 = aob.c(paramParcel, n);
        break;
      case 9:
        str1 = aob.h(paramParcel, n);
        break;
      case 10:
        localSearchAdRequestParcel = (SearchAdRequestParcel)aob.a(paramParcel, n, SearchAdRequestParcel.CREATOR);
        break;
      case 11:
        localLocation = (Location)aob.a(paramParcel, n, Location.CREATOR);
        break;
      case 12:
        str2 = aob.h(paramParcel, n);
        break;
      case 13:
        localBundle2 = aob.j(paramParcel, n);
        break;
      case 14:
        localBundle3 = aob.j(paramParcel, n);
        break;
      case 15:
        localArrayList2 = aob.m(paramParcel, n);
        break;
      case 16:
        str3 = aob.h(paramParcel, n);
        break;
      case 17:
        str4 = aob.h(paramParcel, n);
        break;
      case 18:
        bool3 = aob.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new aoc(37 + "Overread allowed size end=" + i, paramParcel);
    return new AdRequestParcel(j, l, localBundle1, k, localArrayList1, bool1, m, bool2, str1, localSearchAdRequestParcel, localLocation, str2, localBundle2, localBundle3, localArrayList2, str3, str4, bool3);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.g
 * JD-Core Version:    0.6.0
 */