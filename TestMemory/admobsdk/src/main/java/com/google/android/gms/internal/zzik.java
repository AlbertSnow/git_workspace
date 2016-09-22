package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzr;

@zzhb
public class zzik
{
  private final Object zzpV = new Object();
  private int zzLJ;
  private int zzLK;
  private final zzih zzqV;
  private final String zzLh;

  public zzik(String paramString)
  {
    this(zzr.zzbF(), paramString);
  }

  zzik(zzih paramzzih, String paramString)
  {
    this.zzqV = paramzzih;
    this.zzLh = paramString;
  }

  public void zzg(int paramInt1, int paramInt2)
  {
    synchronized (this.zzpV)
    {
      this.zzLJ = paramInt1;
      this.zzLK = paramInt2;
      this.zzqV.zza(this.zzLh, this);
    }
  }

  public Bundle toBundle()
  {
    synchronized (this.zzpV)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pmnli", this.zzLJ);
      localBundle.putInt("pmnll", this.zzLK);
      return localBundle;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzik
 * JD-Core Version:    0.6.0
 */