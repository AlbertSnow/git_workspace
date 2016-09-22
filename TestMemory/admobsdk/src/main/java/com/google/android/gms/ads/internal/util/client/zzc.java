package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator<VersionInfoParcel>
{
  public VersionInfoParcel zzp(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    String str = null;
    int k = 0;
    int m = 0;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      case 1:
        j = zza.zzg(paramParcel, n);
        break;
      case 2:
        str = zza.zzp(paramParcel, n);
        break;
      case 3:
        k = zza.zzg(paramParcel, n);
        break;
      case 4:
        m = zza.zzg(paramParcel, n);
        break;
      case 5:
        bool = zza.zzc(paramParcel, n);
        break;
      default:
        zza.zzb(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(j, str, k, m, bool);
    return localVersionInfoParcel;
  }

  public VersionInfoParcel[] zzR(int paramInt)
  {
    return new VersionInfoParcel[paramInt];
  }

  static void zza(VersionInfoParcel paramVersionInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramVersionInfoParcel.versionCode);
    zzb.zza(paramParcel, 2, paramVersionInfoParcel.afmaVersion, false);
    zzb.zzc(paramParcel, 3, paramVersionInfoParcel.zzMZ);
    zzb.zzc(paramParcel, 4, paramVersionInfoParcel.zzNa);
    zzb.zza(paramParcel, 5, paramVersionInfoParcel.zzNb);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.client.zzc
 * JD-Core Version:    0.6.0
 */