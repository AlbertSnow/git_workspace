package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator<GInAppPurchaseManagerInfoParcel>
{
  public GInAppPurchaseManagerInfoParcel zzh(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    IBinder localIBinder1 = null;
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
    IBinder localIBinder4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(k))
      {
      case 1:
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 3:
        localIBinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 4:
        localIBinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 5:
        localIBinder3 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 6:
        localIBinder4 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 2:
      default:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new zza.zza("Overread allowed size end=" + i, paramParcel);
    GInAppPurchaseManagerInfoParcel localGInAppPurchaseManagerInfoParcel = new GInAppPurchaseManagerInfoParcel(j, localIBinder1, localIBinder2, localIBinder3, localIBinder4);
    return localGInAppPurchaseManagerInfoParcel;
  }

  public GInAppPurchaseManagerInfoParcel[] zzA(int paramInt)
  {
    return new GInAppPurchaseManagerInfoParcel[paramInt];
  }

  static void zza(GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramGInAppPurchaseManagerInfoParcel.versionCode);
    zzb.zza(paramParcel, 3, paramGInAppPurchaseManagerInfoParcel.zzfT(), false);
    zzb.zza(paramParcel, 4, paramGInAppPurchaseManagerInfoParcel.zzfU(), false);
    zzb.zza(paramParcel, 5, paramGInAppPurchaseManagerInfoParcel.zzfV(), false);
    zzb.zza(paramParcel, 6, paramGInAppPurchaseManagerInfoParcel.zzfS(), false);
    zzb.zzI(paramParcel, i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zza
 * JD-Core Version:    0.6.0
 */