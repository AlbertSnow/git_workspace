package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator<StringParcel>
{
  public StringParcel zzm(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
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
        str = zza.zzp(paramParcel, k);
        break;
      default:
        zza.zzb(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    StringParcel localStringParcel = new StringParcel(j, str);
    return localStringParcel;
  }

  public StringParcel[] zzK(int paramInt)
  {
    return new StringParcel[paramInt];
  }

  static void zza(StringParcel paramStringParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramStringParcel.mVersionCode);
    zzb.zza(paramParcel, 2, paramStringParcel.zzxG, false);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzn
 * JD-Core Version:    0.6.0
 */