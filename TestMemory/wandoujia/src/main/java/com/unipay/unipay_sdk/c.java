package com.unipay.unipay_sdk;

import android.app.Activity;
import com.unipay.e.a.d;
import java.io.InputStream;
import java.util.Vector;

final class c
  implements com.unipay.c.b
{
  c(UniPay paramUniPay)
  {
  }

  public final void a()
  {
    com.unipay.log.c.a(UniPay.a(this.a), "649", "无法使用话费支付", "true");
    if (UniPay.b(this.a))
      ((Activity)UniPay.a(this.a)).runOnUiThread(new b(this));
  }

  public final void a(InputStream paramInputStream)
  {
    if (paramInputStream == null)
    {
      com.unipay.log.c.a(UniPay.a(this.a), "649", "获取数据失败", "true");
      if (UniPay.b(this.a))
        ((Activity)UniPay.a(this.a)).runOnUiThread(new e(this));
    }
    do
    {
      com.unipay.e.a.a locala;
      while (true)
      {
        return;
        locala = UniPay.a(paramInputStream);
        if (locala != null)
          break;
        try
        {
          com.unipay.log.c.a(UniPay.a(this.a), "649", "获取数据失败", "true");
          if (!UniPay.b(this.a))
            continue;
          ((Activity)UniPay.a(this.a)).runOnUiThread(new o(this));
          return;
        }
        catch (Exception localException)
        {
          com.unipay.log.c.a(UniPay.a(this.a), "649", "无法使用话费支付", "true");
        }
        if (!UniPay.b(this.a))
          continue;
        ((Activity)UniPay.a(this.a)).runOnUiThread(new k(this));
        return;
      }
      d locald = (d)com.unipay.e.a.b.a(locala, "blacklistSDK").b.elementAt(0);
      int i = com.unipay.e.a.b.a(locald, "result");
      int j = com.unipay.e.a.b.a(locald, "Usertype");
      String str = com.unipay.e.a.b.b(locald, "desc");
      if ((i == 0) && (j == 1))
        if (UniPay.d(this.a))
          android.support.v4.app.b.q(com.unipay.tools.a.h());
      while ((UniPay.b(this.a)) && (i == 0) && (j == 0))
      {
        ((Activity)UniPay.a(this.a)).runOnUiThread(new h(this));
        return;
        if ((i == 0) && (j == 0))
        {
          if (!UniPay.d(this.a))
            continue;
          android.support.v4.app.b.p(com.unipay.tools.a.h());
          continue;
        }
        com.unipay.log.c.a(UniPay.a(this.a), "634", str, "false");
      }
      com.unipay.log.c.a(UniPay.a(this.a), "649", "无法使用话费支付", "true");
    }
    while (!UniPay.b(this.a));
    UniPay.a(this.a, "无法使用话费支付");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.unipay_sdk.c
 * JD-Core Version:    0.6.0
 */