package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@zzhb
public class zzcx extends zzcs.zza
{
  private final NativeContentAd.OnContentAdLoadedListener zzyT;

  public zzcx(NativeContentAd.OnContentAdLoadedListener paramOnContentAdLoadedListener)
  {
    this.zzyT = paramOnContentAdLoadedListener;
  }

  public void zza(zzcn paramzzcn)
  {
    this.zzyT.onContentAdLoaded(zzb(paramzzcn));
  }

  zzco zzb(zzcn paramzzcn)
  {
    return new zzco(paramzzcn);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcx
 * JD-Core Version:    0.6.0
 */