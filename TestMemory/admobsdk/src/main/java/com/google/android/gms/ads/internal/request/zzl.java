package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator<LargeParcelTeleporter>
{
  public LargeParcelTeleporter zzl(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    ParcelFileDescriptor localParcelFileDescriptor = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      case 1:
        j = zza.zzg(paramParcel, k);
        break;
      case 2:
        localParcelFileDescriptor = (ParcelFileDescriptor)zza.zza(paramParcel, k, ParcelFileDescriptor.CREATOR);
        break;
      default:
        zza.zzb(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    LargeParcelTeleporter localLargeParcelTeleporter = new LargeParcelTeleporter(j, localParcelFileDescriptor);
    return localLargeParcelTeleporter;
  }

  public LargeParcelTeleporter[] zzJ(int paramInt)
  {
    return new LargeParcelTeleporter[paramInt];
  }

  static void zza(LargeParcelTeleporter paramLargeParcelTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramLargeParcelTeleporter.mVersionCode);
    zzb.zza(paramParcel, 2, paramLargeParcelTeleporter.zzIq, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzl
 * JD-Core Version:    0.6.0
 */