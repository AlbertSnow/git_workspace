package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzgc;
import com.google.android.gms.internal.zzhb;

@zzhb
public final class GInAppPurchaseManagerInfoParcel
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  public final int versionCode;
  public final zzk zzrI;
  public final zzgc zzFw;
  public final Context zzFx;
  public final zzj zzFy;

  public static void zza(Intent paramIntent, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramGInAppPurchaseManagerInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }

  public static GInAppPurchaseManagerInfoParcel zzc(Intent paramIntent)
  {
    try
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      localBundle.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
      return (GInAppPurchaseManagerInfoParcel)localBundle.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public GInAppPurchaseManagerInfoParcel(Context appContext, zzk inAppPurchaseVerifier, zzgc inAppPurchase, zzj onPlayStorePurchaseFinishedListener)
  {
    this.versionCode = 2;
    this.zzFx = appContext;
    this.zzrI = inAppPurchaseVerifier;
    this.zzFw = inAppPurchase;
    this.zzFy = onPlayStorePurchaseFinishedListener;
  }

  GInAppPurchaseManagerInfoParcel(int versionCode, IBinder wrappedInAppPurchaseVerifier, IBinder wrappedInAppPurchase, IBinder wrappedAppContext, IBinder wrappedOnPlayStorePurchaseFinishedListener)
  {
    this.versionCode = versionCode;
    this.zzrI = ((zzk)zze.zzp(zzd.zza.zzbs(wrappedInAppPurchaseVerifier)));
    this.zzFw = ((zzgc)zze.zzp(zzd.zza.zzbs(wrappedInAppPurchase)));
    this.zzFx = ((Context)zze.zzp(zzd.zza.zzbs(wrappedAppContext)));
    this.zzFy = ((zzj)zze.zzp(zzd.zza.zzbs(wrappedOnPlayStorePurchaseFinishedListener)));
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel out, int flags)
  {
    zza.zza(this, out, flags);
  }

  IBinder zzfS()
  {
    return zze.zzC(this.zzFy).asBinder();
  }

  IBinder zzfT()
  {
    return zze.zzC(this.zzrI).asBinder();
  }

  IBinder zzfU()
  {
    return zze.zzC(this.zzFw).asBinder();
  }

  IBinder zzfV()
  {
    return zze.zzC(this.zzFx).asBinder();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel
 * JD-Core Version:    0.6.0
 */