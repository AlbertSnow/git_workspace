package com.unipay.unipay_sdk;

final class o
  implements Runnable
{
  o(c paramc)
  {
  }

  public final void run()
  {
    try
    {
      UniPay.c(this.a.a);
      return;
    }
    catch (Exception localException)
    {
      UniPay.a(this.a.a, localException.getMessage());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.o
 * JD-Core Version:    0.6.0
 */