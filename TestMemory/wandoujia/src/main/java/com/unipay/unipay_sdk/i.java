package com.unipay.unipay_sdk;

import android.widget.Toast;

final class i
  implements Runnable
{
  i(UniPay paramUniPay)
  {
  }

  public final void run()
  {
    Toast.makeText(UniPay.a(this.a), "请将卡插入卡槽1后重试", 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.i
 * JD-Core Version:    0.6.0
 */