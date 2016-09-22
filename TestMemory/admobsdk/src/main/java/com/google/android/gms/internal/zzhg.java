package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzhb
public final class zzhg
{
  private String zzJn;
  private String zzJo;
  private String zzxY;
  private List<String> zzJp;
  private String zzJq;
  private String zzJr;
  private List<String> zzJs;
  private long zzJt = -1L;
  private boolean zzJu = false;
  private final long zzJv = -1L;
  private List<String> zzGK;
  private long zzJw = -1L;
  private int mOrientation = -1;
  private boolean zzJx = false;
  private boolean zzJy = false;
  private boolean zzJz = false;
  private boolean zzJA = true;
  private int zzJB = 0;
  private String zzJC = "";
  private boolean zzJD = false;
  private boolean zzuS = false;
  private RewardItemParcel zzJE;
  private List<String> zzJF;
  private List<String> zzJG;
  private boolean zzJH = false;
  private final AdRequestInfoParcel zzCu;

  static String zzd(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
      return (String)localList.get(0);
    return null;
  }

  static long zze(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      try
      {
        return ()(Float.parseFloat(str) * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzin.zzaK("Could not parse float from " + paramString + " header: " + str);
      }
    }
    return -1L;
  }

  static List<String> zzf(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      if (str != null)
        return Arrays.asList(str.trim().split("\\s+"));
    }
    return null;
  }

  private boolean zzg(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    return (localList != null) && (!localList.isEmpty()) && (Boolean.valueOf((String)localList.get(0)).booleanValue());
  }

  public zzhg(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    this.zzCu = paramAdRequestInfoParcel;
  }

  public AdResponseParcel zzj(long paramLong)
  {
    return new AdResponseParcel(this.zzCu, this.zzJo, this.zzxY, this.zzJp, this.zzJs, this.zzJt, this.zzJu, -1L, this.zzGK, this.zzJw, this.mOrientation, this.zzJn, paramLong, this.zzJq, this.zzJr, this.zzJx, this.zzJy, this.zzJz, this.zzJA, false, this.zzJB, this.zzJC, this.zzJD, this.zzuS, this.zzJE, this.zzJF, this.zzJG, this.zzJH);
  }

  public void zzb(String paramString1, Map<String, List<String>> paramMap, String paramString2)
  {
    this.zzJo = paramString1;
    this.zzxY = paramString2;
    zzj(paramMap);
  }

  public void zzj(Map<String, List<String>> paramMap)
  {
    zzk(paramMap);
    zzl(paramMap);
    zzm(paramMap);
    zzn(paramMap);
    zzo(paramMap);
    zzs(paramMap);
    zzt(paramMap);
    zzu(paramMap);
    zzv(paramMap);
    zzp(paramMap);
    zzw(paramMap);
    zzr(paramMap);
    zzq(paramMap);
    zzx(paramMap);
    zzy(paramMap);
    zzz(paramMap);
    zzA(paramMap);
    zzB(paramMap);
    zzC(paramMap);
    zzD(paramMap);
    zzE(paramMap);
    zzF(paramMap);
  }

  private void zzk(Map<String, List<String>> paramMap)
  {
    this.zzJn = zzd(paramMap, "X-Afma-Ad-Size");
  }

  private void zzl(Map<String, List<String>> paramMap)
  {
    List localList = zzf(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localList != null)
      this.zzJp = localList;
  }

  private void zzm(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Debug-Dialog");
    if ((localList != null) && (!localList.isEmpty()))
      this.zzJq = ((String)localList.get(0));
  }

  private void zzn(Map<String, List<String>> paramMap)
  {
    List localList = zzf(paramMap, "X-Afma-Tracking-Urls");
    if (localList != null)
      this.zzJs = localList;
  }

  private void zzo(Map<String, List<String>> paramMap)
  {
    long l = zze(paramMap, "X-Afma-Interstitial-Timeout");
    if (l != -1L)
      this.zzJt = l;
  }

  private void zzp(Map<String, List<String>> paramMap)
  {
    this.zzJr = zzd(paramMap, "X-Afma-ActiveView");
  }

  private void zzq(Map<String, List<String>> paramMap)
  {
    String str = zzd(paramMap, "X-Afma-Ad-Format");
    this.zzJy = "native".equals(str);
  }

  private void zzr(Map<String, List<String>> paramMap)
  {
    this.zzJx |= zzg(paramMap, "X-Afma-Custom-Rendering-Allowed");
  }

  private void zzs(Map<String, List<String>> paramMap)
  {
    this.zzJu |= zzg(paramMap, "X-Afma-Mediation");
  }

  private void zzt(Map<String, List<String>> paramMap)
  {
    List localList = zzf(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localList != null)
      this.zzGK = localList;
  }

  private void zzu(Map<String, List<String>> paramMap)
  {
    long l = zze(paramMap, "X-Afma-Refresh-Rate");
    if (l != -1L)
      this.zzJw = l;
  }

  private void zzv(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Orientation");
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      if ("portrait".equalsIgnoreCase(str))
        this.mOrientation = zzr.zzbE().zzhw();
      else if ("landscape".equalsIgnoreCase(str))
        this.mOrientation = zzr.zzbE().zzhv();
    }
  }

  private void zzw(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Use-HTTPS");
    if ((localList != null) && (!localList.isEmpty()))
      this.zzJz = Boolean.valueOf((String)localList.get(0)).booleanValue();
  }

  private void zzx(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
    if ((localList != null) && (!localList.isEmpty()))
      this.zzJA = Boolean.valueOf((String)localList.get(0)).booleanValue();
  }

  private void zzy(Map<String, List<String>> paramMap)
  {
    List localList = zzf(paramMap, "X-Afma-OAuth-Token-Status");
    this.zzJB = 0;
    if (localList == null)
      return;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ("Clear".equalsIgnoreCase(str))
      {
        this.zzJB = 1;
        break;
      }
      if ("No-Op".equalsIgnoreCase(str))
      {
        this.zzJB = 0;
        break;
      }
    }
  }

  private void zzz(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Gws-Query-Id");
    if ((localList != null) && (!localList.isEmpty()))
      this.zzJC = ((String)localList.get(0));
  }

  private void zzA(Map<String, List<String>> paramMap)
  {
    String str = zzd(paramMap, "X-Afma-Fluid");
    if ((str != null) && (str.equals("height")))
      this.zzJD = true;
  }

  private void zzB(Map<String, List<String>> paramMap)
  {
    String str = zzd(paramMap, "X-Afma-Ad-Format");
    this.zzuS = "native_express".equals(str);
  }

  private void zzC(Map<String, List<String>> paramMap)
  {
    String str = zzd(paramMap, "X-Afma-Rewards");
    this.zzJE = RewardItemParcel.zzay(str);
  }

  private void zzD(Map<String, List<String>> paramMap)
  {
    if (this.zzJF != null)
      return;
    this.zzJF = zzf(paramMap, "X-Afma-Reward-Video-Start-Urls");
  }

  private void zzE(Map<String, List<String>> paramMap)
  {
    if (this.zzJG != null)
      return;
    this.zzJG = zzf(paramMap, "X-Afma-Reward-Video-Complete-Urls");
  }

  private void zzF(Map<String, List<String>> paramMap)
  {
    this.zzJH |= zzg(paramMap, "X-Afma-Use-Displayed-Impression");
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhg
 * JD-Core Version:    0.6.0
 */