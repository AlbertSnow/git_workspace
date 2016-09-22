package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzhb;

@zzhb
public final class zzd extends zzg<zzt>
{
  private static final zzd zztB = new zzd();

  public static zzs zza(Context paramContext, String paramString, zzew paramzzew)
  {
    zzs localzzs;
    if ((!zzn.zzcS().zzU(paramContext)) || ((localzzs = zztB.zzb(paramContext, paramString, paramzzew)) == null))
    {
      zzb.zzaI("Using AdLoader from the client jar.");
      VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(8487000, 8487000, true);
      localzzs = zzn.zzcU().createAdLoaderBuilder(paramContext, paramString, paramzzew, localVersionInfoParcel);
    }
    return localzzs;
  }

  private zzd()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }

  private zzs zzb(Context paramContext, String paramString, zzew paramzzew)
  {
    try
    {
      com.google.android.gms.dynamic.zzd localzzd = zze.zzC(paramContext);
      IBinder localIBinder = ((zzt)zzaB(paramContext)).zza(localzzd, paramString, paramzzew, 8487000);
      return zzs.zza.zzi(localIBinder);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not create remote builder for AdLoader.", localRemoteException);
    }
    catch (zzg.zza localzza)
    {
      zzb.zzd("Could not create remote builder for AdLoader.", localzza);
    }
    return null;
  }

  protected zzt zzc(IBinder paramIBinder)
  {
    return zzt.zza.zzj(paramIBinder);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzd
 * JD-Core Version:    0.6.0
 */