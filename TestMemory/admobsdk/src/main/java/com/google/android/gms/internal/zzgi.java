package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

@zzhb
public final class zzgi extends zzgd.zza
{
  private final InAppPurchaseListener zzuO;

  public zzgi(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.zzuO = paramInAppPurchaseListener;
  }

  public void zza(zzgc paramzzgc)
  {
    this.zzuO.onInAppPurchaseRequested(new zzgl(paramzzgc));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgi
 * JD-Core Version:    0.6.0
 */