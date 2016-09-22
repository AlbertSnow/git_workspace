package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

@zzhb
public class zzcw extends zzcr.zza
{
  private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzyS;

  public zzcw(NativeAppInstallAd.OnAppInstallAdLoadedListener paramOnAppInstallAdLoadedListener)
  {
    this.zzyS = paramOnAppInstallAdLoadedListener;
  }

  public void zza(zzcl paramzzcl)
  {
    this.zzyS.onAppInstallAdLoaded(zzb(paramzzcl));
  }

  zzcm zzb(zzcl paramzzcl)
  {
    return new zzcm(paramzzcl);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcw
 * JD-Core Version:    0.6.0
 */