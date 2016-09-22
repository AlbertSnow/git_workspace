package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzf extends zzg<zzc>
{
  public zzb zza(Context paramContext, zzew paramzzew)
  {
    zzb localzzb;
    if ((!zzn.zzcS().zzU(paramContext)) || ((localzzb = zzb(paramContext, paramzzew)) == null))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaI("Using RewardedVideoAd from the client jar.");
      VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(8487000, 8487000, true);
      localzzb = zzn.zzcU().createRewardedVideoAd(paramContext, paramzzew, localVersionInfoParcel);
    }
    return localzzb;
  }

  public zzf()
  {
    super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
  }

  private zzb zzb(Context paramContext, zzew paramzzew)
  {
    try
    {
      zzd localzzd = zze.zzC(paramContext);
      IBinder localIBinder = ((zzc)zzaB(paramContext)).zza(localzzd, paramzzew, 8487000);
      return zzb.zza.zzaa(localIBinder);
    }
    catch (zzg.zza localzza)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get remote RewardedVideoAd.", localzza);
    }
    return null;
  }

  protected zzc zzad(IBinder paramIBinder)
  {
    return zzc.zza.zzab(paramIBinder);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zzf
 * JD-Core Version:    0.6.0
 */