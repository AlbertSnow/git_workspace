package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

@zzhb
public final class zzgj extends zzg<zzgf>
{
  private static final zzgj zzGa = new zzgj();

  @Nullable
  public static zzge createInAppPurchaseManager(Activity activity)
  {
    try
    {
      zzge localzzge;
      if ((zzb(activity)) || ((localzzge = zzGa.zzd(activity)) == null))
      {
        zzin.zzaI("Using AdOverlay from the client jar.");
        return zzn.zzcU().createInAppPurchaseManager(activity);
      }
      return localzzge;
    }
    catch (zza localzza1)
    {
      zzin.zzaK(localzza1.getMessage());
    }
    return null;
  }

  private static boolean zzb(Activity paramActivity)
    throws zzgj.zza
  {
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
      throw new zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
    return localIntent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
  }

  private zzgj()
  {
    super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
  }

  private zzge zzd(Activity paramActivity)
  {
    try
    {
      zzd localzzd = zze.zzC(paramActivity);
      IBinder localIBinder = ((zzgf)zzaB(paramActivity)).zzf(localzzd);
      return zzge.zza.zzQ(localIBinder);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not create remote InAppPurchaseManager.", localRemoteException);
      return null;
    }
    catch (zzg.zza localzza)
    {
      zzin.zzd("Could not create remote InAppPurchaseManager.", localzza);
    }
    return null;
  }

  protected zzgf zzU(IBinder paramIBinder)
  {
    return zzgf.zza.zzR(paramIBinder);
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
 * Qualified Name:     com.google.android.gms.internal.zzgj
 * JD-Core Version:    0.6.0
 */