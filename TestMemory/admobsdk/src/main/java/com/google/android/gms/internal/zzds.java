package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzb;
import java.util.Map;

@zzhb
public class zzds
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    zzdq localzzdq = zzr.zzbR();
    if (paramMap.containsKey("abort"))
    {
      if (!localzzdq.zzd(paramzzjp))
        zzin.zzaK("Precache abort but no preload task running.");
      return;
    }
    String str1 = (String)paramMap.get("src");
    if (str1 == null)
    {
      zzin.zzaK("Precache video action is missing the src parameter.");
      return;
    }
    int i;
    try
    {
      i = Integer.parseInt((String)paramMap.get("player"));
    }
    catch (NumberFormatException localNumberFormatException)
    {
      i = 0;
    }
    String str2 = paramMap.containsKey("mimetype") ? (String)paramMap.get("mimetype") : "";
    if (localzzdq.zze(paramzzjp))
    {
      zzin.zzaK("Precache task already running.");
      return;
    }
    zzb.zzv(paramzzjp.zzhR());
    zzdr localzzdr = paramzzjp.zzhR().zzpw.zza(paramzzjp, i, str2);
    zzdp localzzdp = new zzdp(paramzzjp, localzzdr, str1);
    localzzdp.zzhn();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzds
 * JD-Core Version:    0.6.0
 */