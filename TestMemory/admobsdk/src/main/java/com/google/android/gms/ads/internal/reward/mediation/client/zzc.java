package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator<RewardItemParcel>
{
  public RewardItemParcel zzo(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      case 1:
        j = zza.zzg(paramParcel, m);
        break;
      case 2:
        str = zza.zzp(paramParcel, m);
        break;
      case 3:
        k = zza.zzg(paramParcel, m);
        break;
      default:
        zza.zzb(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    RewardItemParcel localRewardItemParcel = new RewardItemParcel(j, str, k);
    return localRewardItemParcel;
  }

  public RewardItemParcel[] zzO(int paramInt)
  {
    return new RewardItemParcel[paramInt];
  }

  static void zza(RewardItemParcel paramRewardItemParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramRewardItemParcel.versionCode);
    zzb.zza(paramParcel, 2, paramRewardItemParcel.type, false);
    zzb.zzc(paramParcel, 3, paramRewardItemParcel.zzKS);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.zzc
 * JD-Core Version:    0.6.0
 */