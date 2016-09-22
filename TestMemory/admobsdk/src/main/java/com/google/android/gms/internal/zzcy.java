package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@zzhb
public class zzcy extends zzct.zza
{
  private final NativeCustomTemplateAd.OnCustomClickListener zzyU;

  public zzcy(NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
  {
    this.zzyU = paramOnCustomClickListener;
  }

  public void zza(zzcp paramzzcp, String paramString)
  {
    this.zzyU.onCustomClick(new zzcq(paramzzcp), paramString);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcy
 * JD-Core Version:    0.6.0
 */