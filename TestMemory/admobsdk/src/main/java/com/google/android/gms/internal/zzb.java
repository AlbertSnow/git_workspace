package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public abstract interface zzb
{
  public abstract zza zza(String paramString);

  public abstract void zza(String paramString, zza paramzza);

  public abstract void zza();

  public static class zza
  {
    public byte[] data;
    public String zzb;
    public long zzc;
    public long zzd;
    public long zze;
    public long zzf;
    public Map<String, String> zzg = Collections.emptyMap();

    public boolean zzb()
    {
      return this.zze < System.currentTimeMillis();
    }

    public boolean zzc()
    {
      return this.zzf < System.currentTimeMillis();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzb
 * JD-Core Version:    0.6.0
 */