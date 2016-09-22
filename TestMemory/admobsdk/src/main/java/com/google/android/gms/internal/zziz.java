package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;

@zzhb
public class zziz
{
  private long zzMJ;
  private long zzMK = -9223372036854775808L;
  private Object zzpV = new Object();

  public zziz(long paramLong)
  {
    this.zzMJ = paramLong;
  }

  public boolean tryAcquire()
  {
    synchronized (this.zzpV)
    {
      long l = zzr.zzbG().elapsedRealtime();
      if (this.zzMK + this.zzMJ > l)
        return false;
      this.zzMK = l;
      return true;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zziz
 * JD-Core Version:    0.6.0
 */