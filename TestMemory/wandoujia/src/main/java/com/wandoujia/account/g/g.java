package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class g extends a
  implements Runnable
{
  private String e;
  private String f;

  public g(String paramString1, String paramString2, com.wandoujia.account.listener.a parama, b paramb)
  {
    super("", parama, paramb);
    this.e = paramString1;
    this.f = paramString2;
  }

  public final void run()
  {
    if (a())
    {
      if (this.d == null)
      {
        b();
        return;
      }
      a(this.d.d(this.e, this.f));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.g
 * JD-Core Version:    0.6.0
 */