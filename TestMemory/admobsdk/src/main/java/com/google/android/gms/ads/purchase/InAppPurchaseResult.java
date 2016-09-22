package com.google.android.gms.ads.purchase;

import android.content.Intent;

public abstract interface InAppPurchaseResult
{
  public abstract String getProductId();

  public abstract Intent getPurchaseData();

  public abstract int getResultCode();

  public abstract boolean isVerified();

  public abstract void finishPurchase();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.purchase.InAppPurchaseResult
 * JD-Core Version:    0.6.0
 */