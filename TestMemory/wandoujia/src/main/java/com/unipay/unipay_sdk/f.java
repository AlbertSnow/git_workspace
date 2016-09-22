package com.unipay.unipay_sdk;

import android.content.Context;
import android.os.CountDownTimer;

final class f extends CountDownTimer
{
  public f(UniPay paramUniPay)
  {
    super(30000L, 1000L);
  }

  public final void onFinish()
  {
    try
    {
      UniPay.a(this.a).unregisterReceiver(UniPay.i(this.a));
      UniPay.j(this.a);
      label24: if (UniPay.f(this.a) != null)
        UniPay.f(this.a).cancel();
      return;
    }
    catch (Exception localException)
    {
      break label24;
    }
  }

  public final void onTick(long paramLong)
  {
    new StringBuilder().append(paramLong).append("秒倒计时");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.f
 * JD-Core Version:    0.6.0
 */