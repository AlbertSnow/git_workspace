package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator<AdLauncherIntentInfoParcel>
{
  public AdLauncherIntentInfoParcel zzf(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    Intent localIntent = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      case 1:
        j = zza.zzg(paramParcel, k);
        break;
      case 2:
        str1 = zza.zzp(paramParcel, k);
        break;
      case 3:
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4:
        str3 = zza.zzp(paramParcel, k);
        break;
      case 5:
        str4 = zza.zzp(paramParcel, k);
        break;
      case 6:
        str5 = zza.zzp(paramParcel, k);
        break;
      case 7:
        str6 = zza.zzp(paramParcel, k);
        break;
      case 8:
        str7 = zza.zzp(paramParcel, k);
        break;
      case 9:
        localIntent = (Intent)zza.zza(paramParcel, k, Intent.CREATOR);
        break;
      default:
        zza.zzb(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    AdLauncherIntentInfoParcel localAdLauncherIntentInfoParcel = new AdLauncherIntentInfoParcel(j, str1, str2, str3, str4, str5, str6, str7, localIntent);
    return localAdLauncherIntentInfoParcel;
  }

  public AdLauncherIntentInfoParcel[] zzv(int paramInt)
  {
    return new AdLauncherIntentInfoParcel[paramInt];
  }

  static void zza(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, paramAdLauncherIntentInfoParcel.versionCode);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, paramAdLauncherIntentInfoParcel.intentAction, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, paramAdLauncherIntentInfoParcel.url, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, paramAdLauncherIntentInfoParcel.mimeType, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, paramAdLauncherIntentInfoParcel.packageName, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, paramAdLauncherIntentInfoParcel.zzDK, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, paramAdLauncherIntentInfoParcel.zzDL, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, paramAdLauncherIntentInfoParcel.zzDM, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, paramAdLauncherIntentInfoParcel.intent, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzb
 * JD-Core Version:    0.6.0
 */