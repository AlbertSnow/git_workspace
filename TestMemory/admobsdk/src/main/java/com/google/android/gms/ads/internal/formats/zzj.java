package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator<NativeAdOptionsParcel>
{
  public NativeAdOptionsParcel zze(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    while (paramParcel.dataPosition() < i)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      case 1:
        j = zza.zzg(paramParcel, m);
        break;
      case 2:
        bool1 = zza.zzc(paramParcel, m);
        break;
      case 3:
        k = zza.zzg(paramParcel, m);
        break;
      case 4:
        bool2 = zza.zzc(paramParcel, m);
        break;
      default:
        zza.zzb(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    NativeAdOptionsParcel localNativeAdOptionsParcel = new NativeAdOptionsParcel(j, bool1, k, bool2);
    return localNativeAdOptionsParcel;
  }

  public NativeAdOptionsParcel[] zzp(int paramInt)
  {
    return new NativeAdOptionsParcel[paramInt];
  }

  static void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramNativeAdOptionsParcel.versionCode);
    zzb.zza(paramParcel, 2, paramNativeAdOptionsParcel.zzyA);
    zzb.zzc(paramParcel, 3, paramNativeAdOptionsParcel.zzyB);
    zzb.zza(paramParcel, 4, paramNativeAdOptionsParcel.zzyC);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzj
 * JD-Core Version:    0.6.0
 */