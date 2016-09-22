package com.unipay.c;

import java.io.InputStream;

final class f extends Thread
{
  f(a parama, String paramString1, e parame, String paramString2, b paramb)
  {
  }

  public final void run()
  {
    try
    {
      InputStream localInputStream = a.a(this.e).a(this.a, this.b, this.c);
      this.d.a(localInputStream);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      this.d.a();
      return;
    }
    catch (Exception localException)
    {
      this.d.a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.c.f
 * JD-Core Version:    0.6.0
 */