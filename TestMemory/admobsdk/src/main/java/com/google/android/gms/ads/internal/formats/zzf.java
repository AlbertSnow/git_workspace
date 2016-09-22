package com.google.android.gms.ads.internal.formats;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcp.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import java.util.Arrays;
import java.util.List;

@zzhb
public class zzf extends zzcp.zza
  implements zzh.zza
{
  private final zza zzye;
  private final String zzyi;
  private final SimpleArrayMap<String, zzc> zzyj;
  private final SimpleArrayMap<String, String> zzyk;
  private final Object zzpV = new Object();
  private zzh zzyf;

  public zzf(String paramString, SimpleArrayMap<String, zzc> paramSimpleArrayMap, SimpleArrayMap<String, String> paramSimpleArrayMap1, zza paramzza)
  {
    this.zzyi = paramString;
    this.zzyj = paramSimpleArrayMap;
    this.zzyk = paramSimpleArrayMap1;
    this.zzye = paramzza;
  }

  public String zzO(String paramString)
  {
    return (String)this.zzyk.get(paramString);
  }

  public zzch zzP(String paramString)
  {
    return (zzch)this.zzyj.get(paramString);
  }

  public List<String> getAvailableAssetNames()
  {
    String[] arrayOfString = new String[this.zzyj.size() + this.zzyk.size()];
    int i = 0;
    int j = 0;
    while (j < this.zzyj.size())
    {
      arrayOfString[i] = ((String)this.zzyj.keyAt(j));
      j++;
      i++;
    }
    j = 0;
    while (j < this.zzyk.size())
    {
      arrayOfString[i] = ((String)this.zzyk.keyAt(j));
      j++;
      i++;
    }
    return Arrays.asList(arrayOfString);
  }

  public String getCustomTemplateId()
  {
    return this.zzyi;
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
    return "3";
  }

  public zza zzdN()
  {
    return this.zzye;
  }

  public void performClick(String assetName)
  {
    synchronized (this.zzpV)
    {
      if (this.zzyf == null)
      {
        zzin.e("Attempt to call performClick before ad initialized.");
        return;
      }
      this.zzyf.zza(assetName, null, null, null);
    }
  }

  public void recordImpression()
  {
    synchronized (this.zzpV)
    {
      if (this.zzyf == null)
      {
        zzin.e("Attempt to perform recordImpression before ad initialized.");
        return;
      }
      this.zzyf.recordImpression();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzf
 * JD-Core Version:    0.6.0
 */