package com.google.android.gms.internal;

public class zzm<T>
{
  public final T result;
  public final zzb.zza zzag;
  public final zzr zzah;
  public boolean zzai = false;

  public static <T> zzm<T> zza(T paramT, zzb.zza paramzza)
  {
    return new zzm(paramT, paramzza);
  }

  public static <T> zzm<T> zzd(zzr paramzzr)
  {
    return new zzm(paramzzr);
  }

  public boolean isSuccess()
  {
    return this.zzah == null;
  }

  private zzm(T paramT, zzb.zza paramzza)
  {
    this.result = paramT;
    this.zzag = paramzza;
    this.zzah = null;
  }

  private zzm(zzr paramzzr)
  {
    this.result = null;
    this.zzag = null;
    this.zzah = paramzzr;
  }

  public static abstract interface zza
  {
    public abstract void zze(zzr paramzzr);
  }

  public static abstract interface zzb<T>
  {
    public abstract void zzb(T paramT);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzm
 * JD-Core Version:    0.6.0
 */