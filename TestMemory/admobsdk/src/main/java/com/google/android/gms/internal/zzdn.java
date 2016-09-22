package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Map;

public class zzdn
  implements zzdf
{
  private final zza zzzH;

  public static void zza(zzjp paramzzjp, zza paramzza)
  {
    paramzzjp.zzhU().zza("/reward", new zzdn(paramzza));
  }

  public zzdn(zza paramzza)
  {
    this.zzzH = paramzza;
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("action");
    if ("grant".equals(str))
      zze(paramMap);
    else if ("video_start".equals(str))
      zzf(paramMap);
  }

  private void zze(Map<String, String> paramMap)
  {
    RewardItemParcel localRewardItemParcel = null;
    try
    {
      int i = Integer.parseInt((String)paramMap.get("amount"));
      String str = (String)paramMap.get("type");
      if (!TextUtils.isEmpty(str))
        localRewardItemParcel = new RewardItemParcel(str, i);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      zzin.zzd("Unable to parse reward amount.", localNumberFormatException);
    }
    this.zzzH.zzb(localRewardItemParcel);
  }

  private void zzf(Map<String, String> paramMap)
  {
    this.zzzH.zzbq();
  }

  public static abstract interface zza
  {
    public abstract void zzbq();

    public abstract void zzb(RewardItemParcel paramRewardItemParcel);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdn
 * JD-Core Version:    0.6.0
 */