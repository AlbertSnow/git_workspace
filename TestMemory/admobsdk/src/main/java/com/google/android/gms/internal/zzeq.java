package com.google.android.gms.internal;

@zzhb
public final class zzeq extends zzez.zza
{
  private final Object zzpV = new Object();
  private zzes.zza zzCb;
  private zzep zzCc;

  public void zza(zzes.zza paramzza)
  {
    synchronized (this.zzpV)
    {
      this.zzCb = paramzza;
    }
  }

  public void onAdClicked()
  {
    synchronized (this.zzpV)
    {
      if (this.zzCc != null)
        this.zzCc.zzaY();
    }
  }

  public void onAdClosed()
  {
    synchronized (this.zzpV)
    {
      if (this.zzCc != null)
        this.zzCc.zzaZ();
    }
  }

  public void onAdFailedToLoad(int error)
  {
    synchronized (this.zzpV)
    {
      if (this.zzCb != null)
      {
        int i = error == 3 ? 1 : 2;
        this.zzCb.zzr(i);
        this.zzCb = null;
      }
    }
  }

  public void onAdLeftApplication()
  {
    synchronized (this.zzpV)
    {
      if (this.zzCc != null)
        this.zzCc.zzba();
    }
  }

  public void onAdOpened()
  {
    synchronized (this.zzpV)
    {
      if (this.zzCc != null)
        this.zzCc.zzbb();
    }
  }

  public void onAdLoaded()
  {
    synchronized (this.zzpV)
    {
      if (this.zzCb != null)
      {
        this.zzCb.zzr(0);
        this.zzCb = null;
        return;
      }
      if (this.zzCc != null)
        this.zzCc.zzbc();
    }
  }

  public void zza(zzfa paramzzfa)
  {
    synchronized (this.zzpV)
    {
      if (this.zzCb != null)
      {
        this.zzCb.zza(0, paramzzfa);
        this.zzCb = null;
        return;
      }
      if (this.zzCc != null)
        this.zzCc.zzbc();
    }
  }

  public void zza(zzep paramzzep)
  {
    synchronized (this.zzpV)
    {
      this.zzCc = paramzzep;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzeq
 * JD-Core Version:    0.6.0
 */