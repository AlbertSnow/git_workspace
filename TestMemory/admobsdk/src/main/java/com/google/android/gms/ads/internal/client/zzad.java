package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzad
{
  private static zzad zzuV;
  private static final Object zzqy = new Object();
  private zzy zzuW;
  private RewardedVideoAd zzuX;

  public static zzad zzdi()
  {
    synchronized (zzqy)
    {
      if (zzuV == null)
        zzuV = new zzad();
      return zzuV;
    }
  }

  public void zza(Context paramContext, String paramString, zzae paramzzae)
  {
    initialize(paramContext);
  }

  public void initialize(Context context)
  {
    synchronized (zzqy)
    {
      if (this.zzuW != null)
        return;
      if (context == null)
        throw new IllegalArgumentException("Context cannot be null.");
      try
      {
        this.zzuW = zzn.zzcV().zzu(context);
        this.zzuW.zza();
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzaK("Fail to initialize mobile ads setting manager");
      }
    }
  }

  public RewardedVideoAd getRewardedVideoAdInstance(Context context)
  {
    synchronized (zzqy)
    {
      if (this.zzuX != null)
        return this.zzuX;
      zzew localzzew = new zzew();
      com.google.android.gms.ads.internal.reward.client.zzb localzzb = zzn.zzcX().zza(context, localzzew);
      this.zzuX = new zzi(context, localzzb);
      return this.zzuX;
    }
  }

  public void setAppVolume(float volume)
  {
    zzx.zzb((0.0F <= volume) && (volume <= 1.0F), "The app volume must be a value between 0 and 1 inclusive.");
    zzx.zza(this.zzuW != null, "MobileAds.initialize() must be called prior to setting the app volume.");
    try
    {
      this.zzuW.setAppVolume(volume);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzb("Unable to set app volume.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzad
 * JD-Core Version:    0.6.0
 */