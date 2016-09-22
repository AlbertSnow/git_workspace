package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator<CapabilityParcel>
{
  public CapabilityParcel zzk(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    while (paramParcel.dataPosition() < i)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      case 1:
        j = zza.zzg(paramParcel, k);
        break;
      case 2:
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 3:
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 4:
        bool3 = zza.zzc(paramParcel, k);
        break;
      default:
        zza.zzb(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    CapabilityParcel localCapabilityParcel = new CapabilityParcel(j, bool1, bool2, bool3);
    return localCapabilityParcel;
  }

  public CapabilityParcel[] zzI(int paramInt)
  {
    return new CapabilityParcel[paramInt];
  }

  static void zza(CapabilityParcel paramCapabilityParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramCapabilityParcel.versionCode);
    zzb.zza(paramParcel, 2, paramCapabilityParcel.zzIn);
    zzb.zza(paramParcel, 3, paramCapabilityParcel.zzIo);
    zzb.zza(paramParcel, 4, paramCapabilityParcel.zzIp);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzi
 * JD-Core Version:    0.6.0
 */