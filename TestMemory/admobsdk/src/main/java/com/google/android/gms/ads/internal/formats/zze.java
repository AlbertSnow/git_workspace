package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcn.zza;
import com.google.android.gms.internal.zzhb;
import java.util.List;

@zzhb
public class zze extends zzcn.zza
  implements zzh.zza
{
  private String zzxW;
  private List<zzc> zzxX;
  private String zzxY;
  private zzch zzyg;
  private String zzya;
  private String zzyh;
  private zza zzye;
  private Bundle mExtras;
  private Object zzpV = new Object();
  private zzh zzyf;

  public zze(String paramString1, List paramList, String paramString2, zzch paramzzch, String paramString3, String paramString4, zza paramzza, Bundle paramBundle)
  {
    this.zzxW = paramString1;
    this.zzxX = paramList;
    this.zzxY = paramString2;
    this.zzyg = paramzzch;
    this.zzya = paramString3;
    this.zzyh = paramString4;
    this.zzye = paramzza;
    this.mExtras = paramBundle;
  }

  public String getHeadline()
  {
    return this.zzxW;
  }

  public List getImages()
  {
    return this.zzxX;
  }

  public String getBody()
  {
    return this.zzxY;
  }

  public zzch zzdO()
  {
    return this.zzyg;
  }

  public String getCallToAction()
  {
    return this.zzya;
  }

  public String getAdvertiser()
  {
    return this.zzyh;
  }

  public zzd zzdL()
  {
    return com.google.android.gms.dynamic.zze.zzC(this.zzyf);
  }

  public void zzb(zzh paramzzh)
  {
    synchronized (this.zzpV)
    {
      this.zzyf = paramzzh;
    }
  }

  public String zzdM()
  {
    return "1";
  }

  public String getCustomTemplateId()
  {
    return "";
  }

  public zza zzdN()
  {
    return this.zzye;
  }

  public Bundle getExtras()
  {
    return this.mExtras;
  }

  public void destroy()
  {
    this.zzxW = null;
    this.zzxX = null;
    this.zzxY = null;
    this.zzyg = null;
    this.zzya = null;
    this.zzyh = null;
    this.zzye = null;
    this.mExtras = null;
    this.zzpV = null;
    this.zzyf = null;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zze
 * JD-Core Version:    0.6.0
 */