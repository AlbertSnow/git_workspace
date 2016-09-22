package com.alipay.android.mini.window.sdk;

import android.support.v4.app.b;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.wandoujia.i;

final class g
  implements Runnable
{
  g(c paramc, int paramInt)
  {
  }

  public final void run()
  {
    try
    {
      c.a(this.a).a(c.h(this.a), null, this.b);
      return;
    }
    catch (AppErrorException localAppErrorException)
    {
      i.a().b(localAppErrorException, "main thread crash");
      b.b(localAppErrorException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.g
 * JD-Core Version:    0.6.0
 */