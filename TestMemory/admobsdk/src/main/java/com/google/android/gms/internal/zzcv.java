package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

@zzhb
public class zzcv extends zzg<zzck>
{
  public zzcj zza(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    zzcj localzzcj;
    if ((!zzn.zzcS().zzU(paramContext)) || ((localzzcj = zzb(paramContext, paramFrameLayout1, paramFrameLayout2)) == null))
    {
      zzb.zzaI("Using NativeAdViewDelegate from the client jar.");
      localzzcj = zzn.zzcU().createNativeAdViewDelegate(paramFrameLayout1, paramFrameLayout2);
    }
    return localzzcj;
  }

  public zzcv()
  {
    super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
  }

  private zzcj zzb(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    try
    {
      zzd localzzd1 = zze.zzC(paramContext);
      zzd localzzd2 = zze.zzC(paramFrameLayout1);
      zzd localzzd3 = zze.zzC(paramFrameLayout2);
      IBinder localIBinder = ((zzck)zzaB(paramContext)).zza(localzzd1, localzzd2, localzzd3, 8487000);
      return zzcj.zza.zzu(localIBinder);
    }
    catch (zzg.zza localzza)
    {
      zzb.zzd("Could not create remote NativeAdViewDelegate.", localzza);
    }
    return null;
  }

  protected zzck zzD(IBinder paramIBinder)
  {
    return zzck.zza.zzv(paramIBinder);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcv
 * JD-Core Version:    0.6.0
 */