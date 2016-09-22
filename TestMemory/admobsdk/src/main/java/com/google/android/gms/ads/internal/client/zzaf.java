package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzaf extends zzg<zzz>
{
  public zzy zzu(Context paramContext)
  {
    zzy localzzy;
    if ((!zzn.zzcS().zzU(paramContext)) || ((localzzy = zzv(paramContext)) == null))
    {
      zzb.zzaI("Using MobileAdsSettingManager from the client jar.");
      VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(8487000, 8487000, true);
      localzzy = zzn.zzcU().getMobileAdsSettingsManager(paramContext);
    }
    return localzzy;
  }

  public zzaf()
  {
    super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
  }

  private zzy zzv(Context paramContext)
  {
    try
    {
      zzd localzzd = zze.zzC(paramContext);
      IBinder localIBinder = ((zzz)zzaB(paramContext)).zza(localzzd, 8487000);
      return zzy.zza.zzo(localIBinder);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not get remote MobileAdsSettingManager.", localRemoteException);
      return null;
    }
    catch (zzg.zza localzza)
    {
      zzb.zzd("Could not get remote MobileAdsSettingManager.", localzza);
    }
    return null;
  }

  protected zzz zzq(IBinder paramIBinder)
  {
    return zzz.zza.zzp(paramIBinder);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzaf
 * JD-Core Version:    0.6.0
 */