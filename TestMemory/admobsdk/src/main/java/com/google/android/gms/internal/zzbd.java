package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzhb
public class zzbd
{
  private final Object zzpV = new Object();
  private int zzsW;
  private List<zzbc> zzsX = new LinkedList();

  public zzbc zzcF()
  {
    synchronized (this.zzpV)
    {
      if (this.zzsX.size() == 0)
      {
        zzin.zzaI("Queue empty");
        return null;
      }
      if (this.zzsX.size() >= 2)
      {
        localObject1 = null;
        int i = -2147483648;
        Iterator localIterator = this.zzsX.iterator();
        while (localIterator.hasNext())
        {
          zzbc localzzbc = (zzbc)localIterator.next();
          int j = localzzbc.getScore();
          if (j > i)
          {
            i = j;
            localObject1 = localzzbc;
          }
        }
        this.zzsX.remove(localObject1);
        return localObject1;
      }
      Object localObject1 = (zzbc)this.zzsX.get(0);
      ((zzbc)localObject1).zzcA();
      return localObject1;
    }
  }

  public boolean zza(zzbc paramzzbc)
  {
    synchronized (this.zzpV)
    {
      return this.zzsX.contains(paramzzbc);
    }
  }

  public boolean zzb(zzbc paramzzbc)
  {
    synchronized (this.zzpV)
    {
      Iterator localIterator = this.zzsX.iterator();
      while (localIterator.hasNext())
      {
        zzbc localzzbc = (zzbc)localIterator.next();
        if ((paramzzbc != localzzbc) && (localzzbc.zzcy().equals(paramzzbc.zzcy())))
        {
          localIterator.remove();
          return true;
        }
      }
      return false;
    }
  }

  public void zzc(zzbc paramzzbc)
  {
    synchronized (this.zzpV)
    {
      if (this.zzsX.size() >= 10)
      {
        zzin.zzaI("Queue is full, current size = " + this.zzsX.size());
        this.zzsX.remove(0);
      }
      paramzzbc.zzh(this.zzsW++);
      this.zzsX.add(paramzzbc);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbd
 * JD-Core Version:    0.6.0
 */