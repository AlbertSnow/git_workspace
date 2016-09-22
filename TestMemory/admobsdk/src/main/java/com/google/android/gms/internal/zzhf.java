package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.Future;

@zzhb
public final class zzhf
{
  private final Object zzpV = new Object();
  private String zzEY;
  private String zzJh;
  private zzjd<zzhi> zzJi = new zzjd();
  zzjp zzpD;
  zzeg.zzd zzJj;
  public final zzdf zzJk = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      synchronized (zzhf.zza(zzhf.this))
      {
        if (zzhf.zzb(zzhf.this).isDone())
          return;
        if (!zzhf.zzc(zzhf.this).equals(paramMap.get("request_id")))
          return;
        zzhi localzzhi = new zzhi(1, paramMap);
        zzin.zzaK("Invalid " + localzzhi.getType() + " request error: " + localzzhi.zzgE());
        zzhf.zzb(zzhf.this).zzg(localzzhi);
      }
    }
  };
  public final zzdf zzJl = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      synchronized (zzhf.zza(zzhf.this))
      {
        if (zzhf.zzb(zzhf.this).isDone())
          return;
        zzhi localzzhi = new zzhi(-2, paramMap);
        if (!zzhf.zzc(zzhf.this).equals(localzzhi.getRequestId()))
        {
          zzin.zzaK(localzzhi.getRequestId() + " ==== " + zzhf.zzc(zzhf.this));
          return;
        }
        String str1 = localzzhi.getUrl();
        if (str1 == null)
        {
          zzin.zzaK("URL missing in loadAdUrl GMSG.");
          return;
        }
        if (str1.contains("%40mediation_adapters%40"))
        {
          String str2 = zzil.zza(paramzzjp.getContext(), (String)paramMap.get("check_adapters"), zzhf.zzd(zzhf.this));
          str1 = str1.replaceAll("%40mediation_adapters%40", str2);
          localzzhi.setUrl(str1);
          zzin.v("Ad request URL modified to " + str1);
        }
        zzhf.zzb(zzhf.this).zzg(localzzhi);
      }
    }
  };

  public zzhf(String paramString1, String paramString2)
  {
    this.zzJh = paramString2;
    this.zzEY = paramString1;
  }

  public void zzh(zzjp paramzzjp)
  {
    this.zzpD = paramzzjp;
  }

  public void zzb(zzeg.zzd paramzzd)
  {
    this.zzJj = paramzzd;
  }

  public zzeg.zzd zzgB()
  {
    return this.zzJj;
  }

  public Future<zzhi> zzgC()
  {
    return this.zzJi;
  }

  public void zzgD()
  {
    if (this.zzpD != null)
    {
      this.zzpD.destroy();
      this.zzpD = null;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhf
 * JD-Core Version:    0.6.0
 */