package com.google.android.gms.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.LinkedList;

@zzhb
class zzea
{
  private final LinkedList<zza> zzAB;
  private AdRequestParcel zzqH;
  private final String zzpS;
  private final int zzAC;

  zzea(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    zzx.zzz(paramAdRequestParcel);
    zzx.zzz(paramString);
    this.zzAB = new LinkedList();
    this.zzqH = paramAdRequestParcel;
    this.zzpS = paramString;
    this.zzAC = paramInt;
  }

  AdRequestParcel zzei()
  {
    return this.zzqH;
  }

  int getNetworkType()
  {
    return this.zzAC;
  }

  String getAdUnitId()
  {
    return this.zzpS;
  }

  zza zzej()
  {
    return (zza)this.zzAB.remove();
  }

  int size()
  {
    return this.zzAB.size();
  }

  void zzb(zzdv paramzzdv)
  {
    zza localzza = new zza(paramzzdv);
    this.zzAB.add(localzza);
    localzza.zzh(this.zzqH);
  }

  class zza
  {
    zzk zzAD;
    MutableContextWrapper zzAb;
    zzdw zzAE;
    long zzAF;
    boolean zzAG;
    boolean zzAH;

    zza(zzdv arg2)
    {
      Object localObject;
      zzdv localzzdv = localObject.zzec();
      this.zzAb = localObject.zzed();
      this.zzAD = localzzdv.zzX(zzea.zza(zzea.this));
      this.zzAE = new zzdw();
      this.zzAE.zzc(this.zzAD);
    }

    void zzh(AdRequestParcel paramAdRequestParcel)
    {
      if (paramAdRequestParcel != null)
        zzea.zza(zzea.this, paramAdRequestParcel);
      zzek();
      Iterator localIterator = zzea.zzb(zzea.this).iterator();
      while (localIterator.hasNext())
      {
        zza localzza = (zza)localIterator.next();
        localzza.zzek();
      }
    }

    void zzc(zzdv paramzzdv)
    {
      Context localContext = paramzzdv.zzed().getBaseContext();
      this.zzAb.setBaseContext(localContext);
    }

    private void zzek()
    {
      if ((!this.zzAG) && (zzea.zzc(zzea.this) != null))
      {
        this.zzAH = this.zzAD.zzb(zzea.zzc(zzea.this));
        this.zzAG = true;
        this.zzAF = zzr.zzbG().currentTimeMillis();
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzea
 * JD-Core Version:    0.6.0
 */