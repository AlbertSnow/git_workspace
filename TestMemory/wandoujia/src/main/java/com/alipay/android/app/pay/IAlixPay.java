package com.alipay.android.app.pay;

import android.os.IInterface;

public abstract interface IAlixPay extends IInterface
{
  public abstract boolean isAuthenticated();

  public abstract String pay(String paramString);

  public abstract String payWithURL(String paramString);

  public abstract void registerCallback(IAlixPayCallback paramIAlixPayCallback);

  public abstract void unregisterCallback(IAlixPayCallback paramIAlixPayCallback);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.IAlixPay
 * JD-Core Version:    0.6.0
 */