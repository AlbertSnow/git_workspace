package com.alipay.android.mini.window.sdk;

import com.alipay.android.mini.widget.s;

final class ad
  implements Runnable
{
  ad(TransContainer paramTransContainer)
  {
  }

  public final void run()
  {
    TransContainer.a(this.a);
    if (TransContainer.b(this.a) == null)
      TransContainer.a(this.a, new s(this.a));
    TransContainer.b(this.a).setCancelable(false);
    TransContainer.b(this.a).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ad
 * JD-Core Version:    0.6.0
 */