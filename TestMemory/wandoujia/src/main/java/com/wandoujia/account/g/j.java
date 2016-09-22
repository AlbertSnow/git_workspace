package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class j extends a
  implements Runnable
{
  private final String e;

  public j(String paramString1, String paramString2, com.wandoujia.account.listener.a parama, b paramb)
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
      a(this.d.e(this.e));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.j
 * JD-Core Version:    0.6.0
 */