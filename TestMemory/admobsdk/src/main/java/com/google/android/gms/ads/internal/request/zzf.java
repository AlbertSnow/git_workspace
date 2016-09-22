package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzf
  implements Parcelable.Creator<AdRequestInfoParcel>
{
  public AdRequestInfoParcel zzi(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
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
    boolean bool = false;
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
    int i1 = 0;
    int i2 = 0;
    while (paramParcel.dataPosition() < i)
    {
      int i3 = zza.zzat(paramParcel);
      switch (zza.zzca(i3))
      {
      case 1:
        j = zza.zzg(paramParcel, i3);
        break;
      case 2:
        localBundle1 = zza.zzr(paramParcel, i3);
        break;
      case 3:
        localAdRequestParcel = (AdRequestParcel)zza.zza(paramParcel, i3, AdRequestParcel.CREATOR);
        break;
      case 4:
        localAdSizeParcel = (AdSizeParcel)zza.zza(paramParcel, i3, AdSizeParcel.CREATOR);
        break;
      case 5:
        str1 = zza.zzp(paramParcel, i3);
        break;
      case 6:
        localApplicationInfo = (ApplicationInfo)zza.zza(paramParcel, i3, ApplicationInfo.CREATOR);
        break;
      case 7:
        localPackageInfo = (PackageInfo)zza.zza(paramParcel, i3, PackageInfo.CREATOR);
        break;
      case 8:
        str2 = zza.zzp(paramParcel, i3);
        break;
      case 9:
        str3 = zza.zzp(paramParcel, i3);
        break;
      case 10:
        str4 = zza.zzp(paramParcel, i3);
        break;
      case 11:
        localVersionInfoParcel = (VersionInfoParcel)zza.zza(paramParcel, i3, VersionInfoParcel.CREATOR);
        break;
      case 12:
        localBundle2 = zza.zzr(paramParcel, i3);
        break;
      case 13:
        k = zza.zzg(paramParcel, i3);
        break;
      case 14:
        localArrayList1 = zza.zzD(paramParcel, i3);
        break;
      case 15:
        localBundle3 = zza.zzr(paramParcel, i3);
        break;
      case 17:
        localMessenger = (Messenger)zza.zza(paramParcel, i3, Messenger.CREATOR);
        break;
      case 16:
        bool = zza.zzc(paramParcel, i3);
        break;
      case 19:
        n = zza.zzg(paramParcel, i3);
        break;
      case 18:
        m = zza.zzg(paramParcel, i3);
        break;
      case 21:
        str5 = zza.zzp(paramParcel, i3);
        break;
      case 20:
        f1 = zza.zzl(paramParcel, i3);
        break;
      case 25:
        l1 = zza.zzi(paramParcel, i3);
        break;
      case 27:
        localArrayList2 = zza.zzD(paramParcel, i3);
        break;
      case 26:
        str6 = zza.zzp(paramParcel, i3);
        break;
      case 29:
        localNativeAdOptionsParcel = (NativeAdOptionsParcel)zza.zza(paramParcel, i3, NativeAdOptionsParcel.CREATOR);
        break;
      case 28:
        str7 = zza.zzp(paramParcel, i3);
        break;
      case 31:
        l2 = zza.zzi(paramParcel, i3);
        break;
      case 30:
        localArrayList3 = zza.zzD(paramParcel, i3);
        break;
      case 34:
        f2 = zza.zzl(paramParcel, i3);
        break;
      case 35:
        i1 = zza.zzg(paramParcel, i3);
        break;
      case 32:
        localCapabilityParcel = (CapabilityParcel)zza.zza(paramParcel, i3, CapabilityParcel.CREATOR);
        break;
      case 33:
        str8 = zza.zzp(paramParcel, i3);
        break;
      case 36:
        i2 = zza.zzg(paramParcel, i3);
        break;
      case 22:
      case 23:
      case 24:
      default:
        zza.zzb(paramParcel, i3);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    AdRequestInfoParcel localAdRequestInfoParcel = new AdRequestInfoParcel(j, localBundle1, localAdRequestParcel, localAdSizeParcel, str1, localApplicationInfo, localPackageInfo, str2, str3, str4, localVersionInfoParcel, localBundle2, k, localArrayList1, localBundle3, bool, localMessenger, m, n, f1, str5, l1, str6, localArrayList2, str7, localNativeAdOptionsParcel, localArrayList3, l2, localCapabilityParcel, str8, f2, i1, i2);
    return localAdRequestInfoParcel;
  }

  public AdRequestInfoParcel[] zzG(int paramInt)
  {
    return new AdRequestInfoParcel[paramInt];
  }

  static void zza(AdRequestInfoParcel paramAdRequestInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramAdRequestInfoParcel.versionCode);
    zzb.zza(paramParcel, 2, paramAdRequestInfoParcel.zzHs, false);
    zzb.zza(paramParcel, 3, paramAdRequestInfoParcel.zzHt, paramInt, false);
    zzb.zza(paramParcel, 4, paramAdRequestInfoParcel.zzrp, paramInt, false);
    zzb.zza(paramParcel, 5, paramAdRequestInfoParcel.zzrj, false);
    zzb.zza(paramParcel, 6, paramAdRequestInfoParcel.applicationInfo, paramInt, false);
    zzb.zza(paramParcel, 7, paramAdRequestInfoParcel.zzHu, paramInt, false);
    zzb.zza(paramParcel, 8, paramAdRequestInfoParcel.zzHv, false);
    zzb.zza(paramParcel, 9, paramAdRequestInfoParcel.zzHw, false);
    zzb.zza(paramParcel, 10, paramAdRequestInfoParcel.zzHx, false);
    zzb.zza(paramParcel, 11, paramAdRequestInfoParcel.zzrl, paramInt, false);
    zzb.zza(paramParcel, 12, paramAdRequestInfoParcel.zzHy, false);
    zzb.zzc(paramParcel, 13, paramAdRequestInfoParcel.zzHz);
    zzb.zzb(paramParcel, 14, paramAdRequestInfoParcel.zzrH, false);
    zzb.zza(paramParcel, 15, paramAdRequestInfoParcel.zzHA, false);
    zzb.zza(paramParcel, 17, paramAdRequestInfoParcel.zzHC, paramInt, false);
    zzb.zza(paramParcel, 16, paramAdRequestInfoParcel.zzHB);
    zzb.zzc(paramParcel, 19, paramAdRequestInfoParcel.zzHE);
    zzb.zzc(paramParcel, 18, paramAdRequestInfoParcel.zzHD);
    zzb.zza(paramParcel, 21, paramAdRequestInfoParcel.zzHG, false);
    zzb.zza(paramParcel, 20, paramAdRequestInfoParcel.zzHF);
    zzb.zza(paramParcel, 25, paramAdRequestInfoParcel.zzHH);
    zzb.zzb(paramParcel, 27, paramAdRequestInfoParcel.zzHJ, false);
    zzb.zza(paramParcel, 26, paramAdRequestInfoParcel.zzHI, false);
    zzb.zza(paramParcel, 29, paramAdRequestInfoParcel.zzrD, paramInt, false);
    zzb.zza(paramParcel, 28, paramAdRequestInfoParcel.zzri, false);
    zzb.zza(paramParcel, 31, paramAdRequestInfoParcel.zzHL);
    zzb.zzb(paramParcel, 30, paramAdRequestInfoParcel.zzHK, false);
    zzb.zza(paramParcel, 34, paramAdRequestInfoParcel.zzHO);
    zzb.zzc(paramParcel, 35, paramAdRequestInfoParcel.zzHP);
    zzb.zza(paramParcel, 32, paramAdRequestInfoParcel.zzHM, paramInt, false);
    zzb.zza(paramParcel, 33, paramAdRequestInfoParcel.zzHN, false);
    zzb.zzc(paramParcel, 36, paramAdRequestInfoParcel.zzHQ);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzf
 * JD-Core Version:    0.6.0
 */