package com.google.android.gms.ads.purchase;

public abstract interface PlayStorePurchaseListener
{
  public abstract boolean isValidPurchase(String paramString);

  public abstract void onInAppPurchaseFinished(InAppPurchaseResult paramInAppPurchaseResult);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.purchase.PlayStorePurchaseListener
 * JD-Core Version:    0.6.0
 */