package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@zzhb
public class zzca
{
  private final Map<String, zzbz> zzxy;

  @Nullable
  private final zzcb zzpe;

  public zzca(@Nullable zzcb paramzzcb)
  {
    this.zzpe = paramzzcb;
    this.zzxy = new HashMap();
  }

  public void zza(String paramString, zzbz paramzzbz)
  {
    this.zzxy.put(paramString, paramzzbz);
  }

  public void zza(String paramString1, String paramString2, long paramLong)
  {
    zzbx.zza(this.zzpe, (zzbz)this.zzxy.get(paramString2), paramLong, new String[] { paramString1 });
    this.zzxy.put(paramString1, zzbx.zza(this.zzpe, paramLong));
  }

  @Nullable
  public zzcb zzdA()
  {
    return this.zzpe;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzca
 * JD-Core Version:    0.6.0
 */