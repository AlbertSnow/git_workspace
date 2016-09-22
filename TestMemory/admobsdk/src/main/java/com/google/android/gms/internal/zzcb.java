package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@zzhb
public class zzcb
{
  boolean zzxi;
  private final List<zzbz> zzxz = new LinkedList();
  private final Map<String, String> zzxA = new LinkedHashMap();
  private final Object zzpV = new Object();
  private String zzxB;
  private zzbz zzxC;
  private zzcb zzxD;

  public zzcb(boolean paramBoolean, String paramString1, String paramString2)
  {
    this.zzxi = paramBoolean;
    this.zzxA.put("action", paramString1);
    this.zzxA.put("ad_format", paramString2);
  }

  public void zzc(zzcb paramzzcb)
  {
    synchronized (this.zzpV)
    {
      this.zzxD = paramzzcb;
    }
  }

  public zzbz zzdB()
  {
    return zzb(zzr.zzbG().elapsedRealtime());
  }

  public zzbz zzb(long paramLong)
  {
    if (!this.zzxi)
      return null;
    zzbz localzzbz = new zzbz(paramLong, null, null);
    return localzzbz;
  }

  public boolean zza(zzbz paramzzbz, String[] paramArrayOfString)
  {
    if ((!this.zzxi) || (paramzzbz == null))
      return false;
    return zza(paramzzbz, zzr.zzbG().elapsedRealtime(), paramArrayOfString);
  }

  public boolean zza(zzbz paramzzbz, long paramLong, String[] paramArrayOfString)
  {
    synchronized (this.zzpV)
    {
      for (String str : paramArrayOfString)
      {
        zzbz localzzbz = new zzbz(paramLong, str, paramzzbz);
        this.zzxz.add(localzzbz);
      }
      return true;
    }
  }

  public void zzdC()
  {
    synchronized (this.zzpV)
    {
      this.zzxC = zzdB();
    }
  }

  public String zzdD()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (this.zzpV)
    {
      Iterator localIterator = this.zzxz.iterator();
      while (localIterator.hasNext())
      {
        zzbz localzzbz1 = (zzbz)localIterator.next();
        long l1 = localzzbz1.getTime();
        String str = localzzbz1.zzdy();
        zzbz localzzbz2 = localzzbz1.zzdz();
        long l2 = 0L;
        if ((localzzbz2 == null) || (l1 <= 0L))
          continue;
        l2 = l1 - localzzbz2.getTime();
        localStringBuilder.append(str).append('.').append(l2).append(',');
      }
      this.zzxz.clear();
      if (!TextUtils.isEmpty(this.zzxB))
        localStringBuilder.append(this.zzxB);
      else if (localStringBuilder.length() > 0)
        localStringBuilder.setLength(localStringBuilder.length() - 1);
      return localStringBuilder.toString();
    }
  }

  public void zzN(String paramString)
  {
    if (!this.zzxi)
      return;
    synchronized (this.zzpV)
    {
      this.zzxB = paramString;
    }
  }

  public void zzc(String paramString1, String paramString2)
  {
    if ((!this.zzxi) || (TextUtils.isEmpty(paramString2)))
      return;
    zzbv localzzbv = zzr.zzbF().zzhb();
    if (localzzbv == null)
      return;
    synchronized (this.zzpV)
    {
      localzzbv.zzL(paramString1).zza(this.zzxA, paramString1, paramString2);
    }
  }

  Map<String, String> zzn()
  {
    synchronized (this.zzpV)
    {
      zzbv localzzbv = zzr.zzbF().zzhb();
      if ((localzzbv == null) || (this.zzxD == null))
        return this.zzxA;
      return localzzbv.zza(this.zzxA, this.zzxD.zzn());
    }
  }

  public zzbz zzdE()
  {
    synchronized (this.zzpV)
    {
      return this.zzxC;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcb
 * JD-Core Version:    0.6.0
 */