package com.alipay.android.app.pay;

import android.os.Bundle;
import android.os.IInterface;

public abstract interface IAlixPayCallback extends IInterface
{
  public abstract void startActivity(String paramString1, String paramString2, int paramInt, Bundle paramBundle);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.IAlixPayCallback
 * JD-Core Version:    0.6.0
 */