package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.support.v4.app.b;
import android.view.ViewGroup;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.wandoujia.ua.a;

final class ar
  implements ua.a
{
  ar(aq paramaq, Activity paramActivity, ViewGroup paramViewGroup)
  {
  }

  public final void a()
  {
    try
    {
      aq.a(this.a, this.b, this.c);
      aq.e = false;
      return;
    }
    catch (AppErrorException localAppErrorException)
    {
      b.b(localAppErrorException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ar
 * JD-Core Version:    0.6.0
 */