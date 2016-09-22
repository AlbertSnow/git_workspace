package com.unipay.unipay_sdk;

import android.widget.Toast;

final class a
  implements Runnable
{
  a(IIlIlIllIIllIIlI paramIIlIlIllIIllIIlI)
  {
  }

  public final void run()
  {
    Toast.makeText(UniPay.a(this.a.a), "短信鉴权失败", 0).show();
    UniPay.g(this.a.a);
    UniPay.a(this.a.a, "支付失败");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.a
 * JD-Core Version:    0.6.0
 */