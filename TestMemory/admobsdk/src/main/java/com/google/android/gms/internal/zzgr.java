package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;

@zzhb
public class zzgr
{
  public zzit zza(Context paramContext, zza paramzza, zzif.zza paramzza1, zzan paramzzan, zzjp paramzzjp, zzex paramzzex, zza paramzza2, zzcb paramzzcb)
  {
    AdResponseParcel localAdResponseParcel = paramzza1.zzLe;
    Object localObject;
    if (localAdResponseParcel.zzHT)
      localObject = new zzgu(paramContext, paramzza1, paramzzex, paramzza2, paramzzcb, paramzzjp);
    else if (localAdResponseParcel.zzuk)
    {
      if ((paramzza instanceof zzp))
        localObject = new zzgv(paramContext, (zzp)paramzza, new zzee(), paramzza1, paramzzan, paramzza2);
      else
        throw new IllegalArgumentException("Invalid NativeAdManager type. Found: " + (paramzza != null ? paramzza.getClass().getName() : "null") + "; Required: NativeAdManager.");
    }
    else if (localAdResponseParcel.zzHZ)
      localObject = new zzgp(paramContext, paramzza1, paramzzjp, paramzza2);
    else if ((((Boolean)zzbt.zzwu.get()).booleanValue()) && (zzne.zzsk()) && (!zzne.isAtLeastL()) && (paramzzjp.zzaN().zzui))
      localObject = new zzgt(paramContext, paramzza1, paramzzjp, paramzza2);
    else
      localObject = new zzgs(paramContext, paramzza1, paramzzjp, paramzza2);
    zzin.zzaI("AdRenderer: " + localObject.getClass().getName());
    ((zzit)localObject).zzgd();
    return (zzit)localObject;
  }

  public zzit zza(Context paramContext, String paramString, zzif.zza paramzza, zzht paramzzht)
  {
    zzhz localzzhz = new zzhz(paramContext, paramString, paramzza, paramzzht);
    zzin.zzaI("AdRenderer: " + localzzhz.getClass().getName());
    localzzhz.zzgd();
    return localzzhz;
  }

  public static abstract interface zza
  {
    public abstract void zzb(zzif paramzzif);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgr
 * JD-Core Version:    0.6.0
 */