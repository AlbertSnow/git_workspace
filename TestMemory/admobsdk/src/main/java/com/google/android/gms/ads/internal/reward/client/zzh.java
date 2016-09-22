package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator<RewardedVideoAdRequestParcel>
{
  public RewardedVideoAdRequestParcel zzn(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    AdRequestParcel localAdRequestParcel = null;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      case 1:
        j = zza.zzg(paramParcel, k);
        break;
      case 2:
        localAdRequestParcel = (AdRequestParcel)zza.zza(paramParcel, k, AdRequestParcel.CREATOR);
        break;
      case 3:
        str = zza.zzp(paramParcel, k);
        break;
      default:
        zza.zzb(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    RewardedVideoAdRequestParcel localRewardedVideoAdRequestParcel = new RewardedVideoAdRequestParcel(j, localAdRequestParcel, str);
    return localRewardedVideoAdRequestParcel;
  }

  public RewardedVideoAdRequestParcel[] zzM(int paramInt)
  {
    return new RewardedVideoAdRequestParcel[paramInt];
  }

  static void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramRewardedVideoAdRequestParcel.versionCode);
    zzb.zza(paramParcel, 2, paramRewardedVideoAdRequestParcel.zzHt, paramInt, false);
    zzb.zza(paramParcel, 3, paramRewardedVideoAdRequestParcel.zzrj, false);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zzh
 * JD-Core Version:    0.6.0
 */