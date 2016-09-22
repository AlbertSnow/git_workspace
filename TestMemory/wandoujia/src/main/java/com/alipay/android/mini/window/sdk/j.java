package com.alipay.android.mini.window.sdk;

import android.content.Context;
import android.support.v4.app.d;
import com.alipay.wandoujia.ra;
import com.wandoujia.image.c.a;

final class j
  implements Runnable
{
  j(c paramc)
  {
  }

  public final void run()
  {
    Context localContext = a.a().b();
    String str1 = localContext.getString(d.g("mini_net_error"));
    String str2 = localContext.getString(d.g("mini_redo"));
    String str3 = localContext.getString(17039360);
    c.a(this.a).a(null, str1, str3, ra.d, str2, ra.i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.j
 * JD-Core Version:    0.6.0
 */