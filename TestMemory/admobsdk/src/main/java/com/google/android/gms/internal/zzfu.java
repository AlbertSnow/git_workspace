package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

@zzhb
public final class zzfu extends zzg<zzfw>
{
  private static final zzfu zzFp = new zzfu();

  @Nullable
  public static zzfv createAdOverlay(Activity activity)
  {
    try
    {
      zzfv localzzfv;
      if ((zzb(activity)) || ((localzzfv = zzFp.zzc(activity)) == null))
      {
        zzb.zzaI("Using AdOverlay from the client jar.");
        return zzn.zzcU().createAdOverlay(activity);
      }
      return localzzfv;
    }
    catch (zza localzza1)
    {
      zzb.zzaK(localzza1.getMessage());
    }
    return null;
  }

  private static boolean zzb(Activity paramActivity)
    throws zzfu.zza
  {
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
      throw new zza("Ad overlay requires the useClientJar flag in intent extras.");
    return localIntent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
  }

  private zzfu()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }

  private zzfv zzc(Activity paramActivity)
  {
    try
    {
      zzd localzzd = zze.zzC(paramActivity);
      IBinder localIBinder = ((zzfw)zzaB(paramActivity)).zze(localzzd);
      return zzfv.zza.zzL(localIBinder);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not create remote AdOverlay.", localRemoteException);
      return null;
    }
    catch (zzg.zza localzza)
    {
      zzb.zzd("Could not create remote AdOverlay.", localzza);
    }
    return null;
  }

  protected zzfw zzK(IBinder paramIBinder)
  {
    return zzfw.zza.zzM(paramIBinder);
  }

  private static final class zza extends Exception
  {
    public zza(String paramString)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfu
 * JD-Core Version:    0.6.0
 */