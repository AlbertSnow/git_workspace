package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

@zzhb
public class zzax
  implements zzay
{
  private final Object zzpV = new Object();
  private final WeakHashMap<zzif, zzau> zzsB = new WeakHashMap();
  private final ArrayList<zzau> zzsC = new ArrayList();
  private final Context zzsa;
  private final VersionInfoParcel zzpT;
  private final zzeg zzsD;

  public zzax(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzeg paramzzeg)
  {
    this.zzsa = paramContext.getApplicationContext();
    this.zzpT = paramVersionInfoParcel;
    this.zzsD = paramzzeg;
  }

  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif)
  {
    return zza(paramAdSizeParcel, paramzzif, paramzzif.zzED.getView());
  }

  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, View paramView)
  {
    return zza(paramAdSizeParcel, paramzzif, new zzau.zzd(paramView, paramzzif), null);
  }

  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, View paramView, zzeh paramzzeh)
  {
    return zza(paramAdSizeParcel, paramzzif, new zzau.zzd(paramView, paramzzif), paramzzeh);
  }

  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, zzh paramzzh)
  {
    return zza(paramAdSizeParcel, paramzzif, new zzau.zza(paramzzh), null);
  }

  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, zzbb paramzzbb, zzeh paramzzeh)
  {
    synchronized (this.zzpV)
    {
      if (zzh(paramzzif))
        return (zzau)this.zzsB.get(paramzzif);
      Object localObject1;
      if (paramzzeh != null)
        localObject1 = new zzaz(this.zzsa, paramAdSizeParcel, paramzzif, this.zzpT, paramzzbb, paramzzeh);
      else
        localObject1 = new zzba(this.zzsa, paramAdSizeParcel, paramzzif, this.zzpT, paramzzbb, this.zzsD);
      ((zzau)localObject1).zza(this);
      this.zzsB.put(paramzzif, localObject1);
      this.zzsC.add(localObject1);
      return localObject1;
    }
  }

  public boolean zzh(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      zzau localzzau = (zzau)this.zzsB.get(paramzzif);
      return (localzzau != null) && (localzzau.zzch());
    }
  }

  public void zzi(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      zzau localzzau = (zzau)this.zzsB.get(paramzzif);
      if (localzzau != null)
        localzzau.zzcf();
    }
  }

  public void zza(zzau paramzzau)
  {
    synchronized (this.zzpV)
    {
      if (!paramzzau.zzch())
      {
        this.zzsC.remove(paramzzau);
        Iterator localIterator = this.zzsB.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (localEntry.getValue() == paramzzau)
            localIterator.remove();
        }
      }
    }
  }

  public void zzj(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      zzau localzzau = (zzau)this.zzsB.get(paramzzif);
      if (localzzau != null)
        localzzau.stop();
    }
  }

  public void zzk(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      zzau localzzau = (zzau)this.zzsB.get(paramzzif);
      if (localzzau != null)
        localzzau.pause();
    }
  }

  public void zzl(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      zzau localzzau = (zzau)this.zzsB.get(paramzzif);
      if (localzzau != null)
        localzzau.resume();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzax
 * JD-Core Version:    0.6.0
 */