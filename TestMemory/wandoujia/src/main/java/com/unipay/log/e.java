package com.unipay.log;

import com.wandoujia.morph.a.h;

final class e extends Thread
{
  e(String paramString1, String paramString2, String paramString3)
  {
  }

  public final void run()
  {
    String str = this.a;
    h.a();
    if (!h.a(this.b, this.c).toUpperCase().contains("SUCCESS"))
    {
      h.a();
      if (!h.a(this.b, this.c).toUpperCase().contains("SUCCESS"))
      {
        h.a();
        if (!h.a(this.b, this.c).toUpperCase().contains("SUCCESS"))
          c.a(this.c, str);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.log.e
 * JD-Core Version:    0.6.0
 */