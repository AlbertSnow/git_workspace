package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

@zzhb
public class zzcz extends zzcu.zza
{
  private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzyV;

  public zzcz(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener)
  {
    this.zzyV = paramOnCustomTemplateAdLoadedListener;
  }

  public void zza(zzcp paramzzcp)
  {
    this.zzyV.onCustomTemplateAdLoaded(new zzcq(paramzzcp));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcz
 * JD-Core Version:    0.6.0
 */