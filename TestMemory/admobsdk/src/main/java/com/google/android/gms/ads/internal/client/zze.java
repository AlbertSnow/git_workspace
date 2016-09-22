package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zze extends zzg<zzv>
{
  public zzu zza(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew)
  {
    zzu localzzu = null;
    if ((!zzn.zzcS().zzU(paramContext)) || ((localzzu = zza(paramContext, paramAdSizeParcel, paramString, paramzzew, 1)) == null))
    {
      zzb.zzaI("Using BannerAdManager from the client jar.");
      VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(8487000, 8487000, true);
      localzzu = zzn.zzcU().createBannerAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, localVersionInfoParcel);
    }
    return localzzu;
  }

  public zzu zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew)
  {
    zzu localzzu = null;
    if ((!zzn.zzcS().zzU(paramContext)) || ((localzzu = zza(paramContext, paramAdSizeParcel, paramString, paramzzew, 2)) == null))
    {
      zzb.zzaK("Using InterstitialAdManager from the client jar.");
      VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(8487000, 8487000, true);
      localzzu = zzn.zzcU().createInterstitialAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, localVersionInfoParcel);
    }
    return localzzu;
  }

  public zze()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }

  private zzu zza(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, int paramInt)
  {
    try
    {
      zzd localzzd = com.google.android.gms.dynamic.zze.zzC(paramContext);
      IBinder localIBinder = ((zzv)zzaB(paramContext)).zza(localzzd, paramAdSizeParcel, paramString, paramzzew, 8487000, paramInt);
      return zzu.zza.zzk(localIBinder);
    }
    catch (zzg.zza localzza)
    {
      zzb.zza("Could not create remote AdManager.", localzza);
    }
    return null;
  }

  protected zzv zze(IBinder paramIBinder)
  {
    return zzv.zza.zzl(paramIBinder);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zze
 * JD-Core Version:    0.6.0
 */