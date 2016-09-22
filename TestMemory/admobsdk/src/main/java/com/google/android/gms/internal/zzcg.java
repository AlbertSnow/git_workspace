package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzhb
public final class zzcg extends zzcf.zza
{
  private final OnCustomRenderedAdLoadedListener zzuQ;

  public zzcg(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.zzuQ = paramOnCustomRenderedAdLoadedListener;
  }

  public void zza(zzce paramzzce)
  {
    this.zzuQ.onCustomRenderedAdLoaded(new zzcd(paramzzce));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcg
 * JD-Core Version:    0.6.0
 */