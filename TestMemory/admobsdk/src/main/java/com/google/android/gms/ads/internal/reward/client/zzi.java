package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzi
  implements RewardedVideoAd
{
  private final zzb zzKA;
  private final Context mContext;
  private final Object zzpV = new Object();
  private RewardedVideoAdListener zzaX;
  private String zzrG;

  public zzi(Context paramContext, zzb paramzzb)
  {
    this.zzKA = paramzzb;
    this.mContext = paramContext;
  }

  public void loadAd(String adUnitId, AdRequest adRequest)
  {
    synchronized (this.zzpV)
    {
      if (this.zzKA == null)
        return;
      try
      {
        this.zzKA.zza(zzh.zzcO().zza(this.mContext, adRequest.zzaE(), adUnitId));
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward loadAd to RewardedVideoAd", localRemoteException);
      }
    }
  }

  public void show()
  {
    synchronized (this.zzpV)
    {
      if (this.zzKA == null)
        return;
      try
      {
        this.zzKA.show();
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward show to RewardedVideoAd", localRemoteException);
      }
    }
  }

  public void setRewardedVideoAdListener(RewardedVideoAdListener listener)
  {
    synchronized (this.zzpV)
    {
      this.zzaX = listener;
      if (this.zzKA != null)
        try
        {
          this.zzKA.zza(new zzg(listener));
        }
        catch (RemoteException localRemoteException)
        {
          com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward setRewardedVideoAdListener to RewardedVideoAd", localRemoteException);
        }
    }
  }

  public void setUserId(String userId)
  {
    synchronized (this.zzpV)
    {
      if (!TextUtils.isEmpty(this.zzrG))
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzaK("A user id has already been set, ignoring.");
        return;
      }
      this.zzrG = userId;
      if (this.zzKA != null)
        try
        {
          this.zzKA.setUserId(userId);
        }
        catch (RemoteException localRemoteException)
        {
          com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward setUserId to RewardedVideoAd", localRemoteException);
        }
    }
  }

  public boolean isLoaded()
  {
    synchronized (this.zzpV)
    {
      if (this.zzKA == null)
        return false;
      try
      {
        return this.zzKA.isLoaded();
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward isLoaded to RewardedVideoAd", localRemoteException);
        return false;
      }
    }
  }

  public void pause()
  {
    synchronized (this.zzpV)
    {
      if (this.zzKA == null)
        return;
      try
      {
        this.zzKA.pause();
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward pause to RewardedVideoAd", localRemoteException);
      }
    }
  }

  public void resume()
  {
    synchronized (this.zzpV)
    {
      if (this.zzKA == null)
        return;
      try
      {
        this.zzKA.resume();
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward resume to RewardedVideoAd", localRemoteException);
      }
    }
  }

  public void destroy()
  {
    synchronized (this.zzpV)
    {
      if (this.zzKA == null)
        return;
      try
      {
        this.zzKA.destroy();
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward destroy to RewardedVideoAd", localRemoteException);
      }
    }
  }

  public RewardedVideoAdListener getRewardedVideoAdListener()
  {
    synchronized (this.zzpV)
    {
      return this.zzaX;
    }
  }

  public String getUserId()
  {
    synchronized (this.zzpV)
    {
      return this.zzrG;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zzi
 * JD-Core Version:    0.6.0
 */