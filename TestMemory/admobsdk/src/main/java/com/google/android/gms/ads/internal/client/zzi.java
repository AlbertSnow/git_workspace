package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator<AdSizeParcel>
{
  public AdSizeParcel zzc(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    String str = null;
    int k = 0;
    int m = 0;
    boolean bool1 = false;
    int n = 0;
    int i1 = 0;
    AdSizeParcel[] arrayOfAdSizeParcel = null;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    while (paramParcel.dataPosition() < i)
    {
      int i2 = zza.zzat(paramParcel);
      switch (zza.zzca(i2))
      {
      case 1:
        j = zza.zzg(paramParcel, i2);
        break;
      case 2:
        str = zza.zzp(paramParcel, i2);
        break;
      case 3:
        k = zza.zzg(paramParcel, i2);
        break;
      case 4:
        m = zza.zzg(paramParcel, i2);
        break;
      case 5:
        bool1 = zza.zzc(paramParcel, i2);
        break;
      case 6:
        n = zza.zzg(paramParcel, i2);
        break;
      case 7:
        i1 = zza.zzg(paramParcel, i2);
        break;
      case 8:
        arrayOfAdSizeParcel = (AdSizeParcel[])zza.zzb(paramParcel, i2, AdSizeParcel.CREATOR);
        break;
      case 9:
        bool2 = zza.zzc(paramParcel, i2);
        break;
      case 10:
        bool3 = zza.zzc(paramParcel, i2);
        break;
      case 11:
        bool4 = zza.zzc(paramParcel, i2);
        break;
      default:
        zza.zzb(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    AdSizeParcel localAdSizeParcel = new AdSizeParcel(j, str, k, m, bool1, n, i1, arrayOfAdSizeParcel, bool2, bool3, bool4);
    return localAdSizeParcel;
  }

  public AdSizeParcel[] zzm(int paramInt)
  {
    return new AdSizeParcel[paramInt];
  }

  static void zza(AdSizeParcel paramAdSizeParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramAdSizeParcel.versionCode);
    zzb.zza(paramParcel, 2, paramAdSizeParcel.zzuh, false);
    zzb.zzc(paramParcel, 3, paramAdSizeParcel.height);
    zzb.zzc(paramParcel, 4, paramAdSizeParcel.heightPixels);
    zzb.zza(paramParcel, 5, paramAdSizeParcel.zzui);
    zzb.zzc(paramParcel, 6, paramAdSizeParcel.width);
    zzb.zzc(paramParcel, 7, paramAdSizeParcel.widthPixels);
    zzb.zza(paramParcel, 8, paramAdSizeParcel.zzuj, paramInt, false);
    zzb.zza(paramParcel, 9, paramAdSizeParcel.zzuk);
    zzb.zza(paramParcel, 10, paramAdSizeParcel.zzul);
    zzb.zza(paramParcel, 11, paramAdSizeParcel.zzum);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzi
 * JD-Core Version:    0.6.0
 */