package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator<InterstitialAdParameterParcel>
{
  public InterstitialAdParameterParcel zza(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    String str = null;
    boolean bool3 = false;
    float f = 0.0F;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 5:
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 6:
        f = zza.zzl(paramParcel, k);
        break;
      default:
        zza.zzb(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    InterstitialAdParameterParcel localInterstitialAdParameterParcel = new InterstitialAdParameterParcel(j, bool1, bool2, str, bool3, f);
    return localInterstitialAdParameterParcel;
  }

  public InterstitialAdParameterParcel[] zzg(int paramInt)
  {
    return new InterstitialAdParameterParcel[paramInt];
  }

  static void zza(InterstitialAdParameterParcel paramInterstitialAdParameterParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramInterstitialAdParameterParcel.versionCode);
    zzb.zza(paramParcel, 2, paramInterstitialAdParameterParcel.zzql);
    zzb.zza(paramParcel, 3, paramInterstitialAdParameterParcel.zzqm);
    zzb.zza(paramParcel, 4, paramInterstitialAdParameterParcel.zzqn, false);
    zzb.zza(paramParcel, 5, paramInterstitialAdParameterParcel.zzqo);
    zzb.zza(paramParcel, 6, paramInterstitialAdParameterParcel.zzqp);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzl
 * JD-Core Version:    0.6.0
 */