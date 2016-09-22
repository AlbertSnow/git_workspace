package com.google.android.gms.ads.internal.reward.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zze
  implements RewardItem
{
  private final zza zzKz;

  public zze(zza paramzza)
  {
    this.zzKz = paramzza;
  }

  public String getType()
  {
    if (this.zzKz == null)
      return null;
    try
    {
      return this.zzKz.getType();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward getType to RewardItem", localRemoteException);
    }
    return null;
  }

  public int getAmount()
  {
    if (this.zzKz == null)
      return 0;
    try
    {
      return this.zzKz.getAmount();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward getAmount to RewardItem", localRemoteException);
    }
    return 0;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zze
 * JD-Core Version:    0.6.0
 */