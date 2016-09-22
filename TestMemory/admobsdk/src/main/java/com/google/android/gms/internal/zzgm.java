package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

@zzhb
public final class zzgm extends zzgh.zza
{
  private final PlayStorePurchaseListener zzuP;

  public zzgm(PlayStorePurchaseListener paramPlayStorePurchaseListener)
  {
    this.zzuP = paramPlayStorePurchaseListener;
  }

  public boolean isValidPurchase(String productId)
  {
    return this.zzuP.isValidPurchase(productId);
  }

  public void zza(zzgg paramzzgg)
  {
    this.zzuP.onInAppPurchaseFinished(new zzgk(paramzzgg));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgm
 * JD-Core Version:    0.6.0
 */