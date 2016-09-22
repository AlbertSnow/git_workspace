package com.unipay.unipay_sdk;

import android.os.CountDownTimer;

final class m extends CountDownTimer
{
  public m()
  {
    super(15000L, 1000L);
  }

  public final void onFinish()
  {
    UniPay.b();
  }

  public final void onTick(long paramLong)
  {
    new StringBuilder().append(paramLong).append("  ").append(UniPay.c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.m
 * JD-Core Version:    0.6.0
 */