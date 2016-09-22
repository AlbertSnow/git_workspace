package com.alipay.android.app.pay;

import android.content.Context;

public abstract interface PayTask$OnPayListener
{
  public abstract void onPayFailed(Context paramContext, String paramString1, String paramString2, String paramString3);

  public abstract void onPaySuccess(Context paramContext, String paramString1, String paramString2, String paramString3);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.PayTask.OnPayListener
 * JD-Core Version:    0.6.0
 */