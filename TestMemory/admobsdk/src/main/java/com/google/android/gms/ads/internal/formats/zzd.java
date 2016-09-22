package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcl.zza;
import com.google.android.gms.internal.zzhb;
import java.util.List;

@zzhb
public class zzd extends zzcl.zza
  implements zzh.zza
{
  private String zzxW;
  private List<zzc> zzxX;
  private String zzxY;
  private zzch zzxZ;
  private String zzya;
  private double zzyb;
  private String zzyc;
  private String zzyd;
  private zza zzye;
  private Bundle mExtras;
  private Object zzpV = new Object();
  private zzh zzyf;

  public zzd(String paramString1, List paramList, String paramString2, zzch paramzzch, String paramString3, double paramDouble, String paramString4, String paramString5, zza paramzza, Bundle paramBundle)
  {
    this.zzxW = paramString1;
    this.zzxX = paramList;
    this.zzxY = paramString2;
    this.zzxZ = paramzzch;
    this.zzya = paramString3;
    this.zzyb = paramDouble;
    this.zzyc = paramString4;
    this.zzyd = paramString5;
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

  public zzch zzdK()
  {
    return this.zzxZ;
  }

  public String getCallToAction()
  {
    return this.zzya;
  }

  public double getStarRating()
  {
    return this.zzyb;
  }

  public String getStore()
  {
    return this.zzyc;
  }

  public String getPrice()
  {
    return this.zzyd;
  }

  public com.google.android.gms.dynamic.zzd zzdL()
  {
    return zze.zzC(this.zzyf);
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
    return "2";
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
    this.zzxZ = null;
    this.zzya = null;
    this.zzyb = 0.0D;
    this.zzyc = null;
    this.zzyd = null;
    this.zzye = null;
    this.mExtras = null;
    this.zzpV = null;
    this.zzyf = null;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzd
 * JD-Core Version:    0.6.0
 */