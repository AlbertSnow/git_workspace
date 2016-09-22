package com.google.android.gms.internal;

public class zzd
  implements zzo
{
  private int zzo;
  private int zzp;
  private final int zzq;
  private final float zzr;

  public zzd()
  {
    this(2500, 1, 1.0F);
  }

  public zzd(int paramInt1, int paramInt2, float paramFloat)
  {
    this.zzo = paramInt1;
    this.zzq = paramInt2;
    this.zzr = paramFloat;
  }

  public int zzd()
  {
    return this.zzo;
  }

  public int zze()
  {
    return this.zzp;
  }

  public void zza(zzr paramzzr)
    throws zzr
  {
    this.zzp += 1;
    this.zzo = (int)(this.zzo + this.zzo * this.zzr);
    if (!zzf())
      throw paramzzr;
  }

  protected boolean zzf()
  {
    return this.zzp <= this.zzq;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzd
 * JD-Core Version:    0.6.0
 */