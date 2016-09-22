package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class d extends a
  implements Runnable
{
  private final String e;

  public d(String paramString1, String paramString2, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString2, parama, paramb);
    this.e = paramString1;
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
      a(this.d.d(this.e));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.d
 * JD-Core Version:    0.6.0
 */