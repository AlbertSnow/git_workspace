package com.alipay.android.mini.window.sdk;

import android.content.Context;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.android.app.exception.FailOperatingException;
import com.alipay.wandoujia.ra;
import com.wandoujia.image.c.a;

final class h
  implements Runnable
{
  h(c paramc, Exception paramException)
  {
  }

  public final void run()
  {
    Context localContext = a.a().b();
    if ((this.b instanceof FailOperatingException));
    for (String str1 = this.b.getMessage(); ; str1 = null)
    {
      if ((com.alipay.android.app.pay.c.d) && ((this.b instanceof AppErrorException)))
        str1 = this.b.getMessage();
      boolean bool = TextUtils.isEmpty(str1);
      String str2;
      if ((com.alipay.android.app.pay.c.d) && (bool))
        str2 = localContext.getString(d.g("mini_debug_app_error"));
      while (true)
      {
        String str3 = localContext.getString(17039370);
        c.a(this.a).a(null, str2, str3, ra.d, null, null);
        return;
        if (bool)
        {
          str2 = localContext.getString(d.g("mini_app_error"));
          continue;
        }
        str2 = str1;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.h
 * JD-Core Version:    0.6.0
 */