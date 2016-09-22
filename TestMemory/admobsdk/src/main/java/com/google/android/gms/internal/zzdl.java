package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zze;
import java.util.Map;

@zzhb
public class zzdl
  implements zzdf
{
  private final zze zzzA;
  private final zzfn zzzB;
  static final Map<String, Integer> zzzC = zzmr.zza("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));

  public zzdl(zze paramzze, zzfn paramzzfn)
  {
    this.zzzA = paramzze;
    this.zzzB = paramzzfn;
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("a");
    int i = ((Integer)zzzC.get(str)).intValue();
    if ((i != 5) && (this.zzzA != null) && (!this.zzzA.zzbh()))
    {
      this.zzzA.zzq(null);
      return;
    }
    switch (i)
    {
    case 1:
      this.zzzB.zzi(paramMap);
      break;
    case 4:
      new zzfm(paramzzjp, paramMap).execute();
      break;
    case 3:
      new zzfp(paramzzjp, paramMap).execute();
      break;
    case 5:
      new zzfo(paramzzjp, paramMap).execute();
      break;
    case 6:
      this.zzzB.zzp(true);
      break;
    case 2:
    default:
      zzin.zzaJ("Unknown MRAID command called.");
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdl
 * JD-Core Version:    0.6.0
 */