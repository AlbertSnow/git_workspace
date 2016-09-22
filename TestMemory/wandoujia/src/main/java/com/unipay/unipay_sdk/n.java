package com.unipay.unipay_sdk;

import com.unipay.d.d;

final class n
  implements Runnable
{
  n(UniPay paramUniPay)
  {
  }

  public final void run()
  {
    d locald = com.unipay.d.c.a(UniPay.a(this.a)).b();
    if (locald == null)
    {
      com.unipay.log.c.a(UniPay.a(this.a), "652", "", "true");
      UniPay.a(this.a, "支付失败");
      return;
    }
    if (locald.c().equals("com.lenovo.safecenter"))
    {
      if (locald.e().compareToIgnoreCase("4.2.0") >= 0)
      {
        com.unipay.log.c.a(UniPay.a(this.a), "652", "", "");
        UniPay.a(this.a, "支付失败");
        return;
      }
      com.unipay.log.c.a(UniPay.a(this.a), "651", "", "true");
      UniPay.a(this.a, "支付成功");
      return;
    }
    com.unipay.log.c.a(UniPay.a(this.a), "651", "", "true");
    UniPay.a(this.a, "支付成功");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.n
 * JD-Core Version:    0.6.0
 */