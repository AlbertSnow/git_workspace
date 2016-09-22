package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzb.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@zzhb
public class zzhs extends zzb.zza
{
  private final Context mContext;
  private final VersionInfoParcel zzpT;
  private final zzht zzKu;
  private final Object zzpV;

  public zzhs(Context paramContext, com.google.android.gms.ads.internal.zzd paramzzd, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    this.mContext = paramContext;
    this.zzpT = paramVersionInfoParcel;
    this.zzKu = new zzht(paramContext, paramzzd, AdSizeParcel.zzcP(), paramzzex, paramVersionInfoParcel);
    this.zzpV = new Object();
  }

  public void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    synchronized (this.zzpV)
    {
      this.zzKu.zza(paramRewardedVideoAdRequestParcel);
    }
  }

  public void show()
  {
    synchronized (this.zzpV)
    {
      this.zzKu.zzgL();
    }
  }

  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    synchronized (this.zzpV)
    {
      this.zzKu.zza(paramzzd);
    }
  }

  public void setUserId(String userId)
  {
    synchronized (this.zzpV)
    {
      this.zzKu.setUserId(userId);
    }
  }

  public boolean isLoaded()
  {
    synchronized (this.zzpV)
    {
      return this.zzKu.isLoaded();
    }
  }

  public void pause()
  {
    synchronized (this.zzpV)
    {
      this.zzKu.pause();
    }
  }

  public void resume()
  {
    synchronized (this.zzpV)
    {
      this.zzKu.resume();
    }
  }

  public void destroy()
  {
    synchronized (this.zzpV)
    {
      this.zzKu.destroy();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhs
 * JD-Core Version:    0.6.0
 */