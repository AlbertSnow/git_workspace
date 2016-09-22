package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@zzhb
public class zzbq
{
  private final Collection<zzbp> zzvu = new ArrayList();
  private final Collection<zzbp<String>> zzvv = new ArrayList();
  private final Collection<zzbp<String>> zzvw = new ArrayList();

  public void zza(zzbp paramzzbp)
  {
    this.zzvu.add(paramzzbp);
  }

  public void zzb(zzbp<String> paramzzbp)
  {
    this.zzvv.add(paramzzbp);
  }

  public void zzc(zzbp<String> paramzzbp)
  {
    this.zzvw.add(paramzzbp);
  }

  public List<String> zzdr()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.zzvv.iterator();
    while (localIterator.hasNext())
    {
      zzbp localzzbp = (zzbp)localIterator.next();
      String str = (String)localzzbp.get();
      if (str != null)
        localArrayList.add(str);
    }
    return localArrayList;
  }

  public List<String> zzds()
  {
    List localList = zzdr();
    Iterator localIterator = this.zzvw.iterator();
    while (localIterator.hasNext())
    {
      zzbp localzzbp = (zzbp)localIterator.next();
      String str = (String)localzzbp.get();
      if (str != null)
        localList.add(str);
    }
    return localList;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbq
 * JD-Core Version:    0.6.0
 */