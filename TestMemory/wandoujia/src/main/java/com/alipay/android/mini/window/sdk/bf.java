package com.alipay.android.mini.window.sdk;

import com.alipay.android.mini.widget.s;

final class bf
  implements Runnable
{
  bf(MiniPayActivity paramMiniPayActivity)
  {
  }

  public final void run()
  {
    MiniPayActivity.a(this.a);
    if (MiniPayActivity.b(this.a) == null)
      MiniPayActivity.a(this.a, new s(this.a));
    MiniPayActivity.b(this.a).setCancelable(false);
    MiniPayActivity.b(this.a).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.bf
 * JD-Core Version:    0.6.0
 */