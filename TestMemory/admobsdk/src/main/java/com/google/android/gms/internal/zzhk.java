package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzr;
import java.util.WeakHashMap;

@zzhb
public final class zzhk
{
  private WeakHashMap<Context, zza> zzKm = new WeakHashMap();

  public zzhj zzE(Context paramContext)
  {
    zza localzza = (zza)this.zzKm.get(paramContext);
    zzhj localzzhj;
    if ((localzza != null) && (!localzza.hasExpired()) && (((Boolean)zzbt.zzwL.get()).booleanValue()))
      localzzhj = new zzhj.zza(paramContext, localzza.zzKo).zzgI();
    else
      localzzhj = new zzhj.zza(paramContext).zzgI();
    this.zzKm.put(paramContext, new zza(localzzhj));
    return localzzhj;
  }

  private class zza
  {
    public final long zzKn = zzr.zzbG().currentTimeMillis();
    public final zzhj zzKo;

    public zza(zzhj arg2)
    {
      Object localObject;
      this.zzKo = localObject;
    }

    public boolean hasExpired()
    {
      return this.zzKn + ((Long)zzbt.zzwM.get()).longValue() < zzr.zzbG().currentTimeMillis();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhk
 * JD-Core Version:    0.6.0
 */