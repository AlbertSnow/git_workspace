package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzhb
public class zzdq
  implements Iterable<zzdp>
{
  private final List<zzdp> zzzM = new LinkedList();

  public boolean zzd(zzjp paramzzjp)
  {
    zzdp localzzdp = zzf(paramzzjp);
    if (localzzdp != null)
    {
      localzzdp.zzzJ.abort();
      return true;
    }
    return false;
  }

  public boolean zze(zzjp paramzzjp)
  {
    return zzf(paramzzjp) != null;
  }

  private zzdp zzf(zzjp paramzzjp)
  {
    zzdq localzzdq = zzr.zzbR();
    Iterator localIterator = localzzdq.iterator();
    while (localIterator.hasNext())
    {
      zzdp localzzdp = (zzdp)localIterator.next();
      if (localzzdp.zzpD == paramzzjp)
        return localzzdp;
    }
    return null;
  }

  public void zza(zzdp paramzzdp)
  {
    this.zzzM.add(paramzzdp);
  }

  public void zzb(zzdp paramzzdp)
  {
    this.zzzM.remove(paramzzdp);
  }

  public Iterator<zzdp> iterator()
  {
    return this.zzzM.iterator();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdq
 * JD-Core Version:    0.6.0
 */